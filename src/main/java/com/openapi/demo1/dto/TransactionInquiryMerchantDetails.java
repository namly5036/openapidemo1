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
 * TransactionInquiryMerchantDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionInquiryMerchantDetails {

  @JsonProperty("merchantId")
  private String merchantId;

  @JsonProperty("terminalId")
  private String terminalId;

  public TransactionInquiryMerchantDetails merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * A unique ID used to identify the Merchant. The merchant must use the value assigned by the acquirer or the gateway when submitting a transaction.
   * @return merchantId
  */
  @Size(max = 1024) 
  @Schema(name = "merchantId", example = "222222222222", description = "A unique ID used to identify the Merchant. The merchant must use the value assigned by the acquirer or the gateway when submitting a transaction.", required = false)
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public TransactionInquiryMerchantDetails terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * Identifies the specific device or point of entry where the transaction originated assigned by the acquirer or the gateway.
   * @return terminalId
  */
  @Size(max = 1024) 
  @Schema(name = "terminalId", example = "1413257", description = "Identifies the specific device or point of entry where the transaction originated assigned by the acquirer or the gateway.", required = false)
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInquiryMerchantDetails transactionInquiryMerchantDetails = (TransactionInquiryMerchantDetails) o;
    return Objects.equals(this.merchantId, transactionInquiryMerchantDetails.merchantId) &&
        Objects.equals(this.terminalId, transactionInquiryMerchantDetails.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInquiryMerchantDetails {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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

