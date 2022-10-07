package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.BankAssociationDetails;
import com.openapi.demo1.dto.NameValuePair;
import com.openapi.demo1.dto.ResponseIndicator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Processor-Response-Details.md\&quot;&gt;processor response&lt;/a&gt; details.
 */

@Schema(name = "ProcessorResponseDetails", description = "Contains the <a href=\"../docs?path=docs/Resources/Master-Data/Processor-Response-Details.md\">processor response</a> details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ProcessorResponseDetails {

  @JsonProperty("approvalStatus")
  private String approvalStatus;

  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("authenticationResponseCode")
  private String authenticationResponseCode;

  @JsonProperty("referenceNumber")
  private String referenceNumber;

  @JsonProperty("schemeTransactionId")
  private String schemeTransactionId;

  @JsonProperty("networkOriginalAmount")
  private BigDecimal networkOriginalAmount;

  @JsonProperty("feeProgramIndicator")
  private String feeProgramIndicator;

  @JsonProperty("processor")
  private String processor;

  @JsonProperty("host")
  private String host;

  @JsonProperty("networkRouted")
  private String networkRouted;

  @JsonProperty("PAR")
  private String PAR;

  @JsonProperty("networkInternationalId")
  private String networkInternationalId;

  @JsonProperty("responseCode")
  private String responseCode;

  @JsonProperty("responseMessage")
  private String responseMessage;

  @JsonProperty("hostResponseCode")
  private String hostResponseCode;

  @JsonProperty("hostResponseMessage")
  private String hostResponseMessage;

  @JsonProperty("localTimestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime localTimestamp;

  @JsonProperty("debitReceiptNumber")
  private String debitReceiptNumber;

  @JsonProperty("responseIndicators")
  private ResponseIndicator responseIndicators;

  @JsonProperty("bankAssociationDetails")
  private BankAssociationDetails bankAssociationDetails;

  @JsonProperty("additionalInfo")
  @Valid
  private List<NameValuePair> additionalInfo = null;

  public ProcessorResponseDetails approvalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Final status of the transaction.
   * @return approvalStatus
  */
  
  @Schema(name = "approvalStatus", example = "APPROVED", description = "Final status of the transaction.", required = false)
  public String getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public ProcessorResponseDetails approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * Approval code from the processor.
   * @return approvalCode
  */
  
  @Schema(name = "approvalCode", example = "OK3483", description = "Approval code from the processor.", required = false)
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public ProcessorResponseDetails authenticationResponseCode(String authenticationResponseCode) {
    this.authenticationResponseCode = authenticationResponseCode;
    return this;
  }

  /**
   * Response code from authentication.
   * @return authenticationResponseCode
  */
  
  @Schema(name = "authenticationResponseCode", description = "Response code from authentication.", required = false)
  public String getAuthenticationResponseCode() {
    return authenticationResponseCode;
  }

  public void setAuthenticationResponseCode(String authenticationResponseCode) {
    this.authenticationResponseCode = authenticationResponseCode;
  }

  public ProcessorResponseDetails referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Transaction reference number.
   * @return referenceNumber
  */
  
  @Schema(name = "referenceNumber", example = "845366457890-TODO", description = "Transaction reference number.", required = false)
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ProcessorResponseDetails schemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
    return this;
  }

  /**
   * Brand transaction ID.
   * @return schemeTransactionId
  */
  
  @Schema(name = "schemeTransactionId", example = "019078743804756", description = "Brand transaction ID.", required = false)
  public String getSchemeTransactionId() {
    return schemeTransactionId;
  }

  public void setSchemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
  }

  public ProcessorResponseDetails networkOriginalAmount(BigDecimal networkOriginalAmount) {
    this.networkOriginalAmount = networkOriginalAmount;
    return this;
  }

  /**
   * Network original amount
   * maximum: 1000000000000000000
   * @return networkOriginalAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "networkOriginalAmount", example = "100.5", description = "Network original amount", required = false)
  public BigDecimal getNetworkOriginalAmount() {
    return networkOriginalAmount;
  }

  public void setNetworkOriginalAmount(BigDecimal networkOriginalAmount) {
    this.networkOriginalAmount = networkOriginalAmount;
  }

  public ProcessorResponseDetails feeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

  /**
   * Contains the Fee Program Indicator (FPI) code that may be returned on Debit or PLDebit transaction response.
   * @return feeProgramIndicator
  */
  
  @Schema(name = "feeProgramIndicator", example = "123", description = "Contains the Fee Program Indicator (FPI) code that may be returned on Debit or PLDebit transaction response.", required = false)
  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }

  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }

  public ProcessorResponseDetails processor(String processor) {
    this.processor = processor;
    return this;
  }

  /**
   * Card processor.
   * @return processor
  */
  @Size(max = 256) 
  @Schema(name = "processor", example = "FISERV", description = "Card processor.", required = false)
  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public ProcessorResponseDetails host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Processing endpoint or issuer.
   * @return host
  */
  @Size(max = 256) 
  @Schema(name = "host", example = "NASHVILLE", description = "Processing endpoint or issuer.", required = false)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ProcessorResponseDetails networkRouted(String networkRouted) {
    this.networkRouted = networkRouted;
    return this;
  }

  /**
   * Network label that shows the network where the transaction was routed for authorization (e.g. NYCE, PULSE, STAR, Visa, Mastercard, etc.).
   * @return networkRouted
  */
  @Size(max = 10) 
  @Schema(name = "networkRouted", description = "Network label that shows the network where the transaction was routed for authorization (e.g. NYCE, PULSE, STAR, Visa, Mastercard, etc.).", required = false)
  public String getNetworkRouted() {
    return networkRouted;
  }

  public void setNetworkRouted(String networkRouted) {
    this.networkRouted = networkRouted;
  }

  public ProcessorResponseDetails PAR(String PAR) {
    this.PAR = PAR;
    return this;
  }

  /**
   * A Payment Account Reference (PAR) is a unique identifier associated with a specific cardholder PAN. This identification number can be used in place of sensitive consumer identification fields, and transmitted across the payments ecosystem to facilitate consumer identification.
   * @return PAR
  */
  @Size(max = 29) 
  @Schema(name = "PAR", description = "A Payment Account Reference (PAR) is a unique identifier associated with a specific cardholder PAN. This identification number can be used in place of sensitive consumer identification fields, and transmitted across the payments ecosystem to facilitate consumer identification.", required = false)
  public String getPAR() {
    return PAR;
  }

  public void setPAR(String PAR) {
    this.PAR = PAR;
  }

  public ProcessorResponseDetails networkInternationalId(String networkInternationalId) {
    this.networkInternationalId = networkInternationalId;
    return this;
  }

  /**
   * This field identifies the acquiring host.  Valid Values: * FISERV — Fiserv NII excluding Canadian Debit and Credit * CANADA — Canadian processing (Debit and Credit) * LAC — Latin America/Caribbean (LAC) solutions * MEXICO — Mexico (PROSA) solution 
   * @return networkInternationalId
  */
  @Size(max = 16) 
  @Schema(name = "networkInternationalId", example = "FISERV", description = "This field identifies the acquiring host.  Valid Values: * FISERV — Fiserv NII excluding Canadian Debit and Credit * CANADA — Canadian processing (Debit and Credit) * LAC — Latin America/Caribbean (LAC) solutions * MEXICO — Mexico (PROSA) solution ", required = false)
  public String getNetworkInternationalId() {
    return networkInternationalId;
  }

  public void setNetworkInternationalId(String networkInternationalId) {
    this.networkInternationalId = networkInternationalId;
  }

  public ProcessorResponseDetails responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Normalized transaction response code from the gateway (Commerce Hub Response).
   * @return responseCode
  */
  
  @Schema(name = "responseCode", example = "00000", description = "Normalized transaction response code from the gateway (Commerce Hub Response).", required = false)
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public ProcessorResponseDetails responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Normalized transaction message from the gateway (Commerce Hub Response).
   * @return responseMessage
  */
  
  @Schema(name = "responseMessage", example = "APPROVAL", description = "Normalized transaction message from the gateway (Commerce Hub Response).", required = false)
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public ProcessorResponseDetails hostResponseCode(String hostResponseCode) {
    this.hostResponseCode = hostResponseCode;
    return this;
  }

  /**
   * Endpoint or issuer response code.
   * @return hostResponseCode
  */
  
  @Schema(name = "hostResponseCode", example = "00", description = "Endpoint or issuer response code.", required = false)
  public String getHostResponseCode() {
    return hostResponseCode;
  }

  public void setHostResponseCode(String hostResponseCode) {
    this.hostResponseCode = hostResponseCode;
  }

  public ProcessorResponseDetails hostResponseMessage(String hostResponseMessage) {
    this.hostResponseMessage = hostResponseMessage;
    return this;
  }

  /**
   * Endpoint or issuer response message.
   * @return hostResponseMessage
  */
  
  @Schema(name = "hostResponseMessage", example = "APPROVAL", description = "Endpoint or issuer response message.", required = false)
  public String getHostResponseMessage() {
    return hostResponseMessage;
  }

  public void setHostResponseMessage(String hostResponseMessage) {
    this.hostResponseMessage = hostResponseMessage;
  }

  public ProcessorResponseDetails localTimestamp(OffsetDateTime localTimestamp) {
    this.localTimestamp = localTimestamp;
    return this;
  }

  /**
   * Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ
   * @return localTimestamp
  */
  @Valid 
  @Schema(name = "localTimestamp", example = "2016-04-16T16:06:05Z", description = "Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ", required = false)
  public OffsetDateTime getLocalTimestamp() {
    return localTimestamp;
  }

  public void setLocalTimestamp(OffsetDateTime localTimestamp) {
    this.localTimestamp = localTimestamp;
  }

  public ProcessorResponseDetails debitReceiptNumber(String debitReceiptNumber) {
    this.debitReceiptNumber = debitReceiptNumber;
    return this;
  }

  /**
   * Debit Receipt Number generated by switch.
   * @return debitReceiptNumber
  */
  @Size(max = 6) 
  @Schema(name = "debitReceiptNumber", description = "Debit Receipt Number generated by switch.", required = false)
  public String getDebitReceiptNumber() {
    return debitReceiptNumber;
  }

  public void setDebitReceiptNumber(String debitReceiptNumber) {
    this.debitReceiptNumber = debitReceiptNumber;
  }

  public ProcessorResponseDetails responseIndicators(ResponseIndicator responseIndicators) {
    this.responseIndicators = responseIndicators;
    return this;
  }

  /**
   * Get responseIndicators
   * @return responseIndicators
  */
  @Valid 
  @Schema(name = "responseIndicators", required = false)
  public ResponseIndicator getResponseIndicators() {
    return responseIndicators;
  }

  public void setResponseIndicators(ResponseIndicator responseIndicators) {
    this.responseIndicators = responseIndicators;
  }

  public ProcessorResponseDetails bankAssociationDetails(BankAssociationDetails bankAssociationDetails) {
    this.bankAssociationDetails = bankAssociationDetails;
    return this;
  }

  /**
   * Get bankAssociationDetails
   * @return bankAssociationDetails
  */
  @Valid 
  @Schema(name = "bankAssociationDetails", required = false)
  public BankAssociationDetails getBankAssociationDetails() {
    return bankAssociationDetails;
  }

  public void setBankAssociationDetails(BankAssociationDetails bankAssociationDetails) {
    this.bankAssociationDetails = bankAssociationDetails;
  }

  public ProcessorResponseDetails additionalInfo(List<NameValuePair> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public ProcessorResponseDetails addAdditionalInfoItem(NameValuePair additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @Valid 
  @Schema(name = "additionalInfo", required = false)
  public List<NameValuePair> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(List<NameValuePair> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorResponseDetails processorResponseDetails = (ProcessorResponseDetails) o;
    return Objects.equals(this.approvalStatus, processorResponseDetails.approvalStatus) &&
        Objects.equals(this.approvalCode, processorResponseDetails.approvalCode) &&
        Objects.equals(this.authenticationResponseCode, processorResponseDetails.authenticationResponseCode) &&
        Objects.equals(this.referenceNumber, processorResponseDetails.referenceNumber) &&
        Objects.equals(this.schemeTransactionId, processorResponseDetails.schemeTransactionId) &&
        Objects.equals(this.networkOriginalAmount, processorResponseDetails.networkOriginalAmount) &&
        Objects.equals(this.feeProgramIndicator, processorResponseDetails.feeProgramIndicator) &&
        Objects.equals(this.processor, processorResponseDetails.processor) &&
        Objects.equals(this.host, processorResponseDetails.host) &&
        Objects.equals(this.networkRouted, processorResponseDetails.networkRouted) &&
        Objects.equals(this.PAR, processorResponseDetails.PAR) &&
        Objects.equals(this.networkInternationalId, processorResponseDetails.networkInternationalId) &&
        Objects.equals(this.responseCode, processorResponseDetails.responseCode) &&
        Objects.equals(this.responseMessage, processorResponseDetails.responseMessage) &&
        Objects.equals(this.hostResponseCode, processorResponseDetails.hostResponseCode) &&
        Objects.equals(this.hostResponseMessage, processorResponseDetails.hostResponseMessage) &&
        Objects.equals(this.localTimestamp, processorResponseDetails.localTimestamp) &&
        Objects.equals(this.debitReceiptNumber, processorResponseDetails.debitReceiptNumber) &&
        Objects.equals(this.responseIndicators, processorResponseDetails.responseIndicators) &&
        Objects.equals(this.bankAssociationDetails, processorResponseDetails.bankAssociationDetails) &&
        Objects.equals(this.additionalInfo, processorResponseDetails.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalStatus, approvalCode, authenticationResponseCode, referenceNumber, schemeTransactionId, networkOriginalAmount, feeProgramIndicator, processor, host, networkRouted, PAR, networkInternationalId, responseCode, responseMessage, hostResponseCode, hostResponseMessage, localTimestamp, debitReceiptNumber, responseIndicators, bankAssociationDetails, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorResponseDetails {\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    authenticationResponseCode: ").append(toIndentedString(authenticationResponseCode)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    schemeTransactionId: ").append(toIndentedString(schemeTransactionId)).append("\n");
    sb.append("    networkOriginalAmount: ").append(toIndentedString(networkOriginalAmount)).append("\n");
    sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    networkRouted: ").append(toIndentedString(networkRouted)).append("\n");
    sb.append("    PAR: ").append(toIndentedString(PAR)).append("\n");
    sb.append("    networkInternationalId: ").append(toIndentedString(networkInternationalId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    hostResponseCode: ").append(toIndentedString(hostResponseCode)).append("\n");
    sb.append("    hostResponseMessage: ").append(toIndentedString(hostResponseMessage)).append("\n");
    sb.append("    localTimestamp: ").append(toIndentedString(localTimestamp)).append("\n");
    sb.append("    debitReceiptNumber: ").append(toIndentedString(debitReceiptNumber)).append("\n");
    sb.append("    responseIndicators: ").append(toIndentedString(responseIndicators)).append("\n");
    sb.append("    bankAssociationDetails: ").append(toIndentedString(bankAssociationDetails)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

