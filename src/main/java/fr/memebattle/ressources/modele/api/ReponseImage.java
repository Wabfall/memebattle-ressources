package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReponseImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-04T01:26:38.459157800-04:00[America/New_York]")
public class ReponseImage   {
  @JsonProperty("nomFichier")
  private String nomFichier;

  @JsonProperty("contenuImage")
  private byte[] contenuImage;

  @JsonProperty("idImage")
  private String idImage;

  public ReponseImage nomFichier(String nomFichier) {
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

  public ReponseImage contenuImage(byte[] contenuImage) {
    this.contenuImage = contenuImage;
    return this;
  }

  /**
   * contenu de l'image encodé en base64
   * @return contenuImage
  */
  @ApiModelProperty(value = "contenu de l'image encodé en base64")


  public byte[] getContenuImage() {
    return contenuImage;
  }

  public void setContenuImage(byte[] contenuImage) {
    this.contenuImage = contenuImage;
  }

  public ReponseImage idImage(String idImage) {
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
    ReponseImage reponseImage = (ReponseImage) o;
    return Objects.equals(this.nomFichier, reponseImage.nomFichier) &&
        Arrays.equals(this.contenuImage, reponseImage.contenuImage) &&
        Objects.equals(this.idImage, reponseImage.idImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomFichier, Arrays.hashCode(contenuImage), idImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseImage {\n");
    
    sb.append("    nomFichier: ").append(toIndentedString(nomFichier)).append("\n");
    sb.append("    contenuImage: ").append(toIndentedString(contenuImage)).append("\n");
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

