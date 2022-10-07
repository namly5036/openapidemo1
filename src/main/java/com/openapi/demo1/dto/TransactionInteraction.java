package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalPosInformation;
import com.openapi.demo1.dto.Network;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Transaction-Interaction.md\&quot;&gt;Transaction interaction&lt;/a&gt; information based on where the transaction is acquired and the capabilities of the terminal or software.
 */

@Schema(name = "TransactionInteraction", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Transaction-Interaction.md\">Transaction interaction</a> information based on where the transaction is acquired and the capabilities of the terminal or software.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionInteraction {

  @JsonProperty("origin")
  private String origin;

  @JsonProperty("posEntryMode")
  private String posEntryMode;

  @JsonProperty("posConditionCode")
  private String posConditionCode;

  @JsonProperty("responseCode")
  private String responseCode;

  @JsonProperty("posData")
  private String posData;

  @JsonProperty("mobileInteraction")
  private String mobileInteraction;

  @JsonProperty("terminalEntryCapability")
  private String terminalEntryCapability;

  @JsonProperty("cardholderAuthenticationMethod")
  private String cardholderAuthenticationMethod;

  @JsonProperty("eciIndicator")
  private String eciIndicator;

  @JsonProperty("cardholderAuthenticationEntity")
  private String cardholderAuthenticationEntity;

  @JsonProperty("terminalTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime terminalTimestamp;

  @JsonProperty("serviceCode")
  private String serviceCode;

  @JsonProperty("applicationExpiryDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate applicationExpiryDate;

  @JsonProperty("additionalPosInformation")
  private AdditionalPosInformation additionalPosInformation;

  @JsonProperty("network")
  private Network network;

  @JsonProperty("authorizationCharacteristicsIndicator")
  private String authorizationCharacteristicsIndicator;

  public TransactionInteraction origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * The source of the transaction.  Valid Values: * ECOM - Card not present (email, web, or mobile app) * MOTO - Mail order or telephone order * POS - Card present (retail face to face) 
   * @return origin
  */
  @Size(max = 4) 
  @Schema(name = "origin", example = "ECOM", description = "The source of the transaction.  Valid Values: * ECOM - Card not present (email, web, or mobile app) * MOTO - Mail order or telephone order * POS - Card present (retail face to face) ", required = false)
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public TransactionInteraction posEntryMode(String posEntryMode) {
    this.posEntryMode = posEntryMode;
    return this;
  }

  /**
   * An identifier used to indicate how the account number was entered on the transaction.  Valid Values: * UNSPECIFIED - Default * MANUAL - Key entered * BARCODE - Barcode scan * OCR - Optical Character Reader * ICR_RELIABLE - Integrated Circuit Read (CVV data Reliable) * ICR_UNRELIABLE - Integrated Circuit Read (CVV data unreliable) * CONTACTLESS – Contactless Integrated Circuit Read (Reliable) * CONTACTLESS_MOBILE – Contactless Mobile Commerce or Discover InApp * CONTACTLESS_MAG_STRIPE – Contactless Magnetic Stripe Read * AMEX_WALLET - Amex Digital Wallet * MASTERCARD_REMOTE_CHIP – Mastercard remote chip entry * CREDENTIAL_ON_FILE – Credential on File * EMV_FALLBACK – EMV fallback to manual entry * EMV_FALLBACK_MAG - EMV fallback to Magnetic Strip entry * EMV_SWITCHED - EMV Transaction switched from Contactless to Contact entry * MAG_STRIPE – Magnetic Stripe - Track Read 
   * @return posEntryMode
  */
  @Size(max = 22) 
  @Schema(name = "posEntryMode", example = "MANUAL", description = "An identifier used to indicate how the account number was entered on the transaction.  Valid Values: * UNSPECIFIED - Default * MANUAL - Key entered * BARCODE - Barcode scan * OCR - Optical Character Reader * ICR_RELIABLE - Integrated Circuit Read (CVV data Reliable) * ICR_UNRELIABLE - Integrated Circuit Read (CVV data unreliable) * CONTACTLESS – Contactless Integrated Circuit Read (Reliable) * CONTACTLESS_MOBILE – Contactless Mobile Commerce or Discover InApp * CONTACTLESS_MAG_STRIPE – Contactless Magnetic Stripe Read * AMEX_WALLET - Amex Digital Wallet * MASTERCARD_REMOTE_CHIP – Mastercard remote chip entry * CREDENTIAL_ON_FILE – Credential on File * EMV_FALLBACK – EMV fallback to manual entry * EMV_FALLBACK_MAG - EMV fallback to Magnetic Strip entry * EMV_SWITCHED - EMV Transaction switched from Contactless to Contact entry * MAG_STRIPE – Magnetic Stripe - Track Read ", required = false)
  public String getPosEntryMode() {
    return posEntryMode;
  }

  public void setPosEntryMode(String posEntryMode) {
    this.posEntryMode = posEntryMode;
  }

  public TransactionInteraction posConditionCode(String posConditionCode) {
    this.posConditionCode = posConditionCode;
    return this;
  }

  /**
   * An identifier used to indicate the transaction condition at the Point-of-Sale (POS).  Valid Values: * CARD_PRESENT - Cardholder Present, Card Present * CARD_PRESENT_UNSPECIFIED – Cardholder Present, Unspecified * CARD_PRESENT_UNATTENDED – Cardholder Present, Unattended Device * CARD_PRESENT_FRAUD – Cardholder Present, Suspect Fraud * CARD_PRESENT_MAG_NOT_READ – Cardholder Present, Magnetic Stripe Could Not Be Read * CARD_PRESENT_IDENTIFIED - Cardholder Present, Identity Verified * CARD_NOT_PRESENT_RECURRING – Cardholder Not Present – Recurring * CARD_NOT_PRESENT_F2F - Cardholder Present, Card Not Present, Face 2 Face * CARD_NOT_PRESENT_MOTO – Cardholder Not Present, Mail Order/Telephone Order * CARD_NOT_PRESENT_ECOM – Cardholder Not Present, E-commerce 
   * @return posConditionCode
  */
  @Size(max = 26) 
  @Schema(name = "posConditionCode", example = "CARD_NOT_PRESENT_ECOM", description = "An identifier used to indicate the transaction condition at the Point-of-Sale (POS).  Valid Values: * CARD_PRESENT - Cardholder Present, Card Present * CARD_PRESENT_UNSPECIFIED – Cardholder Present, Unspecified * CARD_PRESENT_UNATTENDED – Cardholder Present, Unattended Device * CARD_PRESENT_FRAUD – Cardholder Present, Suspect Fraud * CARD_PRESENT_MAG_NOT_READ – Cardholder Present, Magnetic Stripe Could Not Be Read * CARD_PRESENT_IDENTIFIED - Cardholder Present, Identity Verified * CARD_NOT_PRESENT_RECURRING – Cardholder Not Present – Recurring * CARD_NOT_PRESENT_F2F - Cardholder Present, Card Not Present, Face 2 Face * CARD_NOT_PRESENT_MOTO – Cardholder Not Present, Mail Order/Telephone Order * CARD_NOT_PRESENT_ECOM – Cardholder Not Present, E-commerce ", required = false)
  public String getPosConditionCode() {
    return posConditionCode;
  }

  public void setPosConditionCode(String posConditionCode) {
    this.posConditionCode = posConditionCode;
  }

  public TransactionInteraction responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Response code returned by network/issuer used in subsequent transactions.
   * @return responseCode
  */
  
  @Schema(name = "responseCode", description = "Response code returned by network/issuer used in subsequent transactions.", required = false)
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public TransactionInteraction posData(String posData) {
    this.posData = posData;
    return this;
  }

  /**
   * POS data returned by network/issuer used in subsequent transactions.
   * @return posData
  */
  
  @Schema(name = "posData", description = "POS data returned by network/issuer used in subsequent transactions.", required = false)
  public String getPosData() {
    return posData;
  }

  public void setPosData(String posData) {
    this.posData = posData;
  }

  public TransactionInteraction mobileInteraction(String mobileInteraction) {
    this.mobileInteraction = mobileInteraction;
    return this;
  }

  /**
   * Mobile method of interaction.  Valid Values: * PHONE_NUMBER - Invoice received by phone number * QR_CODE - Invoice paid by scanning QR Code 
   * @return mobileInteraction
  */
  @Size(max = 12) 
  @Schema(name = "mobileInteraction", example = "PHONE_NUMBER", description = "Mobile method of interaction.  Valid Values: * PHONE_NUMBER - Invoice received by phone number * QR_CODE - Invoice paid by scanning QR Code ", required = false)
  public String getMobileInteraction() {
    return mobileInteraction;
  }

  public void setMobileInteraction(String mobileInteraction) {
    this.mobileInteraction = mobileInteraction;
  }

  public TransactionInteraction terminalEntryCapability(String terminalEntryCapability) {
    this.terminalEntryCapability = terminalEntryCapability;
    return this;
  }

  /**
   * Identifies how data can be entered in the terminal or software.  Valid Values: * UNSPECIFIED - Default * ECOMMERCE - E-commerce no terminal used * IVR_VRU - Interactive Voice Response/Voice Response Unit * MAG_STRIPE_ONLY - Track read only * MAG_STRIPE_MANUAL - Track read or manual key * MAG_STRIPE_MANUAL_CHIP - Track read, manual key or chip * BARCODE - Barcode scan * CONTACTLESS - Contactless integrated circuit read * OCR - Opitcal character reader * CHIP_ONLY - Chip only * CHIP_MAG_STRIPE - Chip with track fallback * MANUAL_ONLY - Manual key only * CONTACTLESS_MAG_STRIPE - Contactless or track read * EMV_CONTACTLESS - EMV contactless single tap capable * HYBRID - Hybrid entry mode\" * NONE - Terminal does not read card data 
   * @return terminalEntryCapability
  */
  
  @Schema(name = "terminalEntryCapability", example = "CHIP_ONLY", description = "Identifies how data can be entered in the terminal or software.  Valid Values: * UNSPECIFIED - Default * ECOMMERCE - E-commerce no terminal used * IVR_VRU - Interactive Voice Response/Voice Response Unit * MAG_STRIPE_ONLY - Track read only * MAG_STRIPE_MANUAL - Track read or manual key * MAG_STRIPE_MANUAL_CHIP - Track read, manual key or chip * BARCODE - Barcode scan * CONTACTLESS - Contactless integrated circuit read * OCR - Opitcal character reader * CHIP_ONLY - Chip only * CHIP_MAG_STRIPE - Chip with track fallback * MANUAL_ONLY - Manual key only * CONTACTLESS_MAG_STRIPE - Contactless or track read * EMV_CONTACTLESS - EMV contactless single tap capable * HYBRID - Hybrid entry mode\" * NONE - Terminal does not read card data ", required = false)
  public String getTerminalEntryCapability() {
    return terminalEntryCapability;
  }

  public void setTerminalEntryCapability(String terminalEntryCapability) {
    this.terminalEntryCapability = terminalEntryCapability;
  }

  public TransactionInteraction cardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
    this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
    return this;
  }

  /**
   * Identifies how the cardholder was authenticated/verified.  Valid Values: * UNSPECIFIED * NOT_AUTHENTICATED * PIN * ELECTRONIC_SIGNATURE * MANUAL_SIGNATURE * OTHER_MANUAL_VERIFICATION * OTHER_SYSTEMATIC_VERIFICATION 
   * @return cardholderAuthenticationMethod
  */
  @Size(max = 32) 
  @Schema(name = "cardholderAuthenticationMethod", example = "PIN", description = "Identifies how the cardholder was authenticated/verified.  Valid Values: * UNSPECIFIED * NOT_AUTHENTICATED * PIN * ELECTRONIC_SIGNATURE * MANUAL_SIGNATURE * OTHER_MANUAL_VERIFICATION * OTHER_SYSTEMATIC_VERIFICATION ", required = false)
  public String getCardholderAuthenticationMethod() {
    return cardholderAuthenticationMethod;
  }

  public void setCardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
    this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
  }

  public TransactionInteraction eciIndicator(String eciIndicator) {
    this.eciIndicator = eciIndicator;
    return this;
  }

  /**
   * Electronic Commerce Indicator (ECI) is mandatory for all E-commerce transactions.  Valid Values: * SECURE_ECOM - Secure Electronic Transaction * NON_AUTH_ECOM - Non-Authenticated Electronic Commerce Transaction * CHANNEL_ENCRYPTED - Channel Encrypted Transaction * NON_SECURE_ECOM - Non-Secure Electronic Commerce Transaction 
   * @return eciIndicator
  */
  @Size(max = 17) 
  @Schema(name = "eciIndicator", example = "SECURE_ECOM", description = "Electronic Commerce Indicator (ECI) is mandatory for all E-commerce transactions.  Valid Values: * SECURE_ECOM - Secure Electronic Transaction * NON_AUTH_ECOM - Non-Authenticated Electronic Commerce Transaction * CHANNEL_ENCRYPTED - Channel Encrypted Transaction * NON_SECURE_ECOM - Non-Secure Electronic Commerce Transaction ", required = false)
  public String getEciIndicator() {
    return eciIndicator;
  }

  public void setEciIndicator(String eciIndicator) {
    this.eciIndicator = eciIndicator;
  }

  public TransactionInteraction cardholderAuthenticationEntity(String cardholderAuthenticationEntity) {
    this.cardholderAuthenticationEntity = cardholderAuthenticationEntity;
    return this;
  }

  /**
   * Identifies what entity authenticated the cardholder.  Valid Values: * UNSPECIFIED * NOT_AUTHORIZED * ICC_OFFLINE_PIN * CARD_ACCEPTANCE_DEVICE * AUTHORIZED_AGENT_ONLINE_PIN * MERCHANT_VERIFIED_SIGNATURE * OTHER 
   * @return cardholderAuthenticationEntity
  */
  @Size(max = 32) 
  @Schema(name = "cardholderAuthenticationEntity", example = "UNSPECIFIED", description = "Identifies what entity authenticated the cardholder.  Valid Values: * UNSPECIFIED * NOT_AUTHORIZED * ICC_OFFLINE_PIN * CARD_ACCEPTANCE_DEVICE * AUTHORIZED_AGENT_ONLINE_PIN * MERCHANT_VERIFIED_SIGNATURE * OTHER ", required = false)
  public String getCardholderAuthenticationEntity() {
    return cardholderAuthenticationEntity;
  }

  public void setCardholderAuthenticationEntity(String cardholderAuthenticationEntity) {
    this.cardholderAuthenticationEntity = cardholderAuthenticationEntity;
  }

  public TransactionInteraction terminalTimestamp(OffsetDateTime terminalTimestamp) {
    this.terminalTimestamp = terminalTimestamp;
    return this;
  }

  /**
   * Terminal timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ
   * @return terminalTimestamp
  */
  @Valid 
  @Schema(name = "terminalTimestamp", example = "2016-04-16T16:06:05Z", description = "Terminal timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ", required = false)
  public OffsetDateTime getTerminalTimestamp() {
    return terminalTimestamp;
  }

  public void setTerminalTimestamp(OffsetDateTime terminalTimestamp) {
    this.terminalTimestamp = terminalTimestamp;
  }

  public TransactionInteraction serviceCode(String serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

  /**
   * If this field is returned in an authorization response, and if returned must be provided in subsequent Capture transactions.
   * @return serviceCode
  */
  @Size(max = 3) 
  @Schema(name = "serviceCode", example = "000", description = "If this field is returned in an authorization response, and if returned must be provided in subsequent Capture transactions.", required = false)
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public TransactionInteraction applicationExpiryDate(LocalDate applicationExpiryDate) {
    this.applicationExpiryDate = applicationExpiryDate;
    return this;
  }

  /**
   * Captured from the EMV chip data. YYYY-MM-DD format.
   * @return applicationExpiryDate
  */
  @Valid 
  @Schema(name = "applicationExpiryDate", example = "Fri Sep 03 07:00:00 ICT 2021", description = "Captured from the EMV chip data. YYYY-MM-DD format.", required = false)
  public LocalDate getApplicationExpiryDate() {
    return applicationExpiryDate;
  }

  public void setApplicationExpiryDate(LocalDate applicationExpiryDate) {
    this.applicationExpiryDate = applicationExpiryDate;
  }

  public TransactionInteraction additionalPosInformation(AdditionalPosInformation additionalPosInformation) {
    this.additionalPosInformation = additionalPosInformation;
    return this;
  }

  /**
   * Get additionalPosInformation
   * @return additionalPosInformation
  */
  @Valid 
  @Schema(name = "additionalPosInformation", required = false)
  public AdditionalPosInformation getAdditionalPosInformation() {
    return additionalPosInformation;
  }

  public void setAdditionalPosInformation(AdditionalPosInformation additionalPosInformation) {
    this.additionalPosInformation = additionalPosInformation;
  }

  public TransactionInteraction network(Network network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
  */
  @Valid 
  @Schema(name = "network", required = false)
  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public TransactionInteraction authorizationCharacteristicsIndicator(String authorizationCharacteristicsIndicator) {
    this.authorizationCharacteristicsIndicator = authorizationCharacteristicsIndicator;
    return this;
  }

  /**
   * Response code used for qualification used in subsequent transactions.
   * @return authorizationCharacteristicsIndicator
  */
  @Size(max = 23) 
  @Schema(name = "authorizationCharacteristicsIndicator", example = "CARD_NOT_PRESENT", description = "Response code used for qualification used in subsequent transactions.", required = false)
  public String getAuthorizationCharacteristicsIndicator() {
    return authorizationCharacteristicsIndicator;
  }

  public void setAuthorizationCharacteristicsIndicator(String authorizationCharacteristicsIndicator) {
    this.authorizationCharacteristicsIndicator = authorizationCharacteristicsIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInteraction transactionInteraction = (TransactionInteraction) o;
    return Objects.equals(this.origin, transactionInteraction.origin) &&
        Objects.equals(this.posEntryMode, transactionInteraction.posEntryMode) &&
        Objects.equals(this.posConditionCode, transactionInteraction.posConditionCode) &&
        Objects.equals(this.responseCode, transactionInteraction.responseCode) &&
        Objects.equals(this.posData, transactionInteraction.posData) &&
        Objects.equals(this.mobileInteraction, transactionInteraction.mobileInteraction) &&
        Objects.equals(this.terminalEntryCapability, transactionInteraction.terminalEntryCapability) &&
        Objects.equals(this.cardholderAuthenticationMethod, transactionInteraction.cardholderAuthenticationMethod) &&
        Objects.equals(this.eciIndicator, transactionInteraction.eciIndicator) &&
        Objects.equals(this.cardholderAuthenticationEntity, transactionInteraction.cardholderAuthenticationEntity) &&
        Objects.equals(this.terminalTimestamp, transactionInteraction.terminalTimestamp) &&
        Objects.equals(this.serviceCode, transactionInteraction.serviceCode) &&
        Objects.equals(this.applicationExpiryDate, transactionInteraction.applicationExpiryDate) &&
        Objects.equals(this.additionalPosInformation, transactionInteraction.additionalPosInformation) &&
        Objects.equals(this.network, transactionInteraction.network) &&
        Objects.equals(this.authorizationCharacteristicsIndicator, transactionInteraction.authorizationCharacteristicsIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, posEntryMode, posConditionCode, responseCode, posData, mobileInteraction, terminalEntryCapability, cardholderAuthenticationMethod, eciIndicator, cardholderAuthenticationEntity, terminalTimestamp, serviceCode, applicationExpiryDate, additionalPosInformation, network, authorizationCharacteristicsIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInteraction {\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    posEntryMode: ").append(toIndentedString(posEntryMode)).append("\n");
    sb.append("    posConditionCode: ").append(toIndentedString(posConditionCode)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    posData: ").append(toIndentedString(posData)).append("\n");
    sb.append("    mobileInteraction: ").append(toIndentedString(mobileInteraction)).append("\n");
    sb.append("    terminalEntryCapability: ").append(toIndentedString(terminalEntryCapability)).append("\n");
    sb.append("    cardholderAuthenticationMethod: ").append(toIndentedString(cardholderAuthenticationMethod)).append("\n");
    sb.append("    eciIndicator: ").append(toIndentedString(eciIndicator)).append("\n");
    sb.append("    cardholderAuthenticationEntity: ").append(toIndentedString(cardholderAuthenticationEntity)).append("\n");
    sb.append("    terminalTimestamp: ").append(toIndentedString(terminalTimestamp)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    applicationExpiryDate: ").append(toIndentedString(applicationExpiryDate)).append("\n");
    sb.append("    additionalPosInformation: ").append(toIndentedString(additionalPosInformation)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    authorizationCharacteristicsIndicator: ").append(toIndentedString(authorizationCharacteristicsIndicator)).append("\n");
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

