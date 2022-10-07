package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.BillingAddress;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.TransactionDetails;
import com.openapi.demo1.dto.TransactionProcessingDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountVerificationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AccountVerificationRequest {

  @JsonProperty("source")
  private Source source;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("billingAddress")
  private BillingAddress billingAddress;

  @JsonProperty("transactionProcessingDetails")
  private TransactionProcessingDetails transactionProcessingDetails;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  public AccountVerificationRequest source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", required = false)
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public AccountVerificationRequest merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  */
  @Valid 
  @Schema(name = "merchantDetails", required = false)
  public MerchantDetails getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public AccountVerificationRequest billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
  */
  @Valid 
  @Schema(name = "billingAddress", required = false)
  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AccountVerificationRequest transactionProcessingDetails(TransactionProcessingDetails transactionProcessingDetails) {
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

  public AccountVerificationRequest transactionDetails(TransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  /**
   * Get transactionDetails
   * @return transactionDetails
  */
  @Valid 
  @Schema(name = "transactionDetails", required = false)
  public TransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(TransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerificationRequest accountVerificationRequest = (AccountVerificationRequest) o;
    return Objects.equals(this.source, accountVerificationRequest.source) &&
        Objects.equals(this.merchantDetails, accountVerificationRequest.merchantDetails) &&
        Objects.equals(this.billingAddress, accountVerificationRequest.billingAddress) &&
        Objects.equals(this.transactionProcessingDetails, accountVerificationRequest.transactionProcessingDetails) &&
        Objects.equals(this.transactionDetails, accountVerificationRequest.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, merchantDetails, billingAddress, transactionProcessingDetails, transactionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerificationRequest {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    transactionProcessingDetails: ").append(toIndentedString(transactionProcessingDetails)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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

