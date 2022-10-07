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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Additional-Data.md\&quot;&gt;Additional data&lt;/a&gt; passed during a transaction request.
 */

@Schema(name = "AdditionalData", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Additional-Data.md\">Additional data</a> passed during a transaction request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AdditionalData {

  @JsonProperty("baiFlag")
  private String baiFlag;

  @JsonProperty("ecomURL")
  private String ecomURL;

  @JsonProperty("requestedTestErrorResponseCode")
  private String requestedTestErrorResponseCode;

  @JsonProperty("emvParameterDownloadIndicator")
  private String emvParameterDownloadIndicator;

  public AdditionalData baiFlag(String baiFlag) {
    this.baiFlag = baiFlag;
    return this;
  }

  /**
   * Business Application Identifier. This identifies the intended use of a push payment. It determines the data carried in the message, the limits and economics that may apply to the transaction, and may be used by the sending and/or receiving issuer to make an authorization decision.  Valid Values: * PERSON_TO_PERSON - Person to person * PERSON_TO_PERSON_BANK_INITIATED - Person to person bank initiated * DIGITAL_WALLET_PAN - Digital Wallet PAN * ACCOUNT_TO_ACCOUNT - Account to account * TOP_OFF - Top Off * ACCOUNT_VERIFICATION - Account Verification ($0.00 Transaction) * FUNDS_TRANSFER - Funds Transfer 
   * @return baiFlag
  */
  @Size(max = 31) 
  @Schema(name = "baiFlag", example = "PERSON_TO_PERSON", description = "Business Application Identifier. This identifies the intended use of a push payment. It determines the data carried in the message, the limits and economics that may apply to the transaction, and may be used by the sending and/or receiving issuer to make an authorization decision.  Valid Values: * PERSON_TO_PERSON - Person to person * PERSON_TO_PERSON_BANK_INITIATED - Person to person bank initiated * DIGITAL_WALLET_PAN - Digital Wallet PAN * ACCOUNT_TO_ACCOUNT - Account to account * TOP_OFF - Top Off * ACCOUNT_VERIFICATION - Account Verification ($0.00 Transaction) * FUNDS_TRANSFER - Funds Transfer ", required = false)
  public String getBaiFlag() {
    return baiFlag;
  }

  public void setBaiFlag(String baiFlag) {
    this.baiFlag = baiFlag;
  }

  public AdditionalData ecomURL(String ecomURL) {
    this.ecomURL = ecomURL;
    return this;
  }

  /**
   * This field contains the URL of the site performing the Ecommerce transaction.
   * @return ecomURL
  */
  @Size(max = 512) 
  @Schema(name = "ecomURL", example = "https://www.somedomain.com", description = "This field contains the URL of the site performing the Ecommerce transaction.", required = false)
  public String getEcomURL() {
    return ecomURL;
  }

  public void setEcomURL(String ecomURL) {
    this.ecomURL = ecomURL;
  }

  public AdditionalData requestedTestErrorResponseCode(String requestedTestErrorResponseCode) {
    this.requestedTestErrorResponseCode = requestedTestErrorResponseCode;
    return this;
  }

  /**
   * Value used to test/replicate a transaction error.
   * @return requestedTestErrorResponseCode
  */
  @Size(max = 23) 
  @Schema(name = "requestedTestErrorResponseCode", example = "213", description = "Value used to test/replicate a transaction error.", required = false)
  public String getRequestedTestErrorResponseCode() {
    return requestedTestErrorResponseCode;
  }

  public void setRequestedTestErrorResponseCode(String requestedTestErrorResponseCode) {
    this.requestedTestErrorResponseCode = requestedTestErrorResponseCode;
  }

  public AdditionalData emvParameterDownloadIndicator(String emvParameterDownloadIndicator) {
    this.emvParameterDownloadIndicator = emvParameterDownloadIndicator;
    return this;
  }

  /**
   * Indicator if EMV Parameter has to be downloaded, sent as part of Auth/Sale Response.
   * @return emvParameterDownloadIndicator
  */
  
  @Schema(name = "emvParameterDownloadIndicator", description = "Indicator if EMV Parameter has to be downloaded, sent as part of Auth/Sale Response.", required = false)
  public String getEmvParameterDownloadIndicator() {
    return emvParameterDownloadIndicator;
  }

  public void setEmvParameterDownloadIndicator(String emvParameterDownloadIndicator) {
    this.emvParameterDownloadIndicator = emvParameterDownloadIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalData additionalData = (AdditionalData) o;
    return Objects.equals(this.baiFlag, additionalData.baiFlag) &&
        Objects.equals(this.ecomURL, additionalData.ecomURL) &&
        Objects.equals(this.requestedTestErrorResponseCode, additionalData.requestedTestErrorResponseCode) &&
        Objects.equals(this.emvParameterDownloadIndicator, additionalData.emvParameterDownloadIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baiFlag, ecomURL, requestedTestErrorResponseCode, emvParameterDownloadIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalData {\n");
    sb.append("    baiFlag: ").append(toIndentedString(baiFlag)).append("\n");
    sb.append("    ecomURL: ").append(toIndentedString(ecomURL)).append("\n");
    sb.append("    requestedTestErrorResponseCode: ").append(toIndentedString(requestedTestErrorResponseCode)).append("\n");
    sb.append("    emvParameterDownloadIndicator: ").append(toIndentedString(emvParameterDownloadIndicator)).append("\n");
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

