package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.AppleHeader;
import com.openapi.demo1.dto.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApplePay
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ApplePay extends Source {

  @JsonProperty("data")
  private String data;

  @JsonProperty("header")
  private AppleHeader header;

  @JsonProperty("signature")
  private String signature;

  @JsonProperty("version")
  private String version;

  @JsonProperty("applicationData")
  private String applicationData;

  @JsonProperty("applePayMerchantId")
  private String applePayMerchantId;

  @JsonProperty("merchantPrivateKey")
  private String merchantPrivateKey;

  public ApplePay data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Encrypted data. Payment data dictionary, base64 encoded as a string.
   * @return data
  */
  @Size(max = 4000) 
  @Schema(name = "data", example = "hbreWcQg980mUoUCfuCoripnHO210lvtizOFLV6PTw1DjooSwik778bH/qgK2pKelDTiiC8eXeiSwSIfrTPp6tq9x8Xo2H0KYAHCjLaJtoDdnjXm8QtC3m8MlcKAyYKp4hOW6tcPmy5rKVCKr1RFCDwjWd9zfVmp/au8hzZQtTYvnlje9t36xNy057eKmA1Bl1r9MFPxicTudVesSYMoAPS4IS+IlYiZzCPHzSLYLvFNiLFzP77qq7B6HSZ3dAZm244v8ep9EQdZVb1xzYdr6U+F5n1W+prS/fnL4+PVdiJK1Gn2qhiveyQX1XopLEQSbMDaW0wYhfDP9XM/+EDMLaXIKRiCtFry9nkbQZDjr2ti91KOAvzQf7XFbV+O8i60BSlI4/QRmLdKHmk/m0rDgQAoYLgUZ5xjKzXpJR9iW6RWuNYyaf9XdD8s2eB9aBQ=", description = "Encrypted data. Payment data dictionary, base64 encoded as a string.", required = false)
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ApplePay header(AppleHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  */
  @Valid 
  @Schema(name = "header", required = false)
  public AppleHeader getHeader() {
    return header;
  }

  public void setHeader(AppleHeader header) {
    this.header = header;
  }

  public ApplePay signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Signature of the payment and header data. The signature includes the signing certificate, its intermediate CA certificate, and information about the signing algorithm. Detached PKCS #7 signature, base64 encoded as string.
   * @return signature
  */
  @Size(max = 4000) 
  @Schema(name = "signature", example = "MIAGCSqGSIb3DQEHAqCAMIACAQExDzANBglghkgBZQMEAgEFADCABgkqhkiG9w0BBwEAAKCAMIIB0zCCAXkCAQEwCQYHKoZIzj0EATB2MQswCQYDVQQGEwJVUzELMAkGA1UECAwCTkoxFDASBgNVBAcMC0plcnNleSBDaXR5MRMwEQYDVQQKDApGaXJzdCBEYXRhMRIwEAYDVQQLDAlGaXJzdCBBUEkxGzAZBgNVBAMMEmQxZHZ0bDEwMDAuMWRjLmNvbTAeFw0xNTA3MjMxNjQxMDNaFw0xOTA3MjIxNjQxMDNaMHYxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJOSjEUMBIGA1UEBwwLSmVyc2V5IENpdHkxEzARBgNVBAoMCkZpcnN0IERhdGExEjAQBgNVBAsMCUZpcnN0IEFQSTEbMBkGA1UEAwwSZDFkdnRsMTAwMC4xZGMuY29tMFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAErnHhPM18HFbOomJMUiLiPL7nrJuWvfPy0Gg3xsX3m8q0oWhTs1QcQDTT+TR3yh4sDRPqXnsTUwcvbrCOzdUEeTAJBgcqhkjOPQQBA0kAMEYCIQDrC1z2JTx1jZPvllpnkxPEzBGk9BhTCkEB58j/Cv+sXQIhAKGongoz++3tJroo1GxnwvzK/Qmc4P1K2lHoh9biZeNhAAAxggFSMIIBTgIBATB7MHYxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJOSjEUMBIGA1UEBwwLSmVyc2V5IENpdHkxEzARBgNVBAoMCkZpcnN0IERhdGExEjAQBgNVBAsMCUZpcnN0IEFQSTEbMBkGA1UEAwwSZDFkdnRsMTAwMC4xZGMuY29tAgEBMA0GCWCGSAFlAwQCAQUAoGkwGAYJKoZIhvcNAQkDMQsGCSqGSIb3DQEHATAcBgkqhkiG9w0BCQUxDxcNMTkwNjA3MTg0MTIxWjAvBgkqhkiG9w0BCQQxIgQg0PLaZU4YWZqtP9t/ygv9XIS/5ngU6FlGjpvyK6VFXVMwCgYIKoZIzj0EAwIERjBEAiBTNmQEPyc3aMm4Mwa0riD3dNdSc9aAhslj65Us8b3aKwIgNSc/y+CWpsr8qDln0fZK6ZD/LWPMxofQedlPy7Q6gY8AAAAAAAA=", description = "Signature of the payment and header data. The signature includes the signing certificate, its intermediate CA certificate, and information about the signing algorithm. Detached PKCS #7 signature, base64 encoded as string.", required = false)
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ApplePay version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Specific protocol version supported by Apple. Version information about the payment token. The token uses EC_v1 for ECC-encrypted data, and RSA_v1 for RSA-encrypted data.
   * @return version
  */
  @Size(max = 64) 
  @Schema(name = "version", example = "EC_v1", description = "Specific protocol version supported by Apple. Version information about the payment token. The token uses EC_v1 for ECC-encrypted data, and RSA_v1 for RSA-encrypted data.", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ApplePay applicationData(String applicationData) {
    this.applicationData = applicationData;
    return this;
  }

  /**
   * Hash of the applicationData property of the original PKPaymentRequest object. If the value of that property is null, this key is omitted. SHA–256 hash hex encoded as a string.
   * @return applicationData
  */
  @Size(max = 4000) 
  @Schema(name = "applicationData", example = "VEVTVA==", description = "Hash of the applicationData property of the original PKPaymentRequest object. If the value of that property is null, this key is omitted. SHA–256 hash hex encoded as a string.", required = false)
  public String getApplicationData() {
    return applicationData;
  }

  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }

  public ApplePay applePayMerchantId(String applePayMerchantId) {
    this.applePayMerchantId = applePayMerchantId;
    return this;
  }

  /**
   * Unique AppID registered in the Apple portal.
   * @return applePayMerchantId
  */
  @Size(max = 256) 
  @Schema(name = "applePayMerchantId", example = "merchant.com.fapi.tcoe.applepay", description = "Unique AppID registered in the Apple portal.", required = false)
  public String getApplePayMerchantId() {
    return applePayMerchantId;
  }

  public void setApplePayMerchantId(String applePayMerchantId) {
    this.applePayMerchantId = applePayMerchantId;
  }

  public ApplePay merchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
    return this;
  }

  /**
   * Merchant private key in hex encoded format.
   * @return merchantPrivateKey
  */
  @Size(max = 256) 
  @Schema(name = "merchantPrivateKey", example = "MHcCAQEE234234234opsmasdsalsamdsad/asdsad/asdasd/asdAwEHoUQDQgAaslkdsad8asjdnlkm23leu9jclaskdas/masr4+/as34+4fh/sf64g/nX35fs5w==", description = "Merchant private key in hex encoded format.", required = false)
  public String getMerchantPrivateKey() {
    return merchantPrivateKey;
  }

  public void setMerchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
  }

  public ApplePay sourceType(String sourceType) {
    super.setSourceType(sourceType);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePay applePay = (ApplePay) o;
    return Objects.equals(this.data, applePay.data) &&
        Objects.equals(this.header, applePay.header) &&
        Objects.equals(this.signature, applePay.signature) &&
        Objects.equals(this.version, applePay.version) &&
        Objects.equals(this.applicationData, applePay.applicationData) &&
        Objects.equals(this.applePayMerchantId, applePay.applePayMerchantId) &&
        Objects.equals(this.merchantPrivateKey, applePay.merchantPrivateKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, header, signature, version, applicationData, applePayMerchantId, merchantPrivateKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePay {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
    sb.append("    applePayMerchantId: ").append(toIndentedString(applePayMerchantId)).append("\n");
    sb.append("    merchantPrivateKey: ").append(toIndentedString(merchantPrivateKey)).append("\n");
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

