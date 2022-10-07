package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Address;
import com.openapi.demo1.dto.Phone;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Billing &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Address.md\&quot;&gt;address&lt;/a&gt; information.
 */

@Schema(name = "BillingAddress", description = "Billing <a href=\"../docs?path=docs/Resources/Master-Data/Address.md\">address</a> information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class BillingAddress {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("phone")
  private Phone phone;

  public BillingAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Billing first name.
   * @return firstName
  */
  @Size(max = 256) 
  @Schema(name = "firstName", example = "Jane", description = "Billing first name.", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BillingAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Billing last name.
   * @return lastName
  */
  @Size(max = 256) 
  @Schema(name = "lastName", example = "Smith", description = "Billing last name.", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BillingAddress address(Address address) {
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

  public BillingAddress phone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @Valid 
  @Schema(name = "phone", required = false)
  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAddress billingAddress = (BillingAddress) o;
    return Objects.equals(this.firstName, billingAddress.firstName) &&
        Objects.equals(this.lastName, billingAddress.lastName) &&
        Objects.equals(this.address, billingAddress.address) &&
        Objects.equals(this.phone, billingAddress.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAddress {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

