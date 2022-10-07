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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Reference-Transaction-Details.md\&quot;&gt;Reference Transaction details&lt;/a&gt; specific to each request based on business requirements.
 */

@Schema(name = "ReferenceTransactionDetails", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Reference-Transaction-Details.md\">Reference Transaction details</a> specific to each request based on business requirements.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ReferenceTransactionDetails {

  @JsonProperty("referenceTransactionId")
  private String referenceTransactionId;

  @JsonProperty("referenceMerchantTransactionId")
  private String referenceMerchantTransactionId;

  @JsonProperty("referenceMerchantOrderId")
  private String referenceMerchantOrderId;

  @JsonProperty("referenceOrderId")
  private String referenceOrderId;

  @JsonProperty("referenceClientRequestId")
  private String referenceClientRequestId;

  public ReferenceTransactionDetails referenceTransactionId(String referenceTransactionId) {
    this.referenceTransactionId = referenceTransactionId;
    return this;
  }

  /**
   * Commerce Hub generated <code>transactionId</code> from the original transaction used for reference in a secondary transaction.
   * @return referenceTransactionId
  */
  @Size(max = 40) 
  @Schema(name = "referenceTransactionId", example = "838916029301", description = "Commerce Hub generated <code>transactionId</code> from the original transaction used for reference in a secondary transaction.", required = false)
  public String getReferenceTransactionId() {
    return referenceTransactionId;
  }

  public void setReferenceTransactionId(String referenceTransactionId) {
    this.referenceTransactionId = referenceTransactionId;
  }

  public ReferenceTransactionDetails referenceMerchantTransactionId(String referenceMerchantTransactionId) {
    this.referenceMerchantTransactionId = referenceMerchantTransactionId;
    return this;
  }

  /**
   * Merchant/client generated <code>merchantTransactionId</code> from the original transaction used for reference in a secondary transaction
   * @return referenceMerchantTransactionId
  */
  @Size(max = 128) 
  @Schema(name = "referenceMerchantTransactionId", example = "1343678765", description = "Merchant/client generated <code>merchantTransactionId</code> from the original transaction used for reference in a secondary transaction", required = false)
  public String getReferenceMerchantTransactionId() {
    return referenceMerchantTransactionId;
  }

  public void setReferenceMerchantTransactionId(String referenceMerchantTransactionId) {
    this.referenceMerchantTransactionId = referenceMerchantTransactionId;
  }

  public ReferenceTransactionDetails referenceMerchantOrderId(String referenceMerchantOrderId) {
    this.referenceMerchantOrderId = referenceMerchantOrderId;
    return this;
  }

  /**
   * Merchant/client generated <code>merchantOrderId</code> from the original transaction used for reference in a secondary transaction
   * @return referenceMerchantOrderId
  */
  @Size(max = 128) 
  @Schema(name = "referenceMerchantOrderId", example = "953729024", description = "Merchant/client generated <code>merchantOrderId</code> from the original transaction used for reference in a secondary transaction", required = false)
  public String getReferenceMerchantOrderId() {
    return referenceMerchantOrderId;
  }

  public void setReferenceMerchantOrderId(String referenceMerchantOrderId) {
    this.referenceMerchantOrderId = referenceMerchantOrderId;
  }

  public ReferenceTransactionDetails referenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
    return this;
  }

  /**
   * Commerce Hub generated <code>orderId</code> from the original transaction used for reference in a secondary transaction
   * @return referenceOrderId
  */
  @Size(max = 128) 
  @Schema(name = "referenceOrderId", example = "CHG014994a6b0729e4517858f74c6a41c8d61", description = "Commerce Hub generated <code>orderId</code> from the original transaction used for reference in a secondary transaction", required = false)
  public String getReferenceOrderId() {
    return referenceOrderId;
  }

  public void setReferenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
  }

  public ReferenceTransactionDetails referenceClientRequestId(String referenceClientRequestId) {
    this.referenceClientRequestId = referenceClientRequestId;
    return this;
  }

  /**
   * Merchant/client generated <code>clientRequestId</code> from the original transaction. Can only be used in a transaction inquiry request.
   * @return referenceClientRequestId
  */
  @Size(max = 128) 
  @Schema(name = "referenceClientRequestId", example = "2994454", description = "Merchant/client generated <code>clientRequestId</code> from the original transaction. Can only be used in a transaction inquiry request.", required = false)
  public String getReferenceClientRequestId() {
    return referenceClientRequestId;
  }

  public void setReferenceClientRequestId(String referenceClientRequestId) {
    this.referenceClientRequestId = referenceClientRequestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceTransactionDetails referenceTransactionDetails = (ReferenceTransactionDetails) o;
    return Objects.equals(this.referenceTransactionId, referenceTransactionDetails.referenceTransactionId) &&
        Objects.equals(this.referenceMerchantTransactionId, referenceTransactionDetails.referenceMerchantTransactionId) &&
        Objects.equals(this.referenceMerchantOrderId, referenceTransactionDetails.referenceMerchantOrderId) &&
        Objects.equals(this.referenceOrderId, referenceTransactionDetails.referenceOrderId) &&
        Objects.equals(this.referenceClientRequestId, referenceTransactionDetails.referenceClientRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTransactionId, referenceMerchantTransactionId, referenceMerchantOrderId, referenceOrderId, referenceClientRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceTransactionDetails {\n");
    sb.append("    referenceTransactionId: ").append(toIndentedString(referenceTransactionId)).append("\n");
    sb.append("    referenceMerchantTransactionId: ").append(toIndentedString(referenceMerchantTransactionId)).append("\n");
    sb.append("    referenceMerchantOrderId: ").append(toIndentedString(referenceMerchantOrderId)).append("\n");
    sb.append("    referenceOrderId: ").append(toIndentedString(referenceOrderId)).append("\n");
    sb.append("    referenceClientRequestId: ").append(toIndentedString(referenceClientRequestId)).append("\n");
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

