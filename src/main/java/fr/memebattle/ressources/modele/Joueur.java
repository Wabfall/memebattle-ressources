package fr.memebattle.ressources.modele;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "joueurs")
public class Joueur {
  @Id
  private ObjectId id;
  @Field("pseudo")
  private String pseudo;

  @Field("score")
  private int score;


  public Joueur(ObjectId id, String pseudo) {
    this.id = id;
    this.pseudo = pseudo;
    this.score =  0;
  }

  public ObjectId getId() {
    return id;
  }

  public String getPseudo() {
    return pseudo;
  }
  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }



  // Autres méthodes et fonctionnalités spécifiques aux joueurs
}
