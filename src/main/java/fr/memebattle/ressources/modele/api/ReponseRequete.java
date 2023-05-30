package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReponseRequete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T09:12:01.387469500-04:00[America/New_York]")
public class ReponseRequete   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("contenu")
  private String contenu;

  /**
   * Statut de la réponse
   */
  public enum StatutEnum {
    SUCC_S("Succès"),
    
    ERREUR("Erreur");

    private String value;

    StatutEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatutEnum fromValue(String value) {
      for (StatutEnum b : StatutEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("statut")
  private StatutEnum statut;

  public ReponseRequete id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifiant unique de la réponse
   * @return id
  */
  @ApiModelProperty(value = "Identifiant unique de la réponse")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReponseRequete contenu(String contenu) {
    this.contenu = contenu;
    return this;
  }

  /**
   * Contenu de la réponse
   * @return contenu
  */
  @ApiModelProperty(required = true, value = "Contenu de la réponse")
  @NotNull


  public String getContenu() {
    return contenu;
  }

  public void setContenu(String contenu) {
    this.contenu = contenu;
  }

  public ReponseRequete statut(StatutEnum statut) {
    this.statut = statut;
    return this;
  }

  /**
   * Statut de la réponse
   * @return statut
  */
  @ApiModelProperty(required = true, value = "Statut de la réponse")
  @NotNull


  public StatutEnum getStatut() {
    return statut;
  }

  public void setStatut(StatutEnum statut) {
    this.statut = statut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseRequete reponseRequete = (ReponseRequete) o;
    return Objects.equals(this.id, reponseRequete.id) &&
        Objects.equals(this.contenu, reponseRequete.contenu) &&
        Objects.equals(this.statut, reponseRequete.statut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contenu, statut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseRequete {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contenu: ").append(toIndentedString(contenu)).append("\n");
    sb.append("    statut: ").append(toIndentedString(statut)).append("\n");
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

