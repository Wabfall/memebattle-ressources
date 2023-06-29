package fr.memebattle.ressources.service;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.modele.Joueur;
import fr.memebattle.ressources.modele.Salon;
import fr.memebattle.ressources.modele.api.Vote;
import fr.memebattle.ressources.repository.ImageRepository;
import fr.memebattle.ressources.repository.JoueurRepository;
import fr.memebattle.ressources.repository.SalonRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoteService {
    private final ImageRepository imageRepository;
    private final SalonRepository salonRepository;
    private final JoueurRepository joueurRepository;

    public VoteService(ImageRepository imageRepository, SalonRepository salonRepository, JoueurRepository joueurRepository) {
        this.imageRepository = imageRepository;
        this.salonRepository = salonRepository;
        this.joueurRepository = joueurRepository;
    }

    // Méthode pour voter pour une image
    public void voteImage(ObjectId imageId) {
        // Logique pour incrémenter le nombre de votes pour l'image correspondante
        // Exemple :
        Image image = imageRepository.findById(imageId).orElse(null);
        if (image != null) {
            image.setVotes(image.getVotes() + 1);
            imageRepository.save(image);
        }
    }

    // Méthode pour calculer le score d'une image
    public int calculateImageScore(ObjectId imageId) {
        // Logique pour calculer le score d'une image, par exemple en utilisant une formule spécifique
        // Exemple :
        Image image = imageRepository.findById(imageId).orElse(null);
        if (image != null) {
            // Calcul du score en fonction du nombre de votes et d'autres critères
            return image.getVotes() * 10; // Exemple simple pour illustrer le calcul du score
        }
        return 0;
    }

    public void terminerTourDeVote(Salon salon) {
        // Logique pour terminer le tour de vote
        List<Vote> votes = salon.getVotes();

        // Calculer les scores des joueurs pour leurs images
        for (Vote vote : votes) {
            ObjectId imageId = new ObjectId(vote.getIdImage());
            Image image = imageRepository.findById(imageId).orElse(null);
            if(image!= null){
                image.setVotes(image.getVotes() - 1);
                imageRepository.save(image);
            }
            int score = calculateImageScore(imageId);
            // Mettre à jour le score du joueur pour son image
            Joueur joueur = joueurRepository.findById(imageId).orElse(null);
            joueur.setScore(score);
        }

        // Réinitialiser la liste des votes
        salon.setVotes(new ArrayList<>());

        // Autres opérations nécessaires à la fin du tour de vote

        // Sauvegarder les modifications du salon
        salonRepository.save(salon);
    }


    // Autres méthodes pour la gestion des votes

    // Getters et setters
}
