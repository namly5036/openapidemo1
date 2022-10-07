package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.AuthOptimizationDetails;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.NetworkDetails;
import com.openapi.demo1.dto.PaymentReceipt;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.StoredCredentials;
import com.openapi.demo1.dto.TransactionBatch;
import com.openapi.demo1.dto.TransactionDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RefundResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class RefundResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("paymentReceipt")
  private PaymentReceipt paymentReceipt;

  @JsonProperty("transactionBatch")
  private TransactionBatch transactionBatch;

  @JsonProperty("networkDetails")
  private NetworkDetails networkDetails;

  @JsonProperty("storedCredentials")
  private StoredCredentials storedCredentials;

  @JsonProperty("authOptimizationDetails")
  private AuthOptimizationDetails authOptimizationDetails;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  public RefundResponse gatewayResponse(GatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
    return this;
  }

  /**
   * Get gatewayResponse
   * @return gatewayResponse
  */
  @Valid 
  @Schema(name = "gatewayResponse", required = false)
  public GatewayResponse getGatewayResponse() {
    return gatewayResponse;
  }

  public void setGatewayResponse(GatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
  }

  public RefundResponse source(Source source) {
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

  public RefundResponse transactionDetails(TransactionDetails transactionDetails) {
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

  public RefundResponse merchantDetails(MerchantDetails merchantDetails) {
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

  public RefundResponse paymentReceipt(PaymentReceipt paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
    return this;
  }

  /**
   * Get paymentReceipt
   * @return paymentReceipt
  */
  @Valid 
  @Schema(name = "paymentReceipt", required = false)
  public PaymentReceipt getPaymentReceipt() {
    return paymentReceipt;
  }

  public void setPaymentReceipt(PaymentReceipt paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
  }

  public RefundResponse transactionBatch(TransactionBatch transactionBatch) {
    this.transactionBatch = transactionBatch;
    return this;
  }

  /**
   * Get transactionBatch
   * @return transactionBatch
  */
  @Valid 
  @Schema(name = "transactionBatch", required = false)
  public TransactionBatch getTransactionBatch() {
    return transactionBatch;
  }

  public void setTransactionBatch(TransactionBatch transactionBatch) {
    this.transactionBatch = transactionBatch;
  }

  public RefundResponse networkDetails(NetworkDetails networkDetails) {
    this.networkDetails = networkDetails;
    return this;
  }

  /**
   * Get networkDetails
   * @return networkDetails
  */
  @Valid 
  @Schema(name = "networkDetails", required = false)
  public NetworkDetails getNetworkDetails() {
    return networkDetails;
  }

  public void setNetworkDetails(NetworkDetails networkDetails) {
    this.networkDetails = networkDetails;
  }

  public RefundResponse storedCredentials(StoredCredentials storedCredentials) {
    this.storedCredentials = storedCredentials;
    return this;
  }

  /**
   * Get storedCredentials
   * @return storedCredentials
  */
  @Valid 
  @Schema(name = "storedCredentials", required = false)
  public StoredCredentials getStoredCredentials() {
    return storedCredentials;
  }

  public void setStoredCredentials(StoredCredentials storedCredentials) {
    this.storedCredentials = storedCredentials;
  }

  public RefundResponse authOptimizationDetails(AuthOptimizationDetails authOptimizationDetails) {
    this.authOptimizationDetails = authOptimizationDetails;
    return this;
  }

  /**
   * Get authOptimizationDetails
   * @return authOptimizationDetails
  */
  @Valid 
  @Schema(name = "authOptimizationDetails", required = false)
  public AuthOptimizationDetails getAuthOptimizationDetails() {
    return authOptimizationDetails;
  }

  public void setAuthOptimizationDetails(AuthOptimizationDetails authOptimizationDetails) {
    this.authOptimizationDetails = authOptimizationDetails;
  }

  public RefundResponse additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundResponse refundResponse = (RefundResponse) o;
    return Objects.equals(this.gatewayResponse, refundResponse.gatewayResponse) &&
        Objects.equals(this.source, refundResponse.source) &&
        Objects.equals(this.transactionDetails, refundResponse.transactionDetails) &&
        Objects.equals(this.merchantDetails, refundResponse.merchantDetails) &&
        Objects.equals(this.paymentReceipt, refundResponse.paymentReceipt) &&
        Objects.equals(this.transactionBatch, refundResponse.transactionBatch) &&
        Objects.equals(this.networkDetails, refundResponse.networkDetails) &&
        Objects.equals(this.storedCredentials, refundResponse.storedCredentials) &&
        Objects.equals(this.authOptimizationDetails, refundResponse.authOptimizationDetails) &&
        Objects.equals(this.additionalDataCommon, refundResponse.additionalDataCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, source, transactionDetails, merchantDetails, paymentReceipt, transactionBatch, networkDetails, storedCredentials, authOptimizationDetails, additionalDataCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    paymentReceipt: ").append(toIndentedString(paymentReceipt)).append("\n");
    sb.append("    transactionBatch: ").append(toIndentedString(transactionBatch)).append("\n");
    sb.append("    networkDetails: ").append(toIndentedString(networkDetails)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    authOptimizationDetails: ").append(toIndentedString(authOptimizationDetails)).append("\n");
    sb.append("    additionalDataCommon: ").append(toIndentedString(additionalDataCommon)).append("\n");
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

