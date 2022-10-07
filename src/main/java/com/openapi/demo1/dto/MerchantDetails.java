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
 * Used to pass &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Merchant-Details.md\&quot;&gt;merchant&lt;/a&gt; specific data during the transaction.
 */

@Schema(name = "MerchantDetails", description = "Used to pass <a href=\"../docs?path=docs/Resources/Master-Data/Merchant-Details.md\">merchant</a> specific data during the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class MerchantDetails {

  @JsonProperty("tokenType")
  private String tokenType;

  @JsonProperty("storeId")
  private String storeId;

  @JsonProperty("siteId")
  private String siteId;

  @JsonProperty("terminalId")
  private String terminalId;

  @JsonProperty("merchantId")
  private String merchantId;

  public MerchantDetails tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Specific value to be passed to tokenization platform.
   * @return tokenType
  */
  @Size(max = 64) 
  @Schema(name = "tokenType", example = "AB01", description = "Specific value to be passed to tokenization platform.", required = false)
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public MerchantDetails storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * The unique ID or number used to identify the unique location, store, or site.
   * @return storeId
  */
  @Size(max = 1024) 
  @Schema(name = "storeId", example = "12345", description = "The unique ID or number used to identify the unique location, store, or site.", required = false)
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public MerchantDetails siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * The location ID or number used to identify the unique site and merchant in petro industry.
   * @return siteId
  */
  @Size(max = 1024) 
  @Schema(name = "siteId", example = "CA123456", description = "The location ID or number used to identify the unique site and merchant in petro industry.", required = false)
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public MerchantDetails terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * Identifies the specific device or point of entry where the transaction originated assigned by the acquirer or the gateway.
   * @return terminalId
  */
  @Size(max = 1024) 
  @Schema(name = "terminalId", example = "12", description = "Identifies the specific device or point of entry where the transaction originated assigned by the acquirer or the gateway.", required = false)
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public MerchantDetails merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * A unique ID used to identify the Merchant. The merchant must use the value assigned by the acquirer or the gateway when submitting a transaction.
   * @return merchantId
  */
  @Size(max = 1024) 
  @Schema(name = "merchantId", example = "123456789012345", description = "A unique ID used to identify the Merchant. The merchant must use the value assigned by the acquirer or the gateway when submitting a transaction.", required = false)
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantDetails merchantDetails = (MerchantDetails) o;
    return Objects.equals(this.tokenType, merchantDetails.tokenType) &&
        Objects.equals(this.storeId, merchantDetails.storeId) &&
        Objects.equals(this.siteId, merchantDetails.siteId) &&
        Objects.equals(this.terminalId, merchantDetails.terminalId) &&
        Objects.equals(this.merchantId, merchantDetails.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenType, storeId, siteId, terminalId, merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantDetails {\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

