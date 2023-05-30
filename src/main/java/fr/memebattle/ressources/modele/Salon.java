package fr.memebattle.ressources.modele;
import java.util.ArrayList;
import java.util.List;
import fr.memebattle.ressources.modele.Joueur;

public class Salon {
  private String id;
  private int nombreMaxJoueurs;
  private String gamemode;
  private List<Joueur> joueurs;

  public Salon(String id, int nombreMaxJoueurs, String gamemode) {
    this.id = id;
    this.nombreMaxJoueurs = nombreMaxJoueurs;
    this.gamemode = gamemode;
    this.joueurs = new ArrayList<>();
  }

  public String getId() {
    return id;
  }

  public int getNombreMaxJoueurs() {
    return nombreMaxJoueurs;
  }

  public String getGamemode() {
    return gamemode;
  }

  public void setGamemode(String gamemode) {
    this.gamemode = gamemode;
  }

  public List<Joueur> getJoueurs() {
    return joueurs;
  }

  public void ajouterJoueur(Joueur joueur) {
    joueurs.add(joueur);
  }

  public void supprimerJoueur(Joueur joueur) {
    joueurs.remove(joueur);
  }
}
