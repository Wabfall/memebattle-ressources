package fr.memebattle.ressources.controller;

import fr.memebattle.ressources.modele.api.*;
import fr.memebattle.ressources.service.GameService;
import fr.memebattle.ressources.service.ImageService;
import fr.memebattle.ressources.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

    @PostMapping("/salon/creer")
    public ReponseCodeSalon creerSalon(@RequestBody CreerSalon creerSalon) {
        // Logique pour créer une nouvelle salle de jeu en utilisant les informations fournies dans roomRequest
        return gameService.creerSalon(creerSalon.getMaxJoueurs(), creerSalon.getGameMode());
    }

    @PostMapping("/salon/{idSalon}/rejoindre")
    public ReponseSalon rejoindreSalon(@PathVariable String idSalon, @RequestBody RejoindreSalon rejoindreSalon) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        return gameService.rejoindreSalon(idSalon, rejoindreSalon.getPseudo());
    }

    @PostMapping("/salon/{idSalon}/commencer")
    public void commencerPartie(@PathVariable String idSalon, @RequestBody String idJoueur) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        gameService.commencerPartie(idSalon, idJoueur);
    }
    @PostMapping("/salon/{idSalon}/quitter")
    public void quitterSalon(@PathVariable String idSalon, @RequestBody String idJoueur) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        gameService.quitterSalon(idSalon, idJoueur);
    }
    @GetMapping("/salon/{idSalon}/listeJoueurs")
    public List<String> recupererListeJoueurs(@PathVariable String idSalon) {
        // Logique pour permettre à un joueur de rejoindre une salle de jeu existante
        return gameService.recupererListeJoueurs(idSalon);
    }



    @PostMapping("/salon/{idSalon}/vote/{idImage}")
    public void voteImage(@PathVariable String idSalon, @PathVariable String idImage, @RequestBody Vote vote) {
        // Logique pour permettre à un joueur de voter pour une image dans une salle de jeu
        gameService.voteImage(idSalon, idImage, vote.getIdJoueur());
    }

    @GetMapping("/salon/{idSalon}/classement")
    public ReponseClassement recupererClassement(@PathVariable String idSalon) {
        // Logique pour permettre à un joueur de voter pour une image dans une salle de jeu
        return gameService.recupererClassement(idSalon);
    }

    @PostMapping("/salon/{idSalon}/images/envoie")
    public void envoieImage(@PathVariable String idSalon, @RequestBody String idJoueur, @RequestBody MultipartFile file) throws IOException {
        // Logique pour permettre à un joueur de voter pour une image dans une salle de jeu
        gameService.envoieImage(idSalon, idJoueur, file);
    }

    @PostMapping("/salon/{idSalon}/images/recevoir/fin-tour")
    public List<ReponseImage> recevoirImageFinTour(@PathVariable String idSalon, @RequestBody String idJoueur) {
        // Logique pour permettre à un joueur de voter pour une image dans une salle de jeu
        return gameService.recevoirImageFinTour(idSalon, idJoueur);
    }

    @PostMapping("/salon/{idSalon}/images/recevoir/debut-tour")
    public ReponseImage recevoirImageDebutTour(@PathVariable String idSalon) {
        // Logique pour permettre à un joueur de recevoir une image à légender
        return gameService.recevoirImageDebutTour(idSalon);
    }

    // Getters et setters
}