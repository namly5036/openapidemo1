package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Network;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Mastercard
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Mastercard extends Network {

  @JsonProperty("interchangeComplianceIndicator")
  private String interchangeComplianceIndicator;

  @JsonProperty("bankNetRefNumber")
  private String bankNetRefNumber;

  @JsonProperty("bankNetDate")
  private String bankNetDate;

  @JsonProperty("cvcErrorIndicator")
  private String cvcErrorIndicator;

  @JsonProperty("transactionIntegrityClass")
  private String transactionIntegrityClass;

  @JsonProperty("xCodeResponse")
  private String xCodeResponse;

  @JsonProperty("chipCryptoValue")
  private String chipCryptoValue;

  @JsonProperty("cardDataOutputCapability")
  private String cardDataOutputCapability;

  @JsonProperty("terminalDataOutputCapability")
  private String terminalDataOutputCapability;

  public Mastercard interchangeComplianceIndicator(String interchangeComplianceIndicator) {
    this.interchangeComplianceIndicator = interchangeComplianceIndicator;
    return this;
  }

  /**
   * A code to indicate that Mastercard interchange compliance data was provided for this transaction, and if any other special Mastercard authorization requirements were met.
   * @return interchangeComplianceIndicator
  */
  
  @Schema(name = "interchangeComplianceIndicator", description = "A code to indicate that Mastercard interchange compliance data was provided for this transaction, and if any other special Mastercard authorization requirements were met.", required = false)
  public String getInterchangeComplianceIndicator() {
    return interchangeComplianceIndicator;
  }

  public void setInterchangeComplianceIndicator(String interchangeComplianceIndicator) {
    this.interchangeComplianceIndicator = interchangeComplianceIndicator;
  }

  public Mastercard bankNetRefNumber(String bankNetRefNumber) {
    this.bankNetRefNumber = bankNetRefNumber;
    return this;
  }

  /**
   * A Mastercard generated identifier for each original authorization request. Reference number assigned by Mastercard to each authorization message.
   * @return bankNetRefNumber
  */
  
  @Schema(name = "bankNetRefNumber", description = "A Mastercard generated identifier for each original authorization request. Reference number assigned by Mastercard to each authorization message.", required = false)
  public String getBankNetRefNumber() {
    return bankNetRefNumber;
  }

  public void setBankNetRefNumber(String bankNetRefNumber) {
    this.bankNetRefNumber = bankNetRefNumber;
  }

  public Mastercard bankNetDate(String bankNetDate) {
    this.bankNetDate = bankNetDate;
    return this;
  }

  /**
   * A Mastercard generated date for this transaction. MMDD format
   * @return bankNetDate
  */
  
  @Schema(name = "bankNetDate", description = "A Mastercard generated date for this transaction. MMDD format", required = false)
  public String getBankNetDate() {
    return bankNetDate;
  }

  public void setBankNetDate(String bankNetDate) {
    this.bankNetDate = bankNetDate;
  }

  public Mastercard cvcErrorIndicator(String cvcErrorIndicator) {
    this.cvcErrorIndicator = cvcErrorIndicator;
    return this;
  }

  /**
   * Indicates the CVC Error response data.
   * @return cvcErrorIndicator
  */
  
  @Schema(name = "cvcErrorIndicator", description = "Indicates the CVC Error response data.", required = false)
  public String getCvcErrorIndicator() {
    return cvcErrorIndicator;
  }

  public void setCvcErrorIndicator(String cvcErrorIndicator) {
    this.cvcErrorIndicator = cvcErrorIndicator;
  }

  public Mastercard transactionIntegrityClass(String transactionIntegrityClass) {
    this.transactionIntegrityClass = transactionIntegrityClass;
    return this;
  }

  /**
   * Contains the MasterCard provided Transaction Integrity Classification for Point of Sale (POS) Purchase and Purchase with Cash Back transactions initiated on the Authorization Platform.
   * @return transactionIntegrityClass
  */
  
  @Schema(name = "transactionIntegrityClass", description = "Contains the MasterCard provided Transaction Integrity Classification for Point of Sale (POS) Purchase and Purchase with Cash Back transactions initiated on the Authorization Platform.", required = false)
  public String getTransactionIntegrityClass() {
    return transactionIntegrityClass;
  }

  public void setTransactionIntegrityClass(String transactionIntegrityClass) {
    this.transactionIntegrityClass = transactionIntegrityClass;
  }

  public Mastercard xCodeResponse(String xCodeResponse) {
    this.xCodeResponse = xCodeResponse;
    return this;
  }

  /**
   * Conditional for Mastercard EMV chip transactions. This value is used to notify the chip that the transaction was unable to go online and is required for batch uploads.
   * @return xCodeResponse
  */
  @Size(max = 6) 
  @Schema(name = "xCodeResponse", description = "Conditional for Mastercard EMV chip transactions. This value is used to notify the chip that the transaction was unable to go online and is required for batch uploads.", required = false)
  public String getxCodeResponse() {
    return xCodeResponse;
  }

  public void setxCodeResponse(String xCodeResponse) {
    this.xCodeResponse = xCodeResponse;
  }

  public Mastercard chipCryptoValue(String chipCryptoValue) {
    this.chipCryptoValue = chipCryptoValue;
    return this;
  }

  /**
   * Additional EMV chip info returned by Mastercard.
   * @return chipCryptoValue
  */
  @Size(max = 3) 
  @Schema(name = "chipCryptoValue", description = "Additional EMV chip info returned by Mastercard.", required = false)
  public String getChipCryptoValue() {
    return chipCryptoValue;
  }

  public void setChipCryptoValue(String chipCryptoValue) {
    this.chipCryptoValue = chipCryptoValue;
  }

  public Mastercard cardDataOutputCapability(String cardDataOutputCapability) {
    this.cardDataOutputCapability = cardDataOutputCapability;
    return this;
  }

  /**
   * Identifies the card's capability to output data.  Valid Values: * UNSPECIFIED * NONE * MAG_STRIPE * ICC * OTHER 
   * @return cardDataOutputCapability
  */
  @Size(max = 25) 
  @Schema(name = "cardDataOutputCapability", example = "UNSPECIFIED", description = "Identifies the card's capability to output data.  Valid Values: * UNSPECIFIED * NONE * MAG_STRIPE * ICC * OTHER ", required = false)
  public String getCardDataOutputCapability() {
    return cardDataOutputCapability;
  }

  public void setCardDataOutputCapability(String cardDataOutputCapability) {
    this.cardDataOutputCapability = cardDataOutputCapability;
  }

  public Mastercard terminalDataOutputCapability(String terminalDataOutputCapability) {
    this.terminalDataOutputCapability = terminalDataOutputCapability;
    return this;
  }

  /**
   * Identifies the terminal's capability to display response data.  Valid Values: * UNSPECIFIED * NONE * PRINTING_ONLY * DISPLAY_ONLY * PRINTING_AND_DISPLAY 
   * @return terminalDataOutputCapability
  */
  @Size(max = 25) 
  @Schema(name = "terminalDataOutputCapability", example = "UNSPECIFIED", description = "Identifies the terminal's capability to display response data.  Valid Values: * UNSPECIFIED * NONE * PRINTING_ONLY * DISPLAY_ONLY * PRINTING_AND_DISPLAY ", required = false)
  public String getTerminalDataOutputCapability() {
    return terminalDataOutputCapability;
  }

  public void setTerminalDataOutputCapability(String terminalDataOutputCapability) {
    this.terminalDataOutputCapability = terminalDataOutputCapability;
  }

  public Mastercard network(String network) {
    super.setNetwork(network);
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
    Mastercard mastercard = (Mastercard) o;
    return Objects.equals(this.interchangeComplianceIndicator, mastercard.interchangeComplianceIndicator) &&
        Objects.equals(this.bankNetRefNumber, mastercard.bankNetRefNumber) &&
        Objects.equals(this.bankNetDate, mastercard.bankNetDate) &&
        Objects.equals(this.cvcErrorIndicator, mastercard.cvcErrorIndicator) &&
        Objects.equals(this.transactionIntegrityClass, mastercard.transactionIntegrityClass) &&
        Objects.equals(this.xCodeResponse, mastercard.xCodeResponse) &&
        Objects.equals(this.chipCryptoValue, mastercard.chipCryptoValue) &&
        Objects.equals(this.cardDataOutputCapability, mastercard.cardDataOutputCapability) &&
        Objects.equals(this.terminalDataOutputCapability, mastercard.terminalDataOutputCapability) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interchangeComplianceIndicator, bankNetRefNumber, bankNetDate, cvcErrorIndicator, transactionIntegrityClass, xCodeResponse, chipCryptoValue, cardDataOutputCapability, terminalDataOutputCapability, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mastercard {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interchangeComplianceIndicator: ").append(toIndentedString(interchangeComplianceIndicator)).append("\n");
    sb.append("    bankNetRefNumber: ").append(toIndentedString(bankNetRefNumber)).append("\n");
    sb.append("    bankNetDate: ").append(toIndentedString(bankNetDate)).append("\n");
    sb.append("    cvcErrorIndicator: ").append(toIndentedString(cvcErrorIndicator)).append("\n");
    sb.append("    transactionIntegrityClass: ").append(toIndentedString(transactionIntegrityClass)).append("\n");
    sb.append("    xCodeResponse: ").append(toIndentedString(xCodeResponse)).append("\n");
    sb.append("    chipCryptoValue: ").append(toIndentedString(chipCryptoValue)).append("\n");
    sb.append("    cardDataOutputCapability: ").append(toIndentedString(cardDataOutputCapability)).append("\n");
    sb.append("    terminalDataOutputCapability: ").append(toIndentedString(terminalDataOutputCapability)).append("\n");
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

