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
import com.openapi.demo1.dto.FraudAttributes;
import com.openapi.demo1.dto.MerchantDetails;
import com.openapi.demo1.dto.OrderData;
import com.openapi.demo1.dto.ShippingAddress;
import com.openapi.demo1.dto.Source;
import com.openapi.demo1.dto.SplitTender;
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
 * EnhancedDataServiceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class EnhancedDataServiceRequest {

  @JsonProperty("amount")
  private Amount amount;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("transactionDetails")
  private TransactionDetails transactionDetails;

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

  @JsonProperty("fraudAttributes")
  private FraudAttributes fraudAttributes;

  @JsonProperty("storedCredentials")
  private StoredCredentials storedCredentials;

  @JsonProperty("transactionInteraction")
  private TransactionInteraction transactionInteraction;

  @JsonProperty("additionalDataCommon")
  private AdditionalDataCommon additionalDataCommon;

  @JsonProperty("orderData")
  private OrderData orderData;

  @JsonProperty("splitTender")
  private SplitTender splitTender;

  public EnhancedDataServiceRequest amount(Amount amount) {
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

  public EnhancedDataServiceRequest source(Source source) {
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

  public EnhancedDataServiceRequest transactionDetails(TransactionDetails transactionDetails) {
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

  public EnhancedDataServiceRequest dynamicDescriptors(DynamicDescriptors dynamicDescriptors) {
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

  public EnhancedDataServiceRequest billingAddress(BillingAddress billingAddress) {
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

  public EnhancedDataServiceRequest shippingAddress(ShippingAddress shippingAddress) {
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

  public EnhancedDataServiceRequest merchantDetails(MerchantDetails merchantDetails) {
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

  public EnhancedDataServiceRequest customer(Customer customer) {
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

  public EnhancedDataServiceRequest fraudAttributes(FraudAttributes fraudAttributes) {
    this.fraudAttributes = fraudAttributes;
    return this;
  }

  /**
   * Get fraudAttributes
   * @return fraudAttributes
  */
  @Valid 
  @Schema(name = "fraudAttributes", required = false)
  public FraudAttributes getFraudAttributes() {
    return fraudAttributes;
  }

  public void setFraudAttributes(FraudAttributes fraudAttributes) {
    this.fraudAttributes = fraudAttributes;
  }

  public EnhancedDataServiceRequest storedCredentials(StoredCredentials storedCredentials) {
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

  public EnhancedDataServiceRequest transactionInteraction(TransactionInteraction transactionInteraction) {
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

  public EnhancedDataServiceRequest additionalDataCommon(AdditionalDataCommon additionalDataCommon) {
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

  public EnhancedDataServiceRequest orderData(OrderData orderData) {
    this.orderData = orderData;
    return this;
  }

  /**
   * Get orderData
   * @return orderData
  */
  @Valid 
  @Schema(name = "orderData", required = false)
  public OrderData getOrderData() {
    return orderData;
  }

  public void setOrderData(OrderData orderData) {
    this.orderData = orderData;
  }

  public EnhancedDataServiceRequest splitTender(SplitTender splitTender) {
    this.splitTender = splitTender;
    return this;
  }

  /**
   * Get splitTender
   * @return splitTender
  */
  @Valid 
  @Schema(name = "splitTender", required = false)
  public SplitTender getSplitTender() {
    return splitTender;
  }

  public void setSplitTender(SplitTender splitTender) {
    this.splitTender = splitTender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedDataServiceRequest enhancedDataServiceRequest = (EnhancedDataServiceRequest) o;
    return Objects.equals(this.amount, enhancedDataServiceRequest.amount) &&
        Objects.equals(this.source, enhancedDataServiceRequest.source) &&
        Objects.equals(this.transactionDetails, enhancedDataServiceRequest.transactionDetails) &&
        Objects.equals(this.dynamicDescriptors, enhancedDataServiceRequest.dynamicDescriptors) &&
        Objects.equals(this.billingAddress, enhancedDataServiceRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, enhancedDataServiceRequest.shippingAddress) &&
        Objects.equals(this.merchantDetails, enhancedDataServiceRequest.merchantDetails) &&
        Objects.equals(this.customer, enhancedDataServiceRequest.customer) &&
        Objects.equals(this.fraudAttributes, enhancedDataServiceRequest.fraudAttributes) &&
        Objects.equals(this.storedCredentials, enhancedDataServiceRequest.storedCredentials) &&
        Objects.equals(this.transactionInteraction, enhancedDataServiceRequest.transactionInteraction) &&
        Objects.equals(this.additionalDataCommon, enhancedDataServiceRequest.additionalDataCommon) &&
        Objects.equals(this.orderData, enhancedDataServiceRequest.orderData) &&
        Objects.equals(this.splitTender, enhancedDataServiceRequest.splitTender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, source, transactionDetails, dynamicDescriptors, billingAddress, shippingAddress, merchantDetails, customer, fraudAttributes, storedCredentials, transactionInteraction, additionalDataCommon, orderData, splitTender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedDataServiceRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    dynamicDescriptors: ").append(toIndentedString(dynamicDescriptors)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    fraudAttributes: ").append(toIndentedString(fraudAttributes)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    transactionInteraction: ").append(toIndentedString(transactionInteraction)).append("\n");
    sb.append("    additionalDataCommon: ").append(toIndentedString(additionalDataCommon)).append("\n");
    sb.append("    orderData: ").append(toIndentedString(orderData)).append("\n");
    sb.append("    splitTender: ").append(toIndentedString(splitTender)).append("\n");
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

