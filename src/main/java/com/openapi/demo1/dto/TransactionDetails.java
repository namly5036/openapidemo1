package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.DeviceFingerPrint;
import com.openapi.demo1.dto.SplitShipment;
import java.math.BigDecimal;
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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Transaction-Details.md\&quot;&gt;Transaction details&lt;/a&gt; specific to each request based on business requirements.
 */

@Schema(name = "TransactionDetails", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Transaction-Details.md\">Transaction details</a> specific to each request based on business requirements.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionDetails {

  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("primaryTransactionId")
  private String primaryTransactionId;

  @JsonProperty("primaryOrderId")
  private String primaryOrderId;

  @JsonProperty("clientRequestId")
  private String clientRequestId;

  @JsonProperty("captureFlag")
  private Boolean captureFlag;

  @JsonProperty("transactionCaptureType")
  private String transactionCaptureType;

  @JsonProperty("accountVerification")
  private Boolean accountVerification;

  @JsonProperty("partialApproval")
  private Boolean partialApproval;

  @JsonProperty("merchantTransactionId")
  private String merchantTransactionId;

  @JsonProperty("merchantOrderId")
  private String merchantOrderId;

  @JsonProperty("merchantInvoiceNumber")
  private String merchantInvoiceNumber;

  @JsonProperty("receiptEmail")
  private String receiptEmail;

  @JsonProperty("paymentDescription")
  private String paymentDescription;

  @JsonProperty("cardVerificationAmount")
  private BigDecimal cardVerificationAmount;

  @JsonProperty("partiallyApprovedTransactionAmount")
  private BigDecimal partiallyApprovedTransactionAmount;

  @JsonProperty("splitTenderId")
  private String splitTenderId;

  @JsonProperty("authorizationTypeIndicator")
  private String authorizationTypeIndicator;

  @JsonProperty("duplicateTransactionCheckingIndicator")
  private Boolean duplicateTransactionCheckingIndicator;

  @JsonProperty("primaryTransactionType")
  private String primaryTransactionType;

  @JsonProperty("vaultFundingSource")
  private Boolean vaultFundingSource;

  @JsonProperty("deviceFingerprint")
  @Valid
  private List<DeviceFingerPrint> deviceFingerprint = null;

  @JsonProperty("splitShipment")
  private SplitShipment splitShipment;

  @JsonProperty("reversalReasonCode")
  private String reversalReasonCode;

  @JsonProperty("physicalGoodsIndicator")
  private Boolean physicalGoodsIndicator;

  @JsonProperty("authorizationSequence")
  private String authorizationSequence;

  @JsonProperty("createToken")
  private Boolean createToken;

  @JsonProperty("retrievalReferenceNumber")
  private String retrievalReferenceNumber;

  public TransactionDetails approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * Reference number received as the result of a successful external authorization (e.g. by phone). The gateway needs this number for uniquely mapping a ForcedTicket transaction to a previously performed external authorization.
   * @return approvalCode
  */
  
  @Schema(name = "approvalCode", description = "Reference number received as the result of a successful external authorization (e.g. by phone). The gateway needs this number for uniquely mapping a ForcedTicket transaction to a previously performed external authorization.", required = false)
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public TransactionDetails primaryTransactionId(String primaryTransactionId) {
    this.primaryTransactionId = primaryTransactionId;
    return this;
  }

  /**
   * The unique identifier from the original transaction passed for a reauthorization and incremental authorization.
   * @return primaryTransactionId
  */
  @Size(max = 40) 
  @Schema(name = "primaryTransactionId", example = "838916029301", description = "The unique identifier from the original transaction passed for a reauthorization and incremental authorization.", required = false)
  public String getPrimaryTransactionId() {
    return primaryTransactionId;
  }

  public void setPrimaryTransactionId(String primaryTransactionId) {
    this.primaryTransactionId = primaryTransactionId;
  }

  public TransactionDetails primaryOrderId(String primaryOrderId) {
    this.primaryOrderId = primaryOrderId;
    return this;
  }

  /**
   * The unique order identifier from the original transaction passed for a reauthorization and incremental authorization.
   * @return primaryOrderId
  */
  @Size(max = 40) 
  @Schema(name = "primaryOrderId", example = "838916029301", description = "The unique order identifier from the original transaction passed for a reauthorization and incremental authorization.", required = false)
  public String getPrimaryOrderId() {
    return primaryOrderId;
  }

  public void setPrimaryOrderId(String primaryOrderId) {
    this.primaryOrderId = primaryOrderId;
  }

  public TransactionDetails clientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

  /**
   * Echoes back the value in the request header for tracking.
   * @return clientRequestId
  */
  @Size(max = 64) 
  @Schema(name = "clientRequestId", example = "30dd879c-ee2f-11db-8314-0800200c9a66", description = "Echoes back the value in the request header for tracking.", required = false)
  public String getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public TransactionDetails captureFlag(Boolean captureFlag) {
    this.captureFlag = captureFlag;
    return this;
  }

  /**
   * Designates if the transaction should be captured. Auth (False) or Sale (True).
   * @return captureFlag
  */
  
  @Schema(name = "captureFlag", example = "true", description = "Designates if the transaction should be captured. Auth (False) or Sale (True).", required = false)
  public Boolean getCaptureFlag() {
    return captureFlag;
  }

  public void setCaptureFlag(Boolean captureFlag) {
    this.captureFlag = captureFlag;
  }

  public TransactionDetails transactionCaptureType(String transactionCaptureType) {
    this.transactionCaptureType = transactionCaptureType;
    return this;
  }

  /**
   * Identifies if settlement was Host capture or Terminal capture.
   * @return transactionCaptureType
  */
  @Size(max = 64) 
  @Schema(name = "transactionCaptureType", example = "TCS", description = "Identifies if settlement was Host capture or Terminal capture.", required = false)
  public String getTransactionCaptureType() {
    return transactionCaptureType;
  }

  public void setTransactionCaptureType(String transactionCaptureType) {
    this.transactionCaptureType = transactionCaptureType;
  }

  public TransactionDetails accountVerification(Boolean accountVerification) {
    this.accountVerification = accountVerification;
    return this;
  }

  /**
   * Determines if verification should be performed on the payment type.
   * @return accountVerification
  */
  
  @Schema(name = "accountVerification", example = "false", description = "Determines if verification should be performed on the payment type.", required = false)
  public Boolean getAccountVerification() {
    return accountVerification;
  }

  public void setAccountVerification(Boolean accountVerification) {
    this.accountVerification = accountVerification;
  }

  public TransactionDetails partialApproval(Boolean partialApproval) {
    this.partialApproval = partialApproval;
    return this;
  }

  /**
   *  Indicates if a partial approval is allowed.
   * @return partialApproval
  */
  
  @Schema(name = "partialApproval", example = "true", description = " Indicates if a partial approval is allowed.", required = false)
  public Boolean getPartialApproval() {
    return partialApproval;
  }

  public void setPartialApproval(Boolean partialApproval) {
    this.partialApproval = partialApproval;
  }

  public TransactionDetails merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

  /**
   * Merchant transaction ID (aka transaction reference ID).
   * @return merchantTransactionId
  */
  @Size(max = 32) 
  @Schema(name = "merchantTransactionId", example = "1343678765", description = "Merchant transaction ID (aka transaction reference ID).", required = false)
  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }

  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }

  public TransactionDetails merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

  /**
   * Merchant order ID (aka customer reference number or purchase order number).
   * @return merchantOrderId
  */
  @Size(max = 32) 
  @Schema(name = "merchantOrderId", example = "845366457890-TODO", description = "Merchant order ID (aka customer reference number or purchase order number).", required = false)
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  public TransactionDetails merchantInvoiceNumber(String merchantInvoiceNumber) {
    this.merchantInvoiceNumber = merchantInvoiceNumber;
    return this;
  }

  /**
   * Merchant invoice number (aka reference number).
   * @return merchantInvoiceNumber
  */
  @Size(max = 12) 
  @Schema(name = "merchantInvoiceNumber", example = "123890", description = "Merchant invoice number (aka reference number).", required = false)
  public String getMerchantInvoiceNumber() {
    return merchantInvoiceNumber;
  }

  public void setMerchantInvoiceNumber(String merchantInvoiceNumber) {
    this.merchantInvoiceNumber = merchantInvoiceNumber;
  }

  public TransactionDetails receiptEmail(String receiptEmail) {
    this.receiptEmail = receiptEmail;
    return this;
  }

  /**
   * Email address to send a digital receipt.
   * @return receiptEmail
  */
  @Size(max = 256) 
  @Schema(name = "receiptEmail", example = "abc@gmail.com", description = "Email address to send a digital receipt.", required = false)
  public String getReceiptEmail() {
    return receiptEmail;
  }

  public void setReceiptEmail(String receiptEmail) {
    this.receiptEmail = receiptEmail;
  }

  public TransactionDetails paymentDescription(String paymentDescription) {
    this.paymentDescription = paymentDescription;
    return this;
  }

  /**
   * Payment description.
   * @return paymentDescription
  */
  @Size(max = 1024) 
  @Schema(name = "paymentDescription", description = "Payment description.", required = false)
  public String getPaymentDescription() {
    return paymentDescription;
  }

  public void setPaymentDescription(String paymentDescription) {
    this.paymentDescription = paymentDescription;
  }

  public TransactionDetails cardVerificationAmount(BigDecimal cardVerificationAmount) {
    this.cardVerificationAmount = cardVerificationAmount;
    return this;
  }

  /**
   * Amount used to verify the transaction. Some issuers do not allow $0.00 authorizations.
   * maximum: 1000000000000000000
   * @return cardVerificationAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "cardVerificationAmount", example = "0.02", description = "Amount used to verify the transaction. Some issuers do not allow $0.00 authorizations.", required = false)
  public BigDecimal getCardVerificationAmount() {
    return cardVerificationAmount;
  }

  public void setCardVerificationAmount(BigDecimal cardVerificationAmount) {
    this.cardVerificationAmount = cardVerificationAmount;
  }

  public TransactionDetails partiallyApprovedTransactionAmount(BigDecimal partiallyApprovedTransactionAmount) {
    this.partiallyApprovedTransactionAmount = partiallyApprovedTransactionAmount;
    return this;
  }

  /**
   * The partially approved transaction amount from the original request.
   * maximum: 1000000000000000000
   * @return partiallyApprovedTransactionAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "partiallyApprovedTransactionAmount", example = "10.55", description = "The partially approved transaction amount from the original request.", required = false)
  public BigDecimal getPartiallyApprovedTransactionAmount() {
    return partiallyApprovedTransactionAmount;
  }

  public void setPartiallyApprovedTransactionAmount(BigDecimal partiallyApprovedTransactionAmount) {
    this.partiallyApprovedTransactionAmount = partiallyApprovedTransactionAmount;
  }

  public TransactionDetails splitTenderId(String splitTenderId) {
    this.splitTenderId = splitTenderId;
    return this;
  }

  /**
   * A partially-authorized transaction will generate a split tender ID. Subsequent transactions to complete the authorization should include the split tender ID so that all the transactions comprising that authorization can be linked.
   * @return splitTenderId
  */
  @Size(max = 1024) 
  @Schema(name = "splitTenderId", example = "12423434", description = "A partially-authorized transaction will generate a split tender ID. Subsequent transactions to complete the authorization should include the split tender ID so that all the transactions comprising that authorization can be linked.", required = false)
  public String getSplitTenderId() {
    return splitTenderId;
  }

  public void setSplitTenderId(String splitTenderId) {
    this.splitTenderId = splitTenderId;
  }

  public TransactionDetails authorizationTypeIndicator(String authorizationTypeIndicator) {
    this.authorizationTypeIndicator = authorizationTypeIndicator;
    return this;
  }

  /**
   * Type of authorization requested.  Valid Values: * INITIAL * REAUTH * DEFERRED * INCREMENTAL * ESTIMATED 
   * @return authorizationTypeIndicator
  */
  @Size(max = 11) 
  @Schema(name = "authorizationTypeIndicator", example = "REAUTH", description = "Type of authorization requested.  Valid Values: * INITIAL * REAUTH * DEFERRED * INCREMENTAL * ESTIMATED ", required = false)
  public String getAuthorizationTypeIndicator() {
    return authorizationTypeIndicator;
  }

  public void setAuthorizationTypeIndicator(String authorizationTypeIndicator) {
    this.authorizationTypeIndicator = authorizationTypeIndicator;
  }

  public TransactionDetails duplicateTransactionCheckingIndicator(Boolean duplicateTransactionCheckingIndicator) {
    this.duplicateTransactionCheckingIndicator = duplicateTransactionCheckingIndicator;
    return this;
  }

  /**
   * Determines if duplicate transactions should be checked.
   * @return duplicateTransactionCheckingIndicator
  */
  
  @Schema(name = "duplicateTransactionCheckingIndicator", example = "false", description = "Determines if duplicate transactions should be checked.", required = false)
  public Boolean getDuplicateTransactionCheckingIndicator() {
    return duplicateTransactionCheckingIndicator;
  }

  public void setDuplicateTransactionCheckingIndicator(Boolean duplicateTransactionCheckingIndicator) {
    this.duplicateTransactionCheckingIndicator = duplicateTransactionCheckingIndicator;
  }

  public TransactionDetails primaryTransactionType(String primaryTransactionType) {
    this.primaryTransactionType = primaryTransactionType;
    return this;
  }

  /**
   * Identifies the primary transaction type.  Valid Values: * AUTH_ONLY * CHARGE_PREAUTH * CHARGE_SALE * CANCEL * REFUND 
   * @return primaryTransactionType
  */
  @Size(max = 14) 
  @Schema(name = "primaryTransactionType", example = "CHARGE_SALE", description = "Identifies the primary transaction type.  Valid Values: * AUTH_ONLY * CHARGE_PREAUTH * CHARGE_SALE * CANCEL * REFUND ", required = false)
  public String getPrimaryTransactionType() {
    return primaryTransactionType;
  }

  public void setPrimaryTransactionType(String primaryTransactionType) {
    this.primaryTransactionType = primaryTransactionType;
  }

  public TransactionDetails vaultFundingSource(Boolean vaultFundingSource) {
    this.vaultFundingSource = vaultFundingSource;
    return this;
  }

  /**
   * Identifies if the customer information was from the vault.
   * @return vaultFundingSource
  */
  
  @Schema(name = "vaultFundingSource", example = "false", description = "Identifies if the customer information was from the vault.", required = false)
  public Boolean getVaultFundingSource() {
    return vaultFundingSource;
  }

  public void setVaultFundingSource(Boolean vaultFundingSource) {
    this.vaultFundingSource = vaultFundingSource;
  }

  public TransactionDetails deviceFingerprint(List<DeviceFingerPrint> deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

  public TransactionDetails addDeviceFingerprintItem(DeviceFingerPrint deviceFingerprintItem) {
    if (this.deviceFingerprint == null) {
      this.deviceFingerprint = new ArrayList<>();
    }
    this.deviceFingerprint.add(deviceFingerprintItem);
    return this;
  }

  /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  */
  @Valid 
  @Schema(name = "deviceFingerprint", required = false)
  public List<DeviceFingerPrint> getDeviceFingerprint() {
    return deviceFingerprint;
  }

  public void setDeviceFingerprint(List<DeviceFingerPrint> deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }

  public TransactionDetails splitShipment(SplitShipment splitShipment) {
    this.splitShipment = splitShipment;
    return this;
  }

  /**
   * Get splitShipment
   * @return splitShipment
  */
  @Valid 
  @Schema(name = "splitShipment", required = false)
  public SplitShipment getSplitShipment() {
    return splitShipment;
  }

  public void setSplitShipment(SplitShipment splitShipment) {
    this.splitShipment = splitShipment;
  }

  public TransactionDetails reversalReasonCode(String reversalReasonCode) {
    this.reversalReasonCode = reversalReasonCode;
    return this;
  }

  /**
   * Reason the merchant/customer requests for cancel (void).                Valid Values: * VOID * TIMEOUT * EDIT_ERROR * MAC_VERIFICATION_ERROR * MAC_SYNCH_ERROR * ENCRYPTION_ERROR * SYSTEM_ERROR * SUSPECTED_FRAUD 
   * @return reversalReasonCode
  */
  @Size(max = 22) 
  @Schema(name = "reversalReasonCode", example = "VOID", description = "Reason the merchant/customer requests for cancel (void).                Valid Values: * VOID * TIMEOUT * EDIT_ERROR * MAC_VERIFICATION_ERROR * MAC_SYNCH_ERROR * ENCRYPTION_ERROR * SYSTEM_ERROR * SUSPECTED_FRAUD ", required = false)
  public String getReversalReasonCode() {
    return reversalReasonCode;
  }

  public void setReversalReasonCode(String reversalReasonCode) {
    this.reversalReasonCode = reversalReasonCode;
  }

  public TransactionDetails physicalGoodsIndicator(Boolean physicalGoodsIndicator) {
    this.physicalGoodsIndicator = physicalGoodsIndicator;
    return this;
  }

  /**
   * Identifies if physical goods were sold.
   * @return physicalGoodsIndicator
  */
  
  @Schema(name = "physicalGoodsIndicator", example = "false", description = "Identifies if physical goods were sold.", required = false)
  public Boolean getPhysicalGoodsIndicator() {
    return physicalGoodsIndicator;
  }

  public void setPhysicalGoodsIndicator(Boolean physicalGoodsIndicator) {
    this.physicalGoodsIndicator = physicalGoodsIndicator;
  }

  public TransactionDetails authorizationSequence(String authorizationSequence) {
    this.authorizationSequence = authorizationSequence;
    return this;
  }

  /**
   * Type of authorization sequence requested.  Valid Values: * AUTHORIZATION_ONLY - (default) * AUTHORIZATION_BEFORE_CANCEL * CANCEL_BEFORE_AUTHORIZATION 
   * @return authorizationSequence
  */
  @Size(max = 27) 
  @Schema(name = "authorizationSequence", example = "CANCEL_BEFORE_AUTHORIZATION", description = "Type of authorization sequence requested.  Valid Values: * AUTHORIZATION_ONLY - (default) * AUTHORIZATION_BEFORE_CANCEL * CANCEL_BEFORE_AUTHORIZATION ", required = false)
  public String getAuthorizationSequence() {
    return authorizationSequence;
  }

  public void setAuthorizationSequence(String authorizationSequence) {
    this.authorizationSequence = authorizationSequence;
  }

  public TransactionDetails createToken(Boolean createToken) {
    this.createToken = createToken;
    return this;
  }

  /**
   * Used to create a token on a charge transaction.
   * @return createToken
  */
  
  @Schema(name = "createToken", example = "true", description = "Used to create a token on a charge transaction.", required = false)
  public Boolean getCreateToken() {
    return createToken;
  }

  public void setCreateToken(Boolean createToken) {
    this.createToken = createToken;
  }

  public TransactionDetails retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

  /**
   * Retrieval reference number can be any value based on the merchant’s choosing (e.g. sequential tracking of transactions, fixed value etc.) used for transaction retrieval from the networks.
   * @return retrievalReferenceNumber
  */
  @Size(max = 12) 
  @Schema(name = "retrievalReferenceNumber", example = "56004567", description = "Retrieval reference number can be any value based on the merchant’s choosing (e.g. sequential tracking of transactions, fixed value etc.) used for transaction retrieval from the networks.", required = false)
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetails transactionDetails = (TransactionDetails) o;
    return Objects.equals(this.approvalCode, transactionDetails.approvalCode) &&
        Objects.equals(this.primaryTransactionId, transactionDetails.primaryTransactionId) &&
        Objects.equals(this.primaryOrderId, transactionDetails.primaryOrderId) &&
        Objects.equals(this.clientRequestId, transactionDetails.clientRequestId) &&
        Objects.equals(this.captureFlag, transactionDetails.captureFlag) &&
        Objects.equals(this.transactionCaptureType, transactionDetails.transactionCaptureType) &&
        Objects.equals(this.accountVerification, transactionDetails.accountVerification) &&
        Objects.equals(this.partialApproval, transactionDetails.partialApproval) &&
        Objects.equals(this.merchantTransactionId, transactionDetails.merchantTransactionId) &&
        Objects.equals(this.merchantOrderId, transactionDetails.merchantOrderId) &&
        Objects.equals(this.merchantInvoiceNumber, transactionDetails.merchantInvoiceNumber) &&
        Objects.equals(this.receiptEmail, transactionDetails.receiptEmail) &&
        Objects.equals(this.paymentDescription, transactionDetails.paymentDescription) &&
        Objects.equals(this.cardVerificationAmount, transactionDetails.cardVerificationAmount) &&
        Objects.equals(this.partiallyApprovedTransactionAmount, transactionDetails.partiallyApprovedTransactionAmount) &&
        Objects.equals(this.splitTenderId, transactionDetails.splitTenderId) &&
        Objects.equals(this.authorizationTypeIndicator, transactionDetails.authorizationTypeIndicator) &&
        Objects.equals(this.duplicateTransactionCheckingIndicator, transactionDetails.duplicateTransactionCheckingIndicator) &&
        Objects.equals(this.primaryTransactionType, transactionDetails.primaryTransactionType) &&
        Objects.equals(this.vaultFundingSource, transactionDetails.vaultFundingSource) &&
        Objects.equals(this.deviceFingerprint, transactionDetails.deviceFingerprint) &&
        Objects.equals(this.splitShipment, transactionDetails.splitShipment) &&
        Objects.equals(this.reversalReasonCode, transactionDetails.reversalReasonCode) &&
        Objects.equals(this.physicalGoodsIndicator, transactionDetails.physicalGoodsIndicator) &&
        Objects.equals(this.authorizationSequence, transactionDetails.authorizationSequence) &&
        Objects.equals(this.createToken, transactionDetails.createToken) &&
        Objects.equals(this.retrievalReferenceNumber, transactionDetails.retrievalReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, primaryTransactionId, primaryOrderId, clientRequestId, captureFlag, transactionCaptureType, accountVerification, partialApproval, merchantTransactionId, merchantOrderId, merchantInvoiceNumber, receiptEmail, paymentDescription, cardVerificationAmount, partiallyApprovedTransactionAmount, splitTenderId, authorizationTypeIndicator, duplicateTransactionCheckingIndicator, primaryTransactionType, vaultFundingSource, deviceFingerprint, splitShipment, reversalReasonCode, physicalGoodsIndicator, authorizationSequence, createToken, retrievalReferenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetails {\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    primaryTransactionId: ").append(toIndentedString(primaryTransactionId)).append("\n");
    sb.append("    primaryOrderId: ").append(toIndentedString(primaryOrderId)).append("\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    captureFlag: ").append(toIndentedString(captureFlag)).append("\n");
    sb.append("    transactionCaptureType: ").append(toIndentedString(transactionCaptureType)).append("\n");
    sb.append("    accountVerification: ").append(toIndentedString(accountVerification)).append("\n");
    sb.append("    partialApproval: ").append(toIndentedString(partialApproval)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    sb.append("    merchantInvoiceNumber: ").append(toIndentedString(merchantInvoiceNumber)).append("\n");
    sb.append("    receiptEmail: ").append(toIndentedString(receiptEmail)).append("\n");
    sb.append("    paymentDescription: ").append(toIndentedString(paymentDescription)).append("\n");
    sb.append("    cardVerificationAmount: ").append(toIndentedString(cardVerificationAmount)).append("\n");
    sb.append("    partiallyApprovedTransactionAmount: ").append(toIndentedString(partiallyApprovedTransactionAmount)).append("\n");
    sb.append("    splitTenderId: ").append(toIndentedString(splitTenderId)).append("\n");
    sb.append("    authorizationTypeIndicator: ").append(toIndentedString(authorizationTypeIndicator)).append("\n");
    sb.append("    duplicateTransactionCheckingIndicator: ").append(toIndentedString(duplicateTransactionCheckingIndicator)).append("\n");
    sb.append("    primaryTransactionType: ").append(toIndentedString(primaryTransactionType)).append("\n");
    sb.append("    vaultFundingSource: ").append(toIndentedString(vaultFundingSource)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
    sb.append("    reversalReasonCode: ").append(toIndentedString(reversalReasonCode)).append("\n");
    sb.append("    physicalGoodsIndicator: ").append(toIndentedString(physicalGoodsIndicator)).append("\n");
    sb.append("    authorizationSequence: ").append(toIndentedString(authorizationSequence)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
    sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
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

