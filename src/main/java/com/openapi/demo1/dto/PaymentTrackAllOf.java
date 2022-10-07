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
 * PaymentTrackAllOf
 */

@JsonTypeName("PaymentTrack_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentTrackAllOf {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("encryptionData")
  private EncryptionData encryptionData;

  @JsonProperty("pinBlock")
  private PinBlock pinBlock;

  @JsonProperty("track1Data")
  private String track1Data;

  @JsonProperty("track2Data")
  private String track2Data;

  public PaymentTrackAllOf card(Card card) {
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

  public PaymentTrackAllOf encryptionData(EncryptionData encryptionData) {
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

  public PaymentTrackAllOf pinBlock(PinBlock pinBlock) {
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

  public PaymentTrackAllOf track1Data(String track1Data) {
    this.track1Data = track1Data;
    return this;
  }

  /**
   * Information such as the Expiration Date, Primary Account Number, etc. encoded on Track 1 magnetic stripe.
   * @return track1Data
  */
  @Size(max = 79) 
  @Schema(name = "track1Data", example = "%B4445222299990007^LAST/FIRST^14125025432198712345Q?", description = "Information such as the Expiration Date, Primary Account Number, etc. encoded on Track 1 magnetic stripe.", required = false)
  public String getTrack1Data() {
    return track1Data;
  }

  public void setTrack1Data(String track1Data) {
    this.track1Data = track1Data;
  }

  public PaymentTrackAllOf track2Data(String track2Data) {
    this.track2Data = track2Data;
    return this;
  }

  /**
   * Information such as the Expiration Date, Primary Account Number, etc. encoded on Track 2 magnetic stripe.
   * @return track2Data
  */
  @Size(max = 40) 
  @Schema(name = "track2Data", example = ";4445222299990007=14125025432198712345?", description = "Information such as the Expiration Date, Primary Account Number, etc. encoded on Track 2 magnetic stripe.", required = false)
  public String getTrack2Data() {
    return track2Data;
  }

  public void setTrack2Data(String track2Data) {
    this.track2Data = track2Data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTrackAllOf paymentTrackAllOf = (PaymentTrackAllOf) o;
    return Objects.equals(this.card, paymentTrackAllOf.card) &&
        Objects.equals(this.encryptionData, paymentTrackAllOf.encryptionData) &&
        Objects.equals(this.pinBlock, paymentTrackAllOf.pinBlock) &&
        Objects.equals(this.track1Data, paymentTrackAllOf.track1Data) &&
        Objects.equals(this.track2Data, paymentTrackAllOf.track2Data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, encryptionData, pinBlock, track1Data, track2Data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTrackAllOf {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    encryptionData: ").append(toIndentedString(encryptionData)).append("\n");
    sb.append("    pinBlock: ").append(toIndentedString(pinBlock)).append("\n");
    sb.append("    track1Data: ").append(toIndentedString(track1Data)).append("\n");
    sb.append("    track2Data: ").append(toIndentedString(track2Data)).append("\n");
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

