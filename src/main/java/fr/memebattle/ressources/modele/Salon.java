package fr.memebattle.ressources.modele;

import fr.memebattle.ressources.modele.api.Vote;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "salons")
public class Salon {
  @Id
  private ObjectId id;

  private String nomSalon;
  private int nombreMaxJoueurs;
  private String gamemode;
  private List<ObjectId> joueurs;
  private List<ObjectId> imagesJoueurs;

  private List<ObjectId> imagesJeu;
  private List<Vote> votes;

  private int numeroTour;

  public Salon(ObjectId id, String nomSalon, int nombreMaxJoueurs, String gamemode) {
    this.id = id;
    this.nomSalon = nomSalon;
    this.nombreMaxJoueurs = nombreMaxJoueurs;
    this.gamemode = gamemode;
    this.joueurs = new ArrayList<>();
  }

  public ObjectId getId() {
    return id;
  }

  public int getNombreMaxJoueurs() {
    return nombreMaxJoueurs;
  }

  public String getNomSalon() {
    return nomSalon;
  }

  public void setNomSalon(String nomSalon) {
    this.nomSalon = nomSalon;
  }

  public String getGamemode() {
    return gamemode;
  }

  public void setGamemode(String gamemode) {
    this.gamemode = gamemode;
  }

  public void ajouterJoueur(ObjectId joueur) {
    this.joueurs.add(joueur);
  }

  public void retirerJoueur(ObjectId joueur) {
    this.joueurs.remove(joueur);
  }

  public void ajouterImage(ObjectId image) {
    this.imagesJoueurs.add(image);
  }

  public List<ObjectId> getImagesJoueurs() {
    return imagesJoueurs;
  }

  public void setImagesJoueurs(List<ObjectId> imagesJoueurs) {
    this.imagesJoueurs = imagesJoueurs;
  }

  public void retirerImage(ObjectId image) {
    this.joueurs.remove(image);
  }

  public List<Vote> getVotes() {
    return votes;
  }

  public void ajouterVote(String idJoueur, String idImage) {
    Vote vote = new Vote();
    vote.setIdJoueur(idJoueur);
    vote.setIdImage(idImage);
    this.votes.add(vote);
  }

  public void retirerVote(ObjectId vote) {
    this.votes.remove(vote);
  }

  public void setVotes(List<Vote> votes) {
    this.votes = votes;
  }

  public int getNumeroTour() {
    return numeroTour;
  }

  public void setNumeroTour(int numeroTour) {
    this.numeroTour = numeroTour;
  }
  public List<ObjectId> getImagesJeu() {
    return imagesJeu;
  }

  public void setImagesJeu(List<ObjectId> imagesJeu) {
    this.imagesJeu = imagesJeu;
  }
  public List<ObjectId> getJoueurs() {
    return joueurs;
  }

}
