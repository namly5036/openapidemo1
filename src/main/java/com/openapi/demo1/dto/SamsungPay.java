package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SamsungPay
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SamsungPay extends Source {

  @JsonProperty("data")
  private String data;

  @JsonProperty("version")
  private String version;

  @JsonProperty("samsungPayMerchantId")
  private String samsungPayMerchantId;

  @JsonProperty("merchantPrivateKey")
  private String merchantPrivateKey;

  public SamsungPay data(String data) {
    this.data = data;
    return this;
  }

  /**
   * 
   * @return data
  */
  
  @Schema(name = "data", description = "", required = false)
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SamsungPay version(String version) {
    this.version = version;
    return this;
  }

  /**
   * 100
   * @return version
  */
  
  @Schema(name = "version", description = "100", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SamsungPay samsungPayMerchantId(String samsungPayMerchantId) {
    this.samsungPayMerchantId = samsungPayMerchantId;
    return this;
  }

  /**
   * Unique AppID registered in the Samsung portal.
   * @return samsungPayMerchantId
  */
  @Size(max = 256) 
  @Schema(name = "samsungPayMerchantId", example = "merchant.com.futurex", description = "Unique AppID registered in the Samsung portal.", required = false)
  public String getSamsungPayMerchantId() {
    return samsungPayMerchantId;
  }

  public void setSamsungPayMerchantId(String samsungPayMerchantId) {
    this.samsungPayMerchantId = samsungPayMerchantId;
  }

  public SamsungPay merchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
    return this;
  }

  /**
   * Merchant private key in hex encoded format.
   * @return merchantPrivateKey
  */
  @Size(max = 256) 
  @Schema(name = "merchantPrivateKey", example = "2B939D88050A48885DC2FDD8BC1780CC0AF4DA741424A82A60579DB3F08C7DCF81B03E7A0EC28D6705705488FDEFF6DEC8E37D3C20E9C11B36C9D710C42D029831", description = "Merchant private key in hex encoded format.", required = false)
  public String getMerchantPrivateKey() {
    return merchantPrivateKey;
  }

  public void setMerchantPrivateKey(String merchantPrivateKey) {
    this.merchantPrivateKey = merchantPrivateKey;
  }

  public SamsungPay sourceType(String sourceType) {
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
    SamsungPay samsungPay = (SamsungPay) o;
    return Objects.equals(this.data, samsungPay.data) &&
        Objects.equals(this.version, samsungPay.version) &&
        Objects.equals(this.samsungPayMerchantId, samsungPay.samsungPayMerchantId) &&
        Objects.equals(this.merchantPrivateKey, samsungPay.merchantPrivateKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, version, samsungPayMerchantId, merchantPrivateKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamsungPay {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    samsungPayMerchantId: ").append(toIndentedString(samsungPayMerchantId)).append("\n");
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

