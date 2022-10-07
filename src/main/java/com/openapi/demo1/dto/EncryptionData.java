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
 * Contains the &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Encryption-Data.md\&quot;&gt;Encrypted Data&lt;/a&gt; for EMV, Track, or Manual Entry transactions.
 */

@Schema(name = "EncryptionData", description = "Contains the <a href=\"../docs?path=docs/Resources/Master-Data/Encryption-Data.md\">Encrypted Data</a> for EMV, Track, or Manual Entry transactions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class EncryptionData {

  @JsonProperty("encryptionType")
  private String encryptionType;

  @JsonProperty("encryptionTarget")
  private String encryptionTarget;

  @JsonProperty("encryptionBlock")
  private String encryptionBlock;

  @JsonProperty("deviceType")
  private String deviceType;

  @JsonProperty("securitykeyUpdateIndicator")
  private Boolean securitykeyUpdateIndicator;

  @JsonProperty("keyId")
  private String keyId;

  @JsonProperty("encryptedKey")
  private String encryptedKey;

  public EncryptionData encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * Encryption type to be passed.  Valid Values: * RSA (Default) * VERIFONE * VERIFONE_VDR * AES_DUKPT * TDES_DUKPT * ON_GUARD * FPE 
   * @return encryptionType
  */
  @Size(max = 256) 
  @Schema(name = "encryptionType", example = "RSA", description = "Encryption type to be passed.  Valid Values: * RSA (Default) * VERIFONE * VERIFONE_VDR * AES_DUKPT * TDES_DUKPT * ON_GUARD * FPE ", required = false)
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }

  public EncryptionData encryptionTarget(String encryptionTarget) {
    this.encryptionTarget = encryptionTarget;
    return this;
  }

  /**
   * Target can be TRACK_1, TRACK_2 (including EMV), BOTH (Track 1 and 2) or MANUAL.
   * @return encryptionTarget
  */
  @Size(max = 256) 
  @Schema(name = "encryptionTarget", example = "TRACK_2", description = "Target can be TRACK_1, TRACK_2 (including EMV), BOTH (Track 1 and 2) or MANUAL.", required = false)
  public String getEncryptionTarget() {
    return encryptionTarget;
  }

  public void setEncryptionTarget(String encryptionTarget) {
    this.encryptionTarget = encryptionTarget;
  }

  public EncryptionData encryptionBlock(String encryptionBlock) {
    this.encryptionBlock = encryptionBlock;
    return this;
  }

  /**
   * This field contains the track data or card number provided in encrypted form.
   * @return encryptionBlock
  */
  @Size(max = 2000) 
  @Schema(name = "encryptionBlock", example = "=s3ZmiL1SSZC8QyBpj/Wn+VwpLDgp41IwstEHQS8u4EQJ7TY/0VGHEYpkbG3ORO+dGL6TzOSWuC1pCaJE3cZJ8sWONXp5pDuni1OP9v+eRyDSD25Bjzdfa3KJfmXLFXWa++wJ5CY+NdQKrjHWWKP+iAzIUEd5PmnrzVxMgXOz1wJ5YR245a2350oBbz74EZfaojPtX/DCgfEL6cCEyepttx94hIWDDiOLPuplp1KJhh7nJvUGDhZwyKST68xsFswN53z/aduD128TXD4vkduK9QYgavE0y82lxwQILUGScwYnRYmb+Zu2el3ayNE8zdXCe4eWiN1vXxsKUI49WQA==", description = "This field contains the track data or card number provided in encrypted form.", required = false)
  public String getEncryptionBlock() {
    return encryptionBlock;
  }

  public void setEncryptionBlock(String encryptionBlock) {
    this.encryptionBlock = encryptionBlock;
  }

  public EncryptionData deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Device type need to be sent for TDES and AES encrypted track data.  Valid values: * INGENICO (Default) * RPXXX * CLOVER * NCR * NCRTLV 
   * @return deviceType
  */
  @Size(max = 256) 
  @Schema(name = "deviceType", example = "INGENICO", description = "Device type need to be sent for TDES and AES encrypted track data.  Valid values: * INGENICO (Default) * RPXXX * CLOVER * NCR * NCRTLV ", required = false)
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public EncryptionData securitykeyUpdateIndicator(Boolean securitykeyUpdateIndicator) {
    this.securitykeyUpdateIndicator = securitykeyUpdateIndicator;
    return this;
  }

  /**
   * Provided in response. POS is expected to download updated key, key cert.
   * @return securitykeyUpdateIndicator
  */
  
  @Schema(name = "securitykeyUpdateIndicator", example = "false", description = "Provided in response. POS is expected to download updated key, key cert.", required = false)
  public Boolean getSecuritykeyUpdateIndicator() {
    return securitykeyUpdateIndicator;
  }

  public void setSecuritykeyUpdateIndicator(Boolean securitykeyUpdateIndicator) {
    this.securitykeyUpdateIndicator = securitykeyUpdateIndicator;
  }

  public EncryptionData keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * Needs to be passed if track data is encrypted.
   * @return keyId
  */
  @Size(max = 40) 
  @Schema(name = "keyId", example = "88000000022", description = "Needs to be passed if track data is encrypted.", required = false)
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public EncryptionData encryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
    return this;
  }

  /**
   * Merchant or device defined encryption key required for decryption of encrypted <code>cardData</code>. Normally used in card not present integrations e.g. Mobile device.
   * @return encryptedKey
  */
  @Size(max = 2000) 
  @Schema(name = "encryptedKey", example = "NdCmVw5", description = "Merchant or device defined encryption key required for decryption of encrypted <code>cardData</code>. Normally used in card not present integrations e.g. Mobile device.", required = false)
  public String getEncryptedKey() {
    return encryptedKey;
  }

  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionData encryptionData = (EncryptionData) o;
    return Objects.equals(this.encryptionType, encryptionData.encryptionType) &&
        Objects.equals(this.encryptionTarget, encryptionData.encryptionTarget) &&
        Objects.equals(this.encryptionBlock, encryptionData.encryptionBlock) &&
        Objects.equals(this.deviceType, encryptionData.deviceType) &&
        Objects.equals(this.securitykeyUpdateIndicator, encryptionData.securitykeyUpdateIndicator) &&
        Objects.equals(this.keyId, encryptionData.keyId) &&
        Objects.equals(this.encryptedKey, encryptionData.encryptedKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionType, encryptionTarget, encryptionBlock, deviceType, securitykeyUpdateIndicator, keyId, encryptedKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionData {\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    encryptionTarget: ").append(toIndentedString(encryptionTarget)).append("\n");
    sb.append("    encryptionBlock: ").append(toIndentedString(encryptionBlock)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    securitykeyUpdateIndicator: ").append(toIndentedString(securitykeyUpdateIndicator)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
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

