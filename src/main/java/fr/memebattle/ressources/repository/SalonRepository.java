package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.modele.Salon;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalonRepository extends MongoRepository<Salon, ObjectId> {
    // Méthodes spécifiques à la gestion des salons
    Optional<Salon> findByNomSalon(String nomSalon);
}
