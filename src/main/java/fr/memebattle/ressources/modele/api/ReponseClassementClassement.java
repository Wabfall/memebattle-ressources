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
 * ReponseClassementClassement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-03T23:22:59.648730500-04:00[America/New_York]")
public class ReponseClassementClassement   {
  @JsonProperty("pseudo")
  private String pseudo;

  @JsonProperty("score")
  private Integer score;

  public ReponseClassementClassement pseudo(String pseudo) {
    this.pseudo = pseudo;
    return this;
  }

  /**
   * Pseudo du joueur
   * @return pseudo
  */
  @ApiModelProperty(example = "wabfall", value = "Pseudo du joueur")


  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public ReponseClassementClassement score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Score du joueur
   * @return score
  */
  @ApiModelProperty(example = "800", value = "Score du joueur")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseClassementClassement reponseClassementClassement = (ReponseClassementClassement) o;
    return Objects.equals(this.pseudo, reponseClassementClassement.pseudo) &&
        Objects.equals(this.score, reponseClassementClassement.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudo, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseClassementClassement {\n");
    
    sb.append("    pseudo: ").append(toIndentedString(pseudo)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

