package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Association;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Processor-Response-Details.md#address-and-security-code-response\&quot;&gt;Address and Security Code&lt;/a&gt; verification response details.
 */

@Schema(name = "AvsSecurityCodeResponse", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Processor-Response-Details.md#address-and-security-code-response\">Address and Security Code</a> verification response details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AvsSecurityCodeResponse {

  @JsonProperty("streetMatch")
  private String streetMatch;

  @JsonProperty("postalCodeMatch")
  private String postalCodeMatch;

  @JsonProperty("securityCodeMatch")
  private String securityCodeMatch;

  @JsonProperty("association")
  private Association association;

  public AvsSecurityCodeResponse streetMatch(String streetMatch) {
    this.streetMatch = streetMatch;
    return this;
  }

  /**
   * AVS street address result message.
   * @return streetMatch
  */
  @Size(max = 16) 
  @Schema(name = "streetMatch", example = "MATCH", description = "AVS street address result message.", required = false)
  public String getStreetMatch() {
    return streetMatch;
  }

  public void setStreetMatch(String streetMatch) {
    this.streetMatch = streetMatch;
  }

  public AvsSecurityCodeResponse postalCodeMatch(String postalCodeMatch) {
    this.postalCodeMatch = postalCodeMatch;
    return this;
  }

  /**
   * AVS postal code result message.
   * @return postalCodeMatch
  */
  @Size(max = 16) 
  @Schema(name = "postalCodeMatch", example = "MATCH", description = "AVS postal code result message.", required = false)
  public String getPostalCodeMatch() {
    return postalCodeMatch;
  }

  public void setPostalCodeMatch(String postalCodeMatch) {
    this.postalCodeMatch = postalCodeMatch;
  }

  public AvsSecurityCodeResponse securityCodeMatch(String securityCodeMatch) {
    this.securityCodeMatch = securityCodeMatch;
    return this;
  }

  /**
   * Security code result message.
   * @return securityCodeMatch
  */
  @Size(max = 16) 
  @Schema(name = "securityCodeMatch", example = "MATCH", description = "Security code result message.", required = false)
  public String getSecurityCodeMatch() {
    return securityCodeMatch;
  }

  public void setSecurityCodeMatch(String securityCodeMatch) {
    this.securityCodeMatch = securityCodeMatch;
  }

  public AvsSecurityCodeResponse association(Association association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  */
  @Valid 
  @Schema(name = "association", required = false)
  public Association getAssociation() {
    return association;
  }

  public void setAssociation(Association association) {
    this.association = association;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvsSecurityCodeResponse avsSecurityCodeResponse = (AvsSecurityCodeResponse) o;
    return Objects.equals(this.streetMatch, avsSecurityCodeResponse.streetMatch) &&
        Objects.equals(this.postalCodeMatch, avsSecurityCodeResponse.postalCodeMatch) &&
        Objects.equals(this.securityCodeMatch, avsSecurityCodeResponse.securityCodeMatch) &&
        Objects.equals(this.association, avsSecurityCodeResponse.association);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetMatch, postalCodeMatch, securityCodeMatch, association);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvsSecurityCodeResponse {\n");
    sb.append("    streetMatch: ").append(toIndentedString(streetMatch)).append("\n");
    sb.append("    postalCodeMatch: ").append(toIndentedString(postalCodeMatch)).append("\n");
    sb.append("    securityCodeMatch: ").append(toIndentedString(securityCodeMatch)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
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

