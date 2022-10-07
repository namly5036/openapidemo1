package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Fraud related Parameters
 */

@Schema(name = "FraudAttributes", description = "Fraud related Parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class FraudAttributes {

  @JsonProperty("riskScore")
  private Integer riskScore;

  @JsonProperty("suspicious")
  private Boolean suspicious;

  public FraudAttributes riskScore(Integer riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Merchant’s defined fraud risk score for this transaction 0-100, 100 being highest risk.
   * maximum: 100
   * @return riskScore
  */
  @Max(100) 
  @Schema(name = "riskScore", example = "100", description = "Merchant’s defined fraud risk score for this transaction 0-100, 100 being highest risk.", required = false)
  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public FraudAttributes suspicious(Boolean suspicious) {
    this.suspicious = suspicious;
    return this;
  }

  /**
   * If the merchant detected suspicious activity on card, account or device used for this transaction in prior 60 days.
   * @return suspicious
  */
  
  @Schema(name = "suspicious", example = "true", description = "If the merchant detected suspicious activity on card, account or device used for this transaction in prior 60 days.", required = false)
  public Boolean getSuspicious() {
    return suspicious;
  }

  public void setSuspicious(Boolean suspicious) {
    this.suspicious = suspicious;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudAttributes fraudAttributes = (FraudAttributes) o;
    return Objects.equals(this.riskScore, fraudAttributes.riskScore) &&
        Objects.equals(this.suspicious, fraudAttributes.suspicious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskScore, suspicious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAttributes {\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    suspicious: ").append(toIndentedString(suspicious)).append("\n");
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

