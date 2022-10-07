package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DiscoverAllOf
 */

@JsonTypeName("Discover_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DiscoverAllOf {

  @JsonProperty("networkOriginalAmount")
  private BigDecimal networkOriginalAmount;

  public DiscoverAllOf networkOriginalAmount(BigDecimal networkOriginalAmount) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoverAllOf discoverAllOf = (DiscoverAllOf) o;
    return Objects.equals(this.networkOriginalAmount, discoverAllOf.networkOriginalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkOriginalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoverAllOf {\n");
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

