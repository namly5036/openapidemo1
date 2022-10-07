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
 * Error information.
 */

@Schema(name = "Error", description = "Error information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Error {

  @JsonProperty("type")
  private String type;

  @JsonProperty("code")
  private String code;

  @JsonProperty("field")
  private String field;

  @JsonProperty("message")
  private String message;

  @JsonProperty("additionalInfo")
  private String additionalInfo;

  public Error type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of response either from the HOST, GATEWAY, NETWORK, or APIM.
   * @return type
  */
  
  @Schema(name = "type", example = "HOST", description = "The type of response either from the HOST, GATEWAY, NETWORK, or APIM.", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error response code from the host, gateway or network.
   * @return code
  */
  
  @Schema(name = "code", description = "Error response code from the host, gateway or network.", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The property or attribute associated with the error.
   * @return field
  */
  
  @Schema(name = "field", example = "source.sourceType", description = "The property or attribute associated with the error.", required = false)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Information specific to a property or attribute.
   * @return message
  */
  
  @Schema(name = "message", example = "Missing type ID property.", description = "Information specific to a property or attribute.", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional info added by commerce hub in addition to error message returned by GATEWAY
   * @return additionalInfo
  */
  
  @Schema(name = "additionalInfo", example = "The Reauthorization request was not successful and the Cancel of referenced authorization transaction was not processed, per Auth_before_Cancel configuration", description = "Additional info added by commerce hub in addition to error message returned by GATEWAY", required = false)
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.field, error.field) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.additionalInfo, error.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, field, message, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

