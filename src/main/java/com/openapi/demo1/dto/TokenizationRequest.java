package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.BillingAddress;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.TransactionDetails;
import com.openapi.demo1.dto.TransactionInteraction;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TokenizationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TokenizationRequest {

  @JsonProperty("source")
  private Source source;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("billingAddress")
  private BillingAddress billingAddress;

  @JsonProperty("transactionInteraction")
  private TransactionInteraction transactionInteraction;

  public TokenizationRequest source(Source source) {
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

  public TokenizationRequest transactionDetails(TransactionDetails transactionDetails) {
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

  public TokenizationRequest additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
    this.additionalDataCommon = additionalDataCommon;
    return this;
  }

  /**
   * Get additionalDataCommon
   * @return additionalDataCommon
  */
  @Valid 
  @Schema(name = "additionalDataCommon", required = false)
  public AdditionalDataCommon getAdditionalDataCommon() {
    return additionalDataCommon;
  }

  public void setAdditionalDataCommon(AdditionalDataCommon additionalDataCommon) {
    this.additionalDataCommon = additionalDataCommon;
  }

  public TokenizationRequest merchantDetails(MerchantDetails merchantDetails) {
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

  public TokenizationRequest billingAddress(BillingAddress billingAddress) {
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

  public TokenizationRequest transactionInteraction(TransactionInteraction transactionInteraction) {
    this.transactionInteraction = transactionInteraction;
    return this;
  }

  /**
   * Get transactionInteraction
   * @return transactionInteraction
  */
  @Valid 
  @Schema(name = "transactionInteraction", required = false)
  public TransactionInteraction getTransactionInteraction() {
    return transactionInteraction;
  }

  public void setTransactionInteraction(TransactionInteraction transactionInteraction) {
    this.transactionInteraction = transactionInteraction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizationRequest tokenizationRequest = (TokenizationRequest) o;
    return Objects.equals(this.source, tokenizationRequest.source) &&
        Objects.equals(this.transactionDetails, tokenizationRequest.transactionDetails) &&
        Objects.equals(this.additionalDataCommon, tokenizationRequest.additionalDataCommon) &&
        Objects.equals(this.merchantDetails, tokenizationRequest.merchantDetails) &&
        Objects.equals(this.billingAddress, tokenizationRequest.billingAddress) &&
        Objects.equals(this.transactionInteraction, tokenizationRequest.transactionInteraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, transactionDetails, additionalDataCommon, merchantDetails, billingAddress, transactionInteraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizationRequest {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    additionalDataCommon: ").append(toIndentedString(additionalDataCommon)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    transactionInteraction: ").append(toIndentedString(transactionInteraction)).append("\n");
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

