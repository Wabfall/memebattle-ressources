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
 * Joueur
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T09:12:01.159031200-04:00[America/New_York]")
public class Joueur   {
  @JsonProperty("pseudo")
  private String pseudo;

  @JsonProperty("age")
  private Integer age;

  public Joueur pseudo(String pseudo) {
    this.pseudo = pseudo;
    return this;
  }

  /**
   * Get pseudo
   * @return pseudo
  */
  @ApiModelProperty(value = "")


  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public Joueur age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Joueur joueur = (Joueur) o;
    return Objects.equals(this.pseudo, joueur.pseudo) &&
        Objects.equals(this.age, joueur.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudo, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Joueur {\n");
    
    sb.append("    pseudo: ").append(toIndentedString(pseudo)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

