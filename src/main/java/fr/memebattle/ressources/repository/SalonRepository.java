package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.modele.Salon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends MongoRepository<Salon, String> {
    // Méthodes spécifiques à la gestion des salons
}
