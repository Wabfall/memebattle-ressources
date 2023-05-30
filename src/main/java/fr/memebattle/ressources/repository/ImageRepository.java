package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {
    // Méthode spécifique à la gestion des images
    List<Image> findAllByOrderByVotesDesc();
}
