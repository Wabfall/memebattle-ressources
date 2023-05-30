package fr.memebattle.ressources.modele;
public class Joueur {
  private String id;
  private String pseudo;

  public Joueur(String id, String pseudo) {
    this.id = id;
    this.pseudo = pseudo;
  }

  public String getId() {
    return id;
  }

  public String getPseudo() {
    return pseudo;
  }

  // Autres méthodes et fonctionnalités spécifiques aux joueurs
}
