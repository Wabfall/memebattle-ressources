package fr.memebattle.ressources.service;

import fr.memebattle.ressources.modele.Joueur;
import fr.memebattle.ressources.modele.Salon;
import fr.memebattle.ressources.modele.api.ReponseRequete;
import fr.memebattle.ressources.modele.api.RequeteJoueur;
import fr.memebattle.ressources.repository.JoueurRepository;
import fr.memebattle.ressources.repository.SalonRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {
    private final SalonRepository salonRepository;
    private final JoueurRepository joueurRepository;
    private final ImageService imageService;
    private final VoteService voteService;

    public GameService(SalonRepository salonRepository, JoueurRepository joueurRepository, ImageService imageService, VoteService voteService) {
        this.salonRepository = salonRepository;
        this.joueurRepository = joueurRepository;
        this.imageService = imageService;
        this.voteService = voteService;
    }

    // Méthodes de la logique métier du jeu

    // Exemple de méthode pour créer une salle de jeu
    public Salon creerSalon(String salonName, int maxJoueurs, String gameMode) {
        // Logique pour créer une nouvelle salle de jeu
        // Convertir le String en ObjectId
        ObjectId salonId = new ObjectId(salonName);
        Salon salon = new Salon(salonId, maxJoueurs, gameMode);
        return salonRepository.save(salon);
    }

    // Exemple de méthode pour rejoindre une salle de jeu
    // Méthode pour permettre à un joueur de rejoindre une salle de jeu existante
    public Joueur rejoindreSalon(String idSalon, RequeteJoueur requeteJoueur) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        Optional<Salon> optionalSalon = salonRepository.findById(idSalon);
        if (optionalSalon.isPresent()) {
            Salon salon = optionalSalon.get();
            // Créer l'objet Joueur à partir des informations fournies dans requeteJoueur
            ObjectId joueurId = new ObjectId(requeteJoueur.getPseudo());
            Joueur joueur = new Joueur(joueurId, requeteJoueur.getPseudo());

            if (salon.getJoueurs().size() < salon.getNombreMaxJoueurs()) {
                salon.getJoueurs().add(joueur.getId());
                salonRepository.save(salon);
                return joueur;
            }
        }
        return null;
    }

    // Méthode pour envoyer une réponse dans une salle de jeu
    public void envoieReponse(String idSalon, ReponseRequete reponseRequete) {
        // Logique pour envoyer une réponse dans une salle de jeu
        Salon salon = salonRepository.findById(idSalon).orElse(null);
        if (salon != null) {
            // Ajouter la logique pour gérer l'envoi de réponse dans le salon
            // Utiliser l'objet ReponseRequete pour traiter la réponse soumise
        }
    }

    // Méthode pour voter pour une image dans une salle de jeu
    public void voteImage(String idSalon, Long idImage) {
        // Logique pour voter pour une image dans une salle de jeu
        Salon salon = salonRepository.findById(idSalon).orElse(null);
        if (salon != null) {
            // Ajouter la logique pour gérer le vote pour l'image spécifiée
            // Utiliser l'objet ImageService et VoteService pour effectuer les opérations nécessaires
        }
    }

    // Autres méthodes pour gérer le déroulement du jeu

    // Getters et setters
}
