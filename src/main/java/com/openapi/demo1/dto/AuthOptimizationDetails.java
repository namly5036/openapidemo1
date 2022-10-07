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
 * Updated account details provided by Auth Optimizer for expired cards
 */

@Schema(name = "AuthOptimizationDetails", description = "Updated account details provided by Auth Optimizer for expired cards")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AuthOptimizationDetails {

  @JsonProperty("accountStatus")
  private String accountStatus;

  @JsonProperty("accountUpdaterErrorCode")
  private String accountUpdaterErrorCode;

  @JsonProperty("originalResponseCode")
  private String originalResponseCode;

  public AuthOptimizationDetails accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  /**
   * Indicates the current status of the account.  Valid Values: * ACCOUNT_CHANGE * ACCOUNT_CLOSED * EXPIRATION_CHANGE * CONTACT_CARDHOLDER 
   * @return accountStatus
  */
  
  @Schema(name = "accountStatus", example = "ACCOUNT_CHANGE", description = "Indicates the current status of the account.  Valid Values: * ACCOUNT_CHANGE * ACCOUNT_CLOSED * EXPIRATION_CHANGE * CONTACT_CARDHOLDER ", required = false)
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public AuthOptimizationDetails accountUpdaterErrorCode(String accountUpdaterErrorCode) {
    this.accountUpdaterErrorCode = accountUpdaterErrorCode;
    return this;
  }

  /**
   * Error code provided the account updater system.
   * @return accountUpdaterErrorCode
  */
  
  @Schema(name = "accountUpdaterErrorCode", example = "VAU001", description = "Error code provided the account updater system.", required = false)
  public String getAccountUpdaterErrorCode() {
    return accountUpdaterErrorCode;
  }

  public void setAccountUpdaterErrorCode(String accountUpdaterErrorCode) {
    this.accountUpdaterErrorCode = accountUpdaterErrorCode;
  }

  public AuthOptimizationDetails originalResponseCode(String originalResponseCode) {
    this.originalResponseCode = originalResponseCode;
    return this;
  }

  /**
   * Original Response Code for re-authorized (Optimized) transaction.
   * @return originalResponseCode
  */
  
  @Schema(name = "originalResponseCode", example = "006", description = "Original Response Code for re-authorized (Optimized) transaction.", required = false)
  public String getOriginalResponseCode() {
    return originalResponseCode;
  }

  public void setOriginalResponseCode(String originalResponseCode) {
    this.originalResponseCode = originalResponseCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthOptimizationDetails authOptimizationDetails = (AuthOptimizationDetails) o;
    return Objects.equals(this.accountStatus, authOptimizationDetails.accountStatus) &&
        Objects.equals(this.accountUpdaterErrorCode, authOptimizationDetails.accountUpdaterErrorCode) &&
        Objects.equals(this.originalResponseCode, authOptimizationDetails.originalResponseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountStatus, accountUpdaterErrorCode, originalResponseCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthOptimizationDetails {\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountUpdaterErrorCode: ").append(toIndentedString(accountUpdaterErrorCode)).append("\n");
    sb.append("    originalResponseCode: ").append(toIndentedString(originalResponseCode)).append("\n");
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

