package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Amount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SplitTenderMethod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SplitTenderMethod {

  @JsonProperty("type")
  private String type;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("amount")
  private Amount amount;

  public SplitTenderMethod type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Identifies the additional forms of payment used as part of this order.  Valid Values:          * CREDIT_CARD * COUPON * GIFT_CARD * STORE_CREDIT * DEBIT_CARD * EBT_SNAP 
   * @return type
  */
  @Size(max = 32) 
  @Schema(name = "type", example = "CREDIT_CARD", description = "Identifies the additional forms of payment used as part of this order.  Valid Values:          * CREDIT_CARD * COUPON * GIFT_CARD * STORE_CREDIT * DEBIT_CARD * EBT_SNAP ", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SplitTenderMethod count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of accounts presented of this type.
   * maximum: 99
   * @return count
  */
  @Max(99) 
  @Schema(name = "count", example = "2", description = "Number of accounts presented of this type.", required = false)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SplitTenderMethod amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", required = false)
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTenderMethod splitTenderMethod = (SplitTenderMethod) o;
    return Objects.equals(this.type, splitTenderMethod.type) &&
        Objects.equals(this.count, splitTenderMethod.count) &&
        Objects.equals(this.amount, splitTenderMethod.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, count, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTenderMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

