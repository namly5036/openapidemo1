package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Card;
import com.openapi.demo1.dto.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentToken
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentToken extends Source {

  @JsonProperty("tokenData")
  private String tokenData;

  @JsonProperty("PARId")
  private String paRId;

  @JsonProperty("declineDuplicates")
  private Boolean declineDuplicates;

  @JsonProperty("tokenSource")
  private String tokenSource;

  @JsonProperty("card")
  private Card card;

  public PaymentToken tokenData(String tokenData) {
    this.tokenData = tokenData;
    return this;
  }

  /**
   * Token created from the payment source.
   * @return tokenData
  */
  @Size(max = 2048) 
  @Schema(name = "tokenData", example = "1234123412340019", description = "Token created from the payment source.", required = false)
  public String getTokenData() {
    return tokenData;
  }

  public void setTokenData(String tokenData) {
    this.tokenData = tokenData;
  }

  public PaymentToken paRId(String paRId) {
    this.paRId = paRId;
    return this;
  }

  /**
   * Payment Account Reference ID (PARID) for tokens. Ties transactions with multiple payment sources or tokens to a customer.
   * @return paRId
  */
  @Size(max = 256) 
  @Schema(name = "PARId", description = "Payment Account Reference ID (PARID) for tokens. Ties transactions with multiple payment sources or tokens to a customer.", required = false)
  public String getPaRId() {
    return paRId;
  }

  public void setPaRId(String paRId) {
    this.paRId = paRId;
  }

  public PaymentToken declineDuplicates(Boolean declineDuplicates) {
    this.declineDuplicates = declineDuplicates;
    return this;
  }

  /**
   * Identifies if a duplicate create token should be rejected when one has already been created for the payment source.
   * @return declineDuplicates
  */
  
  @Schema(name = "declineDuplicates", example = "false", description = "Identifies if a duplicate create token should be rejected when one has already been created for the payment source.", required = false)
  public Boolean getDeclineDuplicates() {
    return declineDuplicates;
  }

  public void setDeclineDuplicates(Boolean declineDuplicates) {
    this.declineDuplicates = declineDuplicates;
  }

  public PaymentToken tokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
    return this;
  }

  /**
   * Source for the Token Service Provider (TSP).
   * @return tokenSource
  */
  @Size(max = 256) 
  @Schema(name = "tokenSource", example = "TRANSARMOR", description = "Source for the Token Service Provider (TSP).", required = false)
  public String getTokenSource() {
    return tokenSource;
  }

  public void setTokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
  }

  public PaymentToken card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @Valid 
  @Schema(name = "card", required = false)
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public PaymentToken sourceType(String sourceType) {
    super.setSourceType(sourceType);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentToken paymentToken = (PaymentToken) o;
    return Objects.equals(this.tokenData, paymentToken.tokenData) &&
        Objects.equals(this.paRId, paymentToken.paRId) &&
        Objects.equals(this.declineDuplicates, paymentToken.declineDuplicates) &&
        Objects.equals(this.tokenSource, paymentToken.tokenSource) &&
        Objects.equals(this.card, paymentToken.card) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenData, paRId, declineDuplicates, tokenSource, card, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentToken {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tokenData: ").append(toIndentedString(tokenData)).append("\n");
    sb.append("    paRId: ").append(toIndentedString(paRId)).append("\n");
    sb.append("    declineDuplicates: ").append(toIndentedString(declineDuplicates)).append("\n");
    sb.append("    tokenSource: ").append(toIndentedString(tokenSource)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

