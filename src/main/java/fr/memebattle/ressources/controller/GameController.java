package fr.memebattle.ressources.controller;

import fr.memebattle.ressources.modele.*;
import fr.memebattle.ressources.modele.api.ReponseRequete;
import fr.memebattle.ressources.modele.api.RequeteJoueur;
import fr.memebattle.ressources.service.GameService;
import fr.memebattle.ressources.service.ImageService;
import fr.memebattle.ressources.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jeu")
public class GameController {
    private final GameService gameService;
    private final ImageService imageService;
    private final VoteService voteService;

    @Autowired
    public GameController(GameService gameService, ImageService imageService, VoteService voteService) {
        this.gameService = gameService;
        this.imageService = imageService;
        this.voteService = voteService;
    }

    @PostMapping("/salon")
    public Salon creerSalon(@RequestBody RequeteSalon requeteSalon) {
        // Logique pour créer une nouvelle salle de jeu en utilisant les informations fournies dans roomRequest
        // Exemple :
        String salonName = requeteSalon.getSalonName();
        int maxJoueurs = requeteSalon.getMaxJoueurs();
        String gameMode = requeteSalon.getGameMode();

        return gameService.creerSalon(salonName, maxJoueurs, gameMode);
    }


    @PostMapping("/salon/{idSalon}/join")
    public Joueur rejoindreSalon(@PathVariable String idSalon, @RequestBody RequeteJoueur requeteJoueur) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        return gameService.rejoindreSalon(idSalon, requeteJoueur);
    }

    @PostMapping("/salon/{idSalon}/envoie")
    public void envoieReponse(@PathVariable String idSalon, @RequestBody ReponseRequete reponseRequete) {
        // Logique pour permettre à un joueur de soumettre une réponse dans une salle de jeu
        gameService.envoieReponse(idSalon, reponseRequete);
    }

    @PostMapping("/salon/{idSalon}/vote/{idImage}")
    public void voteImage(@PathVariable String idSalon, @PathVariable Long idImage) {
        // Logique pour permettre à un joueur de voter pour une image dans une salle de jeu
        gameService.voteImage(idSalon, idImage);
    }

    // Autres points de terminaison pour les fonctionnalités du jeu

    // Getters et setters
}