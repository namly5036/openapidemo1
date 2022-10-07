package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.Amount;
import com.openapi.demo1.dto.DynamicDescriptors;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.NetworkDetails;
import com.openapi.demo1.dto.ProcessorResponseDetails;
import com.openapi.demo1.dto.ReferenceTransactionDetails;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.StoredCredentials;
import com.openapi.demo1.dto.TransactionBatch;
import com.openapi.demo1.dto.TransactionDetails;
import com.openapi.demo1.dto.TransactionInteraction;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CancelRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class CancelRequest {

  @JsonProperty("amount")
  private Amount amount;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("transactionBatch")
  private TransactionBatch transactionBatch;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("referenceTransactionDetails")
  private ReferenceTransactionDetails referenceTransactionDetails;

  @JsonProperty("dynamicDescriptors")
  private DynamicDescriptors dynamicDescriptors;

  @JsonProperty("transactionInteraction")
  private TransactionInteraction transactionInteraction;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("processorResponseDetails")
  private ProcessorResponseDetails processorResponseDetails;

  @JsonProperty("networkDetails")
  private NetworkDetails networkDetails;

  @JsonProperty("storedCredentials")
  private StoredCredentials storedCredentials;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  public CancelRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", required = false)
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public CancelRequest source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", required = false)
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public CancelRequest transactionBatch(TransactionBatch transactionBatch) {
    this.transactionBatch = transactionBatch;
    return this;
  }

  /**
   * Get transactionBatch
   * @return transactionBatch
  */
  @Valid 
  @Schema(name = "transactionBatch", required = false)
  public TransactionBatch getTransactionBatch() {
    return transactionBatch;
  }

  public void setTransactionBatch(TransactionBatch transactionBatch) {
    this.transactionBatch = transactionBatch;
  }

  public CancelRequest transactionDetails(TransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  /**
   * Get transactionDetails
   * @return transactionDetails
  */
  @Valid 
  @Schema(name = "transactionDetails", required = false)
  public TransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(TransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public CancelRequest referenceTransactionDetails(ReferenceTransactionDetails referenceTransactionDetails) {
    this.referenceTransactionDetails = referenceTransactionDetails;
    return this;
  }

  /**
   * Get referenceTransactionDetails
   * @return referenceTransactionDetails
  */
  @Valid 
  @Schema(name = "referenceTransactionDetails", required = false)
  public ReferenceTransactionDetails getReferenceTransactionDetails() {
    return referenceTransactionDetails;
  }

  public void setReferenceTransactionDetails(ReferenceTransactionDetails referenceTransactionDetails) {
    this.referenceTransactionDetails = referenceTransactionDetails;
  }

  public CancelRequest dynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
    this.dynamicDescriptors = dynamicDescriptors;
    return this;
  }

  /**
   * Get dynamicDescriptors
   * @return dynamicDescriptors
  */
  @Valid 
  @Schema(name = "dynamicDescriptors", required = false)
  public DynamicDescriptors getDynamicDescriptors() {
    return dynamicDescriptors;
  }

  public void setDynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
    this.dynamicDescriptors = dynamicDescriptors;
  }

  public CancelRequest transactionInteraction(TransactionInteraction transactionInteraction) {
    this.transactionInteraction = transactionInteraction;
    return this;
  }

  /**
   * Get transactionInteraction
   * @return transactionInteraction
  */
  @Valid 
  @Schema(name = "transactionInteraction", required = false)
  public TransactionInteraction getTransactionInteraction() {
    return transactionInteraction;
  }

  public void setTransactionInteraction(TransactionInteraction transactionInteraction) {
    this.transactionInteraction = transactionInteraction;
  }

  public CancelRequest merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  */
  @Valid 
  @Schema(name = "merchantDetails", required = false)
  public MerchantDetails getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public CancelRequest processorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
    this.processorResponseDetails = processorResponseDetails;
    return this;
  }

  /**
   * Get processorResponseDetails
   * @return processorResponseDetails
  */
  @Valid 
  @Schema(name = "processorResponseDetails", required = false)
  public ProcessorResponseDetails getProcessorResponseDetails() {
    return processorResponseDetails;
  }

  public void setProcessorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
    this.processorResponseDetails = processorResponseDetails;
  }

  public CancelRequest networkDetails(NetworkDetails networkDetails) {
    this.networkDetails = networkDetails;
    return this;
  }

  /**
   * Get networkDetails
   * @return networkDetails
  */
  @Valid 
  @Schema(name = "networkDetails", required = false)
  public NetworkDetails getNetworkDetails() {
    return networkDetails;
  }

  public void setNetworkDetails(NetworkDetails networkDetails) {
    this.networkDetails = networkDetails;
  }

  public CancelRequest storedCredentials(StoredCredentials storedCredentials) {
    this.storedCredentials = storedCredentials;
    return this;
  }

  /**
   * Get storedCredentials
   * @return storedCredentials
  */
  @Valid 
  @Schema(name = "storedCredentials", required = false)
  public StoredCredentials getStoredCredentials() {
    return storedCredentials;
  }

  public void setStoredCredentials(StoredCredentials storedCredentials) {
    this.storedCredentials = storedCredentials;
  }

  public CancelRequest additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
    this.additionalDataCommon = additionalDataCommon;
    return this;
  }

  /**
   * Get additionalDataCommon
   * @return additionalDataCommon
  */
  @Valid 
  @Schema(name = "additionalDataCommon", required = false)
  public AdditionalDataCommon getAdditionalDataCommon() {
    return additionalDataCommon;
  }

  public void setAdditionalDataCommon(AdditionalDataCommon additionalDataCommon) {
    this.additionalDataCommon = additionalDataCommon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRequest cancelRequest = (CancelRequest) o;
    return Objects.equals(this.amount, cancelRequest.amount) &&
        Objects.equals(this.source, cancelRequest.source) &&
        Objects.equals(this.transactionBatch, cancelRequest.transactionBatch) &&
        Objects.equals(this.transactionDetails, cancelRequest.transactionDetails) &&
        Objects.equals(this.referenceTransactionDetails, cancelRequest.referenceTransactionDetails) &&
        Objects.equals(this.dynamicDescriptors, cancelRequest.dynamicDescriptors) &&
        Objects.equals(this.transactionInteraction, cancelRequest.transactionInteraction) &&
        Objects.equals(this.merchantDetails, cancelRequest.merchantDetails) &&
        Objects.equals(this.processorResponseDetails, cancelRequest.processorResponseDetails) &&
        Objects.equals(this.networkDetails, cancelRequest.networkDetails) &&
        Objects.equals(this.storedCredentials, cancelRequest.storedCredentials) &&
        Objects.equals(this.additionalDataCommon, cancelRequest.additionalDataCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, source, transactionBatch, transactionDetails, referenceTransactionDetails, dynamicDescriptors, transactionInteraction, merchantDetails, processorResponseDetails, networkDetails, storedCredentials, additionalDataCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionBatch: ").append(toIndentedString(transactionBatch)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    referenceTransactionDetails: ").append(toIndentedString(referenceTransactionDetails)).append("\n");
    sb.append("    dynamicDescriptors: ").append(toIndentedString(dynamicDescriptors)).append("\n");
    sb.append("    transactionInteraction: ").append(toIndentedString(transactionInteraction)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    processorResponseDetails: ").append(toIndentedString(processorResponseDetails)).append("\n");
    sb.append("    networkDetails: ").append(toIndentedString(networkDetails)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    additionalDataCommon: ").append(toIndentedString(additionalDataCommon)).append("\n");
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

