package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Network;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Discover
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Discover extends Network {

  @JsonProperty("networkOriginalAmount")
  private BigDecimal networkOriginalAmount;

  public Discover networkOriginalAmount(BigDecimal networkOriginalAmount) {
    this.networkOriginalAmount = networkOriginalAmount;
    return this;
  }

  /**
   * Original transaction amount, required for Discover card on file transactions.
   * maximum: 1000000000000000000
   * @return networkOriginalAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "networkOriginalAmount", example = "9.66", description = "Original transaction amount, required for Discover card on file transactions.", required = false)
  public BigDecimal getNetworkOriginalAmount() {
    return networkOriginalAmount;
  }

  public void setNetworkOriginalAmount(BigDecimal networkOriginalAmount) {
    this.networkOriginalAmount = networkOriginalAmount;
  }

  public Discover network(String network) {
    super.setNetwork(network);
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
    Discover discover = (Discover) o;
    return Objects.equals(this.networkOriginalAmount, discover.networkOriginalAmount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkOriginalAmount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discover {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    networkOriginalAmount: ").append(toIndentedString(networkOriginalAmount)).append("\n");
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

