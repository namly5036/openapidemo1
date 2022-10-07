package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.GatewayResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SecurityCredentialsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SecurityCredentialsResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("keyId")
  private String keyId;

  @JsonProperty("publicKey")
  private String publicKey;

  @JsonProperty("keyLength")
  private Integer keyLength;

  @JsonProperty("accessToken")
  private String accessToken;

  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("domains")
  @Valid
  private List<String> domains = null;

  @JsonProperty("accessTokenIssuedTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime accessTokenIssuedTime;

  @JsonProperty("accessTokenTimeToLive")
  private String accessTokenTimeToLive;

  @JsonProperty("symmetricEncryptionAlgorithm")
  private String symmetricEncryptionAlgorithm;

  @JsonProperty("asymmetricEncryptionAlgorithm")
  private String asymmetricEncryptionAlgorithm;

  @JsonProperty("accessTokenType")
  private String accessTokenType;

  public SecurityCredentialsResponse gatewayResponse(GatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
    return this;
  }

  /**
   * Get gatewayResponse
   * @return gatewayResponse
  */
  @Valid 
  @Schema(name = "gatewayResponse", required = false)
  public GatewayResponse getGatewayResponse() {
    return gatewayResponse;
  }

  public void setGatewayResponse(GatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
  }

  public SecurityCredentialsResponse keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * Unique identifier of the encryption key.
   * @return keyId
  */
  
  @Schema(name = "keyId", description = "Unique identifier of the encryption key.", required = false)
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public SecurityCredentialsResponse publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Base64 encoded public key.
   * @return publicKey
  */
  
  @Schema(name = "publicKey", description = "Base64 encoded public key.", required = false)
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public SecurityCredentialsResponse keyLength(Integer keyLength) {
    this.keyLength = keyLength;
    return this;
  }

  /**
   * Length of the encryption key.
   * @return keyLength
  */
  
  @Schema(name = "keyLength", description = "Length of the encryption key.", required = false)
  public Integer getKeyLength() {
    return keyLength;
  }

  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }

  public SecurityCredentialsResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access token created and sent back.
   * @return accessToken
  */
  
  @Schema(name = "accessToken", description = "Access token created and sent back.", required = false)
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public SecurityCredentialsResponse sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * 
   * @return sessionId
  */
  
  @Schema(name = "sessionId", description = "", required = false)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public SecurityCredentialsResponse domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public SecurityCredentialsResponse addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * A whitelist of domains that are applicable for this credentials request.
   * @return domains
  */
  
  @Schema(name = "domains", example = "https://checkout.example.com, https://_*.mystore.com", description = "A whitelist of domains that are applicable for this credentials request.", required = false)
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public SecurityCredentialsResponse accessTokenIssuedTime(OffsetDateTime accessTokenIssuedTime) {
    this.accessTokenIssuedTime = accessTokenIssuedTime;
    return this;
  }

  /**
   * Token issue time in YYYY-MM-DDThh:mm:ssZ format.
   * @return accessTokenIssuedTime
  */
  @Valid 
  @Schema(name = "accessTokenIssuedTime", example = "2016-04-16T16:06:05Z", description = "Token issue time in YYYY-MM-DDThh:mm:ssZ format.", required = false)
  public OffsetDateTime getAccessTokenIssuedTime() {
    return accessTokenIssuedTime;
  }

  public void setAccessTokenIssuedTime(OffsetDateTime accessTokenIssuedTime) {
    this.accessTokenIssuedTime = accessTokenIssuedTime;
  }

  public SecurityCredentialsResponse accessTokenTimeToLive(String accessTokenTimeToLive) {
    this.accessTokenTimeToLive = accessTokenTimeToLive;
    return this;
  }

  /**
   * Access token expiry.
   * @return accessTokenTimeToLive
  */
  
  @Schema(name = "accessTokenTimeToLive", description = "Access token expiry.", required = false)
  public String getAccessTokenTimeToLive() {
    return accessTokenTimeToLive;
  }

  public void setAccessTokenTimeToLive(String accessTokenTimeToLive) {
    this.accessTokenTimeToLive = accessTokenTimeToLive;
  }

  public SecurityCredentialsResponse symmetricEncryptionAlgorithm(String symmetricEncryptionAlgorithm) {
    this.symmetricEncryptionAlgorithm = symmetricEncryptionAlgorithm;
    return this;
  }

  /**
   * AES 256/PKCS with padding.
   * @return symmetricEncryptionAlgorithm
  */
  
  @Schema(name = "symmetricEncryptionAlgorithm", description = "AES 256/PKCS with padding.", required = false)
  public String getSymmetricEncryptionAlgorithm() {
    return symmetricEncryptionAlgorithm;
  }

  public void setSymmetricEncryptionAlgorithm(String symmetricEncryptionAlgorithm) {
    this.symmetricEncryptionAlgorithm = symmetricEncryptionAlgorithm;
  }

  public SecurityCredentialsResponse asymmetricEncryptionAlgorithm(String asymmetricEncryptionAlgorithm) {
    this.asymmetricEncryptionAlgorithm = asymmetricEncryptionAlgorithm;
    return this;
  }

  /**
   * RSA/ECB/PKCS1Padding.
   * @return asymmetricEncryptionAlgorithm
  */
  
  @Schema(name = "asymmetricEncryptionAlgorithm", description = "RSA/ECB/PKCS1Padding.", required = false)
  public String getAsymmetricEncryptionAlgorithm() {
    return asymmetricEncryptionAlgorithm;
  }

  public void setAsymmetricEncryptionAlgorithm(String asymmetricEncryptionAlgorithm) {
    this.asymmetricEncryptionAlgorithm = asymmetricEncryptionAlgorithm;
  }

  public SecurityCredentialsResponse accessTokenType(String accessTokenType) {
    this.accessTokenType = accessTokenType;
    return this;
  }

  /**
   * Access token type.  Valid Values:  * BEARER 
   * @return accessTokenType
  */
  @Size(max = 50) 
  @Schema(name = "accessTokenType", description = "Access token type.  Valid Values:  * BEARER ", required = false)
  public String getAccessTokenType() {
    return accessTokenType;
  }

  public void setAccessTokenType(String accessTokenType) {
    this.accessTokenType = accessTokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityCredentialsResponse securityCredentialsResponse = (SecurityCredentialsResponse) o;
    return Objects.equals(this.gatewayResponse, securityCredentialsResponse.gatewayResponse) &&
        Objects.equals(this.keyId, securityCredentialsResponse.keyId) &&
        Objects.equals(this.publicKey, securityCredentialsResponse.publicKey) &&
        Objects.equals(this.keyLength, securityCredentialsResponse.keyLength) &&
        Objects.equals(this.accessToken, securityCredentialsResponse.accessToken) &&
        Objects.equals(this.sessionId, securityCredentialsResponse.sessionId) &&
        Objects.equals(this.domains, securityCredentialsResponse.domains) &&
        Objects.equals(this.accessTokenIssuedTime, securityCredentialsResponse.accessTokenIssuedTime) &&
        Objects.equals(this.accessTokenTimeToLive, securityCredentialsResponse.accessTokenTimeToLive) &&
        Objects.equals(this.symmetricEncryptionAlgorithm, securityCredentialsResponse.symmetricEncryptionAlgorithm) &&
        Objects.equals(this.asymmetricEncryptionAlgorithm, securityCredentialsResponse.asymmetricEncryptionAlgorithm) &&
        Objects.equals(this.accessTokenType, securityCredentialsResponse.accessTokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, keyId, publicKey, keyLength, accessToken, sessionId, domains, accessTokenIssuedTime, accessTokenTimeToLive, symmetricEncryptionAlgorithm, asymmetricEncryptionAlgorithm, accessTokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityCredentialsResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    accessTokenIssuedTime: ").append(toIndentedString(accessTokenIssuedTime)).append("\n");
    sb.append("    accessTokenTimeToLive: ").append(toIndentedString(accessTokenTimeToLive)).append("\n");
    sb.append("    symmetricEncryptionAlgorithm: ").append(toIndentedString(symmetricEncryptionAlgorithm)).append("\n");
    sb.append("    asymmetricEncryptionAlgorithm: ").append(toIndentedString(asymmetricEncryptionAlgorithm)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
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

