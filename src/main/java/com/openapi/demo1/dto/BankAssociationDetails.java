package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AvsSecurityCodeResponse;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Processor-Response-Details.md#bank-association-details\&quot;&gt;Bank association&lt;/a&gt; response details.
 */

@Schema(name = "BankAssociationDetails", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Processor-Response-Details.md#bank-association-details\">Bank association</a> response details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class BankAssociationDetails {

  @JsonProperty("associationResponseCode")
  private String associationResponseCode;

  @JsonProperty("transactionTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionTimestamp;

  @JsonProperty("transactionReferenceInformation")
  private String transactionReferenceInformation;

  @JsonProperty("avsSecurityCodeResponse")
  private AvsSecurityCodeResponse avsSecurityCodeResponse;

  public BankAssociationDetails associationResponseCode(String associationResponseCode) {
    this.associationResponseCode = associationResponseCode;
    return this;
  }

  /**
   * Bank response code.
   * @return associationResponseCode
  */
  @Size(max = 32) 
  @Schema(name = "associationResponseCode", example = "000", description = "Bank response code.", required = false)
  public String getAssociationResponseCode() {
    return associationResponseCode;
  }

  public void setAssociationResponseCode(String associationResponseCode) {
    this.associationResponseCode = associationResponseCode;
  }

  public BankAssociationDetails transactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

  /**
   * Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ
   * @return transactionTimestamp
  */
  @Valid @Size(max = 64) 
  @Schema(name = "transactionTimestamp", example = "2016-04-16T16:06:05Z", description = "Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ", required = false)
  public OffsetDateTime getTransactionTimestamp() {
    return transactionTimestamp;
  }

  public void setTransactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }

  public BankAssociationDetails transactionReferenceInformation(String transactionReferenceInformation) {
    this.transactionReferenceInformation = transactionReferenceInformation;
    return this;
  }

  /**
   * Transaction reference information.
   * @return transactionReferenceInformation
  */
  @Size(max = 256) 
  @Schema(name = "transactionReferenceInformation", example = "", description = "Transaction reference information.", required = false)
  public String getTransactionReferenceInformation() {
    return transactionReferenceInformation;
  }

  public void setTransactionReferenceInformation(String transactionReferenceInformation) {
    this.transactionReferenceInformation = transactionReferenceInformation;
  }

  public BankAssociationDetails avsSecurityCodeResponse(AvsSecurityCodeResponse avsSecurityCodeResponse) {
    this.avsSecurityCodeResponse = avsSecurityCodeResponse;
    return this;
  }

  /**
   * Get avsSecurityCodeResponse
   * @return avsSecurityCodeResponse
  */
  @Valid 
  @Schema(name = "avsSecurityCodeResponse", required = false)
  public AvsSecurityCodeResponse getAvsSecurityCodeResponse() {
    return avsSecurityCodeResponse;
  }

  public void setAvsSecurityCodeResponse(AvsSecurityCodeResponse avsSecurityCodeResponse) {
    this.avsSecurityCodeResponse = avsSecurityCodeResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAssociationDetails bankAssociationDetails = (BankAssociationDetails) o;
    return Objects.equals(this.associationResponseCode, bankAssociationDetails.associationResponseCode) &&
        Objects.equals(this.transactionTimestamp, bankAssociationDetails.transactionTimestamp) &&
        Objects.equals(this.transactionReferenceInformation, bankAssociationDetails.transactionReferenceInformation) &&
        Objects.equals(this.avsSecurityCodeResponse, bankAssociationDetails.avsSecurityCodeResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationResponseCode, transactionTimestamp, transactionReferenceInformation, avsSecurityCodeResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAssociationDetails {\n");
    sb.append("    associationResponseCode: ").append(toIndentedString(associationResponseCode)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
    sb.append("    transactionReferenceInformation: ").append(toIndentedString(transactionReferenceInformation)).append("\n");
    sb.append("    avsSecurityCodeResponse: ").append(toIndentedString(avsSecurityCodeResponse)).append("\n");
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

