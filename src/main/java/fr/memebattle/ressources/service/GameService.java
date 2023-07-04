package fr.memebattle.ressources.service;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.modele.Joueur;
import fr.memebattle.ressources.modele.Salon;
import fr.memebattle.ressources.modele.api.*;
import fr.memebattle.ressources.repository.ImageRepository;
import fr.memebattle.ressources.repository.JoueurRepository;
import fr.memebattle.ressources.repository.SalonRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StreamUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static fr.memebattle.ressources.tools.MemeBattleTools.generateRandomString;

@Service
@AllArgsConstructor
public class GameService {
    private final SalonRepository salonRepository;
    private final JoueurRepository joueurRepository;
    private final ImageRepository imageRepository;
    private final ImageService imageService;
    private final VoteService voteService;

    private static final Logger logger = LoggerFactory.getLogger(GameService.class);

    // Méthodes de la logique métier du jeu

    // Exemple de méthode pour créer une salle de jeu
    public ReponseCodeSalon creerSalon(int maxJoueurs, String gameMode) {
        // Logique pour créer une nouvelle salle de jeu
        // Convertir le String en ObjectId
        ObjectId salonId = new ObjectId();

        Salon salon = new Salon(salonId, generateRandomString(), maxJoueurs, gameMode);

        //Sauvegarde des objets dans la base de données;
        salonRepository.save(salon);

        ReponseCodeSalon reponseCodeSalon = new ReponseCodeSalon();
        reponseCodeSalon.setCodeSalon(salon.getNomSalon());
        return reponseCodeSalon;
    }

    // Exemple de méthode pour rejoindre une salle de jeu
    // Méthode pour permettre à un joueur de rejoindre une salle de jeu existante
    public ReponseSalon rejoindreSalon(String nomSalon, String pseudoJoueur) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        Optional<Salon> optionalSalon = salonRepository.findByNomSalon(nomSalon);
        if (optionalSalon.isPresent()) {
            Salon salon = optionalSalon.get();
            // Créer l'objet Joueur à partir des informations fournies dans requeteJoueur
            ObjectId joueurId = new ObjectId();
            Joueur joueur = new Joueur(joueurId, pseudoJoueur);

            if (salon.getJoueurs().size() < salon.getNombreMaxJoueurs()) {
                salon.ajouterJoueur(joueur.getId());
                joueurRepository.save(joueur);
                salonRepository.save(salon);

                return createReponseSalon(salon, joueur);
            }
        }
        return null;
    }

    private ReponseSalon createReponseSalon(Salon salon, Joueur joueur) {
        ReponseSalon reponseSalon = new ReponseSalon();

        reponseSalon.setNomSalon(salon.getNomSalon());
        reponseSalon.setPartieEstCommence(salon.isPartieEstCommence());
        reponseSalon.setIdSalon(String.valueOf(salon.getId()));
        reponseSalon.setIdJoueur(String.valueOf(joueur.getId()));
        reponseSalon.setPseudo(joueur.getPseudo());
        reponseSalon.setGameMode(salon.getGameMode());
        reponseSalon.setMaxJoueurs(salon.getNombreMaxJoueurs());
        reponseSalon.setNumJoueur(BigDecimal.valueOf(salon.getJoueurs().indexOf(joueur.getId()) + 1));
        return reponseSalon;
    }

    public void commencerPartie(String nomSalon, RequeteJoueur requeteJoueur) {

        // Logique pour récupérer l'image au début d'un tour de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        ObjectId idJoueurUn = new ObjectId(requeteJoueur.getIdJoueur());
        if (salon != null) {
            if(idJoueurUn.equals(salon.getJoueurs().get(0))) {
                salon.setPartieEstCommence(true);
            }
        }
        salonRepository.save(salon);
    }

    public void quitterSalon(String nomSalon, RequeteJoueur requeteJoueur) {
        // Logique pour qu'un joueur puisse quitter le salon
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        ObjectId idJoueurAQuitter = new ObjectId(requeteJoueur.getIdJoueur());
        if (salon != null) {
            int index = salon.getJoueurs().indexOf(idJoueurAQuitter);
            if(index >= 0) {
                salon.getJoueurs().remove(index);
            }
        }
        salonRepository.save(salon);
    }

    public ReponseAttente recupererInfosAttente(String nomSalon) {
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        ReponseAttente reponseAttente = new ReponseAttente();
        List<String> listeAttente = new ArrayList<String>();

        if (salon!= null) {
            for(int i=0; i<salon.getJoueurs().size(); i++) {
                Joueur joueur = joueurRepository.findById(salon.getJoueurs().get(i)).orElse(null);
                if(joueur != null){
                    listeAttente.add(joueur.getPseudo());
                }
            }
            reponseAttente.setListeJoueurs(listeAttente);
            reponseAttente.setPartieEstCommence(salon.isPartieEstCommence());
        }
        return reponseAttente;
    }

    // Méthode pour voter pour une image dans une salle de jeu
    public void voteImage(String nomSalon, String idImage, String idJoueur) {
        // Logique pour voter pour une image dans une salle de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        if (salon != null) {
            // Récupérer l'objet Image à partir de l'idImage
            Optional<ObjectId> optionalImage = salon.getImagesJoueurs().stream()
                    .filter(image -> image.equals(idImage))
                    .findFirst();
            if (optionalImage.isPresent()) {
                ObjectId imageId = optionalImage.get();

                // Vérifier si le joueur a déjà voté pour cette image
                boolean hasVoted = salon.getVotes().stream()
                        .anyMatch(vote -> vote.getIdJoueur().equals(idJoueur) && vote.getIdImage().equals(idImage));

                if (!hasVoted) {
                    // Ajouter le vote de joueur pour cette image
                    salon.ajouterVote(idJoueur, idImage);
                    salonRepository.save(salon);

                    voteService.voteImage(imageId);

                    // Vérifier si tous les joueurs ont voté
                    if (salon.getVotes().size() == salon.getJoueurs().size()) {
                        // Effectuer les opérations nécessaires pour terminer le tour de vote
                        voteService.terminerTourDeVote(salon);
                    }
                }
            }
        }
    }

    public ReponseClassement recupererClassement(String nomSalon) {
        // Logique pour récupérer le classement d'un salon de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        if (salon != null) {
            List<ReponseClassementClassement> classement = new ArrayList<>();
            ReponseClassement reponseClassement = new ReponseClassement();
            reponseClassement.setClassement(classement);
            return reponseClassement;
        }
        return null;
    }

    public void envoieImage(String nomSalon, String idJoueur, MultipartFile file) throws IOException {
        // Logique pour recevoir l'image envoyée par un joueur dans un salon de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        if (salon != null) {
            // Vérifier si c'est le tour du joueur pour envoyer une image
                // Enregistrer l'image dans le système de fichiers ou dans une base de données
                // Utiliser l'objet ImageService pour enregistrer l'image et obtenir l'objet Image
                Image image = imageService.uploadImage(file);

                // Ajouter l'image dans le salon de jeu
                salon.ajouterImage(image.getId());
                salonRepository.save(salon);
        }
    }

     public List<ReponseImage> recevoirImageFinTour(String nomSalon, String idJoueur) {
        // Logique pour récupérer les images à afficher à la fin d'un tour de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        if (salon != null) {
            // Récupérer les images du salon
            List<Optional<Image>> images = new ArrayList<>();
            for (int i = 0; i < salon.getImagesJoueurs().size(); i++) {
                images.add(imageRepository.findById(salon.getImagesJoueurs().get(i)));
            }
            List<ReponseImage> listeReponseImage = new ArrayList<>();
            for (Optional<Image> imageOptional : images) {
                if (imageOptional.isPresent()) {
                    Image image = imageOptional.get();
                    ReponseImage reponseImage = new ReponseImage();
                    reponseImage.setNomFichier(image.getFileName());
                    reponseImage.setIdImage(image.getId().toString());
                    reponseImage.setContenuImage(image.getImageBytes());
                    listeReponseImage.add(reponseImage);
                }
            }
            return listeReponseImage;
        }
        return new ArrayList<>();
    }

    public ReponseImage recevoirImageDebutTour(String nomSalon) {
        // Logique pour récupérer l'image au début d'un tour de jeu
        Salon salon = salonRepository.findByNomSalon(nomSalon).orElse(null);
        if (salon != null) {
                // Utiliser l'objet ImageService pour récupérer une image aléatoire
                Image image = imageService.getRandomImage();
                salon.addImagesJeu(image.getId());
                salonRepository.save(salon);

                ReponseImage reponseImage = new ReponseImage();
                reponseImage.setNomFichier(image.getFileName());
                reponseImage.setIdImage(image.getId().toString());
                reponseImage.setContenuImage(image.getImageBytes());

                return reponseImage;
        }
        return null;
    }

    // Getters et setters
}
