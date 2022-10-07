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
 * InquiryRequestDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class InquiryRequestDetails {

  @JsonProperty("clientRequestId")
  private String clientRequestId;

  @JsonProperty("primaryTransactionId")
  private String primaryTransactionId;

  @JsonProperty("primaryOrderId")
  private String primaryOrderId;

  @JsonProperty("merchantTransactionId")
  private String merchantTransactionId;

  @JsonProperty("merchantOrderId")
  private String merchantOrderId;

  public InquiryRequestDetails clientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

  /**
   * A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format.
   * @return clientRequestId
  */
  @Size(max = 64) 
  @Schema(name = "clientRequestId", example = "2b52a1c95ca446f5abf0e51f37a1d7c5", description = "A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format.", required = false)
  public String getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public InquiryRequestDetails primaryTransactionId(String primaryTransactionId) {
    this.primaryTransactionId = primaryTransactionId;
    return this;
  }

  /**
   * Unique identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.
   * @return primaryTransactionId
  */
  @Size(max = 40) 
  @Schema(name = "primaryTransactionId", example = "838916029301", description = "Unique identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.", required = false)
  public String getPrimaryTransactionId() {
    return primaryTransactionId;
  }

  public void setPrimaryTransactionId(String primaryTransactionId) {
    this.primaryTransactionId = primaryTransactionId;
  }

  public InquiryRequestDetails primaryOrderId(String primaryOrderId) {
    this.primaryOrderId = primaryOrderId;
    return this;
  }

  /**
   * Unique order identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.
   * @return primaryOrderId
  */
  @Size(max = 40) 
  @Schema(name = "primaryOrderId", example = "1343678765", description = "Unique order identifier for each transaction on the gateway. This value will be populated for the secondary transaction from the path.", required = false)
  public String getPrimaryOrderId() {
    return primaryOrderId;
  }

  public void setPrimaryOrderId(String primaryOrderId) {
    this.primaryOrderId = primaryOrderId;
  }

  public InquiryRequestDetails merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

  /**
   * Merchant transaction ID (aka transaction reference ID).
   * @return merchantTransactionId
  */
  @Size(max = 32) 
  @Schema(name = "merchantTransactionId", example = "1343678765", description = "Merchant transaction ID (aka transaction reference ID).", required = false)
  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }

  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }

  public InquiryRequestDetails merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

  /**
   * Merchant order ID (aka customer reference number or purchase order number).
   * @return merchantOrderId
  */
  @Size(max = 32) 
  @Schema(name = "merchantOrderId", example = "845366457890", description = "Merchant order ID (aka customer reference number or purchase order number).", required = false)
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InquiryRequestDetails inquiryRequestDetails = (InquiryRequestDetails) o;
    return Objects.equals(this.clientRequestId, inquiryRequestDetails.clientRequestId) &&
        Objects.equals(this.primaryTransactionId, inquiryRequestDetails.primaryTransactionId) &&
        Objects.equals(this.primaryOrderId, inquiryRequestDetails.primaryOrderId) &&
        Objects.equals(this.merchantTransactionId, inquiryRequestDetails.merchantTransactionId) &&
        Objects.equals(this.merchantOrderId, inquiryRequestDetails.merchantOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, primaryTransactionId, primaryOrderId, merchantTransactionId, merchantOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InquiryRequestDetails {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    primaryTransactionId: ").append(toIndentedString(primaryTransactionId)).append("\n");
    sb.append("    primaryOrderId: ").append(toIndentedString(primaryOrderId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
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

