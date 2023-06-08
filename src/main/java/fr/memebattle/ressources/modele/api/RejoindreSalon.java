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
 * RejoindreSalon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-02T10:39:11.257203500-04:00[America/New_York]")
public class RejoindreSalon   {
  @JsonProperty("nomSalon")
  private String nomSalon;

  @JsonProperty("pseudo")
  private String pseudo;

  public RejoindreSalon nomSalon(String nomSalon) {
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

  public RejoindreSalon pseudo(String pseudo) {
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
    RejoindreSalon rejoindreSalon = (RejoindreSalon) o;
    return Objects.equals(this.nomSalon, rejoindreSalon.nomSalon) &&
        Objects.equals(this.pseudo, rejoindreSalon.pseudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomSalon, pseudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejoindreSalon {\n");
    
    sb.append("    nomSalon: ").append(toIndentedString(nomSalon)).append("\n");
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

