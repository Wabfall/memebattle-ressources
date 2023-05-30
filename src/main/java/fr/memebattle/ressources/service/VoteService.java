package fr.memebattle.ressources.service;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.repository.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final ImageRepository imageRepository;

    public VoteService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    // Méthode pour voter pour une image
    public void voteImage(String imageId) {
        // Logique pour incrémenter le nombre de votes pour l'image correspondante
        // Exemple :
        Image image = imageRepository.findById(imageId).orElse(null);
        if (image != null) {
            image.setVotes(image.getVotes() + 1);
            imageRepository.save(image);
        }
    }

    // Méthode pour calculer le score d'une image
    public int calculateImageScore(String imageId) {
        // Logique pour calculer le score d'une image, par exemple en utilisant une formule spécifique
        // Exemple :
        Image image = imageRepository.findById(imageId).orElse(null);
        if (image != null) {
            // Calcul du score en fonction du nombre de votes et d'autres critères
            return image.getVotes() * 10; // Exemple simple pour illustrer le calcul du score
        }
        return 0;
    }

    // Autres méthodes pour la gestion des votes

    // Getters et setters
}
