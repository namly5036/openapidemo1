package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.DataCapture;
import com.openapi.demo1.dto.DataDynamic;
import com.openapi.demo1.dto.DataStatic;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Device-Fingerprint.md\&quot;&gt;Device fingerprint&lt;/a&gt; details for mobile transactions.
 */

@Schema(name = "DeviceFingerPrint", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Device-Fingerprint.md\">Device fingerprint</a> details for mobile transactions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DeviceFingerPrint {

  @JsonProperty("provider")
  private String provider;

  @JsonProperty("dataCapture")
  private DataCapture dataCapture;

  @JsonProperty("dataStatic")
  private DataStatic dataStatic;

  @JsonProperty("dataDynamic")
  private DataDynamic dataDynamic;

  public DeviceFingerPrint provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Device authentication utilized.
   * @return provider
  */
  @Size(max = 256) 
  @Schema(name = "provider", example = "InAuth", description = "Device authentication utilized.", required = false)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public DeviceFingerPrint dataCapture(DataCapture dataCapture) {
    this.dataCapture = dataCapture;
    return this;
  }

  /**
   * Get dataCapture
   * @return dataCapture
  */
  @Valid 
  @Schema(name = "dataCapture", required = false)
  public DataCapture getDataCapture() {
    return dataCapture;
  }

  public void setDataCapture(DataCapture dataCapture) {
    this.dataCapture = dataCapture;
  }

  public DeviceFingerPrint dataStatic(DataStatic dataStatic) {
    this.dataStatic = dataStatic;
    return this;
  }

  /**
   * Get dataStatic
   * @return dataStatic
  */
  @Valid 
  @Schema(name = "dataStatic", required = false)
  public DataStatic getDataStatic() {
    return dataStatic;
  }

  public void setDataStatic(DataStatic dataStatic) {
    this.dataStatic = dataStatic;
  }

  public DeviceFingerPrint dataDynamic(DataDynamic dataDynamic) {
    this.dataDynamic = dataDynamic;
    return this;
  }

  /**
   * Get dataDynamic
   * @return dataDynamic
  */
  @Valid 
  @Schema(name = "dataDynamic", required = false)
  public DataDynamic getDataDynamic() {
    return dataDynamic;
  }

  public void setDataDynamic(DataDynamic dataDynamic) {
    this.dataDynamic = dataDynamic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFingerPrint deviceFingerPrint = (DeviceFingerPrint) o;
    return Objects.equals(this.provider, deviceFingerPrint.provider) &&
        Objects.equals(this.dataCapture, deviceFingerPrint.dataCapture) &&
        Objects.equals(this.dataStatic, deviceFingerPrint.dataStatic) &&
        Objects.equals(this.dataDynamic, deviceFingerPrint.dataDynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, dataCapture, dataStatic, dataDynamic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFingerPrint {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    dataCapture: ").append(toIndentedString(dataCapture)).append("\n");
    sb.append("    dataStatic: ").append(toIndentedString(dataStatic)).append("\n");
    sb.append("    dataDynamic: ").append(toIndentedString(dataDynamic)).append("\n");
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

