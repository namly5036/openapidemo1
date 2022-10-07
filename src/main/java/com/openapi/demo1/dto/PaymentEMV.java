package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Card;
import com.openapi.demo1.dto.EncryptionData;
import com.openapi.demo1.dto.PinBlock;
import com.openapi.demo1.dto.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentEMV
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentEMV extends Source {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("emvData")
  private String emvData;

  @JsonProperty("encryptionData")
  private EncryptionData encryptionData;

  @JsonProperty("pinBlock")
  private PinBlock pinBlock;

  public PaymentEMV card(Card card) {
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

  public PaymentEMV emvData(String emvData) {
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

  public PaymentEMV encryptionData(EncryptionData encryptionData) {
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

  public PaymentEMV pinBlock(PinBlock pinBlock) {
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

  public PaymentEMV sourceType(String sourceType) {
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
    PaymentEMV paymentEMV = (PaymentEMV) o;
    return Objects.equals(this.card, paymentEMV.card) &&
        Objects.equals(this.emvData, paymentEMV.emvData) &&
        Objects.equals(this.encryptionData, paymentEMV.encryptionData) &&
        Objects.equals(this.pinBlock, paymentEMV.pinBlock) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, emvData, encryptionData, pinBlock, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEMV {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

