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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Processor-Response-Details.md#association-response\&quot;&gt;Bank association&lt;/a&gt; security response details.
 */

@Schema(name = "Association", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Processor-Response-Details.md#association-response\">Bank association</a> security response details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Association {

  @JsonProperty("avsCode")
  private String avsCode;

  @JsonProperty("securityCodeResponse")
  private String securityCodeResponse;

  @JsonProperty("cardholderNameResponse")
  private String cardholderNameResponse;

  public Association avsCode(String avsCode) {
    this.avsCode = avsCode;
    return this;
  }

  /**
   * Bank AVS response code.
   * @return avsCode
  */
  @Size(max = 32) 
  @Schema(name = "avsCode", example = "YY", description = "Bank AVS response code.", required = false)
  public String getAvsCode() {
    return avsCode;
  }

  public void setAvsCode(String avsCode) {
    this.avsCode = avsCode;
  }

  public Association securityCodeResponse(String securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
    return this;
  }

  /**
   * Bank security code response.
   * @return securityCodeResponse
  */
  @Size(max = 32) 
  @Schema(name = "securityCodeResponse", example = "M", description = "Bank security code response.", required = false)
  public String getSecurityCodeResponse() {
    return securityCodeResponse;
  }

  public void setSecurityCodeResponse(String securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
  }

  public Association cardholderNameResponse(String cardholderNameResponse) {
    this.cardholderNameResponse = cardholderNameResponse;
    return this;
  }

  /**
   * Cardholder name response, if supported by card type.
   * @return cardholderNameResponse
  */
  @Size(max = 32) 
  @Schema(name = "cardholderNameResponse", example = "1", description = "Cardholder name response, if supported by card type.", required = false)
  public String getCardholderNameResponse() {
    return cardholderNameResponse;
  }

  public void setCardholderNameResponse(String cardholderNameResponse) {
    this.cardholderNameResponse = cardholderNameResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Association association = (Association) o;
    return Objects.equals(this.avsCode, association.avsCode) &&
        Objects.equals(this.securityCodeResponse, association.securityCodeResponse) &&
        Objects.equals(this.cardholderNameResponse, association.cardholderNameResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avsCode, securityCodeResponse, cardholderNameResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    sb.append("    avsCode: ").append(toIndentedString(avsCode)).append("\n");
    sb.append("    securityCodeResponse: ").append(toIndentedString(securityCodeResponse)).append("\n");
    sb.append("    cardholderNameResponse: ").append(toIndentedString(cardholderNameResponse)).append("\n");
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

