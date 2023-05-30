package fr.memebattle.ressources.repository;

import fr.memebattle.ressources.modele.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, String> {
    // Méthodes spécifiques à la gestion des joueurs
}
