package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.DebitNetworkPinlessDetails;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Card details for Account Information Response.
 */

@Schema(name = "CardDetails", description = "Card details for Account Information Response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class CardDetails {

  @JsonProperty("binSource")
  private String binSource;

  @JsonProperty("recordType")
  private String recordType;

  @JsonProperty("lowBin")
  private String lowBin;

  @JsonProperty("highBin")
  private String highBin;

  @JsonProperty("binLength")
  private String binLength;

  @JsonProperty("binDetailPan")
  private String binDetailPan;

  @JsonProperty("issuerBankName")
  private String issuerBankName;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("detailedCardProduct")
  private String detailedCardProduct;

  @JsonProperty("detailedCardIndicator")
  private String detailedCardIndicator;

  @JsonProperty("pinSignatureCapability")
  private String pinSignatureCapability;

  @JsonProperty("issuerUpdateYear")
  private String issuerUpdateYear;

  @JsonProperty("issuerUpdateMonth")
  private String issuerUpdateMonth;

  @JsonProperty("issuerUpdateDay")
  private String issuerUpdateDay;

  @JsonProperty("regulatorIndicator")
  private String regulatorIndicator;

  @JsonProperty("cardClass")
  private String cardClass;

  @JsonProperty("debitPinlessIndicator")
  @Valid
  private List<DebitNetworkPinlessDetails> debitPinlessIndicator = null;

  @JsonProperty("ebtState")
  private String ebtState;

  @JsonProperty("fsaIndicator")
  private String fsaIndicator;

  @JsonProperty("nonMoneyTransferOCTsDomestic")
  private String nonMoneyTransferOCTsDomestic;

  @JsonProperty("nonMoneyTransferOCTsCrossBorder")
  private String nonMoneyTransferOCTsCrossBorder;

  @JsonProperty("onlineGamblingOCTsDomestic")
  private String onlineGamblingOCTsDomestic;

  @JsonProperty("onlineGamblingOCTsCrossBorder")
  private String onlineGamblingOCTsCrossBorder;

  @JsonProperty("moneyTransferOCTsDomestic")
  private String moneyTransferOCTsDomestic;

  @JsonProperty("moneyTransferOCTsCrossBorder")
  private String moneyTransferOCTsCrossBorder;

  @JsonProperty("fastFundsDomesticMoneyTransfer")
  private String fastFundsDomesticMoneyTransfer;

  @JsonProperty("fastFundsCrossBorderMoneyTransfer")
  private String fastFundsCrossBorderMoneyTransfer;

  @JsonProperty("fastFundsDomesticNonMoneyTransfer")
  private String fastFundsDomesticNonMoneyTransfer;

  @JsonProperty("fastFundsCrossBorderNonMoneyTransfer")
  private String fastFundsCrossBorderNonMoneyTransfer;

  @JsonProperty("fastFundsDomesticGambling")
  private String fastFundsDomesticGambling;

  @JsonProperty("fastFundsCrossBorderGambling")
  private String fastFundsCrossBorderGambling;

  @JsonProperty("prepaidIndicator")
  private String prepaidIndicator;

  @JsonProperty("anonymousPrepaidIndicator")
  private String anonymousPrepaidIndicator;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("visaProductSubType")
  private String visaProductSubType;

  @JsonProperty("visaLargeTicketIndicator")
  private String visaLargeTicketIndicator;

  @JsonProperty("accountFundSource")
  private String accountFundSource;

  @JsonProperty("panLengthMin")
  private String panLengthMin;

  @JsonProperty("panLengthMax")
  private String panLengthMax;

  @JsonProperty("tokenIndicator")
  private String tokenIndicator;

  @JsonProperty("issuingNetwork")
  private String issuingNetwork;

  @JsonProperty("cardholderBillingCurrency")
  private String cardholderBillingCurrency;

  @JsonProperty("accountFundSourceSubtype")
  private String accountFundSourceSubtype;

  @JsonProperty("b2bProgramId")
  private String b2bProgramId;

  @JsonProperty("moneySendIndicator")
  private String moneySendIndicator;

  public CardDetails binSource(String binSource) {
    this.binSource = binSource;
    return this;
  }

  /**
   * Categorizes the source of the BIN record.  Valid Values: * FISERV - (Default) Fiserv Global BIN file * CHASE - Chase BIN file(s) * PRIVATE_LABEL - Private Label specific BIN (availability restricted per merchant) 
   * @return binSource
  */
  @Size(max = 30) 
  @Schema(name = "binSource", example = "CHASE", description = "Categorizes the source of the BIN record.  Valid Values: * FISERV - (Default) Fiserv Global BIN file * CHASE - Chase BIN file(s) * PRIVATE_LABEL - Private Label specific BIN (availability restricted per merchant) ", required = false)
  public String getBinSource() {
    return binSource;
  }

  public void setBinSource(String binSource) {
    this.binSource = binSource;
  }

  public CardDetails recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Record Type  Valid Values: * DETAIL - Detail Record 
   * @return recordType
  */
  @Size(max = 10) 
  @Schema(name = "recordType", example = "DETAIL", description = "Record Type  Valid Values: * DETAIL - Detail Record ", required = false)
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public CardDetails lowBin(String lowBin) {
    this.lowBin = lowBin;
    return this;
  }

  /**
   * This field contains the low BIN value of the BIN range.
   * @return lowBin
  */
  @Size(max = 21) 
  @Schema(name = "lowBin", example = "400337", description = "This field contains the low BIN value of the BIN range.", required = false)
  public String getLowBin() {
    return lowBin;
  }

  public void setLowBin(String lowBin) {
    this.lowBin = lowBin;
  }

  public CardDetails highBin(String highBin) {
    this.highBin = highBin;
    return this;
  }

  /**
   * This field contains the high BIN value of the BIN range.
   * @return highBin
  */
  @Size(max = 21) 
  @Schema(name = "highBin", example = "400338", description = "This field contains the high BIN value of the BIN range.", required = false)
  public String getHighBin() {
    return highBin;
  }

  public void setHighBin(String highBin) {
    this.highBin = highBin;
  }

  public CardDetails binLength(String binLength) {
    this.binLength = binLength;
    return this;
  }

  /**
   * Length of the BIN.
   * @return binLength
  */
  @Size(max = 2) 
  @Schema(name = "binLength", example = "6", description = "Length of the BIN.", required = false)
  public String getBinLength() {
    return binLength;
  }

  public void setBinLength(String binLength) {
    this.binLength = binLength;
  }

  public CardDetails binDetailPan(String binDetailPan) {
    this.binDetailPan = binDetailPan;
    return this;
  }

  /**
   * Displays the primary PAN length.
   * @return binDetailPan
  */
  @Size(max = 2) 
  @Schema(name = "binDetailPan", example = "16", description = "Displays the primary PAN length.", required = false)
  public String getBinDetailPan() {
    return binDetailPan;
  }

  public void setBinDetailPan(String binDetailPan) {
    this.binDetailPan = binDetailPan;
  }

  public CardDetails issuerBankName(String issuerBankName) {
    this.issuerBankName = issuerBankName;
    return this;
  }

  /**
   * Issuer bank name for the BIN.
   * @return issuerBankName
  */
  @Size(max = 100) 
  @Schema(name = "issuerBankName", example = "Example Bank", description = "Issuer bank name for the BIN.", required = false)
  public String getIssuerBankName() {
    return issuerBankName;
  }

  public void setIssuerBankName(String issuerBankName) {
    this.issuerBankName = issuerBankName;
  }

  public CardDetails countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO-3166-1 alpha-3 country code.
   * @return countryCode
  */
  @Size(max = 3) 
  @Schema(name = "countryCode", example = "USA", description = "ISO-3166-1 alpha-3 country code.", required = false)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CardDetails detailedCardProduct(String detailedCardProduct) {
    this.detailedCardProduct = detailedCardProduct;
    return this;
  }

  /**
   * Card Product.  Valid Values: * VISA - Visa * MASTERCARD - Mastercard * AMEX - American Express * DISCOVER - Discover * PIN_ONLY - PIN Only (Not Visa, Mastercard, American Express, Discover) * MAESTRO - International Maestro * DINERS - Diners Club * INTERAC - Interac * JCB - JCB 
   * @return detailedCardProduct
  */
  @Size(max = 21) 
  @Schema(name = "detailedCardProduct", example = "VISA", description = "Card Product.  Valid Values: * VISA - Visa * MASTERCARD - Mastercard * AMEX - American Express * DISCOVER - Discover * PIN_ONLY - PIN Only (Not Visa, Mastercard, American Express, Discover) * MAESTRO - International Maestro * DINERS - Diners Club * INTERAC - Interac * JCB - JCB ", required = false)
  public String getDetailedCardProduct() {
    return detailedCardProduct;
  }

  public void setDetailedCardProduct(String detailedCardProduct) {
    this.detailedCardProduct = detailedCardProduct;
  }

  public CardDetails detailedCardIndicator(String detailedCardIndicator) {
    this.detailedCardIndicator = detailedCardIndicator;
    return this;
  }

  /**
   * Determines the card type (credit, debit).  Valid Values: * CREDIT * DEBIT * COMMERCIAL_DEBIT * CONSUMER_DEBIT 
   * @return detailedCardIndicator
  */
  @Size(max = 16) 
  @Schema(name = "detailedCardIndicator", example = "CREDIT", description = "Determines the card type (credit, debit).  Valid Values: * CREDIT * DEBIT * COMMERCIAL_DEBIT * CONSUMER_DEBIT ", required = false)
  public String getDetailedCardIndicator() {
    return detailedCardIndicator;
  }

  public void setDetailedCardIndicator(String detailedCardIndicator) {
    this.detailedCardIndicator = detailedCardIndicator;
  }

  public CardDetails pinSignatureCapability(String pinSignatureCapability) {
    this.pinSignatureCapability = pinSignatureCapability;
    return this;
  }

  /**
   * Determines the card PIN/Signature capability.  Valid Values: * PIN_CAPABLE - PIN Capable * SIGNATURE - Signature Capable * PIN_OR_SIGNATURE - Supports Both PIN or Signature 
   * @return pinSignatureCapability
  */
  @Size(max = 16) 
  @Schema(name = "pinSignatureCapability", example = "PIN_OR_SIGNATURE", description = "Determines the card PIN/Signature capability.  Valid Values: * PIN_CAPABLE - PIN Capable * SIGNATURE - Signature Capable * PIN_OR_SIGNATURE - Supports Both PIN or Signature ", required = false)
  public String getPinSignatureCapability() {
    return pinSignatureCapability;
  }

  public void setPinSignatureCapability(String pinSignatureCapability) {
    this.pinSignatureCapability = pinSignatureCapability;
  }

  public CardDetails issuerUpdateYear(String issuerUpdateYear) {
    this.issuerUpdateYear = issuerUpdateYear;
    return this;
  }

  /**
   * The year the BIN record was last updated.
   * @return issuerUpdateYear
  */
  @Size(max = 2) 
  @Schema(name = "issuerUpdateYear", example = "20", description = "The year the BIN record was last updated.", required = false)
  public String getIssuerUpdateYear() {
    return issuerUpdateYear;
  }

  public void setIssuerUpdateYear(String issuerUpdateYear) {
    this.issuerUpdateYear = issuerUpdateYear;
  }

  public CardDetails issuerUpdateMonth(String issuerUpdateMonth) {
    this.issuerUpdateMonth = issuerUpdateMonth;
    return this;
  }

  /**
   * The month the BIN record was last updated.
   * @return issuerUpdateMonth
  */
  @Size(max = 2) 
  @Schema(name = "issuerUpdateMonth", example = "09", description = "The month the BIN record was last updated.", required = false)
  public String getIssuerUpdateMonth() {
    return issuerUpdateMonth;
  }

  public void setIssuerUpdateMonth(String issuerUpdateMonth) {
    this.issuerUpdateMonth = issuerUpdateMonth;
  }

  public CardDetails issuerUpdateDay(String issuerUpdateDay) {
    this.issuerUpdateDay = issuerUpdateDay;
    return this;
  }

  /**
   * The day the BIN record was last updated.
   * @return issuerUpdateDay
  */
  @Size(max = 2) 
  @Schema(name = "issuerUpdateDay", example = "22", description = "The day the BIN record was last updated.", required = false)
  public String getIssuerUpdateDay() {
    return issuerUpdateDay;
  }

  public void setIssuerUpdateDay(String issuerUpdateDay) {
    this.issuerUpdateDay = issuerUpdateDay;
  }

  public CardDetails regulatorIndicator(String regulatorIndicator) {
    this.regulatorIndicator = regulatorIndicator;
    return this;
  }

  /**
   * Applies to US issued cards only (Visa, Mastercard, and Discover).  Valid Values: * NON_REGULATED - (Default) ISS non-regulated (unregulated issuer OR Non US issued card) * REGULATED - ISS regulated (regulated issuer) * REGULATED_FRAUD - ISS regulated fraud (regulated issuer with fraud) 
   * @return regulatorIndicator
  */
  @Size(max = 15) 
  @Schema(name = "regulatorIndicator", example = "NON_REGULATED", description = "Applies to US issued cards only (Visa, Mastercard, and Discover).  Valid Values: * NON_REGULATED - (Default) ISS non-regulated (unregulated issuer OR Non US issued card) * REGULATED - ISS regulated (regulated issuer) * REGULATED_FRAUD - ISS regulated fraud (regulated issuer with fraud) ", required = false)
  public String getRegulatorIndicator() {
    return regulatorIndicator;
  }

  public void setRegulatorIndicator(String regulatorIndicator) {
    this.regulatorIndicator = regulatorIndicator;
  }

  public CardDetails cardClass(String cardClass) {
    this.cardClass = cardClass;
    return this;
  }

  /**
   * Categorizes the BIN as a Business card, Corporate T&E card, Purchase card or Consumer card.  Valid Values: * BUSINESS * CONSUMER * PURCHASE * CORPORATE 
   * @return cardClass
  */
  @Size(max = 30) 
  @Schema(name = "cardClass", example = "CONSUMER", description = "Categorizes the BIN as a Business card, Corporate T&E card, Purchase card or Consumer card.  Valid Values: * BUSINESS * CONSUMER * PURCHASE * CORPORATE ", required = false)
  public String getCardClass() {
    return cardClass;
  }

  public void setCardClass(String cardClass) {
    this.cardClass = cardClass;
  }

  public CardDetails debitPinlessIndicator(List<DebitNetworkPinlessDetails> debitPinlessIndicator) {
    this.debitPinlessIndicator = debitPinlessIndicator;
    return this;
  }

  public CardDetails addDebitPinlessIndicatorItem(DebitNetworkPinlessDetails debitPinlessIndicatorItem) {
    if (this.debitPinlessIndicator == null) {
      this.debitPinlessIndicator = new ArrayList<>();
    }
    this.debitPinlessIndicator.add(debitPinlessIndicatorItem);
    return this;
  }

  /**
   * A list of Debit Network PINless Details.
   * @return debitPinlessIndicator
  */
  @Valid 
  @Schema(name = "debitPinlessIndicator", description = "A list of Debit Network PINless Details.", required = false)
  public List<DebitNetworkPinlessDetails> getDebitPinlessIndicator() {
    return debitPinlessIndicator;
  }

  public void setDebitPinlessIndicator(List<DebitNetworkPinlessDetails> debitPinlessIndicator) {
    this.debitPinlessIndicator = debitPinlessIndicator;
  }

  public CardDetails ebtState(String ebtState) {
    this.ebtState = ebtState;
    return this;
  }

  /**
   * This is the EBT State. Will only be present if EBT capable. Information originates from the debit network.
   * @return ebtState
  */
  @Size(max = 2) 
  @Schema(name = "ebtState", description = "This is the EBT State. Will only be present if EBT capable. Information originates from the debit network.", required = false)
  public String getEbtState() {
    return ebtState;
  }

  public void setEbtState(String ebtState) {
    this.ebtState = ebtState;
  }

  public CardDetails fsaIndicator(String fsaIndicator) {
    this.fsaIndicator = fsaIndicator;
    return this;
  }

  /**
   * FSA/HSA (Flexible Spending Account / Health Savings Account) indicator, which denotes prepaid card program in the US that permits use of funds to pay for qualified out of pocket medical expenses.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fsaIndicator
  */
  @Size(max = 13) 
  @Schema(name = "fsaIndicator", example = "SUPPORTED", description = "FSA/HSA (Flexible Spending Account / Health Savings Account) indicator, which denotes prepaid card program in the US that permits use of funds to pay for qualified out of pocket medical expenses.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFsaIndicator() {
    return fsaIndicator;
  }

  public void setFsaIndicator(String fsaIndicator) {
    this.fsaIndicator = fsaIndicator;
  }

  public CardDetails nonMoneyTransferOCTsDomestic(String nonMoneyTransferOCTsDomestic) {
    this.nonMoneyTransferOCTsDomestic = nonMoneyTransferOCTsDomestic;
    return this;
  }

  /**
   * Indicates if domestic non-money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return nonMoneyTransferOCTsDomestic
  */
  @Size(max = 13) 
  @Schema(name = "nonMoneyTransferOCTsDomestic", example = "SUPPORTED", description = "Indicates if domestic non-money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getNonMoneyTransferOCTsDomestic() {
    return nonMoneyTransferOCTsDomestic;
  }

  public void setNonMoneyTransferOCTsDomestic(String nonMoneyTransferOCTsDomestic) {
    this.nonMoneyTransferOCTsDomestic = nonMoneyTransferOCTsDomestic;
  }

  public CardDetails nonMoneyTransferOCTsCrossBorder(String nonMoneyTransferOCTsCrossBorder) {
    this.nonMoneyTransferOCTsCrossBorder = nonMoneyTransferOCTsCrossBorder;
    return this;
  }

  /**
   * Indicates if cross-border non-money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return nonMoneyTransferOCTsCrossBorder
  */
  @Size(max = 13) 
  @Schema(name = "nonMoneyTransferOCTsCrossBorder", example = "SUPPORTED", description = "Indicates if cross-border non-money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getNonMoneyTransferOCTsCrossBorder() {
    return nonMoneyTransferOCTsCrossBorder;
  }

  public void setNonMoneyTransferOCTsCrossBorder(String nonMoneyTransferOCTsCrossBorder) {
    this.nonMoneyTransferOCTsCrossBorder = nonMoneyTransferOCTsCrossBorder;
  }

  public CardDetails onlineGamblingOCTsDomestic(String onlineGamblingOCTsDomestic) {
    this.onlineGamblingOCTsDomestic = onlineGamblingOCTsDomestic;
    return this;
  }

  /**
   * Indicates if domestic online gambling OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return onlineGamblingOCTsDomestic
  */
  @Size(max = 13) 
  @Schema(name = "onlineGamblingOCTsDomestic", example = "SUPPORTED", description = "Indicates if domestic online gambling OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getOnlineGamblingOCTsDomestic() {
    return onlineGamblingOCTsDomestic;
  }

  public void setOnlineGamblingOCTsDomestic(String onlineGamblingOCTsDomestic) {
    this.onlineGamblingOCTsDomestic = onlineGamblingOCTsDomestic;
  }

  public CardDetails onlineGamblingOCTsCrossBorder(String onlineGamblingOCTsCrossBorder) {
    this.onlineGamblingOCTsCrossBorder = onlineGamblingOCTsCrossBorder;
    return this;
  }

  /**
   * Indicates if cross-border online gambling OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return onlineGamblingOCTsCrossBorder
  */
  @Size(max = 13) 
  @Schema(name = "onlineGamblingOCTsCrossBorder", example = "SUPPORTED", description = "Indicates if cross-border online gambling OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getOnlineGamblingOCTsCrossBorder() {
    return onlineGamblingOCTsCrossBorder;
  }

  public void setOnlineGamblingOCTsCrossBorder(String onlineGamblingOCTsCrossBorder) {
    this.onlineGamblingOCTsCrossBorder = onlineGamblingOCTsCrossBorder;
  }

  public CardDetails moneyTransferOCTsDomestic(String moneyTransferOCTsDomestic) {
    this.moneyTransferOCTsDomestic = moneyTransferOCTsDomestic;
    return this;
  }

  /**
   * Indicates if domestic money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return moneyTransferOCTsDomestic
  */
  @Size(max = 13) 
  @Schema(name = "moneyTransferOCTsDomestic", example = "SUPPORTED", description = "Indicates if domestic money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getMoneyTransferOCTsDomestic() {
    return moneyTransferOCTsDomestic;
  }

  public void setMoneyTransferOCTsDomestic(String moneyTransferOCTsDomestic) {
    this.moneyTransferOCTsDomestic = moneyTransferOCTsDomestic;
  }

  public CardDetails moneyTransferOCTsCrossBorder(String moneyTransferOCTsCrossBorder) {
    this.moneyTransferOCTsCrossBorder = moneyTransferOCTsCrossBorder;
    return this;
  }

  /**
   * Indicates if cross-border money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return moneyTransferOCTsCrossBorder
  */
  @Size(max = 13) 
  @Schema(name = "moneyTransferOCTsCrossBorder", example = "SUPPORTED", description = "Indicates if cross-border money transfer OCTs are supported. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getMoneyTransferOCTsCrossBorder() {
    return moneyTransferOCTsCrossBorder;
  }

  public void setMoneyTransferOCTsCrossBorder(String moneyTransferOCTsCrossBorder) {
    this.moneyTransferOCTsCrossBorder = moneyTransferOCTsCrossBorder;
  }

  public CardDetails fastFundsDomesticMoneyTransfer(String fastFundsDomesticMoneyTransfer) {
    this.fastFundsDomesticMoneyTransfer = fastFundsDomesticMoneyTransfer;
    return this;
  }

  /**
   * Indicates if fast funds is supported for domestic money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsDomesticMoneyTransfer
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsDomesticMoneyTransfer", example = "SUPPORTED", description = "Indicates if fast funds is supported for domestic money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsDomesticMoneyTransfer() {
    return fastFundsDomesticMoneyTransfer;
  }

  public void setFastFundsDomesticMoneyTransfer(String fastFundsDomesticMoneyTransfer) {
    this.fastFundsDomesticMoneyTransfer = fastFundsDomesticMoneyTransfer;
  }

  public CardDetails fastFundsCrossBorderMoneyTransfer(String fastFundsCrossBorderMoneyTransfer) {
    this.fastFundsCrossBorderMoneyTransfer = fastFundsCrossBorderMoneyTransfer;
    return this;
  }

  /**
   * Indicates if fast funds is supported for cross-border money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsCrossBorderMoneyTransfer
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsCrossBorderMoneyTransfer", example = "SUPPORTED", description = "Indicates if fast funds is supported for cross-border money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsCrossBorderMoneyTransfer() {
    return fastFundsCrossBorderMoneyTransfer;
  }

  public void setFastFundsCrossBorderMoneyTransfer(String fastFundsCrossBorderMoneyTransfer) {
    this.fastFundsCrossBorderMoneyTransfer = fastFundsCrossBorderMoneyTransfer;
  }

  public CardDetails fastFundsDomesticNonMoneyTransfer(String fastFundsDomesticNonMoneyTransfer) {
    this.fastFundsDomesticNonMoneyTransfer = fastFundsDomesticNonMoneyTransfer;
    return this;
  }

  /**
   * Indicates if fast funds is supported for domestic non-money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsDomesticNonMoneyTransfer
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsDomesticNonMoneyTransfer", example = "SUPPORTED", description = "Indicates if fast funds is supported for domestic non-money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsDomesticNonMoneyTransfer() {
    return fastFundsDomesticNonMoneyTransfer;
  }

  public void setFastFundsDomesticNonMoneyTransfer(String fastFundsDomesticNonMoneyTransfer) {
    this.fastFundsDomesticNonMoneyTransfer = fastFundsDomesticNonMoneyTransfer;
  }

  public CardDetails fastFundsCrossBorderNonMoneyTransfer(String fastFundsCrossBorderNonMoneyTransfer) {
    this.fastFundsCrossBorderNonMoneyTransfer = fastFundsCrossBorderNonMoneyTransfer;
    return this;
  }

  /**
   * Indicates if fast funds is supported for cross-border non-money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsCrossBorderNonMoneyTransfer
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsCrossBorderNonMoneyTransfer", example = "SUPPORTED", description = "Indicates if fast funds is supported for cross-border non-money transfer OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsCrossBorderNonMoneyTransfer() {
    return fastFundsCrossBorderNonMoneyTransfer;
  }

  public void setFastFundsCrossBorderNonMoneyTransfer(String fastFundsCrossBorderNonMoneyTransfer) {
    this.fastFundsCrossBorderNonMoneyTransfer = fastFundsCrossBorderNonMoneyTransfer;
  }

  public CardDetails fastFundsDomesticGambling(String fastFundsDomesticGambling) {
    this.fastFundsDomesticGambling = fastFundsDomesticGambling;
    return this;
  }

  /**
   * Indicates if fast funds is supported for domestic gambling OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsDomesticGambling
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsDomesticGambling", example = "SUPPORTED", description = "Indicates if fast funds is supported for domestic gambling OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsDomesticGambling() {
    return fastFundsDomesticGambling;
  }

  public void setFastFundsDomesticGambling(String fastFundsDomesticGambling) {
    this.fastFundsDomesticGambling = fastFundsDomesticGambling;
  }

  public CardDetails fastFundsCrossBorderGambling(String fastFundsCrossBorderGambling) {
    this.fastFundsCrossBorderGambling = fastFundsCrossBorderGambling;
    return this;
  }

  /**
   * Indicates if fast funds is supported for cross-border gambling OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return fastFundsCrossBorderGambling
  */
  @Size(max = 13) 
  @Schema(name = "fastFundsCrossBorderGambling", example = "SUPPORTED", description = "Indicates if fast funds is supported for cross-border gambling OCTs. Visa Only.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getFastFundsCrossBorderGambling() {
    return fastFundsCrossBorderGambling;
  }

  public void setFastFundsCrossBorderGambling(String fastFundsCrossBorderGambling) {
    this.fastFundsCrossBorderGambling = fastFundsCrossBorderGambling;
  }

  public CardDetails prepaidIndicator(String prepaidIndicator) {
    this.prepaidIndicator = prepaidIndicator;
    return this;
  }

  /**
   * Indicates whether the card is prepaid.  Valid Values: * NON_PREPAID - (Default) No / Not Supported * PREPAID - Yes / Supported 
   * @return prepaidIndicator
  */
  @Size(max = 13) 
  @Schema(name = "prepaidIndicator", example = "SUPPORTED", description = "Indicates whether the card is prepaid.  Valid Values: * NON_PREPAID - (Default) No / Not Supported * PREPAID - Yes / Supported ", required = false)
  public String getPrepaidIndicator() {
    return prepaidIndicator;
  }

  public void setPrepaidIndicator(String prepaidIndicator) {
    this.prepaidIndicator = prepaidIndicator;
  }

  public CardDetails anonymousPrepaidIndicator(String anonymousPrepaidIndicator) {
    this.anonymousPrepaidIndicator = anonymousPrepaidIndicator;
    return this;
  }

  /**
   * Identifies whether Anonymous Prepaid is supported, like AMLD5 (Anti-Money Laundering Directive) compliant, non-AMLD5 compliant, or non-anonymous prepaid programs / not a prepaid program. Mastercard Only.  Valid Values: * AMLD5_NON_COMPLIANT - Anonymous Mastercard and Maestro prepaid card programs, not AMLD5 compliant * AMLD5_COMPLIANT_EQUIVALENT - Anonymous Mastercard and Maestro prepaid card programs with restrictions considered by the issuer as either compliant with or equivalent to AMLD5 requirements * NON_ANONYMOUS - Non-Anonymous Mastercard and Maestro prepaid programs that follow full Know-Your-Customer (KYC) or Simplified Due Diligence (SDD) or not a Prepaid Program example: 'AMLD5_COMPLIANT_EQUIVALENT' 
   * @return anonymousPrepaidIndicator
  */
  @Size(max = 26) 
  @Schema(name = "anonymousPrepaidIndicator", description = "Identifies whether Anonymous Prepaid is supported, like AMLD5 (Anti-Money Laundering Directive) compliant, non-AMLD5 compliant, or non-anonymous prepaid programs / not a prepaid program. Mastercard Only.  Valid Values: * AMLD5_NON_COMPLIANT - Anonymous Mastercard and Maestro prepaid card programs, not AMLD5 compliant * AMLD5_COMPLIANT_EQUIVALENT - Anonymous Mastercard and Maestro prepaid card programs with restrictions considered by the issuer as either compliant with or equivalent to AMLD5 requirements * NON_ANONYMOUS - Non-Anonymous Mastercard and Maestro prepaid programs that follow full Know-Your-Customer (KYC) or Simplified Due Diligence (SDD) or not a Prepaid Program example: 'AMLD5_COMPLIANT_EQUIVALENT' ", required = false)
  public String getAnonymousPrepaidIndicator() {
    return anonymousPrepaidIndicator;
  }

  public void setAnonymousPrepaidIndicator(String anonymousPrepaidIndicator) {
    this.anonymousPrepaidIndicator = anonymousPrepaidIndicator;
  }

  public CardDetails productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Indicates card product sub categories (Purchase Card, Business Card, etc.) for Visa, Mastercard, Discover or Private Label. Refer to BIN specs for valid values.
   * @return productId
  */
  @Size(max = 5) 
  @Schema(name = "productId", example = "N1", description = "Indicates card product sub categories (Purchase Card, Business Card, etc.) for Visa, Mastercard, Discover or Private Label. Refer to BIN specs for valid values.", required = false)
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CardDetails visaProductSubType(String visaProductSubType) {
    this.visaProductSubType = visaProductSubType;
    return this;
  }

  /**
   * This is used to identify product subtypes. Refer to BIN specs for valid values.
   * @return visaProductSubType
  */
  @Size(max = 2) 
  @Schema(name = "visaProductSubType", example = "HC", description = "This is used to identify product subtypes. Refer to BIN specs for valid values.", required = false)
  public String getVisaProductSubType() {
    return visaProductSubType;
  }

  public void setVisaProductSubType(String visaProductSubType) {
    this.visaProductSubType = visaProductSubType;
  }

  public CardDetails visaLargeTicketIndicator(String visaLargeTicketIndicator) {
    this.visaLargeTicketIndicator = visaLargeTicketIndicator;
    return this;
  }

  /**
   * Visa large ticket indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return visaLargeTicketIndicator
  */
  @Size(max = 13) 
  @Schema(name = "visaLargeTicketIndicator", example = "SUPPORTED", description = "Visa large ticket indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getVisaLargeTicketIndicator() {
    return visaLargeTicketIndicator;
  }

  public void setVisaLargeTicketIndicator(String visaLargeTicketIndicator) {
    this.visaLargeTicketIndicator = visaLargeTicketIndicator;
  }

  public CardDetails accountFundSource(String accountFundSource) {
    this.accountFundSource = accountFundSource;
    return this;
  }

  /**
   * For Visa, Mastercard, Discover, and UnionPay. Identifies the source of the funds associated with the primary account for the card.  Valid Values: * CREDIT - Credit * DEBIT - Debit * PREPAID - Prepaid * CHARGE - Charge * DEFERRED_DEBIT - Deferred Debit (Visa ONLY) 
   * @return accountFundSource
  */
  @Size(max = 15) 
  @Schema(name = "accountFundSource", example = "CREDIT", description = "For Visa, Mastercard, Discover, and UnionPay. Identifies the source of the funds associated with the primary account for the card.  Valid Values: * CREDIT - Credit * DEBIT - Debit * PREPAID - Prepaid * CHARGE - Charge * DEFERRED_DEBIT - Deferred Debit (Visa ONLY) ", required = false)
  public String getAccountFundSource() {
    return accountFundSource;
  }

  public void setAccountFundSource(String accountFundSource) {
    this.accountFundSource = accountFundSource;
  }

  public CardDetails panLengthMin(String panLengthMin) {
    this.panLengthMin = panLengthMin;
    return this;
  }

  /**
   * Primary Account Number (PAN) Length Minimum
   * @return panLengthMin
  */
  @Size(max = 2) 
  @Schema(name = "panLengthMin", example = "16", description = "Primary Account Number (PAN) Length Minimum", required = false)
  public String getPanLengthMin() {
    return panLengthMin;
  }

  public void setPanLengthMin(String panLengthMin) {
    this.panLengthMin = panLengthMin;
  }

  public CardDetails panLengthMax(String panLengthMax) {
    this.panLengthMax = panLengthMax;
    return this;
  }

  /**
   * Primary Account Number (PAN) Length Maximum
   * @return panLengthMax
  */
  @Size(max = 2) 
  @Schema(name = "panLengthMax", example = "16", description = "Primary Account Number (PAN) Length Maximum", required = false)
  public String getPanLengthMax() {
    return panLengthMax;
  }

  public void setPanLengthMax(String panLengthMax) {
    this.panLengthMax = panLengthMax;
  }

  public CardDetails tokenIndicator(String tokenIndicator) {
    this.tokenIndicator = tokenIndicator;
    return this;
  }

  /**
   * Token indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return tokenIndicator
  */
  @Size(max = 13) 
  @Schema(name = "tokenIndicator", example = "SUPPORTED", description = "Token indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getTokenIndicator() {
    return tokenIndicator;
  }

  public void setTokenIndicator(String tokenIndicator) {
    this.tokenIndicator = tokenIndicator;
  }

  public CardDetails issuingNetwork(String issuingNetwork) {
    this.issuingNetwork = issuingNetwork;
    return this;
  }

  /**
   * Identifies Discover card types.  Valid Values: * DISCOVER - Discover * DINERS - Diners * JCB - JCB (Japanese Credit Bank) * CUP - CUP (China Union Pay) * PAYPAL - PayPal 
   * @return issuingNetwork
  */
  @Size(max = 10) 
  @Schema(name = "issuingNetwork", example = "DINERS", description = "Identifies Discover card types.  Valid Values: * DISCOVER - Discover * DINERS - Diners * JCB - JCB (Japanese Credit Bank) * CUP - CUP (China Union Pay) * PAYPAL - PayPal ", required = false)
  public String getIssuingNetwork() {
    return issuingNetwork;
  }

  public void setIssuingNetwork(String issuingNetwork) {
    this.issuingNetwork = issuingNetwork;
  }

  public CardDetails cardholderBillingCurrency(String cardholderBillingCurrency) {
    this.cardholderBillingCurrency = cardholderBillingCurrency;
    return this;
  }

  /**
   * Cardholder billing currency in 3-letter ISO currency format.
   * @return cardholderBillingCurrency
  */
  @Size(max = 3) 
  @Schema(name = "cardholderBillingCurrency", example = "USD", description = "Cardholder billing currency in 3-letter ISO currency format.", required = false)
  public String getCardholderBillingCurrency() {
    return cardholderBillingCurrency;
  }

  public void setCardholderBillingCurrency(String cardholderBillingCurrency) {
    this.cardholderBillingCurrency = cardholderBillingCurrency;
  }

  public CardDetails accountFundSourceSubtype(String accountFundSourceSubtype) {
    this.accountFundSourceSubtype = accountFundSourceSubtype;
    return this;
  }

  /**
   * Account fund source subtype. Mastercard only.  Valid Values: * PREPAID_RELOADABLE - Prepaid card is reloadable * PREPAID_NON_RELOADABLE - Prepaid card is non-reloadable 
   * @return accountFundSourceSubtype
  */
  @Size(max = 22) 
  @Schema(name = "accountFundSourceSubtype", example = "PREPAID_RELOADABLE", description = "Account fund source subtype. Mastercard only.  Valid Values: * PREPAID_RELOADABLE - Prepaid card is reloadable * PREPAID_NON_RELOADABLE - Prepaid card is non-reloadable ", required = false)
  public String getAccountFundSourceSubtype() {
    return accountFundSourceSubtype;
  }

  public void setAccountFundSourceSubtype(String accountFundSourceSubtype) {
    this.accountFundSourceSubtype = accountFundSourceSubtype;
  }

  public CardDetails b2bProgramId(String b2bProgramId) {
    this.b2bProgramId = b2bProgramId;
    return this;
  }

  /**
   * Business-to-Business Virtual Payments Product Offering. Visa only.  Valid Values: * B2B_PROGRAM_1 - B2B Program 1 * B2B_PROGRAM_2 - B2B Program 2 * B2B_PROGRAM_3 - B2B Program 3 * B2B_PROGRAM_4 - B2B Program 4 * B2B_PROGRAM_5 - B2B Program 5 * B2B_PROGRAM_6 - B2B Program 6 
   * @return b2bProgramId
  */
  @Size(max = 15) 
  @Schema(name = "b2bProgramId", example = "B2B_PROGRAM_1", description = "Business-to-Business Virtual Payments Product Offering. Visa only.  Valid Values: * B2B_PROGRAM_1 - B2B Program 1 * B2B_PROGRAM_2 - B2B Program 2 * B2B_PROGRAM_3 - B2B Program 3 * B2B_PROGRAM_4 - B2B Program 4 * B2B_PROGRAM_5 - B2B Program 5 * B2B_PROGRAM_6 - B2B Program 6 ", required = false)
  public String getB2bProgramId() {
    return b2bProgramId;
  }

  public void setB2bProgramId(String b2bProgramId) {
    this.b2bProgramId = b2bProgramId;
  }

  public CardDetails moneySendIndicator(String moneySendIndicator) {
    this.moneySendIndicator = moneySendIndicator;
    return this;
  }

  /**
   * MoneySend is a set of a Mastercard network transactions that facilitate fund transfers. This indicator determines if the Mastercard account is eligible to receive a MoneySend payment.  Valid Values: * UNKNOWN - (Default) MoneySend unknown * DOMESTIC_AND_CROSS_BORDER - MoneySend enabled Domestic and Cross-Border * DOMESTIC - MoneySend enabled Domestic only * NOT_ENABLED - NOT MoneySend enabled 
   * @return moneySendIndicator
  */
  @Size(max = 25) 
  @Schema(name = "moneySendIndicator", example = "DOMESTIC_AND_CROSS_BORDER", description = "MoneySend is a set of a Mastercard network transactions that facilitate fund transfers. This indicator determines if the Mastercard account is eligible to receive a MoneySend payment.  Valid Values: * UNKNOWN - (Default) MoneySend unknown * DOMESTIC_AND_CROSS_BORDER - MoneySend enabled Domestic and Cross-Border * DOMESTIC - MoneySend enabled Domestic only * NOT_ENABLED - NOT MoneySend enabled ", required = false)
  public String getMoneySendIndicator() {
    return moneySendIndicator;
  }

  public void setMoneySendIndicator(String moneySendIndicator) {
    this.moneySendIndicator = moneySendIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.binSource, cardDetails.binSource) &&
        Objects.equals(this.recordType, cardDetails.recordType) &&
        Objects.equals(this.lowBin, cardDetails.lowBin) &&
        Objects.equals(this.highBin, cardDetails.highBin) &&
        Objects.equals(this.binLength, cardDetails.binLength) &&
        Objects.equals(this.binDetailPan, cardDetails.binDetailPan) &&
        Objects.equals(this.issuerBankName, cardDetails.issuerBankName) &&
        Objects.equals(this.countryCode, cardDetails.countryCode) &&
        Objects.equals(this.detailedCardProduct, cardDetails.detailedCardProduct) &&
        Objects.equals(this.detailedCardIndicator, cardDetails.detailedCardIndicator) &&
        Objects.equals(this.pinSignatureCapability, cardDetails.pinSignatureCapability) &&
        Objects.equals(this.issuerUpdateYear, cardDetails.issuerUpdateYear) &&
        Objects.equals(this.issuerUpdateMonth, cardDetails.issuerUpdateMonth) &&
        Objects.equals(this.issuerUpdateDay, cardDetails.issuerUpdateDay) &&
        Objects.equals(this.regulatorIndicator, cardDetails.regulatorIndicator) &&
        Objects.equals(this.cardClass, cardDetails.cardClass) &&
        Objects.equals(this.debitPinlessIndicator, cardDetails.debitPinlessIndicator) &&
        Objects.equals(this.ebtState, cardDetails.ebtState) &&
        Objects.equals(this.fsaIndicator, cardDetails.fsaIndicator) &&
        Objects.equals(this.nonMoneyTransferOCTsDomestic, cardDetails.nonMoneyTransferOCTsDomestic) &&
        Objects.equals(this.nonMoneyTransferOCTsCrossBorder, cardDetails.nonMoneyTransferOCTsCrossBorder) &&
        Objects.equals(this.onlineGamblingOCTsDomestic, cardDetails.onlineGamblingOCTsDomestic) &&
        Objects.equals(this.onlineGamblingOCTsCrossBorder, cardDetails.onlineGamblingOCTsCrossBorder) &&
        Objects.equals(this.moneyTransferOCTsDomestic, cardDetails.moneyTransferOCTsDomestic) &&
        Objects.equals(this.moneyTransferOCTsCrossBorder, cardDetails.moneyTransferOCTsCrossBorder) &&
        Objects.equals(this.fastFundsDomesticMoneyTransfer, cardDetails.fastFundsDomesticMoneyTransfer) &&
        Objects.equals(this.fastFundsCrossBorderMoneyTransfer, cardDetails.fastFundsCrossBorderMoneyTransfer) &&
        Objects.equals(this.fastFundsDomesticNonMoneyTransfer, cardDetails.fastFundsDomesticNonMoneyTransfer) &&
        Objects.equals(this.fastFundsCrossBorderNonMoneyTransfer, cardDetails.fastFundsCrossBorderNonMoneyTransfer) &&
        Objects.equals(this.fastFundsDomesticGambling, cardDetails.fastFundsDomesticGambling) &&
        Objects.equals(this.fastFundsCrossBorderGambling, cardDetails.fastFundsCrossBorderGambling) &&
        Objects.equals(this.prepaidIndicator, cardDetails.prepaidIndicator) &&
        Objects.equals(this.anonymousPrepaidIndicator, cardDetails.anonymousPrepaidIndicator) &&
        Objects.equals(this.productId, cardDetails.productId) &&
        Objects.equals(this.visaProductSubType, cardDetails.visaProductSubType) &&
        Objects.equals(this.visaLargeTicketIndicator, cardDetails.visaLargeTicketIndicator) &&
        Objects.equals(this.accountFundSource, cardDetails.accountFundSource) &&
        Objects.equals(this.panLengthMin, cardDetails.panLengthMin) &&
        Objects.equals(this.panLengthMax, cardDetails.panLengthMax) &&
        Objects.equals(this.tokenIndicator, cardDetails.tokenIndicator) &&
        Objects.equals(this.issuingNetwork, cardDetails.issuingNetwork) &&
        Objects.equals(this.cardholderBillingCurrency, cardDetails.cardholderBillingCurrency) &&
        Objects.equals(this.accountFundSourceSubtype, cardDetails.accountFundSourceSubtype) &&
        Objects.equals(this.b2bProgramId, cardDetails.b2bProgramId) &&
        Objects.equals(this.moneySendIndicator, cardDetails.moneySendIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binSource, recordType, lowBin, highBin, binLength, binDetailPan, issuerBankName, countryCode, detailedCardProduct, detailedCardIndicator, pinSignatureCapability, issuerUpdateYear, issuerUpdateMonth, issuerUpdateDay, regulatorIndicator, cardClass, debitPinlessIndicator, ebtState, fsaIndicator, nonMoneyTransferOCTsDomestic, nonMoneyTransferOCTsCrossBorder, onlineGamblingOCTsDomestic, onlineGamblingOCTsCrossBorder, moneyTransferOCTsDomestic, moneyTransferOCTsCrossBorder, fastFundsDomesticMoneyTransfer, fastFundsCrossBorderMoneyTransfer, fastFundsDomesticNonMoneyTransfer, fastFundsCrossBorderNonMoneyTransfer, fastFundsDomesticGambling, fastFundsCrossBorderGambling, prepaidIndicator, anonymousPrepaidIndicator, productId, visaProductSubType, visaLargeTicketIndicator, accountFundSource, panLengthMin, panLengthMax, tokenIndicator, issuingNetwork, cardholderBillingCurrency, accountFundSourceSubtype, b2bProgramId, moneySendIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    sb.append("    binSource: ").append(toIndentedString(binSource)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    lowBin: ").append(toIndentedString(lowBin)).append("\n");
    sb.append("    highBin: ").append(toIndentedString(highBin)).append("\n");
    sb.append("    binLength: ").append(toIndentedString(binLength)).append("\n");
    sb.append("    binDetailPan: ").append(toIndentedString(binDetailPan)).append("\n");
    sb.append("    issuerBankName: ").append(toIndentedString(issuerBankName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    detailedCardProduct: ").append(toIndentedString(detailedCardProduct)).append("\n");
    sb.append("    detailedCardIndicator: ").append(toIndentedString(detailedCardIndicator)).append("\n");
    sb.append("    pinSignatureCapability: ").append(toIndentedString(pinSignatureCapability)).append("\n");
    sb.append("    issuerUpdateYear: ").append(toIndentedString(issuerUpdateYear)).append("\n");
    sb.append("    issuerUpdateMonth: ").append(toIndentedString(issuerUpdateMonth)).append("\n");
    sb.append("    issuerUpdateDay: ").append(toIndentedString(issuerUpdateDay)).append("\n");
    sb.append("    regulatorIndicator: ").append(toIndentedString(regulatorIndicator)).append("\n");
    sb.append("    cardClass: ").append(toIndentedString(cardClass)).append("\n");
    sb.append("    debitPinlessIndicator: ").append(toIndentedString(debitPinlessIndicator)).append("\n");
    sb.append("    ebtState: ").append(toIndentedString(ebtState)).append("\n");
    sb.append("    fsaIndicator: ").append(toIndentedString(fsaIndicator)).append("\n");
    sb.append("    nonMoneyTransferOCTsDomestic: ").append(toIndentedString(nonMoneyTransferOCTsDomestic)).append("\n");
    sb.append("    nonMoneyTransferOCTsCrossBorder: ").append(toIndentedString(nonMoneyTransferOCTsCrossBorder)).append("\n");
    sb.append("    onlineGamblingOCTsDomestic: ").append(toIndentedString(onlineGamblingOCTsDomestic)).append("\n");
    sb.append("    onlineGamblingOCTsCrossBorder: ").append(toIndentedString(onlineGamblingOCTsCrossBorder)).append("\n");
    sb.append("    moneyTransferOCTsDomestic: ").append(toIndentedString(moneyTransferOCTsDomestic)).append("\n");
    sb.append("    moneyTransferOCTsCrossBorder: ").append(toIndentedString(moneyTransferOCTsCrossBorder)).append("\n");
    sb.append("    fastFundsDomesticMoneyTransfer: ").append(toIndentedString(fastFundsDomesticMoneyTransfer)).append("\n");
    sb.append("    fastFundsCrossBorderMoneyTransfer: ").append(toIndentedString(fastFundsCrossBorderMoneyTransfer)).append("\n");
    sb.append("    fastFundsDomesticNonMoneyTransfer: ").append(toIndentedString(fastFundsDomesticNonMoneyTransfer)).append("\n");
    sb.append("    fastFundsCrossBorderNonMoneyTransfer: ").append(toIndentedString(fastFundsCrossBorderNonMoneyTransfer)).append("\n");
    sb.append("    fastFundsDomesticGambling: ").append(toIndentedString(fastFundsDomesticGambling)).append("\n");
    sb.append("    fastFundsCrossBorderGambling: ").append(toIndentedString(fastFundsCrossBorderGambling)).append("\n");
    sb.append("    prepaidIndicator: ").append(toIndentedString(prepaidIndicator)).append("\n");
    sb.append("    anonymousPrepaidIndicator: ").append(toIndentedString(anonymousPrepaidIndicator)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    visaProductSubType: ").append(toIndentedString(visaProductSubType)).append("\n");
    sb.append("    visaLargeTicketIndicator: ").append(toIndentedString(visaLargeTicketIndicator)).append("\n");
    sb.append("    accountFundSource: ").append(toIndentedString(accountFundSource)).append("\n");
    sb.append("    panLengthMin: ").append(toIndentedString(panLengthMin)).append("\n");
    sb.append("    panLengthMax: ").append(toIndentedString(panLengthMax)).append("\n");
    sb.append("    tokenIndicator: ").append(toIndentedString(tokenIndicator)).append("\n");
    sb.append("    issuingNetwork: ").append(toIndentedString(issuingNetwork)).append("\n");
    sb.append("    cardholderBillingCurrency: ").append(toIndentedString(cardholderBillingCurrency)).append("\n");
    sb.append("    accountFundSourceSubtype: ").append(toIndentedString(accountFundSourceSubtype)).append("\n");
    sb.append("    b2bProgramId: ").append(toIndentedString(b2bProgramId)).append("\n");
    sb.append("    moneySendIndicator: ").append(toIndentedString(moneySendIndicator)).append("\n");
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

