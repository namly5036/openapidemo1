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
 * Contains the &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Pin-Block.md\&quot;&gt;Encrypted PIN Block&lt;/a&gt; for Debit, EBT, or Credit transactions.
 */

@Schema(name = "PinBlock", description = "Contains the <a href=\"../docs?path=docs/Resources/Master-Data/Pin-Block.md\">Encrypted PIN Block</a> for Debit, EBT, or Credit transactions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PinBlock {

  @JsonProperty("encryptedPin")
  private String encryptedPin;

  @JsonProperty("keySerialNumber")
  private String keySerialNumber;

  @JsonProperty("pinEncryptionWorkingKey")
  private String pinEncryptionWorkingKey;

  public PinBlock encryptedPin(String encryptedPin) {
    this.encryptedPin = encryptedPin;
    return this;
  }

  /**
   * This field contains the Encrypted PIN Block for Debit, EBT, Fleet or Credit transactions.
   * @return encryptedPin
  */
  @Size(max = 2000) 
  @Schema(name = "encryptedPin", example = "F5f36kA...", description = "This field contains the Encrypted PIN Block for Debit, EBT, Fleet or Credit transactions.", required = false)
  public String getEncryptedPin() {
    return encryptedPin;
  }

  public void setEncryptedPin(String encryptedPin) {
    this.encryptedPin = encryptedPin;
  }

  public PinBlock keySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
    return this;
  }

  /**
   * This field is used to create the base PIN encryption key for DUKPT PIN Debit, EBT, Fleet and Credit Transactions.
   * @return keySerialNumber
  */
  @Size(max = 256) 
  @Schema(name = "keySerialNumber", example = "15f36kA...", description = "This field is used to create the base PIN encryption key for DUKPT PIN Debit, EBT, Fleet and Credit Transactions.", required = false)
  public String getKeySerialNumber() {
    return keySerialNumber;
  }

  public void setKeySerialNumber(String keySerialNumber) {
    this.keySerialNumber = keySerialNumber;
  }

  public PinBlock pinEncryptionWorkingKey(String pinEncryptionWorkingKey) {
    this.pinEncryptionWorkingKey = pinEncryptionWorkingKey;
    return this;
  }

  /**
   * Terminal PIN Encryption working key (TKPE). A PIN Encryption Key is a used to protect PINs as they are transmitted.
   * @return pinEncryptionWorkingKey
  */
  @Size(max = 2000) 
  @Schema(name = "pinEncryptionWorkingKey", example = "A23f36kA...", description = "Terminal PIN Encryption working key (TKPE). A PIN Encryption Key is a used to protect PINs as they are transmitted.", required = false)
  public String getPinEncryptionWorkingKey() {
    return pinEncryptionWorkingKey;
  }

  public void setPinEncryptionWorkingKey(String pinEncryptionWorkingKey) {
    this.pinEncryptionWorkingKey = pinEncryptionWorkingKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinBlock pinBlock = (PinBlock) o;
    return Objects.equals(this.encryptedPin, pinBlock.encryptedPin) &&
        Objects.equals(this.keySerialNumber, pinBlock.keySerialNumber) &&
        Objects.equals(this.pinEncryptionWorkingKey, pinBlock.pinEncryptionWorkingKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedPin, keySerialNumber, pinEncryptionWorkingKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinBlock {\n");
    sb.append("    encryptedPin: ").append(toIndentedString(encryptedPin)).append("\n");
    sb.append("    keySerialNumber: ").append(toIndentedString(keySerialNumber)).append("\n");
    sb.append("    pinEncryptionWorkingKey: ").append(toIndentedString(pinEncryptionWorkingKey)).append("\n");
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

