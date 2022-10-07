package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.PosFeatures;
import com.openapi.demo1.dto.PosHardwareAndSoftware;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Additional-POS-Info.md\&quot;&gt;Additional terminal&lt;/a&gt; or software specific information.
 */

@Schema(name = "AdditionalPosInformation", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Additional-POS-Info.md\">Additional terminal</a> or software specific information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AdditionalPosInformation {

  @JsonProperty("posId")
  private String posId;

  @JsonProperty("cashierId")
  private String cashierId;

  @JsonProperty("stan")
  private String stan;

  @JsonProperty("posFormFactorIndicator")
  private String posFormFactorIndicator;

  @JsonProperty("alternateRoutingIndicator")
  private Boolean alternateRoutingIndicator;

  @JsonProperty("dataEntrySource")
  private String dataEntrySource;

  @JsonProperty("transactionQualifier")
  private String transactionQualifier;

  @JsonProperty("attendedTerminalData")
  private String attendedTerminalData;

  @JsonProperty("cardholderActivatedTerminalInformation")
  private String cardholderActivatedTerminalInformation;

  @JsonProperty("posHardwareAndSoftware")
  private PosHardwareAndSoftware posHardwareAndSoftware;

  @JsonProperty("posFeatures")
  private PosFeatures posFeatures;

  @JsonProperty("supervisorId")
  private String supervisorId;

  public AdditionalPosInformation posId(String posId) {
    this.posId = posId;
    return this;
  }

  /**
   * Identifies the specific device or point of entry where the transaction originated. For example, pump number, lane number, terminal number, etc.
   * @return posId
  */
  
  @Schema(name = "posId", example = "1234", description = "Identifies the specific device or point of entry where the transaction originated. For example, pump number, lane number, terminal number, etc.", required = false)
  public String getPosId() {
    return posId;
  }

  public void setPosId(String posId) {
    this.posId = posId;
  }

  public AdditionalPosInformation cashierId(String cashierId) {
    this.cashierId = cashierId;
    return this;
  }

  /**
   * Used to uniquely identify the merchant’s store cashier or employee accepting the transaction.
   * @return cashierId
  */
  
  @Schema(name = "cashierId", example = "3456", description = "Used to uniquely identify the merchant’s store cashier or employee accepting the transaction.", required = false)
  public String getCashierId() {
    return cashierId;
  }

  public void setCashierId(String cashierId) {
    this.cashierId = cashierId;
  }

  public AdditionalPosInformation stan(String stan) {
    this.stan = stan;
    return this;
  }

  /**
   * System Trace or Debit Reg E Receipt Number - A system-generated number is provided by the merchant and it uniquely identifies a transaction. This number needs to be a unique number per Merchant and Terminal ID.
   * @return stan
  */
  @Size(max = 6) 
  @Schema(name = "stan", example = "123456", description = "System Trace or Debit Reg E Receipt Number - A system-generated number is provided by the merchant and it uniquely identifies a transaction. This number needs to be a unique number per Merchant and Terminal ID.", required = false)
  public String getStan() {
    return stan;
  }

  public void setStan(String stan) {
    this.stan = stan;
  }

  public AdditionalPosInformation posFormFactorIndicator(String posFormFactorIndicator) {
    this.posFormFactorIndicator = posFormFactorIndicator;
    return this;
  }

  /**
   * This field is used to identify the form factor used at the POS for MasterCard PayPass transactions. Note: Some values from 00–19 may indicate not only the physical form factor but also other attributes such as device technology and payment app specifications. Values from 20–99 exclusively indicate the form factor only without also indicating the storage technology.
   * @return posFormFactorIndicator
  */
  
  @Schema(name = "posFormFactorIndicator", example = "02", description = "This field is used to identify the form factor used at the POS for MasterCard PayPass transactions. Note: Some values from 00–19 may indicate not only the physical form factor but also other attributes such as device technology and payment app specifications. Values from 20–99 exclusively indicate the form factor only without also indicating the storage technology.", required = false)
  public String getPosFormFactorIndicator() {
    return posFormFactorIndicator;
  }

  public void setPosFormFactorIndicator(String posFormFactorIndicator) {
    this.posFormFactorIndicator = posFormFactorIndicator;
  }

  public AdditionalPosInformation alternateRoutingIndicator(Boolean alternateRoutingIndicator) {
    this.alternateRoutingIndicator = alternateRoutingIndicator;
    return this;
  }

  /**
   * Identifies if the terminal support the Alternate Routing feature used for PINless POS, Signature Debit, and EMV Common AID features (excluding Online PIN CVM) allows merchants to process PIN Debit Network transactions without a PIN.
   * @return alternateRoutingIndicator
  */
  
  @Schema(name = "alternateRoutingIndicator", example = "true", description = "Identifies if the terminal support the Alternate Routing feature used for PINless POS, Signature Debit, and EMV Common AID features (excluding Online PIN CVM) allows merchants to process PIN Debit Network transactions without a PIN.", required = false)
  public Boolean getAlternateRoutingIndicator() {
    return alternateRoutingIndicator;
  }

  public void setAlternateRoutingIndicator(Boolean alternateRoutingIndicator) {
    this.alternateRoutingIndicator = alternateRoutingIndicator;
  }

  public AdditionalPosInformation dataEntrySource(String dataEntrySource) {
    this.dataEntrySource = dataEntrySource;
    return this;
  }

  /**
   * Channel the consumer used to initiate a card not present transaction.  Valid Values: * MOBILE_APP * MOBILE_WEB * BROWSER_PC * KIOSK * CONSOLE * 3DS_REQUESTOR_INITIATED * UNSPECIFIED * ELECTRONIC_PAYMENT_TERMINAL * AUTOMATED_FUEL_DISPENSING_MACHINE * UNATTENDED_CUSTOMER_TERMINAL * ECOMMERCE_CUSTOMER_PRESENT * MOBILE_TERMINAL * MOBILE_POS * ELECTRONIC_CASH_REGISTER * IVR_VRU * TICKET_MACHINE * CALL_CENTER_OPERATOR 
   * @return dataEntrySource
  */
  @Size(max = 50) 
  @Schema(name = "dataEntrySource", example = "ELECTRONIC_PAYMENT_TERMINAL", description = "Channel the consumer used to initiate a card not present transaction.  Valid Values: * MOBILE_APP * MOBILE_WEB * BROWSER_PC * KIOSK * CONSOLE * 3DS_REQUESTOR_INITIATED * UNSPECIFIED * ELECTRONIC_PAYMENT_TERMINAL * AUTOMATED_FUEL_DISPENSING_MACHINE * UNATTENDED_CUSTOMER_TERMINAL * ECOMMERCE_CUSTOMER_PRESENT * MOBILE_TERMINAL * MOBILE_POS * ELECTRONIC_CASH_REGISTER * IVR_VRU * TICKET_MACHINE * CALL_CENTER_OPERATOR ", required = false)
  public String getDataEntrySource() {
    return dataEntrySource;
  }

  public void setDataEntrySource(String dataEntrySource) {
    this.dataEntrySource = dataEntrySource;
  }

  public AdditionalPosInformation transactionQualifier(String transactionQualifier) {
    this.transactionQualifier = transactionQualifier;
    return this;
  }

  /**
   * Used for Discover - Discover TransactionQualifier.
   * @return transactionQualifier
  */
  
  @Schema(name = "transactionQualifier", description = "Used for Discover - Discover TransactionQualifier.", required = false)
  public String getTransactionQualifier() {
    return transactionQualifier;
  }

  public void setTransactionQualifier(String transactionQualifier) {
    this.transactionQualifier = transactionQualifier;
  }

  public AdditionalPosInformation attendedTerminalData(String attendedTerminalData) {
    this.attendedTerminalData = attendedTerminalData;
    return this;
  }

  /**
   * Indicates if the card acceptor was at the point of sale.  Valid Values: * ATTENDED – Attended terminal (Not a valid option if cardholderActivatedTerminalInformation is CAT_LEVEL_6) * UNATTENDED – Unattended terminal or software * NONE – No terminal or software used (VRU, etc.) 
   * @return attendedTerminalData
  */
  @Size(max = 16) 
  @Schema(name = "attendedTerminalData", example = "ATTENDED", description = "Indicates if the card acceptor was at the point of sale.  Valid Values: * ATTENDED – Attended terminal (Not a valid option if cardholderActivatedTerminalInformation is CAT_LEVEL_6) * UNATTENDED – Unattended terminal or software * NONE – No terminal or software used (VRU, etc.) ", required = false)
  public String getAttendedTerminalData() {
    return attendedTerminalData;
  }

  public void setAttendedTerminalData(String attendedTerminalData) {
    this.attendedTerminalData = attendedTerminalData;
  }

  public AdditionalPosInformation cardholderActivatedTerminalInformation(String cardholderActivatedTerminalInformation) {
    this.cardholderActivatedTerminalInformation = cardholderActivatedTerminalInformation;
    return this;
  }

  /**
   * Identifies Cardholder Activated Terminal (CAT) capabilities of the device.  Valid Values: * BLANK – Not a CAT device * CAT_LEVEL_1 - Automated dispensing machine with online/offline PIN (MC Only) * CAT_LEVEL_2 - Self-service terminal, used for automated fueling transactions and unattended terminals. * CAT_LEVEL_3 - Limited amount terminal * CAT_LEVEL_6 - Electronic commerce transaction (attendedTerminalData must not be ATTENDED) 
   * @return cardholderActivatedTerminalInformation
  */
  @Size(max = 16) 
  @Schema(name = "cardholderActivatedTerminalInformation", example = "2", description = "Identifies Cardholder Activated Terminal (CAT) capabilities of the device.  Valid Values: * BLANK – Not a CAT device * CAT_LEVEL_1 - Automated dispensing machine with online/offline PIN (MC Only) * CAT_LEVEL_2 - Self-service terminal, used for automated fueling transactions and unattended terminals. * CAT_LEVEL_3 - Limited amount terminal * CAT_LEVEL_6 - Electronic commerce transaction (attendedTerminalData must not be ATTENDED) ", required = false)
  public String getCardholderActivatedTerminalInformation() {
    return cardholderActivatedTerminalInformation;
  }

  public void setCardholderActivatedTerminalInformation(String cardholderActivatedTerminalInformation) {
    this.cardholderActivatedTerminalInformation = cardholderActivatedTerminalInformation;
  }

  public AdditionalPosInformation posHardwareAndSoftware(PosHardwareAndSoftware posHardwareAndSoftware) {
    this.posHardwareAndSoftware = posHardwareAndSoftware;
    return this;
  }

  /**
   * Get posHardwareAndSoftware
   * @return posHardwareAndSoftware
  */
  @Valid 
  @Schema(name = "posHardwareAndSoftware", required = false)
  public PosHardwareAndSoftware getPosHardwareAndSoftware() {
    return posHardwareAndSoftware;
  }

  public void setPosHardwareAndSoftware(PosHardwareAndSoftware posHardwareAndSoftware) {
    this.posHardwareAndSoftware = posHardwareAndSoftware;
  }

  public AdditionalPosInformation posFeatures(PosFeatures posFeatures) {
    this.posFeatures = posFeatures;
    return this;
  }

  /**
   * Get posFeatures
   * @return posFeatures
  */
  @Valid 
  @Schema(name = "posFeatures", required = false)
  public PosFeatures getPosFeatures() {
    return posFeatures;
  }

  public void setPosFeatures(PosFeatures posFeatures) {
    this.posFeatures = posFeatures;
  }

  public AdditionalPosInformation supervisorId(String supervisorId) {
    this.supervisorId = supervisorId;
    return this;
  }

  /**
   * Used to uniquely identify the merchant’s store supervisor transactions.
   * @return supervisorId
  */
  
  @Schema(name = "supervisorId", example = "1234567", description = "Used to uniquely identify the merchant’s store supervisor transactions.", required = false)
  public String getSupervisorId() {
    return supervisorId;
  }

  public void setSupervisorId(String supervisorId) {
    this.supervisorId = supervisorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPosInformation additionalPosInformation = (AdditionalPosInformation) o;
    return Objects.equals(this.posId, additionalPosInformation.posId) &&
        Objects.equals(this.cashierId, additionalPosInformation.cashierId) &&
        Objects.equals(this.stan, additionalPosInformation.stan) &&
        Objects.equals(this.posFormFactorIndicator, additionalPosInformation.posFormFactorIndicator) &&
        Objects.equals(this.alternateRoutingIndicator, additionalPosInformation.alternateRoutingIndicator) &&
        Objects.equals(this.dataEntrySource, additionalPosInformation.dataEntrySource) &&
        Objects.equals(this.transactionQualifier, additionalPosInformation.transactionQualifier) &&
        Objects.equals(this.attendedTerminalData, additionalPosInformation.attendedTerminalData) &&
        Objects.equals(this.cardholderActivatedTerminalInformation, additionalPosInformation.cardholderActivatedTerminalInformation) &&
        Objects.equals(this.posHardwareAndSoftware, additionalPosInformation.posHardwareAndSoftware) &&
        Objects.equals(this.posFeatures, additionalPosInformation.posFeatures) &&
        Objects.equals(this.supervisorId, additionalPosInformation.supervisorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posId, cashierId, stan, posFormFactorIndicator, alternateRoutingIndicator, dataEntrySource, transactionQualifier, attendedTerminalData, cardholderActivatedTerminalInformation, posHardwareAndSoftware, posFeatures, supervisorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPosInformation {\n");
    sb.append("    posId: ").append(toIndentedString(posId)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    stan: ").append(toIndentedString(stan)).append("\n");
    sb.append("    posFormFactorIndicator: ").append(toIndentedString(posFormFactorIndicator)).append("\n");
    sb.append("    alternateRoutingIndicator: ").append(toIndentedString(alternateRoutingIndicator)).append("\n");
    sb.append("    dataEntrySource: ").append(toIndentedString(dataEntrySource)).append("\n");
    sb.append("    transactionQualifier: ").append(toIndentedString(transactionQualifier)).append("\n");
    sb.append("    attendedTerminalData: ").append(toIndentedString(attendedTerminalData)).append("\n");
    sb.append("    cardholderActivatedTerminalInformation: ").append(toIndentedString(cardholderActivatedTerminalInformation)).append("\n");
    sb.append("    posHardwareAndSoftware: ").append(toIndentedString(posHardwareAndSoftware)).append("\n");
    sb.append("    posFeatures: ").append(toIndentedString(posFeatures)).append("\n");
    sb.append("    supervisorId: ").append(toIndentedString(supervisorId)).append("\n");
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

