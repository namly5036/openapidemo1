package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.openapi.demo1.dto.Card;
import com.openapi.demo1.dto.EncryptionData;
import com.openapi.demo1.dto.PinBlock;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentCardAllOf
 */

@JsonTypeName("PaymentCard_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentCardAllOf {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("encryptionData")
  private EncryptionData encryptionData;

  @JsonProperty("pinBlock")
  private PinBlock pinBlock;

  public PaymentCardAllOf card(Card card) {
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

  public PaymentCardAllOf encryptionData(EncryptionData encryptionData) {
    this.encryptionData = encryptionData;
    return this;
  }

  /**
   * Get encryptionData
   * @return encryptionData
  */
  @Valid 
  @Schema(name = "encryptionData", required = false)
  public EncryptionData getEncryptionData() {
    return encryptionData;
  }

  public void setEncryptionData(EncryptionData encryptionData) {
    this.encryptionData = encryptionData;
  }

  public PaymentCardAllOf pinBlock(PinBlock pinBlock) {
    this.pinBlock = pinBlock;
    return this;
  }

  /**
   * Get pinBlock
   * @return pinBlock
  */
  @Valid 
  @Schema(name = "pinBlock", required = false)
  public PinBlock getPinBlock() {
    return pinBlock;
  }

  public void setPinBlock(PinBlock pinBlock) {
    this.pinBlock = pinBlock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardAllOf paymentCardAllOf = (PaymentCardAllOf) o;
    return Objects.equals(this.card, paymentCardAllOf.card) &&
        Objects.equals(this.encryptionData, paymentCardAllOf.encryptionData) &&
        Objects.equals(this.pinBlock, paymentCardAllOf.pinBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, encryptionData, pinBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardAllOf {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    encryptionData: ").append(toIndentedString(encryptionData)).append("\n");
    sb.append("    pinBlock: ").append(toIndentedString(pinBlock)).append("\n");
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

