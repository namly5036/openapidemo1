package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Address;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Dynamic-Descriptor.md\&quot;&gt;Dynamic descriptor&lt;/a&gt; information about a merchant and appears on the customer statement. Note: This has limited platform availability. For more information, please contact your Account Representative.
 */

@Schema(name = "DynamicDescriptors", description = "<a href=\"../docs?path=docs/Resources/Guides/Dynamic-Descriptor.md\">Dynamic descriptor</a> information about a merchant and appears on the customer statement. Note: This has limited platform availability. For more information, please contact your Account Representative.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DynamicDescriptors {

  @JsonProperty("mcc")
  private String mcc;

  @JsonProperty("merchantName")
  private String merchantName;

  @JsonProperty("customerServiceNumber")
  private String customerServiceNumber;

  @JsonProperty("serviceEntitlement")
  private String serviceEntitlement;

  @JsonProperty("address")
  private Address address;

  public DynamicDescriptors mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * Merchant Category Code (MCC). The MCC is an industry standard four-digit number used to classify a business by the type of goods or services provided.
   * @return mcc
  */
  @Size(max = 4) 
  @Schema(name = "mcc", example = "4457", description = "Merchant Category Code (MCC). The MCC is an industry standard four-digit number used to classify a business by the type of goods or services provided.", required = false)
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public DynamicDescriptors merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Doing Business As (DBA) name.
   * @return merchantName
  */
  @Size(max = 1024) 
  @Schema(name = "merchantName", example = "MyWebsite.com", description = "Doing Business As (DBA) name.", required = false)
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public DynamicDescriptors customerServiceNumber(String customerServiceNumber) {
    this.customerServiceNumber = customerServiceNumber;
    return this;
  }

  /**
   * Customer service phone number information that is passed to the issuer and may appear on the customer statement.
   * @return customerServiceNumber
  */
  @Size(max = 15) 
  @Schema(name = "customerServiceNumber", example = "1231231234", description = "Customer service phone number information that is passed to the issuer and may appear on the customer statement.", required = false)
  public String getCustomerServiceNumber() {
    return customerServiceNumber;
  }

  public void setCustomerServiceNumber(String customerServiceNumber) {
    this.customerServiceNumber = customerServiceNumber;
  }

  public DynamicDescriptors serviceEntitlement(String serviceEntitlement) {
    this.serviceEntitlement = serviceEntitlement;
    return this;
  }

  /**
   * Merchant service entitlement number (aka merchant ID).
   * @return serviceEntitlement
  */
  @Size(max = 16) 
  @Schema(name = "serviceEntitlement", example = "67893827513", description = "Merchant service entitlement number (aka merchant ID).", required = false)
  public String getServiceEntitlement() {
    return serviceEntitlement;
  }

  public void setServiceEntitlement(String serviceEntitlement) {
    this.serviceEntitlement = serviceEntitlement;
  }

  public DynamicDescriptors address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicDescriptors dynamicDescriptors = (DynamicDescriptors) o;
    return Objects.equals(this.mcc, dynamicDescriptors.mcc) &&
        Objects.equals(this.merchantName, dynamicDescriptors.merchantName) &&
        Objects.equals(this.customerServiceNumber, dynamicDescriptors.customerServiceNumber) &&
        Objects.equals(this.serviceEntitlement, dynamicDescriptors.serviceEntitlement) &&
        Objects.equals(this.address, dynamicDescriptors.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, merchantName, customerServiceNumber, serviceEntitlement, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicDescriptors {\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    customerServiceNumber: ").append(toIndentedString(customerServiceNumber)).append("\n");
    sb.append("    serviceEntitlement: ").append(toIndentedString(serviceEntitlement)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

