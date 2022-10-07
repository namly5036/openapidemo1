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
 * Customer &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Customer-Details.md\&quot;&gt;phone&lt;/a&gt; information.
 */

@Schema(name = "Phone", description = "Customer <a href=\"../docs?path=docs/Resources/Master-Data/Customer-Details.md\">phone</a> information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Phone {

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("type")
  private String type;

  public Phone countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO country code.
   * @return countryCode
  */
  @Size(max = 4) 
  @Schema(name = "countryCode", example = "91", description = "ISO country code.", required = false)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Phone phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Contact phone number.
   * @return phoneNumber
  */
  @Size(max = 15) 
  @Schema(name = "phoneNumber", example = "123-123-1234", description = "Contact phone number.", required = false)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Phone type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of phone number.  Valid Values: * DAY * HOME * NIGHT * WORK * MOBILE 
   * @return type
  */
  @Size(max = 16) 
  @Schema(name = "type", example = "DAY", description = "Indicates the type of phone number.  Valid Values: * DAY * HOME * NIGHT * WORK * MOBILE ", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.countryCode, phone.countryCode) &&
        Objects.equals(this.phoneNumber, phone.phoneNumber) &&
        Objects.equals(this.type, phone.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, phoneNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

