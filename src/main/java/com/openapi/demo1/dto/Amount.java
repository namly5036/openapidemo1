package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Amount-Components.md\&quot;&gt;Amount&lt;/a&gt; object to support the request for payment.
 */

@Schema(name = "Amount", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Amount-Components.md\">Amount</a> object to support the request for payment.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Amount {

  @JsonProperty("total")
  private BigDecimal total;

  @JsonProperty("currency")
  private String currency;

  public Amount total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Sub-component values must add up to total amount.
   * maximum: 1000000000000000000
   * @return total
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "total", example = "13.5", description = "Sub-component values must add up to total amount.", required = false)
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 3 Currency Format.
   * @return currency
  */
  @Size(max = 3) 
  @Schema(name = "currency", example = "USD", description = "ISO 3 Currency Format.", required = false)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.total, amount.total) &&
        Objects.equals(this.currency, amount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

