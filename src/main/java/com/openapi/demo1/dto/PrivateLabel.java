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
 * Private label transaction information.
 */

@Schema(name = "PrivateLabel", description = "Private label transaction information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PrivateLabel {

  @JsonProperty("paymentSource")
  private String paymentSource;

  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("specialFinanceIndicator")
  private String specialFinanceIndicator;

  public PrivateLabel paymentSource(String paymentSource) {
    this.paymentSource = paymentSource;
    return this;
  }

  /**
   * Private label card source.
   * @return paymentSource
  */
  @Size(max = 256) 
  @Schema(name = "paymentSource", example = "SHELL", description = "Private label card source.", required = false)
  public String getPaymentSource() {
    return paymentSource;
  }

  public void setPaymentSource(String paymentSource) {
    this.paymentSource = paymentSource;
  }

  public PrivateLabel paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Type of transaction.
   * @return paymentType
  */
  @Size(max = 16) 
  @Schema(name = "paymentType", example = "REFUND", description = "Type of transaction.", required = false)
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PrivateLabel specialFinanceIndicator(String specialFinanceIndicator) {
    this.specialFinanceIndicator = specialFinanceIndicator;
    return this;
  }

  /**
   * Indicates if special finance term and rate.
   * @return specialFinanceIndicator
  */
  @Size(max = 16) 
  @Schema(name = "specialFinanceIndicator", example = "24/0", description = "Indicates if special finance term and rate.", required = false)
  public String getSpecialFinanceIndicator() {
    return specialFinanceIndicator;
  }

  public void setSpecialFinanceIndicator(String specialFinanceIndicator) {
    this.specialFinanceIndicator = specialFinanceIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateLabel privateLabel = (PrivateLabel) o;
    return Objects.equals(this.paymentSource, privateLabel.paymentSource) &&
        Objects.equals(this.paymentType, privateLabel.paymentType) &&
        Objects.equals(this.specialFinanceIndicator, privateLabel.specialFinanceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSource, paymentType, specialFinanceIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateLabel {\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    specialFinanceIndicator: ").append(toIndentedString(specialFinanceIndicator)).append("\n");
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

