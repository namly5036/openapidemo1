package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.openapi.demo1.dto.Card;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * 3DSecure source.
 */

@Schema(name = "Payment3DS_allOf", description = "3DSecure source.")
@JsonTypeName("Payment3DS_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Payment3DSAllOf {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("merchantIdentifier")
  private String merchantIdentifier;

  @JsonProperty("version")
  private String version;

  @JsonProperty("cavv")
  private String cavv;

  @JsonProperty("xid")
  private String xid;

  @JsonProperty("verificationResponse")
  private String verificationResponse;

  @JsonProperty("authenticationAttemptResult")
  private String authenticationAttemptResult;

  @JsonProperty("channel")
  private String channel;

  @JsonProperty("authenticationResponse")
  private String authenticationResponse;

  @JsonProperty("directoryServerTransactionId")
  private String directoryServerTransactionId;

  @JsonProperty("messageCategory")
  private String messageCategory;

  @JsonProperty("tavv")
  private String tavv;

  @JsonProperty("challengeStatus")
  private String challengeStatus;

  public Payment3DSAllOf card(Card card) {
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

  public Payment3DSAllOf merchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
    return this;
  }

  /**
   * A unique ID used to identify the merchant. The merchant must use the value assigned by the acquirer.
   * @return merchantIdentifier
  */
  @Size(max = 256) 
  @Schema(name = "merchantIdentifier", example = "1234567890123456", description = "A unique ID used to identify the merchant. The merchant must use the value assigned by the acquirer.", required = false)
  public String getMerchantIdentifier() {
    return merchantIdentifier;
  }

  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }

  public Payment3DSAllOf version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Specific protocol version supported by 3DS.
   * @return version
  */
  @Size(max = 64) 
  @Schema(name = "version", example = "3DS2", description = "Specific protocol version supported by 3DS.", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Payment3DSAllOf cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

  /**
   * The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.
   * @return cavv
  */
  @Size(max = 256) 
  @Schema(name = "cavv", example = "AAABCZIhcQAAAABZlyFxAAAAAAA", description = "The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.", required = false)
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public Payment3DSAllOf xid(String xid) {
    this.xid = xid;
    return this;
  }

  /**
   * 3DSecure/Verified by Visa value returned by Cardinal Commerce.
   * @return xid
  */
  @Size(max = 256) 
  @Schema(name = "xid", example = "&x_MD5_Hash=abfaf1d1df004e3c27d5d2e05929b529&x_state=BC&x_reference_3=&x_auth_code=ET141870&x_fp_timestamp=1231877695", description = "3DSecure/Verified by Visa value returned by Cardinal Commerce.", required = false)
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public Payment3DSAllOf verificationResponse(String verificationResponse) {
    this.verificationResponse = verificationResponse;
    return this;
  }

  /**
   * Verification response message.
   * @return verificationResponse
  */
  @Size(max = 256) 
  @Schema(name = "verificationResponse", example = "PASSED_VALIDATION", description = "Verification response message.", required = false)
  public String getVerificationResponse() {
    return verificationResponse;
  }

  public void setVerificationResponse(String verificationResponse) {
    this.verificationResponse = verificationResponse;
  }

  public Payment3DSAllOf authenticationAttemptResult(String authenticationAttemptResult) {
    this.authenticationAttemptResult = authenticationAttemptResult;
    return this;
  }

  /**
   * Result of authentication attempt from Payer Authentication Response (PaRes).
   * @return authenticationAttemptResult
  */
  @Size(max = 256) 
  @Schema(name = "authenticationAttemptResult", example = "uyt45t89cnwu3rhc98a4hterjklth4o8ctsrjzth4", description = "Result of authentication attempt from Payer Authentication Response (PaRes).", required = false)
  public String getAuthenticationAttemptResult() {
    return authenticationAttemptResult;
  }

  public void setAuthenticationAttemptResult(String authenticationAttemptResult) {
    this.authenticationAttemptResult = authenticationAttemptResult;
  }

  public Payment3DSAllOf channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   *  Valid Values:  * MOBILE_APP * MOBILE_WEB * BROWSER_PC * KIOSK * CONSOLE * 3DS_REQUESTOR_INITIATED 
   * @return channel
  */
  @Size(max = 32) 
  @Schema(name = "channel", description = " Valid Values:  * MOBILE_APP * MOBILE_WEB * BROWSER_PC * KIOSK * CONSOLE * 3DS_REQUESTOR_INITIATED ", required = false)
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Payment3DSAllOf authenticationResponse(String authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
    return this;
  }

  /**
   * The result of authentication attempt returned by the 3D Secure authentication process (PaRes).
   * @return authenticationResponse
  */
  
  @Schema(name = "authenticationResponse", example = "A", description = "The result of authentication attempt returned by the 3D Secure authentication process (PaRes).", required = false)
  public String getAuthenticationResponse() {
    return authenticationResponse;
  }

  public void setAuthenticationResponse(String authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  public Payment3DSAllOf directoryServerTransactionId(String directoryServerTransactionId) {
    this.directoryServerTransactionId = directoryServerTransactionId;
    return this;
  }

  /**
   * The response transaction UUID from the DS (directory server)
   * @return directoryServerTransactionId
  */
  
  @Schema(name = "directoryServerTransactionId", example = "f38e6948-5388-41a6-bca4-b49723c19437", description = "The response transaction UUID from the DS (directory server)", required = false)
  public String getDirectoryServerTransactionId() {
    return directoryServerTransactionId;
  }

  public void setDirectoryServerTransactionId(String directoryServerTransactionId) {
    this.directoryServerTransactionId = directoryServerTransactionId;
  }

  public Payment3DSAllOf messageCategory(String messageCategory) {
    this.messageCategory = messageCategory;
    return this;
  }

  /**
   * Indicates the message category of 3d secure authentication version 2.X. 01 = Payment Authentication 02 = Non-Payment Authentication 80 = Mastercard Data Only
   * @return messageCategory
  */
  
  @Schema(name = "messageCategory", example = "1", description = "Indicates the message category of 3d secure authentication version 2.X. 01 = Payment Authentication 02 = Non-Payment Authentication 80 = Mastercard Data Only", required = false)
  public String getMessageCategory() {
    return messageCategory;
  }

  public void setMessageCategory(String messageCategory) {
    this.messageCategory = messageCategory;
  }

  public Payment3DSAllOf tavv(String tavv) {
    this.tavv = tavv;
    return this;
  }

  /**
   * Cryptographic value that is generated during the Visa transaction authentication process for a payment token transaction.
   * @return tavv
  */
  
  @Schema(name = "tavv", example = "AAABCZIhcQAAAABZlyFxAAAAAAA", description = "Cryptographic value that is generated during the Visa transaction authentication process for a payment token transaction.", required = false)
  public String getTavv() {
    return tavv;
  }

  public void setTavv(String tavv) {
    this.tavv = tavv;
  }

  public Payment3DSAllOf challengeStatus(String challengeStatus) {
    this.challengeStatus = challengeStatus;
    return this;
  }

  /**
   * The transaction status as returned by the 3D Secure authentication process. (CRes)
   * @return challengeStatus
  */
  
  @Schema(name = "challengeStatus", example = "A", description = "The transaction status as returned by the 3D Secure authentication process. (CRes)", required = false)
  public String getChallengeStatus() {
    return challengeStatus;
  }

  public void setChallengeStatus(String challengeStatus) {
    this.challengeStatus = challengeStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment3DSAllOf payment3DSAllOf = (Payment3DSAllOf) o;
    return Objects.equals(this.card, payment3DSAllOf.card) &&
        Objects.equals(this.merchantIdentifier, payment3DSAllOf.merchantIdentifier) &&
        Objects.equals(this.version, payment3DSAllOf.version) &&
        Objects.equals(this.cavv, payment3DSAllOf.cavv) &&
        Objects.equals(this.xid, payment3DSAllOf.xid) &&
        Objects.equals(this.verificationResponse, payment3DSAllOf.verificationResponse) &&
        Objects.equals(this.authenticationAttemptResult, payment3DSAllOf.authenticationAttemptResult) &&
        Objects.equals(this.channel, payment3DSAllOf.channel) &&
        Objects.equals(this.authenticationResponse, payment3DSAllOf.authenticationResponse) &&
        Objects.equals(this.directoryServerTransactionId, payment3DSAllOf.directoryServerTransactionId) &&
        Objects.equals(this.messageCategory, payment3DSAllOf.messageCategory) &&
        Objects.equals(this.tavv, payment3DSAllOf.tavv) &&
        Objects.equals(this.challengeStatus, payment3DSAllOf.challengeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, merchantIdentifier, version, cavv, xid, verificationResponse, authenticationAttemptResult, channel, authenticationResponse, directoryServerTransactionId, messageCategory, tavv, challengeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment3DSAllOf {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    merchantIdentifier: ").append(toIndentedString(merchantIdentifier)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    verificationResponse: ").append(toIndentedString(verificationResponse)).append("\n");
    sb.append("    authenticationAttemptResult: ").append(toIndentedString(authenticationAttemptResult)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    directoryServerTransactionId: ").append(toIndentedString(directoryServerTransactionId)).append("\n");
    sb.append("    messageCategory: ").append(toIndentedString(messageCategory)).append("\n");
    sb.append("    tavv: ").append(toIndentedString(tavv)).append("\n");
    sb.append("    challengeStatus: ").append(toIndentedString(challengeStatus)).append("\n");
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

