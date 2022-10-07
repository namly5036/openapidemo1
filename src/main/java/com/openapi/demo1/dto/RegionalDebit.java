package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.PinBlock;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Data that applies to &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Debit/Regional-Debit.md\&quot;&gt;regional debit&lt;/a&gt; transactions.
 */

@Schema(name = "RegionalDebit", description = "Data that applies to <a href=\"../docs?path=docs/Resources/Guides/Debit/Regional-Debit.md\">regional debit</a> transactions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class RegionalDebit {

  @JsonProperty("pinBlock")
  private PinBlock pinBlock;

  @JsonProperty("region")
  private String region;

  @JsonProperty("debitTransactionCode")
  private String debitTransactionCode;

  @JsonProperty("debitMACValue")
  private String debitMACValue;

  @JsonProperty("encryptedKeyIndex")
  private BigDecimal encryptedKeyIndex;

  @JsonProperty("messageAuthenticationWorkingKey")
  private String messageAuthenticationWorkingKey;

  @JsonProperty("messageAuthenticationWorkingKeyCheckDigits")
  private String messageAuthenticationWorkingKeyCheckDigits;

  @JsonProperty("messageEncryptionWorkingKey")
  private String messageEncryptionWorkingKey;

  @JsonProperty("debitPinPadSerialNumber")
  private String debitPinPadSerialNumber;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("transactionSequenceCounter")
  private Integer transactionSequenceCounter;

  public RegionalDebit pinBlock(PinBlock pinBlock) {
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

  public RegionalDebit region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Region of debit origin.
   * @return region
  */
  
  @Schema(name = "region", description = "Region of debit origin.", required = false)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public RegionalDebit debitTransactionCode(String debitTransactionCode) {
    this.debitTransactionCode = debitTransactionCode;
    return this;
  }

  /**
   * Identifies the debit transaction.
   * @return debitTransactionCode
  */
  
  @Schema(name = "debitTransactionCode", description = "Identifies the debit transaction.", required = false)
  public String getDebitTransactionCode() {
    return debitTransactionCode;
  }

  public void setDebitTransactionCode(String debitTransactionCode) {
    this.debitTransactionCode = debitTransactionCode;
  }

  public RegionalDebit debitMACValue(String debitMACValue) {
    this.debitMACValue = debitMACValue;
    return this;
  }

  /**
   * Used to confirm that the key data elements of the transaction have not been tampered.
   * @return debitMACValue
  */
  
  @Schema(name = "debitMACValue", description = "Used to confirm that the key data elements of the transaction have not been tampered.", required = false)
  public String getDebitMACValue() {
    return debitMACValue;
  }

  public void setDebitMACValue(String debitMACValue) {
    this.debitMACValue = debitMACValue;
  }

  public RegionalDebit encryptedKeyIndex(BigDecimal encryptedKeyIndex) {
    this.encryptedKeyIndex = encryptedKeyIndex;
    return this;
  }

  /**
   * Indicates the key index in use by PIN Pad, valid values are 1 through 9.
   * @return encryptedKeyIndex
  */
  @Valid 
  @Schema(name = "encryptedKeyIndex", example = "1", description = "Indicates the key index in use by PIN Pad, valid values are 1 through 9.", required = false)
  public BigDecimal getEncryptedKeyIndex() {
    return encryptedKeyIndex;
  }

  public void setEncryptedKeyIndex(BigDecimal encryptedKeyIndex) {
    this.encryptedKeyIndex = encryptedKeyIndex;
  }

  public RegionalDebit messageAuthenticationWorkingKey(String messageAuthenticationWorkingKey) {
    this.messageAuthenticationWorkingKey = messageAuthenticationWorkingKey;
    return this;
  }

  /**
   * A message authentication code for a working key that uses a session key to detect both accidental and intentional modifications of the data.
   * @return messageAuthenticationWorkingKey
  */
  
  @Schema(name = "messageAuthenticationWorkingKey", description = "A message authentication code for a working key that uses a session key to detect both accidental and intentional modifications of the data.", required = false)
  public String getMessageAuthenticationWorkingKey() {
    return messageAuthenticationWorkingKey;
  }

  public void setMessageAuthenticationWorkingKey(String messageAuthenticationWorkingKey) {
    this.messageAuthenticationWorkingKey = messageAuthenticationWorkingKey;
  }

  public RegionalDebit messageAuthenticationWorkingKeyCheckDigits(String messageAuthenticationWorkingKeyCheckDigits) {
    this.messageAuthenticationWorkingKeyCheckDigits = messageAuthenticationWorkingKeyCheckDigits;
    return this;
  }

  /**
   * A message authentication code for a working key that uses a session key to check digits.
   * @return messageAuthenticationWorkingKeyCheckDigits
  */
  
  @Schema(name = "messageAuthenticationWorkingKeyCheckDigits", description = "A message authentication code for a working key that uses a session key to check digits.", required = false)
  public String getMessageAuthenticationWorkingKeyCheckDigits() {
    return messageAuthenticationWorkingKeyCheckDigits;
  }

  public void setMessageAuthenticationWorkingKeyCheckDigits(String messageAuthenticationWorkingKeyCheckDigits) {
    this.messageAuthenticationWorkingKeyCheckDigits = messageAuthenticationWorkingKeyCheckDigits;
  }

  public RegionalDebit messageEncryptionWorkingKey(String messageEncryptionWorkingKey) {
    this.messageEncryptionWorkingKey = messageEncryptionWorkingKey;
    return this;
  }

  /**
   * A message encryption working key is typically a random string of bits generated specifically to scramble and unscramble data.
   * @return messageEncryptionWorkingKey
  */
  
  @Schema(name = "messageEncryptionWorkingKey", description = "A message encryption working key is typically a random string of bits generated specifically to scramble and unscramble data.", required = false)
  public String getMessageEncryptionWorkingKey() {
    return messageEncryptionWorkingKey;
  }

  public void setMessageEncryptionWorkingKey(String messageEncryptionWorkingKey) {
    this.messageEncryptionWorkingKey = messageEncryptionWorkingKey;
  }

  public RegionalDebit debitPinPadSerialNumber(String debitPinPadSerialNumber) {
    this.debitPinPadSerialNumber = debitPinPadSerialNumber;
    return this;
  }

  /**
   * Serial Number of the PIN device in use at the POS.
   * @return debitPinPadSerialNumber
  */
  
  @Schema(name = "debitPinPadSerialNumber", description = "Serial Number of the PIN device in use at the POS.", required = false)
  public String getDebitPinPadSerialNumber() {
    return debitPinPadSerialNumber;
  }

  public void setDebitPinPadSerialNumber(String debitPinPadSerialNumber) {
    this.debitPinPadSerialNumber = debitPinPadSerialNumber;
  }

  public RegionalDebit accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * CHECKING or SAVINGS
   * @return accountType
  */
  
  @Schema(name = "accountType", example = "CHECKING", description = "CHECKING or SAVINGS", required = false)
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public RegionalDebit transactionSequenceCounter(Integer transactionSequenceCounter) {
    this.transactionSequenceCounter = transactionSequenceCounter;
    return this;
  }

  /**
   * Contains a unique sequence counter for this transaction from this point of sale.
   * @return transactionSequenceCounter
  */
  
  @Schema(name = "transactionSequenceCounter", description = "Contains a unique sequence counter for this transaction from this point of sale.", required = false)
  public Integer getTransactionSequenceCounter() {
    return transactionSequenceCounter;
  }

  public void setTransactionSequenceCounter(Integer transactionSequenceCounter) {
    this.transactionSequenceCounter = transactionSequenceCounter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionalDebit regionalDebit = (RegionalDebit) o;
    return Objects.equals(this.pinBlock, regionalDebit.pinBlock) &&
        Objects.equals(this.region, regionalDebit.region) &&
        Objects.equals(this.debitTransactionCode, regionalDebit.debitTransactionCode) &&
        Objects.equals(this.debitMACValue, regionalDebit.debitMACValue) &&
        Objects.equals(this.encryptedKeyIndex, regionalDebit.encryptedKeyIndex) &&
        Objects.equals(this.messageAuthenticationWorkingKey, regionalDebit.messageAuthenticationWorkingKey) &&
        Objects.equals(this.messageAuthenticationWorkingKeyCheckDigits, regionalDebit.messageAuthenticationWorkingKeyCheckDigits) &&
        Objects.equals(this.messageEncryptionWorkingKey, regionalDebit.messageEncryptionWorkingKey) &&
        Objects.equals(this.debitPinPadSerialNumber, regionalDebit.debitPinPadSerialNumber) &&
        Objects.equals(this.accountType, regionalDebit.accountType) &&
        Objects.equals(this.transactionSequenceCounter, regionalDebit.transactionSequenceCounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinBlock, region, debitTransactionCode, debitMACValue, encryptedKeyIndex, messageAuthenticationWorkingKey, messageAuthenticationWorkingKeyCheckDigits, messageEncryptionWorkingKey, debitPinPadSerialNumber, accountType, transactionSequenceCounter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionalDebit {\n");
    sb.append("    pinBlock: ").append(toIndentedString(pinBlock)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    debitTransactionCode: ").append(toIndentedString(debitTransactionCode)).append("\n");
    sb.append("    debitMACValue: ").append(toIndentedString(debitMACValue)).append("\n");
    sb.append("    encryptedKeyIndex: ").append(toIndentedString(encryptedKeyIndex)).append("\n");
    sb.append("    messageAuthenticationWorkingKey: ").append(toIndentedString(messageAuthenticationWorkingKey)).append("\n");
    sb.append("    messageAuthenticationWorkingKeyCheckDigits: ").append(toIndentedString(messageAuthenticationWorkingKeyCheckDigits)).append("\n");
    sb.append("    messageEncryptionWorkingKey: ").append(toIndentedString(messageEncryptionWorkingKey)).append("\n");
    sb.append("    debitPinPadSerialNumber: ").append(toIndentedString(debitPinPadSerialNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    transactionSequenceCounter: ").append(toIndentedString(transactionSequenceCounter)).append("\n");
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

