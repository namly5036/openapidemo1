package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.NetworkDetails;
import com.openapi.demo1.dto.PaymentReceipt;
import com.openapi.demo1.dto.Source;
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
 * CancelResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class CancelResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("paymentReceipt")
  private PaymentReceipt paymentReceipt;

  @JsonProperty("transactionBatch")
  private TransactionBatch transactionBatch;

  @JsonProperty("networkDetails")
  private NetworkDetails networkDetails;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  public CancelResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public CancelResponse transactionDetails(TransactionDetails transactionDetails) {
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

  public CancelResponse source(Source source) {
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

  public CancelResponse merchantDetails(MerchantDetails merchantDetails) {
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

  public CancelResponse paymentReceipt(PaymentReceipt paymentReceipt) {
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

  public CancelResponse transactionBatch(TransactionBatch transactionBatch) {
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

  public CancelResponse networkDetails(NetworkDetails networkDetails) {
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

  public CancelResponse additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
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
    CancelResponse cancelResponse = (CancelResponse) o;
    return Objects.equals(this.gatewayResponse, cancelResponse.gatewayResponse) &&
        Objects.equals(this.transactionDetails, cancelResponse.transactionDetails) &&
        Objects.equals(this.source, cancelResponse.source) &&
        Objects.equals(this.merchantDetails, cancelResponse.merchantDetails) &&
        Objects.equals(this.paymentReceipt, cancelResponse.paymentReceipt) &&
        Objects.equals(this.transactionBatch, cancelResponse.transactionBatch) &&
        Objects.equals(this.networkDetails, cancelResponse.networkDetails) &&
        Objects.equals(this.additionalDataCommon, cancelResponse.additionalDataCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, transactionDetails, source, merchantDetails, paymentReceipt, transactionBatch, networkDetails, additionalDataCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    paymentReceipt: ").append(toIndentedString(paymentReceipt)).append("\n");
    sb.append("    transactionBatch: ").append(toIndentedString(transactionBatch)).append("\n");
    sb.append("    networkDetails: ").append(toIndentedString(networkDetails)).append("\n");
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

