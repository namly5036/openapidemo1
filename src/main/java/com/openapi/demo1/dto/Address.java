package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Model for &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Address.md\&quot;&gt;address&lt;/a&gt; information.
 */

@Schema(name = "Address", description = "Model for <a href=\"../docs?path=docs/Resources/Master-Data/Address.md\">address</a> information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Address {

  @JsonProperty("street")
  private String street;

  @JsonProperty("houseNumberOrName")
  private String houseNumberOrName;

  @JsonProperty("recipientNameOrAddress")
  private String recipientNameOrAddress;

  @JsonProperty("city")
  private String city;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("county")
  private String county;

  @JsonProperty("addressHistory")
  private String addressHistory;

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street address.
   * @return street
  */
  @Size(max = 256) 
  @Schema(name = "street", example = "123 Main Street", description = "Street address.", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

  /**
   * Secondary address information, e.g. house number or name.
   * @return houseNumberOrName
  */
  @Size(max = 256) 
  @Schema(name = "houseNumberOrName", example = "Apt 213", description = "Secondary address information, e.g. house number or name.", required = false)
  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }

  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }

  public Address recipientNameOrAddress(String recipientNameOrAddress) {
    this.recipientNameOrAddress = recipientNameOrAddress;
    return this;
  }

  /**
   * Tertiary address information e.g. recipient name, company name or address.
   * @return recipientNameOrAddress
  */
  @Size(max = 256) 
  @Schema(name = "recipientNameOrAddress", example = "ATTN: Accounting Dept", description = "Tertiary address information e.g. recipient name, company name or address.", required = false)
  public String getRecipientNameOrAddress() {
    return recipientNameOrAddress;
  }

  public void setRecipientNameOrAddress(String recipientNameOrAddress) {
    this.recipientNameOrAddress = recipientNameOrAddress;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City or locality.
   * @return city
  */
  @Size(max = 256) 
  @Schema(name = "city", example = "Sandy Springs", description = "City or locality.", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * State or province.
   * @return stateOrProvince
  */
  @Size(max = 256) 
  @Schema(name = "stateOrProvince", example = "GA", description = "State or province.", required = false)
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * ZIP code or postal code.
   * @return postalCode
  */
  @Size(max = 10) 
  @Schema(name = "postalCode", example = "30303-0001", description = "ZIP code or postal code.", required = false)
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * ISO-3166-1 alpha-2, alpha-3, numeric or full country name.
   * @return country
  */
  @Size(max = 256) 
  @Schema(name = "country", example = "US", description = "ISO-3166-1 alpha-2, alpha-3, numeric or full country name.", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address county(String county) {
    this.county = county;
    return this;
  }

  /**
   * The 5-digit number or full county name identifying the U.S. county as defined by FIPS, indicating where the transaction occurred. Commonly used with EBT transactions.
   * @return county
  */
  @Size(max = 256) 
  @Schema(name = "county", example = "13121", description = "The 5-digit number or full county name identifying the U.S. county as defined by FIPS, indicating where the transaction occurred. Commonly used with EBT transactions.", required = false)
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Address addressHistory(String addressHistory) {
    this.addressHistory = addressHistory;
    return this;
  }

  /**
   * Update history of the address on file.  Valid Values: * FIRST * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS 
   * @return addressHistory
  */
  @Size(max = 32) 
  @Schema(name = "addressHistory", example = "OVER_90_DAYS", description = "Update history of the address on file.  Valid Values: * FIRST * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS ", required = false)
  public String getAddressHistory() {
    return addressHistory;
  }

  public void setAddressHistory(String addressHistory) {
    this.addressHistory = addressHistory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.houseNumberOrName, address.houseNumberOrName) &&
        Objects.equals(this.recipientNameOrAddress, address.recipientNameOrAddress) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.county, address.county) &&
        Objects.equals(this.addressHistory, address.addressHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, houseNumberOrName, recipientNameOrAddress, city, stateOrProvince, postalCode, country, county, addressHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    recipientNameOrAddress: ").append(toIndentedString(recipientNameOrAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    addressHistory: ").append(toIndentedString(addressHistory)).append("\n");
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

