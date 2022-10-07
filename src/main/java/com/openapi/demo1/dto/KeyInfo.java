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
 * KeyInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class KeyInfo {

  @JsonProperty("merchantPrivateKey")
  private String merchantPrivateKey;

  @JsonProperty("signingVerificationKey")
  private String signingVerificationKey;

  public KeyInfo merchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
    return this;
  }

  /**
   * Merchant private key, hex encoded.
   * @return merchantPrivateKey
  */
  @Size(max = 1024) 
  @Schema(name = "merchantPrivateKey", example = "DCEDF9AF72707BFD9C5231ECB9EAD040F3B4BA2AB608579736E37FDBA8884175566BDA410997B2575EA7E76AC54BBDB99DD0F74DD0A648BC0F6A2F06909E79A0F15D779F1A80CFC1EC9612476204C43A", description = "Merchant private key, hex encoded.", required = false)
  public String getMerchantPrivateKey() {
    return merchantPrivateKey;
  }

  public void setMerchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
  }

  public KeyInfo signingVerificationKey(String signingVerificationKey) {
    this.signingVerificationKey = signingVerificationKey;
    return this;
  }

  /**
   * Signing verification key, base64 encoded.
   * @return signingVerificationKey
  */
  @Size(max = 1024) 
  @Schema(name = "signingVerificationKey", example = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEIsFro6K+IUxRr4yFTOTO+kFCCEvHo7B9IOMLxah6c977oFzX/beObH4a9OfosMHmft3JJZ6B3xpjIb8kduK4/A==", description = "Signing verification key, base64 encoded.", required = false)
  public String getSigningVerificationKey() {
    return signingVerificationKey;
  }

  public void setSigningVerificationKey(String signingVerificationKey) {
    this.signingVerificationKey = signingVerificationKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyInfo keyInfo = (KeyInfo) o;
    return Objects.equals(this.merchantPrivateKey, keyInfo.merchantPrivateKey) &&
        Objects.equals(this.signingVerificationKey, keyInfo.signingVerificationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantPrivateKey, signingVerificationKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyInfo {\n");
    sb.append("    merchantPrivateKey: ").append(toIndentedString(merchantPrivateKey)).append("\n");
    sb.append("    signingVerificationKey: ").append(toIndentedString(signingVerificationKey)).append("\n");
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

