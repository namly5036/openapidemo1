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
 * PaymentEMVAllOf
 */

@JsonTypeName("PaymentEMV_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentEMVAllOf {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("emvData")
  private String emvData;

  @JsonProperty("encryptionData")
  private EncryptionData encryptionData;

  @JsonProperty("pinBlock")
  private PinBlock pinBlock;

  public PaymentEMVAllOf card(Card card) {
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

  public PaymentEMVAllOf emvData(String emvData) {
    this.emvData = emvData;
    return this;
  }

  /**
   * EMV/Chip data is a series of \"Tag/Length/Value\" combination for chip card processing.
   * @return emvData
  */
  
  @Schema(name = "emvData", example = "0249F3704833A12329F1002AB34", description = "EMV/Chip data is a series of \"Tag/Length/Value\" combination for chip card processing.", required = false)
  public String getEmvData() {
    return emvData;
  }

  public void setEmvData(String emvData) {
    this.emvData = emvData;
  }

  public PaymentEMVAllOf encryptionData(EncryptionData encryptionData) {
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

  public PaymentEMVAllOf pinBlock(PinBlock pinBlock) {
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
    PaymentEMVAllOf paymentEMVAllOf = (PaymentEMVAllOf) o;
    return Objects.equals(this.card, paymentEMVAllOf.card) &&
        Objects.equals(this.emvData, paymentEMVAllOf.emvData) &&
        Objects.equals(this.encryptionData, paymentEMVAllOf.encryptionData) &&
        Objects.equals(this.pinBlock, paymentEMVAllOf.pinBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, emvData, encryptionData, pinBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEMVAllOf {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    emvData: ").append(toIndentedString(emvData)).append("\n");
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

