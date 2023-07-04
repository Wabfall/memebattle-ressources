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
 * RequeteJoueur
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-03T23:22:59.305186400-04:00[America/New_York]")
public class RequeteJoueur   {
  @JsonProperty("idJoueur")
  private String idJoueur;

  public RequeteJoueur idJoueur(String idJoueur) {
    this.idJoueur = idJoueur;
    return this;
  }

  /**
   * idDuJoueur
   * @return idJoueur
  */
  @ApiModelProperty(example = "649dc0aad3f99b01e287a40a", value = "idDuJoueur")


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
    RequeteJoueur requeteJoueur = (RequeteJoueur) o;
    return Objects.equals(this.idJoueur, requeteJoueur.idJoueur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idJoueur);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequeteJoueur {\n");
    
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

