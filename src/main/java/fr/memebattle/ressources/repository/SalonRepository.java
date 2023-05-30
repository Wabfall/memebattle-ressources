package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository<Salon, String> {
    // Méthodes spécifiques à la gestion des salons
}
