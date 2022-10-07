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
 * Deferred bill payment transaction information.
 */

@Schema(name = "DeferredPayments", description = "Deferred bill payment transaction information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DeferredPayments {

  @JsonProperty("numberOfPayments")
  private String numberOfPayments;

  @JsonProperty("paymentPlan")
  private String paymentPlan;

  @JsonProperty("timePeriod")
  private String timePeriod;

  public DeferredPayments numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of payments for a sale transaction if the customer pays the total amount in multiple transactions.
   * @return numberOfPayments
  */
  @Size(max = 32) 
  @Schema(name = "numberOfPayments", example = "5", description = "Number of payments for a sale transaction if the customer pays the total amount in multiple transactions.", required = false)
  public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public DeferredPayments paymentPlan(String paymentPlan) {
    this.paymentPlan = paymentPlan;
    return this;
  }

  /**
   * This field details the type of the Deferred Payment Plan (DPP) for Mexican payments.  Valid Values: * NO_INTEREST – No Interest charges * INTEREST – Interest charges * PAY_LATER – Pay at a Later Date 
   * @return paymentPlan
  */
  @Size(max = 11) 
  @Schema(name = "paymentPlan", example = "PAY_LATER", description = "This field details the type of the Deferred Payment Plan (DPP) for Mexican payments.  Valid Values: * NO_INTEREST – No Interest charges * INTEREST – Interest charges * PAY_LATER – Pay at a Later Date ", required = false)
  public String getPaymentPlan() {
    return paymentPlan;
  }

  public void setPaymentPlan(String paymentPlan) {
    this.paymentPlan = paymentPlan;
  }

  public DeferredPayments timePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Number of months for which the payment would not be enforced.
   * @return timePeriod
  */
  @Size(max = 64) 
  @Schema(name = "timePeriod", example = "12", description = "Number of months for which the payment would not be enforced.", required = false)
  public String getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeferredPayments deferredPayments = (DeferredPayments) o;
    return Objects.equals(this.numberOfPayments, deferredPayments.numberOfPayments) &&
        Objects.equals(this.paymentPlan, deferredPayments.paymentPlan) &&
        Objects.equals(this.timePeriod, deferredPayments.timePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfPayments, paymentPlan, timePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeferredPayments {\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    paymentPlan: ").append(toIndentedString(paymentPlan)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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

