package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreerSalon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-23T13:43:47.188507600-04:00[America/New_York]")
public class CreerSalon   {
  @JsonProperty("nomSalon")
  private String nomSalon;

  @JsonProperty("maxJoueurs")
  private Integer maxJoueurs;

  @JsonProperty("gameMode")
  private String gameMode;

  @JsonProperty("pseudo")
  private String pseudo;

  public CreerSalon nomSalon(String nomSalon) {
    this.nomSalon = nomSalon;
    return this;
  }

  /**
   * Nom du salon à rejoindre
   * @return nomSalon
  */
  @ApiModelProperty(example = "OEOTW", value = "Nom du salon à rejoindre")


  public String getNomSalon() {
    return nomSalon;
  }

  public void setNomSalon(String nomSalon) {
    this.nomSalon = nomSalon;
  }

  public CreerSalon maxJoueurs(Integer maxJoueurs) {
    this.maxJoueurs = maxJoueurs;
    return this;
  }

  /**
   * Nombre de joueurs maximum du salon
   * @return maxJoueurs
  */
  @ApiModelProperty(example = "6", value = "Nombre de joueurs maximum du salon")


  public Integer getMaxJoueurs() {
    return maxJoueurs;
  }

  public void setMaxJoueurs(Integer maxJoueurs) {
    this.maxJoueurs = maxJoueurs;
  }

  public CreerSalon gameMode(String gameMode) {
    this.gameMode = gameMode;
    return this;
  }

  /**
   * Type de partie à jouer dans le salon
   * @return gameMode
  */
  @ApiModelProperty(example = "classique", value = "Type de partie à jouer dans le salon")


  public String getGameMode() {
    return gameMode;
  }

  public void setGameMode(String gameMode) {
    this.gameMode = gameMode;
  }

  public CreerSalon pseudo(String pseudo) {
    this.pseudo = pseudo;
    return this;
  }

  /**
   * Pseudonyme du joueur
   * @return pseudo
  */
  @ApiModelProperty(example = "Wabfall", value = "Pseudonyme du joueur")


  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreerSalon creerSalon = (CreerSalon) o;
    return Objects.equals(this.nomSalon, creerSalon.nomSalon) &&
        Objects.equals(this.maxJoueurs, creerSalon.maxJoueurs) &&
        Objects.equals(this.gameMode, creerSalon.gameMode) &&
        Objects.equals(this.pseudo, creerSalon.pseudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomSalon, maxJoueurs, gameMode, pseudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreerSalon {\n");
    
    sb.append("    nomSalon: ").append(toIndentedString(nomSalon)).append("\n");
    sb.append("    maxJoueurs: ").append(toIndentedString(maxJoueurs)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    pseudo: ").append(toIndentedString(pseudo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

