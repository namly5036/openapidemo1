package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.openapi.demo1.dto.KeyInfo;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Google Pay source.
 */

@Schema(name = "GooglePay_allOf", description = "Google Pay source.")
@JsonTypeName("GooglePay_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class GooglePayAllOf {

  @JsonProperty("data")
  private String data;

  @JsonProperty("signature")
  private String signature;

  @JsonProperty("version")
  private String version;

  @JsonProperty("merchantId")
  private String merchantId;

  @JsonProperty("keyInfo")
  @Valid
  private List<KeyInfo> keyInfo = null;

  public GooglePayAllOf data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Encrypted data. Payment data dictionary, base64 encoded as a string.
   * @return data
  */
  @Size(max = 4000) 
  @Schema(name = "data", example = "{\"encryptedMessage\":\"NZF5Vs2YaI/t25L/1+dp6tuUOvra9pszs2antqcbHJbkjMMXZSR7innTFJxNR5DNnf4GheWIso8n8MA1q1zqWCU8MaK9bnNcHxvROpvfsU3SCCjkfG2k2M4/RYMjs+lxYW/nEtIIKVVOkdjAj4pI/Wth8xQXphn7hDNiyp9tIydmlPZVnzkXI6mVbpHbbkaCCD4TNPhFBDtx0VafqRjbb2Wt3EDazTx3dHdd+qVX5Xj8/BPb1cmwHWvrDw/dQRk/E0TsP+erLjhLaZ8l2EycxeUEZYqSX5w77S8vd3sw8WXuOCMsU8sx0Bs5IY7hohq67qNDxckP1fcBD4OYdGP6bumJR0J6pJxD5iRh5lFSjN6zNLRI77ylxWL6DwHoe/pPdCc0n6cV0Nt0RJMLjerr12BLuhv4bPQ3QB6jxnbt8JK/EndgIG8xpFyNkKlRUyxAKM22/ZSy45d6qtZIKLXRqDTr9JMk8uJ53QRZtQx8k9KkRZGC+GM2sD+Z75fxc0Yye7l6H0D8p5z1iEzWnYHxd0pmY/cOYEJxnOOdD573QmE6ikFcyaAw3XnCyul/EA\\u003d\\u003d\",\"ephemeralPublicKey\":\"BAhnPIWrCXWv/45GFK0mNAvN9w+NFBs3tQji0wTUS2+hiFKsZujG5wRd4JXGmxhG+k3bglYk544ILBNdDpsAh+o\\u003d\",\"tag\":\"liBzKfGcO+FclHg7XuqRJxR/8EJShRp9/APab0Sho08\\u003d\"}", description = "Encrypted data. Payment data dictionary, base64 encoded as a string.", required = false)
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public GooglePayAllOf signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Verifies that the message came from Google, base64 encoded, and created with ECDSA by the intermediate signing key.
   * @return signature
  */
  @Size(max = 1500) 
  @Schema(name = "signature", example = "MEUCIFWTRWUZAOM5nfJC79FtJm56olnbwG4H5uWWxAUWAquiAiEA24j/BcOroeISsdJzYsyoVi8wzu4tnmKw+jdsGfuvPko=", description = "Verifies that the message came from Google, base64 encoded, and created with ECDSA by the intermediate signing key.", required = false)
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public GooglePayAllOf version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Specific protocol version supported by Google. Identifies the encryption or signing scheme under which the message is created. It allows the protocol to evolve over time, if needed.
   * @return version
  */
  @Size(max = 32) 
  @Schema(name = "version", example = "ECv2", description = "Specific protocol version supported by Google. Identifies the encryption or signing scheme under which the message is created. It allows the protocol to evolve over time, if needed.", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public GooglePayAllOf merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Single merchant identifier common for all Google Pay merchants.
   * @return merchantId
  */
  @Size(max = 256) 
  @Schema(name = "merchantId", example = "676174657761793A666972737464617461", description = "Single merchant identifier common for all Google Pay merchants.", required = false)
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public GooglePayAllOf keyInfo(List<KeyInfo> keyInfo) {
    this.keyInfo = keyInfo;
    return this;
  }

  public GooglePayAllOf addKeyInfoItem(KeyInfo keyInfoItem) {
    if (this.keyInfo == null) {
      this.keyInfo = new ArrayList<>();
    }
    this.keyInfo.add(keyInfoItem);
    return this;
  }

  /**
   * Get keyInfo
   * @return keyInfo
  */
  @Valid 
  @Schema(name = "keyInfo", required = false)
  public List<KeyInfo> getKeyInfo() {
    return keyInfo;
  }

  public void setKeyInfo(List<KeyInfo> keyInfo) {
    this.keyInfo = keyInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePayAllOf googlePayAllOf = (GooglePayAllOf) o;
    return Objects.equals(this.data, googlePayAllOf.data) &&
        Objects.equals(this.signature, googlePayAllOf.signature) &&
        Objects.equals(this.version, googlePayAllOf.version) &&
        Objects.equals(this.merchantId, googlePayAllOf.merchantId) &&
        Objects.equals(this.keyInfo, googlePayAllOf.keyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, signature, version, merchantId, keyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayAllOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    keyInfo: ").append(toIndentedString(keyInfo)).append("\n");
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

