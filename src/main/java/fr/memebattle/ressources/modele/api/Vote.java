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
 * Vote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-29T15:38:46.376692400-04:00[America/New_York]")
public class Vote   {
  @JsonProperty("idImage")
  private String idImage;

  @JsonProperty("idJoueur")
  private String idJoueur;

  public Vote idImage(String idImage) {
    this.idImage = idImage;
    return this;
  }

  /**
   * ID de l'image à voter
   * @return idImage
  */
  @ApiModelProperty(value = "ID de l'image à voter")


  public String getIdImage() {
    return idImage;
  }

  public void setIdImage(String idImage) {
    this.idImage = idImage;
  }

  public Vote idJoueur(String idJoueur) {
    this.idJoueur = idJoueur;
    return this;
  }

  /**
   * ID du joueur qui effectue le vote
   * @return idJoueur
  */
  @ApiModelProperty(value = "ID du joueur qui effectue le vote")


  public String getIdJoueur() {
    return idJoueur;
  }

  public void setIdJoueur(String idJoueur) {
    this.idJoueur = idJoueur;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vote vote = (Vote) o;
    return Objects.equals(this.idImage, vote.idImage) &&
        Objects.equals(this.idJoueur, vote.idJoueur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idImage, idJoueur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vote {\n");
    
    sb.append("    idImage: ").append(toIndentedString(idImage)).append("\n");
    sb.append("    idJoueur: ").append(toIndentedString(idJoueur)).append("\n");
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

