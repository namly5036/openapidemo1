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
 * 
 */

@Schema(name = "ItemDetails", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class ItemDetails {

  @JsonProperty("categoryName")
  private String categoryName;

  @JsonProperty("itemCount")
  private Integer itemCount;

  @JsonProperty("value")
  private BigDecimal value;

  public ItemDetails categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Merchant defined category of the item(s) sold
   * @return categoryName
  */
  @Size(max = 8) 
  @Schema(name = "categoryName", example = "Merchandise", description = "Merchant defined category of the item(s) sold", required = false)
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public ItemDetails itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * The item count in category.
   * @return itemCount
  */
  
  @Schema(name = "itemCount", example = "1", description = "The item count in category.", required = false)
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ItemDetails value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The monetary value of items.
   * @return value
  */
  @Valid 
  @Schema(name = "value", example = "12.5", description = "The monetary value of items.", required = false)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetails itemDetails = (ItemDetails) o;
    return Objects.equals(this.categoryName, itemDetails.categoryName) &&
        Objects.equals(this.itemCount, itemDetails.itemCount) &&
        Objects.equals(this.value, itemDetails.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, itemCount, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetails {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

