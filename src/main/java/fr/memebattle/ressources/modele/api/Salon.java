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
 * Salon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T09:12:01.268778800-04:00[America/New_York]")
public class Salon   {
  @JsonProperty("salonName")
  private String salonName;

  @JsonProperty("maxJoueurs")
  private Integer maxJoueurs;

  @JsonProperty("gameMode")
  private String gameMode;

  public Salon salonName(String salonName) {
    this.salonName = salonName;
    return this;
  }

  /**
   * Get salonName
   * @return salonName
  */
  @ApiModelProperty(value = "")


  public String getSalonName() {
    return salonName;
  }

  public void setSalonName(String salonName) {
    this.salonName = salonName;
  }

  public Salon maxJoueurs(Integer maxJoueurs) {
    this.maxJoueurs = maxJoueurs;
    return this;
  }

  /**
   * Get maxJoueurs
   * @return maxJoueurs
  */
  @ApiModelProperty(value = "")


  public Integer getMaxJoueurs() {
    return maxJoueurs;
  }

  public void setMaxJoueurs(Integer maxJoueurs) {
    this.maxJoueurs = maxJoueurs;
  }

  public Salon gameMode(String gameMode) {
    this.gameMode = gameMode;
    return this;
  }

  /**
   * Get gameMode
   * @return gameMode
  */
  @ApiModelProperty(value = "")


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
    Salon salon = (Salon) o;
    return Objects.equals(this.salonName, salon.salonName) &&
        Objects.equals(this.maxJoueurs, salon.maxJoueurs) &&
        Objects.equals(this.gameMode, salon.gameMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salonName, maxJoueurs, gameMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Salon {\n");
    
    sb.append("    salonName: ").append(toIndentedString(salonName)).append("\n");
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

