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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-29T15:38:46.103042800-04:00[America/New_York]")
public class CreerSalon   {
  @JsonProperty("maxJoueurs")
  private Integer maxJoueurs;

  @JsonProperty("gameMode")
  private String gameMode;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreerSalon creerSalon = (CreerSalon) o;
    return Objects.equals(this.maxJoueurs, creerSalon.maxJoueurs) &&
        Objects.equals(this.gameMode, creerSalon.gameMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxJoueurs, gameMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreerSalon {\n");
    
    sb.append("    maxJoueurs: ").append(toIndentedString(maxJoueurs)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
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

