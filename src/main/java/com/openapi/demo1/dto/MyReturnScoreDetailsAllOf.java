package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MyReturnScoreDetailsAllOf
 */

@JsonTypeName("MyReturnScoreDetails_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class MyReturnScoreDetailsAllOf {

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("returnProbabilityProfile")
  private String returnProbabilityProfile;

  public MyReturnScoreDetailsAllOf score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Normalized score of a return probability. 0 indicating a low returner and 100 indicating a high returner.
   * minimum: 0
   * maximum: 100
   * @return score
  */
  @Min(0) @Max(100) 
  @Schema(name = "score", example = "100", description = "Normalized score of a return probability. 0 indicating a low returner and 100 indicating a high returner.", required = false)
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MyReturnScoreDetailsAllOf returnProbabilityProfile(String returnProbabilityProfile) {
    this.returnProbabilityProfile = returnProbabilityProfile;
    return this;
  }

  /**
   * Bucketed return probability profile  Valid Values: * High * Low 
   * @return returnProbabilityProfile
  */
  
  @Schema(name = "returnProbabilityProfile", example = "High", description = "Bucketed return probability profile  Valid Values: * High * Low ", required = false)
  public String getReturnProbabilityProfile() {
    return returnProbabilityProfile;
  }

  public void setReturnProbabilityProfile(String returnProbabilityProfile) {
    this.returnProbabilityProfile = returnProbabilityProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyReturnScoreDetailsAllOf myReturnScoreDetailsAllOf = (MyReturnScoreDetailsAllOf) o;
    return Objects.equals(this.score, myReturnScoreDetailsAllOf.score) &&
        Objects.equals(this.returnProbabilityProfile, myReturnScoreDetailsAllOf.returnProbabilityProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, returnProbabilityProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyReturnScoreDetailsAllOf {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    returnProbabilityProfile: ").append(toIndentedString(returnProbabilityProfile)).append("\n");
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

