package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Image;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends MongoRepository<Image, ObjectId> {
    // Méthode spécifique à la gestion des images
    List<Image> findAllByOrderByVotesDesc();
}
