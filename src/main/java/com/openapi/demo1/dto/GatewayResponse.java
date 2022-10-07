package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.TransactionProcessingDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Gateway-Response.md\&quot;&gt;gateway response&lt;/a&gt; details.
 */

@Schema(name = "GatewayResponse", description = "Contains the <a href=\"../docs?path=docs/Resources/Master-Data/Gateway-Response.md\">gateway response</a> details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class GatewayResponse {

  @JsonProperty("transactionType")
  private String transactionType;

  @JsonProperty("transactionState")
  private String transactionState;

  @JsonProperty("transactionOrigin")
  private String transactionOrigin;

  @JsonProperty("transactionProcessingDetails")
  private TransactionProcessingDetails transactionProcessingDetails;

  public GatewayResponse transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Transaction type performed.
   * @return transactionType
  */
  @Size(max = 256) 
  @Schema(name = "transactionType", example = "CHARGE", description = "Transaction type performed.", required = false)
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public GatewayResponse transactionState(String transactionState) {
    this.transactionState = transactionState;
    return this;
  }

  /**
   * Final state of the transaction.
   * @return transactionState
  */
  @Size(max = 256) 
  @Schema(name = "transactionState", example = "AUTHORIZED", description = "Final state of the transaction.", required = false)
  public String getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(String transactionState) {
    this.transactionState = transactionState;
  }

  public GatewayResponse transactionOrigin(String transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
    return this;
  }

  /**
   * Transaction origin based on original request.
   * @return transactionOrigin
  */
  @Size(max = 4) 
  @Schema(name = "transactionOrigin", example = "ECOM", description = "Transaction origin based on original request.", required = false)
  public String getTransactionOrigin() {
    return transactionOrigin;
  }

  public void setTransactionOrigin(String transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
  }

  public GatewayResponse transactionProcessingDetails(TransactionProcessingDetails transactionProcessingDetails) {
    this.transactionProcessingDetails = transactionProcessingDetails;
    return this;
  }

  /**
   * Get transactionProcessingDetails
   * @return transactionProcessingDetails
  */
  @Valid 
  @Schema(name = "transactionProcessingDetails", required = false)
  public TransactionProcessingDetails getTransactionProcessingDetails() {
    return transactionProcessingDetails;
  }

  public void setTransactionProcessingDetails(TransactionProcessingDetails transactionProcessingDetails) {
    this.transactionProcessingDetails = transactionProcessingDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayResponse gatewayResponse = (GatewayResponse) o;
    return Objects.equals(this.transactionType, gatewayResponse.transactionType) &&
        Objects.equals(this.transactionState, gatewayResponse.transactionState) &&
        Objects.equals(this.transactionOrigin, gatewayResponse.transactionOrigin) &&
        Objects.equals(this.transactionProcessingDetails, gatewayResponse.transactionProcessingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, transactionState, transactionOrigin, transactionProcessingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayResponse {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    transactionProcessingDetails: ").append(toIndentedString(transactionProcessingDetails)).append("\n");
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

