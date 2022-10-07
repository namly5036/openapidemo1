package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * My Return Score Details
 */

@Schema(name = "MyReturnScoreDetails", description = "My Return Score Details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class MyReturnScoreDetails {

  @JsonProperty("averageReturnValue")
  private BigDecimal averageReturnValue;

  @JsonProperty("averageOrderValue")
  private BigDecimal averageOrderValue;

  @JsonProperty("percentSalesReturned")
  private BigDecimal percentSalesReturned;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("returnProbabilityProfile")
  private String returnProbabilityProfile;

  public MyReturnScoreDetails averageReturnValue(BigDecimal averageReturnValue) {
    this.averageReturnValue = averageReturnValue;
    return this;
  }

  /**
   * Average amount value returned (ARV)
   * @return averageReturnValue
  */
  @Valid 
  @Schema(name = "averageReturnValue", example = "45.53", description = "Average amount value returned (ARV)", required = false)
  public BigDecimal getAverageReturnValue() {
    return averageReturnValue;
  }

  public void setAverageReturnValue(BigDecimal averageReturnValue) {
    this.averageReturnValue = averageReturnValue;
  }

  public MyReturnScoreDetails averageOrderValue(BigDecimal averageOrderValue) {
    this.averageOrderValue = averageOrderValue;
    return this;
  }

  /**
   * Average amount value spent (AOV)
   * @return averageOrderValue
  */
  @Valid 
  @Schema(name = "averageOrderValue", example = "275.25", description = "Average amount value spent (AOV)", required = false)
  public BigDecimal getAverageOrderValue() {
    return averageOrderValue;
  }

  public void setAverageOrderValue(BigDecimal averageOrderValue) {
    this.averageOrderValue = averageOrderValue;
  }

  public MyReturnScoreDetails percentSalesReturned(BigDecimal percentSalesReturned) {
    this.percentSalesReturned = percentSalesReturned;
    return this;
  }

  /**
   * % of sales returned (by Amount)
   * minimum: 0
   * maximum: 1
   * @return percentSalesReturned
  */
  @Valid @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "percentSalesReturned", example = "0.3", description = "% of sales returned (by Amount)", required = false)
  public BigDecimal getPercentSalesReturned() {
    return percentSalesReturned;
  }

  public void setPercentSalesReturned(BigDecimal percentSalesReturned) {
    this.percentSalesReturned = percentSalesReturned;
  }

  public MyReturnScoreDetails score(Integer score) {
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

  public MyReturnScoreDetails returnProbabilityProfile(String returnProbabilityProfile) {
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
    MyReturnScoreDetails myReturnScoreDetails = (MyReturnScoreDetails) o;
    return Objects.equals(this.averageReturnValue, myReturnScoreDetails.averageReturnValue) &&
        Objects.equals(this.averageOrderValue, myReturnScoreDetails.averageOrderValue) &&
        Objects.equals(this.percentSalesReturned, myReturnScoreDetails.percentSalesReturned) &&
        Objects.equals(this.score, myReturnScoreDetails.score) &&
        Objects.equals(this.returnProbabilityProfile, myReturnScoreDetails.returnProbabilityProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageReturnValue, averageOrderValue, percentSalesReturned, score, returnProbabilityProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyReturnScoreDetails {\n");
    sb.append("    averageReturnValue: ").append(toIndentedString(averageReturnValue)).append("\n");
    sb.append("    averageOrderValue: ").append(toIndentedString(averageOrderValue)).append("\n");
    sb.append("    percentSalesReturned: ").append(toIndentedString(percentSalesReturned)).append("\n");
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

