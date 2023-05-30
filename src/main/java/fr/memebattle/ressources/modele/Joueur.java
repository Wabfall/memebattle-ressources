package fr.memebattle.ressources.modele;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "joueurs")
public class Joueur {
  @Id
  private ObjectId id;
  private String pseudo;

  public Joueur(ObjectId id, String pseudo) {
    this.id = id;
    this.pseudo = pseudo;
  }

  public ObjectId getId() {
    return id;
  }

  public String getPseudo() {
    return pseudo;
  }

  // Autres méthodes et fonctionnalités spécifiques aux joueurs
}
