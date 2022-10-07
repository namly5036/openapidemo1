package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.GatewayResponse;
import com.openapi.demo1.dto.TransactionScoreResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReturnOptimizerResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ReturnOptimizerResponse {

  @JsonProperty("gatewayResponse")
  private GatewayResponse gatewayResponse;

  @JsonProperty("transactionScoreResponse")
  private TransactionScoreResponse transactionScoreResponse;

  public ReturnOptimizerResponse gatewayResponse(GatewayResponse gatewayResponse) {
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

  public ReturnOptimizerResponse transactionScoreResponse(TransactionScoreResponse transactionScoreResponse) {
    this.transactionScoreResponse = transactionScoreResponse;
    return this;
  }

  /**
   * Get transactionScoreResponse
   * @return transactionScoreResponse
  */
  @Valid 
  @Schema(name = "transactionScoreResponse", required = false)
  public TransactionScoreResponse getTransactionScoreResponse() {
    return transactionScoreResponse;
  }

  public void setTransactionScoreResponse(TransactionScoreResponse transactionScoreResponse) {
    this.transactionScoreResponse = transactionScoreResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnOptimizerResponse returnOptimizerResponse = (ReturnOptimizerResponse) o;
    return Objects.equals(this.gatewayResponse, returnOptimizerResponse.gatewayResponse) &&
        Objects.equals(this.transactionScoreResponse, returnOptimizerResponse.transactionScoreResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayResponse, transactionScoreResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnOptimizerResponse {\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    transactionScoreResponse: ").append(toIndentedString(transactionScoreResponse)).append("\n");
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

