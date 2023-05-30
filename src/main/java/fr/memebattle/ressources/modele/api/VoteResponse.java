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
 * VoteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T12:27:48.761145800-04:00[America/New_York]")
public class VoteResponse   {
  @JsonProperty("voteId")
  private String voteId;

  @JsonProperty("imageId")
  private String imageId;

  @JsonProperty("playerId")
  private String playerId;

  public VoteResponse voteId(String voteId) {
    this.voteId = voteId;
    return this;
  }

  /**
   * ID of the vote
   * @return voteId
  */
  @ApiModelProperty(value = "ID of the vote")


  public String getVoteId() {
    return voteId;
  }

  public void setVoteId(String voteId) {
    this.voteId = voteId;
  }

  public VoteResponse imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * ID of the voted image
   * @return imageId
  */
  @ApiModelProperty(value = "ID of the voted image")


  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public VoteResponse playerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * ID of the player who cast the vote
   * @return playerId
  */
  @ApiModelProperty(value = "ID of the player who cast the vote")


  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteResponse voteResponse = (VoteResponse) o;
    return Objects.equals(this.voteId, voteResponse.voteId) &&
        Objects.equals(this.imageId, voteResponse.imageId) &&
        Objects.equals(this.playerId, voteResponse.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voteId, imageId, playerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteResponse {\n");
    
    sb.append("    voteId: ").append(toIndentedString(voteId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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

