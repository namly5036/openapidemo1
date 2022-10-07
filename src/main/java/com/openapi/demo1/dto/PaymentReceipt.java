package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Amount;
import com.openapi.demo1.dto.ProcessorResponseDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Payment-Receipt.md\&quot;&gt;Payment receipt&lt;/a&gt; response details.
 */

@Schema(name = "PaymentReceipt", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Payment-Receipt.md\">Payment receipt</a> response details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PaymentReceipt {

  @JsonProperty("approvedAmount")
  private Amount approvedAmount;

  @JsonProperty("processorResponseDetails")
  private ProcessorResponseDetails processorResponseDetails;

  @JsonProperty("merchantName")
  private String merchantName;

  @JsonProperty("merchantAddress")
  private String merchantAddress;

  @JsonProperty("merchantCity")
  private String merchantCity;

  @JsonProperty("merchantStateOrProvince")
  private String merchantStateOrProvince;

  @JsonProperty("merchantCountry")
  private String merchantCountry;

  @JsonProperty("merchantURL")
  private String merchantURL;

  @JsonProperty("merchantPostalCode")
  private String merchantPostalCode;

  public PaymentReceipt approvedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

  /**
   * Get approvedAmount
   * @return approvedAmount
  */
  @Valid 
  @Schema(name = "approvedAmount", required = false)
  public Amount getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public PaymentReceipt processorResponseDetails(ProcessorResponseDetails processorResponseDetails) {
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

  public PaymentReceipt merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantName
  */
  @Size(max = 1024) 
  @Schema(name = "merchantName", description = "Name of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public PaymentReceipt merchantAddress(String merchantAddress) {
    this.merchantAddress = merchantAddress;
    return this;
  }

  /**
   * Street address of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantAddress
  */
  @Size(max = 1024) 
  @Schema(name = "merchantAddress", description = "Street address of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantAddress() {
    return merchantAddress;
  }

  public void setMerchantAddress(String merchantAddress) {
    this.merchantAddress = merchantAddress;
  }

  public PaymentReceipt merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

  /**
   * City of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantCity
  */
  @Size(max = 256) 
  @Schema(name = "merchantCity", description = "City of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantCity() {
    return merchantCity;
  }

  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }

  public PaymentReceipt merchantStateOrProvince(String merchantStateOrProvince) {
    this.merchantStateOrProvince = merchantStateOrProvince;
    return this;
  }

  /**
   * State or Province of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantStateOrProvince
  */
  @Size(max = 256) 
  @Schema(name = "merchantStateOrProvince", description = "State or Province of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantStateOrProvince() {
    return merchantStateOrProvince;
  }

  public void setMerchantStateOrProvince(String merchantStateOrProvince) {
    this.merchantStateOrProvince = merchantStateOrProvince;
  }

  public PaymentReceipt merchantCountry(String merchantCountry) {
    this.merchantCountry = merchantCountry;
    return this;
  }

  /**
   * Country of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantCountry
  */
  @Size(max = 256) 
  @Schema(name = "merchantCountry", description = "Country of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantCountry() {
    return merchantCountry;
  }

  public void setMerchantCountry(String merchantCountry) {
    this.merchantCountry = merchantCountry;
  }

  public PaymentReceipt merchantURL(String merchantURL) {
    this.merchantURL = merchantURL;
    return this;
  }

  /**
   * Merchant URL returned from boarded account.
   * @return merchantURL
  */
  @Size(max = 256) 
  @Schema(name = "merchantURL", description = "Merchant URL returned from boarded account.", required = false)
  public String getMerchantURL() {
    return merchantURL;
  }

  public void setMerchantURL(String merchantURL) {
    this.merchantURL = merchantURL;
  }

  public PaymentReceipt merchantPostalCode(String merchantPostalCode) {
    this.merchantPostalCode = merchantPostalCode;
    return this;
  }

  /**
   * Postal code of the merchant returned from boarded account or dynamic descriptor.
   * @return merchantPostalCode
  */
  @Size(max = 10) 
  @Schema(name = "merchantPostalCode", description = "Postal code of the merchant returned from boarded account or dynamic descriptor.", required = false)
  public String getMerchantPostalCode() {
    return merchantPostalCode;
  }

  public void setMerchantPostalCode(String merchantPostalCode) {
    this.merchantPostalCode = merchantPostalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReceipt paymentReceipt = (PaymentReceipt) o;
    return Objects.equals(this.approvedAmount, paymentReceipt.approvedAmount) &&
        Objects.equals(this.processorResponseDetails, paymentReceipt.processorResponseDetails) &&
        Objects.equals(this.merchantName, paymentReceipt.merchantName) &&
        Objects.equals(this.merchantAddress, paymentReceipt.merchantAddress) &&
        Objects.equals(this.merchantCity, paymentReceipt.merchantCity) &&
        Objects.equals(this.merchantStateOrProvince, paymentReceipt.merchantStateOrProvince) &&
        Objects.equals(this.merchantCountry, paymentReceipt.merchantCountry) &&
        Objects.equals(this.merchantURL, paymentReceipt.merchantURL) &&
        Objects.equals(this.merchantPostalCode, paymentReceipt.merchantPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedAmount, processorResponseDetails, merchantName, merchantAddress, merchantCity, merchantStateOrProvince, merchantCountry, merchantURL, merchantPostalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReceipt {\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    processorResponseDetails: ").append(toIndentedString(processorResponseDetails)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantAddress: ").append(toIndentedString(merchantAddress)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
    sb.append("    merchantStateOrProvince: ").append(toIndentedString(merchantStateOrProvince)).append("\n");
    sb.append("    merchantCountry: ").append(toIndentedString(merchantCountry)).append("\n");
    sb.append("    merchantURL: ").append(toIndentedString(merchantURL)).append("\n");
    sb.append("    merchantPostalCode: ").append(toIndentedString(merchantPostalCode)).append("\n");
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

