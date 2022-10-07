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
 * Static data details.
 */

@Schema(name = "DataStatic", description = "Static data details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DataStatic {

  @JsonProperty("operatingSystem")
  private String operatingSystem;

  @JsonProperty("operatingSystemVersion")
  private String operatingSystemVersion;

  @JsonProperty("model")
  private String model;

  @JsonProperty("type")
  private String type;

  @JsonProperty("deviceId")
  private String deviceId;

  @JsonProperty("javaScriptEnabled")
  private Boolean javaScriptEnabled;

  @JsonProperty("javaEnabled")
  private Boolean javaEnabled;

  @JsonProperty("userAgent")
  private String userAgent;

  @JsonProperty("locale")
  private String locale;

  public DataStatic operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Device operating system (OS).
   * @return operatingSystem
  */
  @Size(max = 256) 
  @Schema(name = "operatingSystem", example = "ANDROID", description = "Device operating system (OS).", required = false)
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public DataStatic operatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
    return this;
  }

  /**
   * Device operating system (OS) version.
   * @return operatingSystemVersion
  */
  @Size(max = 256) 
  @Schema(name = "operatingSystemVersion", example = "5.1.1 Lollipop", description = "Device operating system (OS) version.", required = false)
  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public DataStatic model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Device model.
   * @return model
  */
  @Size(max = 256) 
  @Schema(name = "model", example = "XYX-1", description = "Device model.", required = false)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DataStatic type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Device type/name.
   * @return type
  */
  @Size(max = 256) 
  @Schema(name = "type", example = "Moto G", description = "Device type/name.", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataStatic deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * MAC of the device originating the transaction.
   * @return deviceId
  */
  @Size(max = 48) 
  @Schema(name = "deviceId", example = "00:1B:44:11:3A:B7", description = "MAC of the device originating the transaction.", required = false)
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DataStatic javaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
    return this;
  }

  /**
   * Indicates if the device has JavaScript enabled.
   * @return javaScriptEnabled
  */
  
  @Schema(name = "javaScriptEnabled", example = "true", description = "Indicates if the device has JavaScript enabled.", required = false)
  public Boolean getJavaScriptEnabled() {
    return javaScriptEnabled;
  }

  public void setJavaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
  }

  public DataStatic javaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
    return this;
  }

  /**
   * Indicates if the device has Java enabled.
   * @return javaEnabled
  */
  
  @Schema(name = "javaEnabled", example = "true", description = "Indicates if the device has Java enabled.", required = false)
  public Boolean getJavaEnabled() {
    return javaEnabled;
  }

  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
  }

  public DataStatic userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * User agent data from the user device, truncated to 2048 bytes.
   * @return userAgent
  */
  
  @Schema(name = "userAgent", example = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0", description = "User agent data from the user device, truncated to 2048 bytes.", required = false)
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public DataStatic locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Language/Region code of user in IETF BCP47 format.
   * @return locale
  */
  @Size(max = 8) 
  @Schema(name = "locale", example = "en-US", description = "Language/Region code of user in IETF BCP47 format.", required = false)
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStatic dataStatic = (DataStatic) o;
    return Objects.equals(this.operatingSystem, dataStatic.operatingSystem) &&
        Objects.equals(this.operatingSystemVersion, dataStatic.operatingSystemVersion) &&
        Objects.equals(this.model, dataStatic.model) &&
        Objects.equals(this.type, dataStatic.type) &&
        Objects.equals(this.deviceId, dataStatic.deviceId) &&
        Objects.equals(this.javaScriptEnabled, dataStatic.javaScriptEnabled) &&
        Objects.equals(this.javaEnabled, dataStatic.javaEnabled) &&
        Objects.equals(this.userAgent, dataStatic.userAgent) &&
        Objects.equals(this.locale, dataStatic.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingSystem, operatingSystemVersion, model, type, deviceId, javaScriptEnabled, javaEnabled, userAgent, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStatic {\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operatingSystemVersion: ").append(toIndentedString(operatingSystemVersion)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    javaScriptEnabled: ").append(toIndentedString(javaScriptEnabled)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

