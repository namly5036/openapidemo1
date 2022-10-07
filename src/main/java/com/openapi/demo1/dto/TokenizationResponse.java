package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.BillingAddress;
import com.openapi.demo1.dto.CardDetails;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.ProcessorResponseDetails;
import com.openapi.demo1.dto.ResponsePaymentToken;
import com.openapi.demo1.dto.Source;
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
 * TokenizationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TokenizationResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("cardDetails")
  @Valid
  private List<CardDetails> cardDetails = null;

  @JsonProperty("paymentToken")
  private ResponsePaymentToken paymentToken;

  @JsonProperty("paymentTokens")
  @Valid
  private List<ResponsePaymentToken> paymentTokens = null;

  @JsonProperty("processorResponseDetails")
  private ProcessorResponseDetails processorResponseDetails;

  @JsonProperty("billingAddress")
  private BillingAddress billingAddress;

  public TokenizationResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public TokenizationResponse source(Source source) {
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

  public TokenizationResponse cardDetails(List<CardDetails> cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

  public TokenizationResponse addCardDetailsItem(CardDetails cardDetailsItem) {
    if (this.cardDetails == null) {
      this.cardDetails = new ArrayList<>();
    }
    this.cardDetails.add(cardDetailsItem);
    return this;
  }

  /**
   * Get cardDetails
   * @return cardDetails
  */
  @Valid 
  @Schema(name = "cardDetails", required = false)
  public List<CardDetails> getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(List<CardDetails> cardDetails) {
    this.cardDetails = cardDetails;
  }

  public TokenizationResponse paymentToken(ResponsePaymentToken paymentToken) {
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

  public TokenizationResponse paymentTokens(List<ResponsePaymentToken> paymentTokens) {
    this.paymentTokens = paymentTokens;
    return this;
  }

  public TokenizationResponse addPaymentTokensItem(ResponsePaymentToken paymentTokensItem) {
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

  public TokenizationResponse processorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
    this.processorResponseDetails = processorResponseDetails;
    return this;
  }

  /**
   * Get processorResponseDetails
   * @return processorResponseDetails
  */
  @Valid 
  @Schema(name = "processorResponseDetails", required = false)
  public ProcessorResponseDetails getProcessorResponseDetails() {
    return processorResponseDetails;
  }

  public void setProcessorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
    this.processorResponseDetails = processorResponseDetails;
  }

  public TokenizationResponse billingAddress(BillingAddress billingAddress) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizationResponse tokenizationResponse = (TokenizationResponse) o;
    return Objects.equals(this.gatewayResponse, tokenizationResponse.gatewayResponse) &&
        Objects.equals(this.source, tokenizationResponse.source) &&
        Objects.equals(this.cardDetails, tokenizationResponse.cardDetails) &&
        Objects.equals(this.paymentToken, tokenizationResponse.paymentToken) &&
        Objects.equals(this.paymentTokens, tokenizationResponse.paymentTokens) &&
        Objects.equals(this.processorResponseDetails, tokenizationResponse.processorResponseDetails) &&
        Objects.equals(this.billingAddress, tokenizationResponse.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, source, cardDetails, paymentToken, paymentTokens, processorResponseDetails, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizationResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTokens: ").append(toIndentedString(paymentTokens)).append("\n");
    sb.append("    processorResponseDetails: ").append(toIndentedString(processorResponseDetails)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

