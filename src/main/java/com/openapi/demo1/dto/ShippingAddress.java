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
 * Shipping and/or delivery &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Address.md\&quot;&gt;address&lt;/a&gt; information.
 */

@Schema(name = "ShippingAddress", description = "Shipping and/or delivery <a href=\"../docs?path=docs/Resources/Master-Data/Address.md\">address</a> information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ShippingAddress {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("shipToEmail")
  private String shipToEmail;

  @JsonProperty("shippingMethod")
  private String shippingMethod;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("phone")
  private Phone phone;

  public ShippingAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Shipping contact first name.
   * @return firstName
  */
  @Size(max = 256) 
  @Schema(name = "firstName", example = "Joe", description = "Shipping contact first name.", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ShippingAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Shipping contact last name.
   * @return lastName
  */
  @Size(max = 256) 
  @Schema(name = "lastName", example = "Smith", description = "Shipping contact last name.", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ShippingAddress shipToEmail(String shipToEmail) {
    this.shipToEmail = shipToEmail;
    return this;
  }

  /**
   * Email on a digital delivery transaction.
   * @return shipToEmail
  */
  @Size(max = 256) 
  @Schema(name = "shipToEmail", example = "customer@domain.com", description = "Email on a digital delivery transaction.", required = false)
  public String getShipToEmail() {
    return shipToEmail;
  }

  public void setShipToEmail(String shipToEmail) {
    this.shipToEmail = shipToEmail;
  }

  public ShippingAddress shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

  /**
   * Shipping or delivery method.  Valid Values: * SAME_DAY * OVERNIGHT - Next day * PRIORITY - 2-3 days * GROUND - 4 days * ELECTRONIC - Email or digital goods * SHIP_TO_STORE 
   * @return shippingMethod
  */
  @Size(max = 13) 
  @Schema(name = "shippingMethod", example = "SAME_DAY", description = "Shipping or delivery method.  Valid Values: * SAME_DAY * OVERNIGHT - Next day * PRIORITY - 2-3 days * GROUND - 4 days * ELECTRONIC - Email or digital goods * SHIP_TO_STORE ", required = false)
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public ShippingAddress address(Address address) {
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

  public ShippingAddress phone(Phone phone) {
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
    ShippingAddress shippingAddress = (ShippingAddress) o;
    return Objects.equals(this.firstName, shippingAddress.firstName) &&
        Objects.equals(this.lastName, shippingAddress.lastName) &&
        Objects.equals(this.shipToEmail, shippingAddress.shipToEmail) &&
        Objects.equals(this.shippingMethod, shippingAddress.shippingMethod) &&
        Objects.equals(this.address, shippingAddress.address) &&
        Objects.equals(this.phone, shippingAddress.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, shipToEmail, shippingMethod, address, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAddress {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shipToEmail: ").append(toIndentedString(shipToEmail)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
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

