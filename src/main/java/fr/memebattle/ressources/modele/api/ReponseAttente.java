package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * liste de joueurs en attente
 */
@ApiModel(description = "liste de joueurs en attente")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-03T23:22:59.305186400-04:00[America/New_York]")
public class ReponseAttente   {
  @JsonProperty("listeJoueurs")
  @Valid
  private List<String> listeJoueurs = null;

  @JsonProperty("partieEstCommence")
  private Boolean partieEstCommence;

  public ReponseAttente listeJoueurs(List<String> listeJoueurs) {
    this.listeJoueurs = listeJoueurs;
    return this;
  }

  public ReponseAttente addListeJoueursItem(String listeJoueursItem) {
    if (this.listeJoueurs == null) {
      this.listeJoueurs = new ArrayList<>();
    }
    this.listeJoueurs.add(listeJoueursItem);
    return this;
  }

  /**
   * liste de joueurs en attente
   * @return listeJoueurs
  */
  @ApiModelProperty(value = "liste de joueurs en attente")


  public List<String> getListeJoueurs() {
    return listeJoueurs;
  }

  public void setListeJoueurs(List<String> listeJoueurs) {
    this.listeJoueurs = listeJoueurs;
  }

  public ReponseAttente partieEstCommence(Boolean partieEstCommence) {
    this.partieEstCommence = partieEstCommence;
    return this;
  }

  /**
   * etat de la partie
   * @return partieEstCommence
  */
  @ApiModelProperty(example = "true", value = "etat de la partie")


  public Boolean getPartieEstCommence() {
    return partieEstCommence;
  }

  public void setPartieEstCommence(Boolean partieEstCommence) {
    this.partieEstCommence = partieEstCommence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseAttente reponseAttente = (ReponseAttente) o;
    return Objects.equals(this.listeJoueurs, reponseAttente.listeJoueurs) &&
        Objects.equals(this.partieEstCommence, reponseAttente.partieEstCommence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listeJoueurs, partieEstCommence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseAttente {\n");
    
    sb.append("    listeJoueurs: ").append(toIndentedString(listeJoueurs)).append("\n");
    sb.append("    partieEstCommence: ").append(toIndentedString(partieEstCommence)).append("\n");
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

