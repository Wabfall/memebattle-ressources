package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReponseSalon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-29T15:38:46.103042800-04:00[America/New_York]")
public class ReponseSalon   {
  @JsonProperty("idSalon")
  private String idSalon;

  @JsonProperty("nomSalon")
  private String nomSalon;

  @JsonProperty("maxJoueurs")
  private Integer maxJoueurs;

  @JsonProperty("gameMode")
  private String gameMode;

  @JsonProperty("idJoueur")
  private String idJoueur;

  @JsonProperty("pseudo")
  private String pseudo;

  @JsonProperty("numJoueur")
  private BigDecimal numJoueur;

  public ReponseSalon idSalon(String idSalon) {
    this.idSalon = idSalon;
    return this;
  }

  /**
   * Identifiant du salon qui vient d'être créé
   * @return idSalon
  */
  @ApiModelProperty(example = "223418136f238113312d96f5", value = "Identifiant du salon qui vient d'être créé")


  public String getIdSalon() {
    return idSalon;
  }

  public void setIdSalon(String idSalon) {
    this.idSalon = idSalon;
  }

  public ReponseSalon nomSalon(String nomSalon) {
    this.nomSalon = nomSalon;
    return this;
  }

  /**
   * Nom court du salon qui vient d'être créé
   * @return nomSalon
  */
  @ApiModelProperty(example = "OEOTW", value = "Nom court du salon qui vient d'être créé")


  public String getNomSalon() {
    return nomSalon;
  }

  public void setNomSalon(String nomSalon) {
    this.nomSalon = nomSalon;
  }

  public ReponseSalon maxJoueurs(Integer maxJoueurs) {
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

  public ReponseSalon gameMode(String gameMode) {
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

  public ReponseSalon idJoueur(String idJoueur) {
    this.idJoueur = idJoueur;
    return this;
  }

  /**
   * Identifiant du joueur
   * @return idJoueur
  */
  @ApiModelProperty(example = "abc123", value = "Identifiant du joueur")


  public String getIdJoueur() {
    return idJoueur;
  }

  public void setIdJoueur(String idJoueur) {
    this.idJoueur = idJoueur;
  }

  public ReponseSalon pseudo(String pseudo) {
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

  public ReponseSalon numJoueur(BigDecimal numJoueur) {
    this.numJoueur = numJoueur;
    return this;
  }

  /**
   * Numero du joueur
   * @return numJoueur
  */
  @ApiModelProperty(value = "Numero du joueur")

  @Valid

  public BigDecimal getNumJoueur() {
    return numJoueur;
  }

  public void setNumJoueur(BigDecimal numJoueur) {
    this.numJoueur = numJoueur;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseSalon reponseSalon = (ReponseSalon) o;
    return Objects.equals(this.idSalon, reponseSalon.idSalon) &&
        Objects.equals(this.nomSalon, reponseSalon.nomSalon) &&
        Objects.equals(this.maxJoueurs, reponseSalon.maxJoueurs) &&
        Objects.equals(this.gameMode, reponseSalon.gameMode) &&
        Objects.equals(this.idJoueur, reponseSalon.idJoueur) &&
        Objects.equals(this.pseudo, reponseSalon.pseudo) &&
        Objects.equals(this.numJoueur, reponseSalon.numJoueur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSalon, nomSalon, maxJoueurs, gameMode, idJoueur, pseudo, numJoueur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseSalon {\n");
    
    sb.append("    idSalon: ").append(toIndentedString(idSalon)).append("\n");
    sb.append("    nomSalon: ").append(toIndentedString(nomSalon)).append("\n");
    sb.append("    maxJoueurs: ").append(toIndentedString(maxJoueurs)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    idJoueur: ").append(toIndentedString(idJoueur)).append("\n");
    sb.append("    pseudo: ").append(toIndentedString(pseudo)).append("\n");
    sb.append("    numJoueur: ").append(toIndentedString(numJoueur)).append("\n");
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

