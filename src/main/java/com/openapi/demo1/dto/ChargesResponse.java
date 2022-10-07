package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.AuthOptimizationDetails;
import com.openapi.demo1.dto.BillingAddress;
import com.openapi.demo1.dto.CardDetails;
import com.openapi.demo1.dto.DynamicDescriptors;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.NetworkDetails;
import com.openapi.demo1.dto.PaymentReceipt;
import com.openapi.demo1.dto.ResponsePaymentToken;
import com.openapi.demo1.dto.ShippingAddress;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.StoredCredentials;
import com.openapi.demo1.dto.TransactionBatch;
import com.openapi.demo1.dto.TransactionDetails;
import com.openapi.demo1.dto.TransactionInteraction;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChargesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ChargesResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("paymentReceipt")
  private PaymentReceipt paymentReceipt;

  @JsonProperty("billingAddress")
  private BillingAddress billingAddress;

  @JsonProperty("shippingAddress")
  private ShippingAddress shippingAddress;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("transactionInteraction")
  private TransactionInteraction transactionInteraction;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("dynamicDescriptors")
  private DynamicDescriptors dynamicDescriptors;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  @JsonProperty("transactionBatch")
  private TransactionBatch transactionBatch;

  @JsonProperty("networkDetails")
  private NetworkDetails networkDetails;

  @JsonProperty("cardDetails")
  private CardDetails cardDetails;

  @JsonProperty("paymentToken")
  private ResponsePaymentToken paymentToken;

  @JsonProperty("paymentTokens")
  @Valid
  private List<ResponsePaymentToken> paymentTokens = null;

  @JsonProperty("storedCredentials")
  private StoredCredentials storedCredentials;

  @JsonProperty("authOptimizationDetails")
  private AuthOptimizationDetails authOptimizationDetails;

  public ChargesResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public ChargesResponse source(Source source) {
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

  public ChargesResponse paymentReceipt(PaymentReceipt paymentReceipt) {
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

  public ChargesResponse billingAddress(BillingAddress billingAddress) {
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

  public ChargesResponse shippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
  */
  @Valid 
  @Schema(name = "shippingAddress", required = false)
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public ChargesResponse transactionDetails(TransactionDetails transactionDetails) {
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

  public ChargesResponse transactionInteraction(TransactionInteraction transactionInteraction) {
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

  public ChargesResponse merchantDetails(MerchantDetails merchantDetails) {
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

  public ChargesResponse dynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
    this.dynamicDescriptors = dynamicDescriptors;
    return this;
  }

  /**
   * Get dynamicDescriptors
   * @return dynamicDescriptors
  */
  @Valid 
  @Schema(name = "dynamicDescriptors", required = false)
  public DynamicDescriptors getDynamicDescriptors() {
    return dynamicDescriptors;
  }

  public void setDynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
    this.dynamicDescriptors = dynamicDescriptors;
  }

  public ChargesResponse additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
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

  public ChargesResponse transactionBatch(TransactionBatch transactionBatch) {
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

  public ChargesResponse networkDetails(NetworkDetails networkDetails) {
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

  public ChargesResponse cardDetails(CardDetails cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

  /**
   * Get cardDetails
   * @return cardDetails
  */
  @Valid 
  @Schema(name = "cardDetails", required = false)
  public CardDetails getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(CardDetails cardDetails) {
    this.cardDetails = cardDetails;
  }

  public ChargesResponse paymentToken(ResponsePaymentToken paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * Get paymentToken
   * @return paymentToken
  */
  @Valid 
  @Schema(name = "paymentToken", required = false)
  public ResponsePaymentToken getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(ResponsePaymentToken paymentToken) {
    this.paymentToken = paymentToken;
  }

  public ChargesResponse paymentTokens(List<ResponsePaymentToken> paymentTokens) {
    this.paymentTokens = paymentTokens;
    return this;
  }

  public ChargesResponse addPaymentTokensItem(ResponsePaymentToken paymentTokensItem) {
    if (this.paymentTokens == null) {
      this.paymentTokens = new ArrayList<>();
    }
    this.paymentTokens.add(paymentTokensItem);
    return this;
  }

  /**
   * Get paymentTokens
   * @return paymentTokens
  */
  @Valid 
  @Schema(name = "paymentTokens", required = false)
  public List<ResponsePaymentToken> getPaymentTokens() {
    return paymentTokens;
  }

  public void setPaymentTokens(List<ResponsePaymentToken> paymentTokens) {
    this.paymentTokens = paymentTokens;
  }

  public ChargesResponse storedCredentials(StoredCredentials storedCredentials) {
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

  public ChargesResponse authOptimizationDetails(AuthOptimizationDetails authOptimizationDetails) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesResponse chargesResponse = (ChargesResponse) o;
    return Objects.equals(this.gatewayResponse, chargesResponse.gatewayResponse) &&
        Objects.equals(this.source, chargesResponse.source) &&
        Objects.equals(this.paymentReceipt, chargesResponse.paymentReceipt) &&
        Objects.equals(this.billingAddress, chargesResponse.billingAddress) &&
        Objects.equals(this.shippingAddress, chargesResponse.shippingAddress) &&
        Objects.equals(this.transactionDetails, chargesResponse.transactionDetails) &&
        Objects.equals(this.transactionInteraction, chargesResponse.transactionInteraction) &&
        Objects.equals(this.merchantDetails, chargesResponse.merchantDetails) &&
        Objects.equals(this.dynamicDescriptors, chargesResponse.dynamicDescriptors) &&
        Objects.equals(this.additionalDataCommon, chargesResponse.additionalDataCommon) &&
        Objects.equals(this.transactionBatch, chargesResponse.transactionBatch) &&
        Objects.equals(this.networkDetails, chargesResponse.networkDetails) &&
        Objects.equals(this.cardDetails, chargesResponse.cardDetails) &&
        Objects.equals(this.paymentToken, chargesResponse.paymentToken) &&
        Objects.equals(this.paymentTokens, chargesResponse.paymentTokens) &&
        Objects.equals(this.storedCredentials, chargesResponse.storedCredentials) &&
        Objects.equals(this.authOptimizationDetails, chargesResponse.authOptimizationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, source, paymentReceipt, billingAddress, shippingAddress, transactionDetails, transactionInteraction, merchantDetails, dynamicDescriptors, additionalDataCommon, transactionBatch, networkDetails, cardDetails, paymentToken, paymentTokens, storedCredentials, authOptimizationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    paymentReceipt: ").append(toIndentedString(paymentReceipt)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    transactionInteraction: ").append(toIndentedString(transactionInteraction)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    dynamicDescriptors: ").append(toIndentedString(dynamicDescriptors)).append("\n");
    sb.append("    additionalDataCommon: ").append(toIndentedString(additionalDataCommon)).append("\n");
    sb.append("    transactionBatch: ").append(toIndentedString(transactionBatch)).append("\n");
    sb.append("    networkDetails: ").append(toIndentedString(networkDetails)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTokens: ").append(toIndentedString(paymentTokens)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    authOptimizationDetails: ").append(toIndentedString(authOptimizationDetails)).append("\n");
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

