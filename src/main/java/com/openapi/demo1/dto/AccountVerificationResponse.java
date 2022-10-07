package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.ProcessorResponseDetails;
import com.openapi.demo1.dto.ResponsePaymentToken;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountVerificationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AccountVerificationResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("responsePaymentToken")
  private ResponsePaymentToken responsePaymentToken;

  @JsonProperty("processorResponseDetails")
  private ProcessorResponseDetails processorResponseDetails;

  public AccountVerificationResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public AccountVerificationResponse responsePaymentToken(ResponsePaymentToken responsePaymentToken) {
    this.responsePaymentToken = responsePaymentToken;
    return this;
  }

  /**
   * Get responsePaymentToken
   * @return responsePaymentToken
  */
  @Valid 
  @Schema(name = "responsePaymentToken", required = false)
  public ResponsePaymentToken getResponsePaymentToken() {
    return responsePaymentToken;
  }

  public void setResponsePaymentToken(ResponsePaymentToken responsePaymentToken) {
    this.responsePaymentToken = responsePaymentToken;
  }

  public AccountVerificationResponse processorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerificationResponse accountVerificationResponse = (AccountVerificationResponse) o;
    return Objects.equals(this.gatewayResponse, accountVerificationResponse.gatewayResponse) &&
        Objects.equals(this.responsePaymentToken, accountVerificationResponse.responsePaymentToken) &&
        Objects.equals(this.processorResponseDetails, accountVerificationResponse.processorResponseDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, responsePaymentToken, processorResponseDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerificationResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    responsePaymentToken: ").append(toIndentedString(responsePaymentToken)).append("\n");
    sb.append("    processorResponseDetails: ").append(toIndentedString(processorResponseDetails)).append("\n");
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

