package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AmericanExpressAllOf
 */

@JsonTypeName("AmericanExpress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AmericanExpressAllOf {

  @JsonProperty("safeKeyResponse")
  private String safeKeyResponse;

  public AmericanExpressAllOf safeKeyResponse(String safeKeyResponse) {
    this.safeKeyResponse = safeKeyResponse;
    return this;
  }

  /**
   * Response that corresponds to the American Express SafeKey response value.  Valid Values: * FAILED_AUTH - Authentication Issuer Key * PASSED_AUTH - Authentication Issuer key * PASSED_ATTEMPT - Attempt, Issuer Key * FAILED_ATTEMPT - Attempt, Issuer Key * FAILED_NON_PARTICIPANT - Attempt, Issuer not participating, Network Key * PASSED_NON_PARTICIPANT - Attempt, Issuer not participating, Network Key * FAILED_PARTICIPANT - Attempt, Participating, ACS not available, Network Key * PASSED_PARTICIPANT - Attempt, Participating, ACS not available, Network Key * UNCHEKED 
   * @return safeKeyResponse
  */
  @Size(max = 50) 
  @Schema(name = "safeKeyResponse", example = "PASSED_AUTH", description = "Response that corresponds to the American Express SafeKey response value.  Valid Values: * FAILED_AUTH - Authentication Issuer Key * PASSED_AUTH - Authentication Issuer key * PASSED_ATTEMPT - Attempt, Issuer Key * FAILED_ATTEMPT - Attempt, Issuer Key * FAILED_NON_PARTICIPANT - Attempt, Issuer not participating, Network Key * PASSED_NON_PARTICIPANT - Attempt, Issuer not participating, Network Key * FAILED_PARTICIPANT - Attempt, Participating, ACS not available, Network Key * PASSED_PARTICIPANT - Attempt, Participating, ACS not available, Network Key * UNCHEKED ", required = false)
  public String getSafeKeyResponse() {
    return safeKeyResponse;
  }

  public void setSafeKeyResponse(String safeKeyResponse) {
    this.safeKeyResponse = safeKeyResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmericanExpressAllOf americanExpressAllOf = (AmericanExpressAllOf) o;
    return Objects.equals(this.safeKeyResponse, americanExpressAllOf.safeKeyResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(safeKeyResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmericanExpressAllOf {\n");
    sb.append("    safeKeyResponse: ").append(toIndentedString(safeKeyResponse)).append("\n");
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

