package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.ReferenceTransactionDetails;
import com.openapi.demo1.dto.TransactionInquiryMerchantDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TransactionInquiryRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionInquiryRequest {

  @JsonProperty("referenceTransactionDetails")
  private ReferenceTransactionDetails referenceTransactionDetails;

  @JsonProperty("merchantDetails")
  private TransactionInquiryMerchantDetails merchantDetails;

  public TransactionInquiryRequest referenceTransactionDetails(ReferenceTransactionDetails referenceTransactionDetails) {
    this.referenceTransactionDetails = referenceTransactionDetails;
    return this;
  }

  /**
   * Get referenceTransactionDetails
   * @return referenceTransactionDetails
  */
  @Valid 
  @Schema(name = "referenceTransactionDetails", required = false)
  public ReferenceTransactionDetails getReferenceTransactionDetails() {
    return referenceTransactionDetails;
  }

  public void setReferenceTransactionDetails(ReferenceTransactionDetails referenceTransactionDetails) {
    this.referenceTransactionDetails = referenceTransactionDetails;
  }

  public TransactionInquiryRequest merchantDetails(TransactionInquiryMerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  */
  @Valid 
  @Schema(name = "merchantDetails", required = false)
  public TransactionInquiryMerchantDetails getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(TransactionInquiryMerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInquiryRequest transactionInquiryRequest = (TransactionInquiryRequest) o;
    return Objects.equals(this.referenceTransactionDetails, transactionInquiryRequest.referenceTransactionDetails) &&
        Objects.equals(this.merchantDetails, transactionInquiryRequest.merchantDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTransactionDetails, merchantDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInquiryRequest {\n");
    sb.append("    referenceTransactionDetails: ").append(toIndentedString(referenceTransactionDetails)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
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

