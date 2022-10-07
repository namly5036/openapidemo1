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
 * 
 */

@Schema(name = "ResponseIndicator", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ResponseIndicator {

  @JsonProperty("alternateRouteDebitIndicator")
  private Boolean alternateRouteDebitIndicator;

  @JsonProperty("signatureLineIndicator")
  private Boolean signatureLineIndicator;

  @JsonProperty("signatureDebitRouteIndicator")
  private Boolean signatureDebitRouteIndicator;

  public ResponseIndicator alternateRouteDebitIndicator(Boolean alternateRouteDebitIndicator) {
    this.alternateRouteDebitIndicator = alternateRouteDebitIndicator;
    return this;
  }

  /**
   * Get alternateRouteDebitIndicator
   * @return alternateRouteDebitIndicator
  */
  
  @Schema(name = "alternateRouteDebitIndicator", example = "false", required = false)
  public Boolean getAlternateRouteDebitIndicator() {
    return alternateRouteDebitIndicator;
  }

  public void setAlternateRouteDebitIndicator(Boolean alternateRouteDebitIndicator) {
    this.alternateRouteDebitIndicator = alternateRouteDebitIndicator;
  }

  public ResponseIndicator signatureLineIndicator(Boolean signatureLineIndicator) {
    this.signatureLineIndicator = signatureLineIndicator;
    return this;
  }

  /**
   * Get signatureLineIndicator
   * @return signatureLineIndicator
  */
  
  @Schema(name = "signatureLineIndicator", example = "false", required = false)
  public Boolean getSignatureLineIndicator() {
    return signatureLineIndicator;
  }

  public void setSignatureLineIndicator(Boolean signatureLineIndicator) {
    this.signatureLineIndicator = signatureLineIndicator;
  }

  public ResponseIndicator signatureDebitRouteIndicator(Boolean signatureDebitRouteIndicator) {
    this.signatureDebitRouteIndicator = signatureDebitRouteIndicator;
    return this;
  }

  /**
   * Get signatureDebitRouteIndicator
   * @return signatureDebitRouteIndicator
  */
  
  @Schema(name = "signatureDebitRouteIndicator", example = "false", required = false)
  public Boolean getSignatureDebitRouteIndicator() {
    return signatureDebitRouteIndicator;
  }

  public void setSignatureDebitRouteIndicator(Boolean signatureDebitRouteIndicator) {
    this.signatureDebitRouteIndicator = signatureDebitRouteIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseIndicator responseIndicator = (ResponseIndicator) o;
    return Objects.equals(this.alternateRouteDebitIndicator, responseIndicator.alternateRouteDebitIndicator) &&
        Objects.equals(this.signatureLineIndicator, responseIndicator.signatureLineIndicator) &&
        Objects.equals(this.signatureDebitRouteIndicator, responseIndicator.signatureDebitRouteIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateRouteDebitIndicator, signatureLineIndicator, signatureDebitRouteIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseIndicator {\n");
    sb.append("    alternateRouteDebitIndicator: ").append(toIndentedString(alternateRouteDebitIndicator)).append("\n");
    sb.append("    signatureLineIndicator: ").append(toIndentedString(signatureLineIndicator)).append("\n");
    sb.append("    signatureDebitRouteIndicator: ").append(toIndentedString(signatureDebitRouteIndicator)).append("\n");
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

