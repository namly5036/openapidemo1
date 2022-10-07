package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Network;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the authorization &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Network-Details.md\&quot;&gt;network response&lt;/a&gt; details.
 */

@Schema(name = "NetworkDetails", description = "Contains the authorization <a href=\"../docs?path=docs/Resources/Master-Data/Network-Details.md\">network response</a> details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class NetworkDetails {

  @JsonProperty("network")
  private Network network;

  @JsonProperty("debitNetworkId")
  private String debitNetworkId;

  @JsonProperty("transactionSequence")
  private String transactionSequence;

  @JsonProperty("systemTrace")
  private String systemTrace;

  @JsonProperty("debitIssuerData")
  private String debitIssuerData;

  @JsonProperty("networkResponseCode")
  private String networkResponseCode;

  @JsonProperty("posEntryModeChange")
  private Boolean posEntryModeChange;

  @JsonProperty("cardLevelResultCode")
  private String cardLevelResultCode;

  @JsonProperty("validationCode")
  private String validationCode;

  @JsonProperty("downgradeReason")
  private String downgradeReason;

  @JsonProperty("creditAuthType")
  private String creditAuthType;

  @JsonProperty("authScore")
  private String authScore;

  @JsonProperty("partialAuthTransactionId")
  private String partialAuthTransactionId;

  @JsonProperty("totalAuthAmount")
  private BigDecimal totalAuthAmount;

  @JsonProperty("transactionIdentifier")
  private String transactionIdentifier;

  @JsonProperty("magStripeQualityIndicator")
  private String magStripeQualityIndicator;

  @JsonProperty("networkAvsCode")
  private String networkAvsCode;

  @JsonProperty("panMappingAccountNumber")
  private String panMappingAccountNumber;

  @JsonProperty("cardholderResponse")
  private String cardholderResponse;

  @JsonProperty("authSource")
  private String authSource;

  public NetworkDetails network(Network network) {
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

  public NetworkDetails debitNetworkId(String debitNetworkId) {
    this.debitNetworkId = debitNetworkId;
    return this;
  }

  /**
   * Network ID for the debit component.
   * @return debitNetworkId
  */
  @Size(max = 64) 
  @Schema(name = "debitNetworkId", example = "123456", description = "Network ID for the debit component.", required = false)
  public String getDebitNetworkId() {
    return debitNetworkId;
  }

  public void setDebitNetworkId(String debitNetworkId) {
    this.debitNetworkId = debitNetworkId;
  }

  public NetworkDetails transactionSequence(String transactionSequence) {
    this.transactionSequence = transactionSequence;
    return this;
  }

  /**
   * Transaction specific data that may be returned in response messages.
   * @return transactionSequence
  */
  @Size(max = 64) 
  @Schema(name = "transactionSequence", example = "1123456", description = "Transaction specific data that may be returned in response messages.", required = false)
  public String getTransactionSequence() {
    return transactionSequence;
  }

  public void setTransactionSequence(String transactionSequence) {
    this.transactionSequence = transactionSequence;
  }

  public NetworkDetails systemTrace(String systemTrace) {
    this.systemTrace = systemTrace;
    return this;
  }

  /**
   * Original trace number that was returned in an authorization response.
   * @return systemTrace
  */
  @Size(max = 64) 
  @Schema(name = "systemTrace", example = "123456789", description = "Original trace number that was returned in an authorization response.", required = false)
  public String getSystemTrace() {
    return systemTrace;
  }

  public void setSystemTrace(String systemTrace) {
    this.systemTrace = systemTrace;
  }

  public NetworkDetails debitIssuerData(String debitIssuerData) {
    this.debitIssuerData = debitIssuerData;
    return this;
  }

  /**
   * Debit issuer specific data that may be returned in the response messages.
   * @return debitIssuerData
  */
  
  @Schema(name = "debitIssuerData", example = "Standard Issuer", description = "Debit issuer specific data that may be returned in the response messages.", required = false)
  public String getDebitIssuerData() {
    return debitIssuerData;
  }

  public void setDebitIssuerData(String debitIssuerData) {
    this.debitIssuerData = debitIssuerData;
  }

  public NetworkDetails networkResponseCode(String networkResponseCode) {
    this.networkResponseCode = networkResponseCode;
    return this;
  }

  /**
   * Debit network response code.
   * @return networkResponseCode
  */
  @Size(max = 16) 
  @Schema(name = "networkResponseCode", example = "00", description = "Debit network response code.", required = false)
  public String getNetworkResponseCode() {
    return networkResponseCode;
  }

  public void setNetworkResponseCode(String networkResponseCode) {
    this.networkResponseCode = networkResponseCode;
  }

  public NetworkDetails posEntryModeChange(Boolean posEntryModeChange) {
    this.posEntryModeChange = posEntryModeChange;
    return this;
  }

  /**
   * Issuer will reply if the entry mode has changed.
   * @return posEntryModeChange
  */
  
  @Schema(name = "posEntryModeChange", description = "Issuer will reply if the entry mode has changed.", required = false)
  public Boolean getPosEntryModeChange() {
    return posEntryModeChange;
  }

  public void setPosEntryModeChange(Boolean posEntryModeChange) {
    this.posEntryModeChange = posEntryModeChange;
  }

  public NetworkDetails cardLevelResultCode(String cardLevelResultCode) {
    this.cardLevelResultCode = cardLevelResultCode;
    return this;
  }

  /**
   * Identifies purchase, corporate, and business card level e.g. Level II/Level III
   * @return cardLevelResultCode
  */
  
  @Schema(name = "cardLevelResultCode", description = "Identifies purchase, corporate, and business card level e.g. Level II/Level III", required = false)
  public String getCardLevelResultCode() {
    return cardLevelResultCode;
  }

  public void setCardLevelResultCode(String cardLevelResultCode) {
    this.cardLevelResultCode = cardLevelResultCode;
  }

  public NetworkDetails validationCode(String validationCode) {
    this.validationCode = validationCode;
    return this;
  }

  /**
   * A code calculated by card brands to ensure that the fields present in the authorization are also present in the clearing record.
   * @return validationCode
  */
  
  @Schema(name = "validationCode", example = "", description = "A code calculated by card brands to ensure that the fields present in the authorization are also present in the clearing record.", required = false)
  public String getValidationCode() {
    return validationCode;
  }

  public void setValidationCode(String validationCode) {
    this.validationCode = validationCode;
  }

  public NetworkDetails downgradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
    return this;
  }

  /**
   * Downgrade reason as supplied by network.
   * @return downgradeReason
  */
  
  @Schema(name = "downgradeReason", example = "ACCOUNT_NUMBER_MISSING", description = "Downgrade reason as supplied by network.", required = false)
  public String getDowngradeReason() {
    return downgradeReason;
  }

  public void setDowngradeReason(String downgradeReason) {
    this.downgradeReason = downgradeReason;
  }

  public NetworkDetails creditAuthType(String creditAuthType) {
    this.creditAuthType = creditAuthType;
    return this;
  }

  /**
   * Indicates the type of authorization required.
   * @return creditAuthType
  */
  
  @Schema(name = "creditAuthType", example = "DISCOVER", description = "Indicates the type of authorization required.", required = false)
  public String getCreditAuthType() {
    return creditAuthType;
  }

  public void setCreditAuthType(String creditAuthType) {
    this.creditAuthType = creditAuthType;
  }

  public NetworkDetails authScore(String authScore) {
    this.authScore = authScore;
    return this;
  }

  /**
   * The auth score returned for the transaction.
   * @return authScore
  */
  
  @Schema(name = "authScore", example = "", description = "The auth score returned for the transaction.", required = false)
  public String getAuthScore() {
    return authScore;
  }

  public void setAuthScore(String authScore) {
    this.authScore = authScore;
  }

  public NetworkDetails partialAuthTransactionId(String partialAuthTransactionId) {
    this.partialAuthTransactionId = partialAuthTransactionId;
    return this;
  }

  /**
   * Generated identifier unique for each original authorization request.
   * @return partialAuthTransactionId
  */
  
  @Schema(name = "partialAuthTransactionId", example = "", description = "Generated identifier unique for each original authorization request.", required = false)
  public String getPartialAuthTransactionId() {
    return partialAuthTransactionId;
  }

  public void setPartialAuthTransactionId(String partialAuthTransactionId) {
    this.partialAuthTransactionId = partialAuthTransactionId;
  }

  public NetworkDetails totalAuthAmount(BigDecimal totalAuthAmount) {
    this.totalAuthAmount = totalAuthAmount;
    return this;
  }

  /**
   * Total amount authorized.
   * @return totalAuthAmount
  */
  @Valid 
  @Schema(name = "totalAuthAmount", example = "13.5", description = "Total amount authorized.", required = false)
  public BigDecimal getTotalAuthAmount() {
    return totalAuthAmount;
  }

  public void setTotalAuthAmount(BigDecimal totalAuthAmount) {
    this.totalAuthAmount = totalAuthAmount;
  }

  public NetworkDetails transactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  /**
   * This field represents a unique value used to identify and link all related transactions for authorization and settlement
   * @return transactionIdentifier
  */
  
  @Schema(name = "transactionIdentifier", description = "This field represents a unique value used to identify and link all related transactions for authorization and settlement", required = false)
  public String getTransactionIdentifier() {
    return transactionIdentifier;
  }

  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  public NetworkDetails magStripeQualityIndicator(String magStripeQualityIndicator) {
    this.magStripeQualityIndicator = magStripeQualityIndicator;
    return this;
  }

  /**
   * This field dentifies the error encountered with the track data provided in the authorization request message.  Valid Values: * TRACK_PRESENT - Track 1 and Track 2 present in the message * NO_TRACK - Track 1 or Track 2 not present in the message * PAN_NOT_EQUAL - Primary Account Number not equal in track data * EXPIRATION_NOT_EQUAL - Expiration date not equal in track data * CARD_TYPE_INVALID - Card type invalid in track data * FIELD_SEPARATORS - Field separator(s) invalid in track data * EXCEEDS_LENGTH -  A field within the track data exceeds maximum length * CATEGORY_CODE - The transaction category code is \"T\". * CUSTOMER_PRESENCE - POS customer presence indicator is false. * CARD_PRESENCE - POS card presence indicator is false. 
   * @return magStripeQualityIndicator
  */
  
  @Schema(name = "magStripeQualityIndicator", example = "TRACK_PRESENT", description = "This field dentifies the error encountered with the track data provided in the authorization request message.  Valid Values: * TRACK_PRESENT - Track 1 and Track 2 present in the message * NO_TRACK - Track 1 or Track 2 not present in the message * PAN_NOT_EQUAL - Primary Account Number not equal in track data * EXPIRATION_NOT_EQUAL - Expiration date not equal in track data * CARD_TYPE_INVALID - Card type invalid in track data * FIELD_SEPARATORS - Field separator(s) invalid in track data * EXCEEDS_LENGTH -  A field within the track data exceeds maximum length * CATEGORY_CODE - The transaction category code is \"T\". * CUSTOMER_PRESENCE - POS customer presence indicator is false. * CARD_PRESENCE - POS card presence indicator is false. ", required = false)
  public String getMagStripeQualityIndicator() {
    return magStripeQualityIndicator;
  }

  public void setMagStripeQualityIndicator(String magStripeQualityIndicator) {
    this.magStripeQualityIndicator = magStripeQualityIndicator;
  }

  public NetworkDetails networkAvsCode(String networkAvsCode) {
    this.networkAvsCode = networkAvsCode;
    return this;
  }

  /**
   * Non-Normalized newtork AVS response code is available.
   * @return networkAvsCode
  */
  @Size(max = 1) 
  @Schema(name = "networkAvsCode", example = "", description = "Non-Normalized newtork AVS response code is available.", required = false)
  public String getNetworkAvsCode() {
    return networkAvsCode;
  }

  public void setNetworkAvsCode(String networkAvsCode) {
    this.networkAvsCode = networkAvsCode;
  }

  public NetworkDetails panMappingAccountNumber(String panMappingAccountNumber) {
    this.panMappingAccountNumber = panMappingAccountNumber;
    return this;
  }

  /**
   * Returned for MasterCard Token transactions (only for MCCs 4111, 4131, 4784, and 7523) and for all AMEX Token transactions.
   * @return panMappingAccountNumber
  */
  @Size(max = 19) 
  @Schema(name = "panMappingAccountNumber", example = "", description = "Returned for MasterCard Token transactions (only for MCCs 4111, 4131, 4784, and 7523) and for all AMEX Token transactions.", required = false)
  public String getPanMappingAccountNumber() {
    return panMappingAccountNumber;
  }

  public void setPanMappingAccountNumber(String panMappingAccountNumber) {
    this.panMappingAccountNumber = panMappingAccountNumber;
  }

  public NetworkDetails cardholderResponse(String cardholderResponse) {
    this.cardholderResponse = cardholderResponse;
    return this;
  }

  /**
   * Non-normalized response from for verifying cardholder data where each position represents the postal/zip code, address, name, telephone, and email respectively.  Valid Values: * Y = Yes data matches * N = No data does not match * U - Data unchecked * R - Retry * S - Service not allowed * Blank - Data not sent 
   * @return cardholderResponse
  */
  @Size(max = 5) 
  @Schema(name = "cardholderResponse", example = "YYNUU", description = "Non-normalized response from for verifying cardholder data where each position represents the postal/zip code, address, name, telephone, and email respectively.  Valid Values: * Y = Yes data matches * N = No data does not match * U - Data unchecked * R - Retry * S - Service not allowed * Blank - Data not sent ", required = false)
  public String getCardholderResponse() {
    return cardholderResponse;
  }

  public void setCardholderResponse(String cardholderResponse) {
    this.cardholderResponse = cardholderResponse;
  }

  public NetworkDetails authSource(String authSource) {
    this.authSource = authSource;
    return this;
  }

  /**
   * Code indicating how the network performed the authorization.
   * @return authSource
  */
  
  @Schema(name = "authSource", example = "STIP", description = "Code indicating how the network performed the authorization.", required = false)
  public String getAuthSource() {
    return authSource;
  }

  public void setAuthSource(String authSource) {
    this.authSource = authSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDetails networkDetails = (NetworkDetails) o;
    return Objects.equals(this.network, networkDetails.network) &&
        Objects.equals(this.debitNetworkId, networkDetails.debitNetworkId) &&
        Objects.equals(this.transactionSequence, networkDetails.transactionSequence) &&
        Objects.equals(this.systemTrace, networkDetails.systemTrace) &&
        Objects.equals(this.debitIssuerData, networkDetails.debitIssuerData) &&
        Objects.equals(this.networkResponseCode, networkDetails.networkResponseCode) &&
        Objects.equals(this.posEntryModeChange, networkDetails.posEntryModeChange) &&
        Objects.equals(this.cardLevelResultCode, networkDetails.cardLevelResultCode) &&
        Objects.equals(this.validationCode, networkDetails.validationCode) &&
        Objects.equals(this.downgradeReason, networkDetails.downgradeReason) &&
        Objects.equals(this.creditAuthType, networkDetails.creditAuthType) &&
        Objects.equals(this.authScore, networkDetails.authScore) &&
        Objects.equals(this.partialAuthTransactionId, networkDetails.partialAuthTransactionId) &&
        Objects.equals(this.totalAuthAmount, networkDetails.totalAuthAmount) &&
        Objects.equals(this.transactionIdentifier, networkDetails.transactionIdentifier) &&
        Objects.equals(this.magStripeQualityIndicator, networkDetails.magStripeQualityIndicator) &&
        Objects.equals(this.networkAvsCode, networkDetails.networkAvsCode) &&
        Objects.equals(this.panMappingAccountNumber, networkDetails.panMappingAccountNumber) &&
        Objects.equals(this.cardholderResponse, networkDetails.cardholderResponse) &&
        Objects.equals(this.authSource, networkDetails.authSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, debitNetworkId, transactionSequence, systemTrace, debitIssuerData, networkResponseCode, posEntryModeChange, cardLevelResultCode, validationCode, downgradeReason, creditAuthType, authScore, partialAuthTransactionId, totalAuthAmount, transactionIdentifier, magStripeQualityIndicator, networkAvsCode, panMappingAccountNumber, cardholderResponse, authSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDetails {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    debitNetworkId: ").append(toIndentedString(debitNetworkId)).append("\n");
    sb.append("    transactionSequence: ").append(toIndentedString(transactionSequence)).append("\n");
    sb.append("    systemTrace: ").append(toIndentedString(systemTrace)).append("\n");
    sb.append("    debitIssuerData: ").append(toIndentedString(debitIssuerData)).append("\n");
    sb.append("    networkResponseCode: ").append(toIndentedString(networkResponseCode)).append("\n");
    sb.append("    posEntryModeChange: ").append(toIndentedString(posEntryModeChange)).append("\n");
    sb.append("    cardLevelResultCode: ").append(toIndentedString(cardLevelResultCode)).append("\n");
    sb.append("    validationCode: ").append(toIndentedString(validationCode)).append("\n");
    sb.append("    downgradeReason: ").append(toIndentedString(downgradeReason)).append("\n");
    sb.append("    creditAuthType: ").append(toIndentedString(creditAuthType)).append("\n");
    sb.append("    authScore: ").append(toIndentedString(authScore)).append("\n");
    sb.append("    partialAuthTransactionId: ").append(toIndentedString(partialAuthTransactionId)).append("\n");
    sb.append("    totalAuthAmount: ").append(toIndentedString(totalAuthAmount)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    magStripeQualityIndicator: ").append(toIndentedString(magStripeQualityIndicator)).append("\n");
    sb.append("    networkAvsCode: ").append(toIndentedString(networkAvsCode)).append("\n");
    sb.append("    panMappingAccountNumber: ").append(toIndentedString(panMappingAccountNumber)).append("\n");
    sb.append("    cardholderResponse: ").append(toIndentedString(cardholderResponse)).append("\n");
    sb.append("    authSource: ").append(toIndentedString(authSource)).append("\n");
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

