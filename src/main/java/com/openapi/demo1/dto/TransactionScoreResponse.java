package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.MyReturnScoreDetails;
import com.openapi.demo1.dto.ReturnScoreDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response containing return score details
 */

@Schema(name = "TransactionScoreResponse", description = "Response containing return score details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionScoreResponse {

  @JsonProperty("invocationId")
  private String invocationId;

  @JsonProperty("consumerType")
  private String consumerType;

  @JsonProperty("modelId")
  private String modelId;

  @JsonProperty("myReturnScoreDetails")
  private MyReturnScoreDetails myReturnScoreDetails;

  @JsonProperty("peerReturnScoreDetails")
  private ReturnScoreDetails peerReturnScoreDetails;

  public TransactionScoreResponse invocationId(String invocationId) {
    this.invocationId = invocationId;
    return this;
  }

  /**
   * Unique Identifier associated with the invocation response
   * @return invocationId
  */
  
  @Schema(name = "invocationId", example = "ad0760bf-2db5-4ba9-b294-0d2241ff58f8", description = "Unique Identifier associated with the invocation response", required = false)
  public String getInvocationId() {
    return invocationId;
  }

  public void setInvocationId(String invocationId) {
    this.invocationId = invocationId;
  }

  public TransactionScoreResponse consumerType(String consumerType) {
    this.consumerType = consumerType;
    return this;
  }

  /**
   * Indicator for new or returning customer. myReturnScoreDetails and peerReturnScoreDetails will not be present for New Customers  Valid Values: * New * Existing 
   * @return consumerType
  */
  
  @Schema(name = "consumerType", example = "Existing", description = "Indicator for new or returning customer. myReturnScoreDetails and peerReturnScoreDetails will not be present for New Customers  Valid Values: * New * Existing ", required = false)
  public String getConsumerType() {
    return consumerType;
  }

  public void setConsumerType(String consumerType) {
    this.consumerType = consumerType;
  }

  public TransactionScoreResponse modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Model Identifier
   * @return modelId
  */
  
  @Schema(name = "modelId", example = "1.0.0", description = "Model Identifier", required = false)
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public TransactionScoreResponse myReturnScoreDetails(MyReturnScoreDetails myReturnScoreDetails) {
    this.myReturnScoreDetails = myReturnScoreDetails;
    return this;
  }

  /**
   * Get myReturnScoreDetails
   * @return myReturnScoreDetails
  */
  @Valid 
  @Schema(name = "myReturnScoreDetails", required = false)
  public MyReturnScoreDetails getMyReturnScoreDetails() {
    return myReturnScoreDetails;
  }

  public void setMyReturnScoreDetails(MyReturnScoreDetails myReturnScoreDetails) {
    this.myReturnScoreDetails = myReturnScoreDetails;
  }

  public TransactionScoreResponse peerReturnScoreDetails(ReturnScoreDetails peerReturnScoreDetails) {
    this.peerReturnScoreDetails = peerReturnScoreDetails;
    return this;
  }

  /**
   * Get peerReturnScoreDetails
   * @return peerReturnScoreDetails
  */
  @Valid 
  @Schema(name = "peerReturnScoreDetails", required = false)
  public ReturnScoreDetails getPeerReturnScoreDetails() {
    return peerReturnScoreDetails;
  }

  public void setPeerReturnScoreDetails(ReturnScoreDetails peerReturnScoreDetails) {
    this.peerReturnScoreDetails = peerReturnScoreDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionScoreResponse transactionScoreResponse = (TransactionScoreResponse) o;
    return Objects.equals(this.invocationId, transactionScoreResponse.invocationId) &&
        Objects.equals(this.consumerType, transactionScoreResponse.consumerType) &&
        Objects.equals(this.modelId, transactionScoreResponse.modelId) &&
        Objects.equals(this.myReturnScoreDetails, transactionScoreResponse.myReturnScoreDetails) &&
        Objects.equals(this.peerReturnScoreDetails, transactionScoreResponse.peerReturnScoreDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invocationId, consumerType, modelId, myReturnScoreDetails, peerReturnScoreDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionScoreResponse {\n");
    sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
    sb.append("    consumerType: ").append(toIndentedString(consumerType)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    myReturnScoreDetails: ").append(toIndentedString(myReturnScoreDetails)).append("\n");
    sb.append("    peerReturnScoreDetails: ").append(toIndentedString(peerReturnScoreDetails)).append("\n");
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

