package fr.memebattle.ressources.modele.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.memebattle.ressources.modele.api.ReponseClassementClassement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReponseClassement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-04T01:26:38.576275300-04:00[America/New_York]")
public class ReponseClassement   {
  @JsonProperty("classement")
  @Valid
  private List<ReponseClassementClassement> classement = null;

  public ReponseClassement classement(List<ReponseClassementClassement> classement) {
    this.classement = classement;
    return this;
  }

  public ReponseClassement addClassementItem(ReponseClassementClassement classementItem) {
    if (this.classement == null) {
      this.classement = new ArrayList<>();
    }
    this.classement.add(classementItem);
    return this;
  }

  /**
   * Get classement
   * @return classement
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReponseClassementClassement> getClassement() {
    return classement;
  }

  public void setClassement(List<ReponseClassementClassement> classement) {
    this.classement = classement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseClassement reponseClassement = (ReponseClassement) o;
    return Objects.equals(this.classement, reponseClassement.classement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseClassement {\n");
    
    sb.append("    classement: ").append(toIndentedString(classement)).append("\n");
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

