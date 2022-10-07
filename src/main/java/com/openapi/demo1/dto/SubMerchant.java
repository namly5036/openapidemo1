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
 * Sub-merchant information applicable to &lt;a &#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Industry-Verticals/Payment-Faciliator.md\&quot;&gt;Payment Facilitators&lt;/a&gt; (also known as payment service providers or aggregators).
 */

@Schema(name = "SubMerchant", description = "Sub-merchant information applicable to <a =\"../docs?path=docs/Resources/Guides/Industry-Verticals/Payment-Faciliator.md\">Payment Facilitators</a> (also known as payment service providers or aggregators).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SubMerchant {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("street")
  private String street;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("taxId")
  private String taxId;

  public SubMerchant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Sub-merchant ID used by Payment Facilitators.
   * @return id
  */
  
  @Schema(name = "id", example = "9999", description = "Sub-merchant ID used by Payment Facilitators.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubMerchant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Merchant name/product/service to be used in lieu of the Payment Facilitator name.
   * @return name
  */
  @Size(max = 256) 
  @Schema(name = "name", example = "Some Business", description = "Merchant name/product/service to be used in lieu of the Payment Facilitator name.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubMerchant street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Merchant street address to be used in lieu of the Payment Facilitator street.
   * @return street
  */
  @Size(max = 256) 
  @Schema(name = "street", example = "123 Main Street", description = "Merchant street address to be used in lieu of the Payment Facilitator street.", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public SubMerchant city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Merchant city to be used in lieu of the Payment Facilitator city.
   * @return city
  */
  @Size(max = 256) 
  @Schema(name = "city", example = "Atlanta", description = "Merchant city to be used in lieu of the Payment Facilitator city.", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SubMerchant state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Merchant state to be used in lieu of the Payment Facilitator state.
   * @return state
  */
  @Size(max = 256) 
  @Schema(name = "state", example = "GA", description = "Merchant state to be used in lieu of the Payment Facilitator state.", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SubMerchant postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Merchant postal code to be used in lieu of the Payment Facilitator postal code.
   * @return postalCode
  */
  @Size(max = 10) 
  @Schema(name = "postalCode", example = "30303-001", description = "Merchant postal code to be used in lieu of the Payment Facilitator postal code.", required = false)
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SubMerchant country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Merchant country to be used in lieu of the Payment Facilitator country.
   * @return country
  */
  @Size(max = 256) 
  @Schema(name = "country", example = "US", description = "Merchant country to be used in lieu of the Payment Facilitator country.", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SubMerchant taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Tax ID collected of the merchant for this transaction.
   * @return taxId
  */
  @Size(max = 9) 
  @Schema(name = "taxId", example = "123456789", description = "Tax ID collected of the merchant for this transaction.", required = false)
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchant subMerchant = (SubMerchant) o;
    return Objects.equals(this.id, subMerchant.id) &&
        Objects.equals(this.name, subMerchant.name) &&
        Objects.equals(this.street, subMerchant.street) &&
        Objects.equals(this.city, subMerchant.city) &&
        Objects.equals(this.state, subMerchant.state) &&
        Objects.equals(this.postalCode, subMerchant.postalCode) &&
        Objects.equals(this.country, subMerchant.country) &&
        Objects.equals(this.taxId, subMerchant.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, street, city, state, postalCode, country, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

