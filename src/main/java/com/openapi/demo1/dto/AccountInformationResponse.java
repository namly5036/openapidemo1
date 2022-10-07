package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.CardDetails;
import com.openapi.demo1.dto.GatewayResponse;
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
 * AccountInformationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AccountInformationResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("cardDetails")
  @Valid
  private List<CardDetails> cardDetails = null;

  public AccountInformationResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public AccountInformationResponse cardDetails(List<CardDetails> cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

  public AccountInformationResponse addCardDetailsItem(CardDetails cardDetailsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInformationResponse accountInformationResponse = (AccountInformationResponse) o;
    return Objects.equals(this.gatewayResponse, accountInformationResponse.gatewayResponse) &&
        Objects.equals(this.cardDetails, accountInformationResponse.cardDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, cardDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformationResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
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

