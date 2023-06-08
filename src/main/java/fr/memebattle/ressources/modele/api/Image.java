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
 * Image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-02T10:39:10.859034900-04:00[America/New_York]")
public class Image   {
  @JsonProperty("nomFichier")
  private String nomFichier;

  @JsonProperty("cheminImage")
  private String cheminImage;

  @JsonProperty("idImage")
  private String idImage;

  public Image nomFichier(String nomFichier) {
    this.nomFichier = nomFichier;
    return this;
  }

  /**
   * nom de l'image
   * @return nomFichier
  */
  @ApiModelProperty(value = "nom de l'image")


  public String getNomFichier() {
    return nomFichier;
  }

  public void setNomFichier(String nomFichier) {
    this.nomFichier = nomFichier;
  }

  public Image cheminImage(String cheminImage) {
    this.cheminImage = cheminImage;
    return this;
  }

  /**
   * chemin pour récupérer l'image
   * @return cheminImage
  */
  @ApiModelProperty(value = "chemin pour récupérer l'image")


  public String getCheminImage() {
    return cheminImage;
  }

  public void setCheminImage(String cheminImage) {
    this.cheminImage = cheminImage;
  }

  public Image idImage(String idImage) {
    this.idImage = idImage;
    return this;
  }

  /**
   * id de l'Image
   * @return idImage
  */
  @ApiModelProperty(value = "id de l'Image")


  public String getIdImage() {
    return idImage;
  }

  public void setIdImage(String idImage) {
    this.idImage = idImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.nomFichier, image.nomFichier) &&
        Objects.equals(this.cheminImage, image.cheminImage) &&
        Objects.equals(this.idImage, image.idImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomFichier, cheminImage, idImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    nomFichier: ").append(toIndentedString(nomFichier)).append("\n");
    sb.append("    cheminImage: ").append(toIndentedString(cheminImage)).append("\n");
    sb.append("    idImage: ").append(toIndentedString(idImage)).append("\n");
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

