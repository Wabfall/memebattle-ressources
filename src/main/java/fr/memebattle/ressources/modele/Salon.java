package fr.memebattle.ressources.modele;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "salons")
public class Salon {
  @Id
  private ObjectId id;
  private int nombreMaxJoueurs;
  private String gamemode;
  private List<ObjectId> joueurs;

  public Salon(ObjectId id, int nombreMaxJoueurs, String gamemode) {
    this.id = id;
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

  public String getGamemode() {
    return gamemode;
  }

  public void setGamemode(String gamemode) {
    this.gamemode = gamemode;
  }

  public List<ObjectId> getJoueurs() {
    return joueurs;
  }
}
