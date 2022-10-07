package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Address;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Dynamic data details.
 */

@Schema(name = "DataDynamic", description = "Dynamic data details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DataDynamic {

  @JsonProperty("latitude")
  private String latitude;

  @JsonProperty("longitude")
  private String longitude;

  @JsonProperty("ipAddress")
  private String ipAddress;

  @JsonProperty("captureTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime captureTime;

  @JsonProperty("address")
  private Address address;

  public DataDynamic latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Cardholder current latitude GPS position.
   * @return latitude
  */
  @Size(max = 256) 
  @Schema(name = "latitude", example = "13.0827 N", description = "Cardholder current latitude GPS position.", required = false)
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public DataDynamic longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Cardholder current longitude GPS position.
   * @return longitude
  */
  @Size(max = 256) 
  @Schema(name = "longitude", example = "80.2707 E", description = "Cardholder current longitude GPS position.", required = false)
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public DataDynamic ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Device IP address.
   * @return ipAddress
  */
  @Size(max = 39) 
  @Schema(name = "ipAddress", example = "172.27.37.221", description = "Device IP address.", required = false)
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public DataDynamic captureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
    return this;
  }

  /**
   * Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ
   * @return captureTime
  */
  @Valid @Size(max = 20) 
  @Schema(name = "captureTime", example = "2016-04-16T16:06:05Z", description = "Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ", required = false)
  public OffsetDateTime getCaptureTime() {
    return captureTime;
  }

  public void setCaptureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
  }

  public DataDynamic address(Address address) {
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
    DataDynamic dataDynamic = (DataDynamic) o;
    return Objects.equals(this.latitude, dataDynamic.latitude) &&
        Objects.equals(this.longitude, dataDynamic.longitude) &&
        Objects.equals(this.ipAddress, dataDynamic.ipAddress) &&
        Objects.equals(this.captureTime, dataDynamic.captureTime) &&
        Objects.equals(this.address, dataDynamic.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, ipAddress, captureTime, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataDynamic {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
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

