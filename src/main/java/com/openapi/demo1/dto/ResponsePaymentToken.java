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
 * ResponsePaymentToken
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ResponsePaymentToken {

  @JsonProperty("tokenData")
  private String tokenData;

  @JsonProperty("tokenSource")
  private String tokenSource;

  @JsonProperty("tokenResponseCode")
  private String tokenResponseCode;

  @JsonProperty("tokenResponseDescription")
  private String tokenResponseDescription;

  public ResponsePaymentToken tokenData(String tokenData) {
    this.tokenData = tokenData;
    return this;
  }

  /**
   * Token created from the payment source.
   * @return tokenData
  */
  @Size(max = 2048) 
  @Schema(name = "tokenData", example = "1234123412340019", description = "Token created from the payment source.", required = false)
  public String getTokenData() {
    return tokenData;
  }

  public void setTokenData(String tokenData) {
    this.tokenData = tokenData;
  }

  public ResponsePaymentToken tokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
    return this;
  }

  /**
   * Source for the Token Service Provider (TSP).
   * @return tokenSource
  */
  @Size(max = 256) 
  @Schema(name = "tokenSource", example = "TRANSARMOR", description = "Source for the Token Service Provider (TSP).", required = false)
  public String getTokenSource() {
    return tokenSource;
  }

  public void setTokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
  }

  public ResponsePaymentToken tokenResponseCode(String tokenResponseCode) {
    this.tokenResponseCode = tokenResponseCode;
    return this;
  }

  /**
   * Response code for token generation request.
   * @return tokenResponseCode
  */
  @Size(max = 256) 
  @Schema(name = "tokenResponseCode", example = "000", description = "Response code for token generation request.", required = false)
  public String getTokenResponseCode() {
    return tokenResponseCode;
  }

  public void setTokenResponseCode(String tokenResponseCode) {
    this.tokenResponseCode = tokenResponseCode;
  }

  public ResponsePaymentToken tokenResponseDescription(String tokenResponseDescription) {
    this.tokenResponseDescription = tokenResponseDescription;
    return this;
  }

  /**
   * Response description for token generation request.
   * @return tokenResponseDescription
  */
  @Size(max = 256) 
  @Schema(name = "tokenResponseDescription", example = "SUCCESS", description = "Response description for token generation request.", required = false)
  public String getTokenResponseDescription() {
    return tokenResponseDescription;
  }

  public void setTokenResponseDescription(String tokenResponseDescription) {
    this.tokenResponseDescription = tokenResponseDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePaymentToken responsePaymentToken = (ResponsePaymentToken) o;
    return Objects.equals(this.tokenData, responsePaymentToken.tokenData) &&
        Objects.equals(this.tokenSource, responsePaymentToken.tokenSource) &&
        Objects.equals(this.tokenResponseCode, responsePaymentToken.tokenResponseCode) &&
        Objects.equals(this.tokenResponseDescription, responsePaymentToken.tokenResponseDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenData, tokenSource, tokenResponseCode, tokenResponseDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePaymentToken {\n");
    sb.append("    tokenData: ").append(toIndentedString(tokenData)).append("\n");
    sb.append("    tokenSource: ").append(toIndentedString(tokenSource)).append("\n");
    sb.append("    tokenResponseCode: ").append(toIndentedString(tokenResponseCode)).append("\n");
    sb.append("    tokenResponseDescription: ").append(toIndentedString(tokenResponseDescription)).append("\n");
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

