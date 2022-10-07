package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Recurring
 */

@Schema(name = "Recurring", description = "Recurring")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Recurring {

  @JsonProperty("frequency")
  private String frequency;

  @JsonProperty("merchantDeclineAdvice")
  private String merchantDeclineAdvice;

  @JsonProperty("expiry")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate expiry;

  public Recurring frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Number of days between transactions.  Valid Values: * ONCE - One Time * DAILY - Every Day * WEEKLY - Every 7 Days * BI_WEEKLY - Every 14 Days * SEMI_MONTHLY - Every 15 Days * MONTHLY - Every Month on the Same Date * BI_MONTHLY - Every 2 Months on the Same Date * QUARTERLY - Every 3 Months on the Same Date * 4_MONTHS - Every 4 Months on the Same Date * SEMI_ANNUALLY - Every 6 Months on the Same Date * ANNUALLY - Once a Year on the Same Date  
   * @return frequency
  */
  
  @Schema(name = "frequency", example = "MONTHLY", description = "Number of days between transactions.  Valid Values: * ONCE - One Time * DAILY - Every Day * WEEKLY - Every 7 Days * BI_WEEKLY - Every 14 Days * SEMI_MONTHLY - Every 15 Days * MONTHLY - Every Month on the Same Date * BI_MONTHLY - Every 2 Months on the Same Date * QUARTERLY - Every 3 Months on the Same Date * 4_MONTHS - Every 4 Months on the Same Date * SEMI_ANNUALLY - Every 6 Months on the Same Date * ANNUALLY - Once a Year on the Same Date  ", required = false)
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public Recurring merchantDeclineAdvice(String merchantDeclineAdvice) {
    this.merchantDeclineAdvice = merchantDeclineAdvice;
    return this;
  }

  /**
   * Identifies the reason for declining a MasterCard and Visa recurring payment transaction.  Valid Values: * NOT_PROVIDED * NEW_ACCOUNT_INFORMATION * TRY_AGAIN_LATER * DO_NOT_TRY_AGAIN * TOKEN_NOT_SUPPORTED * DO_NOT_HONOR 
   * @return merchantDeclineAdvice
  */
  @Size(max = 32) 
  @Schema(name = "merchantDeclineAdvice", example = "NOT_PROVIDED", description = "Identifies the reason for declining a MasterCard and Visa recurring payment transaction.  Valid Values: * NOT_PROVIDED * NEW_ACCOUNT_INFORMATION * TRY_AGAIN_LATER * DO_NOT_TRY_AGAIN * TOKEN_NOT_SUPPORTED * DO_NOT_HONOR ", required = false)
  public String getMerchantDeclineAdvice() {
    return merchantDeclineAdvice;
  }

  public void setMerchantDeclineAdvice(String merchantDeclineAdvice) {
    this.merchantDeclineAdvice = merchantDeclineAdvice;
  }

  public Recurring expiry(LocalDate expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * When does the recurring transaction expire in YYYY-MM-DD format.
   * @return expiry
  */
  @Valid @Size(max = 10) 
  @Schema(name = "expiry", example = "Wed Nov 20 07:00:00 ICT 2030", description = "When does the recurring transaction expire in YYYY-MM-DD format.", required = false)
  public LocalDate getExpiry() {
    return expiry;
  }

  public void setExpiry(LocalDate expiry) {
    this.expiry = expiry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurring recurring = (Recurring) o;
    return Objects.equals(this.frequency, recurring.frequency) &&
        Objects.equals(this.merchantDeclineAdvice, recurring.merchantDeclineAdvice) &&
        Objects.equals(this.expiry, recurring.expiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, merchantDeclineAdvice, expiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurring {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    merchantDeclineAdvice: ").append(toIndentedString(merchantDeclineAdvice)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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

