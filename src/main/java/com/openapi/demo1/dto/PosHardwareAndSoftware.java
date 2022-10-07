package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Terminal hardware and software information.
 */

@Schema(name = "PosHardwareAndSoftware", description = "Terminal hardware and software information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PosHardwareAndSoftware {

  @JsonProperty("hardwareVendorIdentifier")
  private String hardwareVendorIdentifier;

  @JsonProperty("softwareIdentifier")
  private String softwareIdentifier;

  @JsonProperty("hardwareSerialNumber")
  private String hardwareSerialNumber;

  @JsonProperty("softwareApplicationName")
  private String softwareApplicationName;

  @JsonProperty("softwareReleaseDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate softwareReleaseDate;

  @JsonProperty("softwareVersionNumber")
  private String softwareVersionNumber;

  public PosHardwareAndSoftware hardwareVendorIdentifier(String hardwareVendorIdentifier) {
    this.hardwareVendorIdentifier = hardwareVendorIdentifier;
    return this;
  }

  /**
   * Hardware vendor identifier assigned by Chase merchant services at time of certification, represented in ASCII HEX.
   * @return hardwareVendorIdentifier
  */
  
  @Schema(name = "hardwareVendorIdentifier", description = "Hardware vendor identifier assigned by Chase merchant services at time of certification, represented in ASCII HEX.", required = false)
  public String getHardwareVendorIdentifier() {
    return hardwareVendorIdentifier;
  }

  public void setHardwareVendorIdentifier(String hardwareVendorIdentifier) {
    this.hardwareVendorIdentifier = hardwareVendorIdentifier;
  }

  public PosHardwareAndSoftware softwareIdentifier(String softwareIdentifier) {
    this.softwareIdentifier = softwareIdentifier;
    return this;
  }

  /**
   * Software Identifier assigned by Chase merchant services at time of certification, represented in ASCII HEX.
   * @return softwareIdentifier
  */
  
  @Schema(name = "softwareIdentifier", description = "Software Identifier assigned by Chase merchant services at time of certification, represented in ASCII HEX.", required = false)
  public String getSoftwareIdentifier() {
    return softwareIdentifier;
  }

  public void setSoftwareIdentifier(String softwareIdentifier) {
    this.softwareIdentifier = softwareIdentifier;
  }

  public PosHardwareAndSoftware hardwareSerialNumber(String hardwareSerialNumber) {
    this.hardwareSerialNumber = hardwareSerialNumber;
    return this;
  }

  /**
   * Serial number of hardware device. The hardware serial # can be left-justified, space-filled.
   * @return hardwareSerialNumber
  */
  
  @Schema(name = "hardwareSerialNumber", example = "V1234567", description = "Serial number of hardware device. The hardware serial # can be left-justified, space-filled.", required = false)
  public String getHardwareSerialNumber() {
    return hardwareSerialNumber;
  }

  public void setHardwareSerialNumber(String hardwareSerialNumber) {
    this.hardwareSerialNumber = hardwareSerialNumber;
  }

  public PosHardwareAndSoftware softwareApplicationName(String softwareApplicationName) {
    this.softwareApplicationName = softwareApplicationName;
    return this;
  }

  /**
   * Name of software application.
   * @return softwareApplicationName
  */
  
  @Schema(name = "softwareApplicationName", description = "Name of software application.", required = false)
  public String getSoftwareApplicationName() {
    return softwareApplicationName;
  }

  public void setSoftwareApplicationName(String softwareApplicationName) {
    this.softwareApplicationName = softwareApplicationName;
  }

  public PosHardwareAndSoftware softwareReleaseDate(LocalDate softwareReleaseDate) {
    this.softwareReleaseDate = softwareReleaseDate;
    return this;
  }

  /**
   * Date software was released, in YYYY-MM-DD format.
   * @return softwareReleaseDate
  */
  @Valid 
  @Schema(name = "softwareReleaseDate", example = "Sat May 21 07:00:00 ICT 2022", description = "Date software was released, in YYYY-MM-DD format.", required = false)
  public LocalDate getSoftwareReleaseDate() {
    return softwareReleaseDate;
  }

  public void setSoftwareReleaseDate(LocalDate softwareReleaseDate) {
    this.softwareReleaseDate = softwareReleaseDate;
  }

  public PosHardwareAndSoftware softwareVersionNumber(String softwareVersionNumber) {
    this.softwareVersionNumber = softwareVersionNumber;
    return this;
  }

  /**
   * EPROM or version information related to the terminal software.
   * @return softwareVersionNumber
  */
  
  @Schema(name = "softwareVersionNumber", description = "EPROM or version information related to the terminal software.", required = false)
  public String getSoftwareVersionNumber() {
    return softwareVersionNumber;
  }

  public void setSoftwareVersionNumber(String softwareVersionNumber) {
    this.softwareVersionNumber = softwareVersionNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosHardwareAndSoftware posHardwareAndSoftware = (PosHardwareAndSoftware) o;
    return Objects.equals(this.hardwareVendorIdentifier, posHardwareAndSoftware.hardwareVendorIdentifier) &&
        Objects.equals(this.softwareIdentifier, posHardwareAndSoftware.softwareIdentifier) &&
        Objects.equals(this.hardwareSerialNumber, posHardwareAndSoftware.hardwareSerialNumber) &&
        Objects.equals(this.softwareApplicationName, posHardwareAndSoftware.softwareApplicationName) &&
        Objects.equals(this.softwareReleaseDate, posHardwareAndSoftware.softwareReleaseDate) &&
        Objects.equals(this.softwareVersionNumber, posHardwareAndSoftware.softwareVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareVendorIdentifier, softwareIdentifier, hardwareSerialNumber, softwareApplicationName, softwareReleaseDate, softwareVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosHardwareAndSoftware {\n");
    sb.append("    hardwareVendorIdentifier: ").append(toIndentedString(hardwareVendorIdentifier)).append("\n");
    sb.append("    softwareIdentifier: ").append(toIndentedString(softwareIdentifier)).append("\n");
    sb.append("    hardwareSerialNumber: ").append(toIndentedString(hardwareSerialNumber)).append("\n");
    sb.append("    softwareApplicationName: ").append(toIndentedString(softwareApplicationName)).append("\n");
    sb.append("    softwareReleaseDate: ").append(toIndentedString(softwareReleaseDate)).append("\n");
    sb.append("    softwareVersionNumber: ").append(toIndentedString(softwareVersionNumber)).append("\n");
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

