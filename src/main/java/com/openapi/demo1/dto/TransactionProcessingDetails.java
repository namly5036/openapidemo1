package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Contains the &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Gateway-Response.md#transaction-processing-details\&quot;&gt;transaction response&lt;/a&gt; details.
 */

@Schema(name = "TransactionProcessingDetails", description = "Contains the <a href=\"../docs?path=docs/Resources/Master-Data/Gateway-Response.md#transaction-processing-details\">transaction response</a> details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionProcessingDetails {

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("transactionTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionTimestamp;

  @JsonProperty("apiTraceId")
  private String apiTraceId;

  @JsonProperty("clientRequestId")
  private String clientRequestId;

  @JsonProperty("transactionId")
  private String transactionId;

  public TransactionProcessingDetails orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order identifier returned in the parameter orderId from a Charge transaction.
   * @return orderId
  */
  @Size(max = 40) 
  @Schema(name = "orderId", example = "R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16", description = "Order identifier returned in the parameter orderId from a Charge transaction.", required = false)
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TransactionProcessingDetails transactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

  /**
   * Date and time the transaction occurred in YYYY-MM-DDThh:mm:ssZ format.
   * @return transactionTimestamp
  */
  @Valid 
  @Schema(name = "transactionTimestamp", example = "2016-04-16T16:06:05Z", description = "Date and time the transaction occurred in YYYY-MM-DDThh:mm:ssZ format.", required = false)
  public OffsetDateTime getTransactionTimestamp() {
    return transactionTimestamp;
  }

  public void setTransactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }

  public TransactionProcessingDetails apiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
    return this;
  }

  /**
   * Request identifier in API that can be used to request logs from the support team.
   * @return apiTraceId
  */
  @Pattern(regexp = "^[a-f0-9]{32}$") @Size(max = 32) 
  @Schema(name = "apiTraceId", example = "1234567a1234567b1234567c1234567d", description = "Request identifier in API that can be used to request logs from the support team.", required = false)
  public String getApiTraceId() {
    return apiTraceId;
  }

  public void setApiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
  }

  public TransactionProcessingDetails clientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

  /**
   * Echoes back the value in the request header for tracking.
   * @return clientRequestId
  */
  @Size(max = 64) 
  @Schema(name = "clientRequestId", example = "30dd879c-ee2f-11db-8314-0800200c9a66", description = "Echoes back the value in the request header for tracking.", required = false)
  public String getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public TransactionProcessingDetails transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.
   * @return transactionId
  */
  @Size(max = 40) 
  @Schema(name = "transactionId", example = "838916029301", description = "Unique identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.", required = false)
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionProcessingDetails transactionProcessingDetails = (TransactionProcessingDetails) o;
    return Objects.equals(this.orderId, transactionProcessingDetails.orderId) &&
        Objects.equals(this.transactionTimestamp, transactionProcessingDetails.transactionTimestamp) &&
        Objects.equals(this.apiTraceId, transactionProcessingDetails.apiTraceId) &&
        Objects.equals(this.clientRequestId, transactionProcessingDetails.clientRequestId) &&
        Objects.equals(this.transactionId, transactionProcessingDetails.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, transactionTimestamp, apiTraceId, clientRequestId, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionProcessingDetails {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

