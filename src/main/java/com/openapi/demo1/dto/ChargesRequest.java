package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalDataCommon;
import com.openapi.demo1.dto.Amount;
import com.openapi.demo1.dto.BillingAddress;
import com.openapi.demo1.dto.Customer;
import com.openapi.demo1.dto.DynamicDescriptors;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.NetworkDetails;
import com.openapi.demo1.dto.ReferenceTransactionDetails;
import com.openapi.demo1.dto.ShippingAddress;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.StoredCredentials;
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
 * ChargesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ChargesRequest {

  @JsonProperty("amount")
  private Amount amount;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

  @JsonProperty("referenceTransactionDetails")
  private ReferenceTransactionDetails referenceTransactionDetails;

  @JsonProperty("dynamicDescriptors")
  private DynamicDescriptors dynamicDescriptors;

  @JsonProperty("billingAddress")
  private BillingAddress billingAddress;

  @JsonProperty("shippingAddress")
  private ShippingAddress shippingAddress;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  @JsonProperty("customer")
  private Customer customer;

  @JsonProperty("storedCredentials")
  private StoredCredentials storedCredentials;

  @JsonProperty("transactionInteraction")
  private TransactionInteraction transactionInteraction;

  @JsonProperty("networkDetails")
  private NetworkDetails networkDetails;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  public ChargesRequest amount(Amount amount) {
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

  public ChargesRequest source(Source source) {
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

  public ChargesRequest transactionDetails(TransactionDetails transactionDetails) {
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

  public ChargesRequest referenceTransactionDetails(ReferenceTransactionDetails referenceTransactionDetails) {
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

  public ChargesRequest dynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
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

  public ChargesRequest billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
  */
  @Valid 
  @Schema(name = "billingAddress", required = false)
  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public ChargesRequest shippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
  */
  @Valid 
  @Schema(name = "shippingAddress", required = false)
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public ChargesRequest merchantDetails(MerchantDetails merchantDetails) {
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

  public ChargesRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "customer", required = false)
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public ChargesRequest storedCredentials(StoredCredentials storedCredentials) {
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

  public ChargesRequest transactionInteraction(TransactionInteraction transactionInteraction) {
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

  public ChargesRequest networkDetails(NetworkDetails networkDetails) {
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

  public ChargesRequest additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
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
    ChargesRequest chargesRequest = (ChargesRequest) o;
    return Objects.equals(this.amount, chargesRequest.amount) &&
        Objects.equals(this.source, chargesRequest.source) &&
        Objects.equals(this.transactionDetails, chargesRequest.transactionDetails) &&
        Objects.equals(this.referenceTransactionDetails, chargesRequest.referenceTransactionDetails) &&
        Objects.equals(this.dynamicDescriptors, chargesRequest.dynamicDescriptors) &&
        Objects.equals(this.billingAddress, chargesRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, chargesRequest.shippingAddress) &&
        Objects.equals(this.merchantDetails, chargesRequest.merchantDetails) &&
        Objects.equals(this.customer, chargesRequest.customer) &&
        Objects.equals(this.storedCredentials, chargesRequest.storedCredentials) &&
        Objects.equals(this.transactionInteraction, chargesRequest.transactionInteraction) &&
        Objects.equals(this.networkDetails, chargesRequest.networkDetails) &&
        Objects.equals(this.additionalDataCommon, chargesRequest.additionalDataCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, source, transactionDetails, referenceTransactionDetails, dynamicDescriptors, billingAddress, shippingAddress, merchantDetails, customer, storedCredentials, transactionInteraction, networkDetails, additionalDataCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    referenceTransactionDetails: ").append(toIndentedString(referenceTransactionDetails)).append("\n");
    sb.append("    dynamicDescriptors: ").append(toIndentedString(dynamicDescriptors)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    transactionInteraction: ").append(toIndentedString(transactionInteraction)).append("\n");
    sb.append("    networkDetails: ").append(toIndentedString(networkDetails)).append("\n");
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

