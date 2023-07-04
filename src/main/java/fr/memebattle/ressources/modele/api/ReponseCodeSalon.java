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
 * ReponseCodeSalon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-03T23:22:59.305186400-04:00[America/New_York]")
public class ReponseCodeSalon   {
  @JsonProperty("codeSalon")
  private String codeSalon;

  public ReponseCodeSalon codeSalon(String codeSalon) {
    this.codeSalon = codeSalon;
    return this;
  }

  /**
   * Nom court du salon qui vient d'être créé
   * @return codeSalon
  */
  @ApiModelProperty(example = "OEOTW", value = "Nom court du salon qui vient d'être créé")


  public String getCodeSalon() {
    return codeSalon;
  }

  public void setCodeSalon(String codeSalon) {
    this.codeSalon = codeSalon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReponseCodeSalon reponseCodeSalon = (ReponseCodeSalon) o;
    return Objects.equals(this.codeSalon, reponseCodeSalon.codeSalon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSalon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReponseCodeSalon {\n");
    
    sb.append("    codeSalon: ").append(toIndentedString(codeSalon)).append("\n");
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

