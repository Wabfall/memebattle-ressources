package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.modele.Joueur;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends MongoRepository<Joueur, ObjectId> {
    // Méthodes spécifiques à la gestion des joueurs
}
