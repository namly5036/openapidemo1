package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Amount;
import com.openapi.demo1.dto.ItemDetails;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Order-Data.md\&quot;&gt;Order data&lt;/a&gt; can be used for merchant database tracking, improve authorization rates and reduce fraud.
 */

@Schema(name = "OrderData", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Order-Data.md\">Order data</a> can be used for merchant database tracking, improve authorization rates and reduce fraud.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class OrderData {

  @JsonProperty("orderDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate orderDate;

  @JsonProperty("itemCount")
  private Integer itemCount;

  @JsonProperty("itemDetails")
  @Valid
  private List<ItemDetails> itemDetails = null;

  @JsonProperty("preOrder")
  private Boolean preOrder;

  @JsonProperty("preOrderDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate preOrderDate;

  @JsonProperty("reOrder")
  private Boolean reOrder;

  @JsonProperty("goodsSoldCode")
  private String goodsSoldCode;

  @JsonProperty("giftcardCount")
  private Integer giftcardCount;

  @JsonProperty("giftCardAmount")
  private Amount giftCardAmount;

  public OrderData orderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Date that goods and services are ordered, in YYYY-MM-DD format.
   * @return orderDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "orderDate", example = "Fri Nov 20 07:00:00 ICT 2020", description = "Date that goods and services are ordered, in YYYY-MM-DD format.", required = false)
  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public OrderData itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Total number of items included in the purchase.
   * @return itemCount
  */
  
  @Schema(name = "itemCount", example = "1", description = "Total number of items included in the purchase.", required = false)
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public OrderData itemDetails(List<ItemDetails> itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }

  public OrderData addItemDetailsItem(ItemDetails itemDetailsItem) {
    if (this.itemDetails == null) {
      this.itemDetails = new ArrayList<>();
    }
    this.itemDetails.add(itemDetailsItem);
    return this;
  }

  /**
   * Get itemDetails
   * @return itemDetails
  */
  @Valid 
  @Schema(name = "itemDetails", required = false)
  public List<ItemDetails> getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(List<ItemDetails> itemDetails) {
    this.itemDetails = itemDetails;
  }

  public OrderData preOrder(Boolean preOrder) {
    this.preOrder = preOrder;
    return this;
  }

  /**
   * Identifies if the purchase is a preorder.
   * @return preOrder
  */
  
  @Schema(name = "preOrder", example = "true", description = "Identifies if the purchase is a preorder.", required = false)
  public Boolean getPreOrder() {
    return preOrder;
  }

  public void setPreOrder(Boolean preOrder) {
    this.preOrder = preOrder;
  }

  public OrderData preOrderDate(LocalDate preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

  /**
   * Date that goods and services are pre-ordered, in YYYY-MM-DD format.
   * @return preOrderDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "preOrderDate", example = "Fri Nov 20 07:00:00 ICT 2020", description = "Date that goods and services are pre-ordered, in YYYY-MM-DD format.", required = false)
  public LocalDate getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(LocalDate preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public OrderData reOrder(Boolean reOrder) {
    this.reOrder = reOrder;
    return this;
  }

  /**
   * Identifies if the purchase is a reorder.
   * @return reOrder
  */
  
  @Schema(name = "reOrder", example = "false", description = "Identifies if the purchase is a reorder.", required = false)
  public Boolean getReOrder() {
    return reOrder;
  }

  public void setReOrder(Boolean reOrder) {
    this.reOrder = reOrder;
  }

  public OrderData goodsSoldCode(String goodsSoldCode) {
    this.goodsSoldCode = goodsSoldCode;
    return this;
  }

  /**
   * Indicates a specific type of goods. It is used to help identify potentially fraudulent sales.
   * @return goodsSoldCode
  */
  @Size(max = 16) 
  @Schema(name = "goodsSoldCode", example = "GIFT_CARD", description = "Indicates a specific type of goods. It is used to help identify potentially fraudulent sales.", required = false)
  public String getGoodsSoldCode() {
    return goodsSoldCode;
  }

  public void setGoodsSoldCode(String goodsSoldCode) {
    this.goodsSoldCode = goodsSoldCode;
  }

  public OrderData giftcardCount(Integer giftcardCount) {
    this.giftcardCount = giftcardCount;
    return this;
  }

  /**
   * Total number of gift cards purchased.
   * maximum: 99
   * @return giftcardCount
  */
  @Max(99) 
  @Schema(name = "giftcardCount", example = "1", description = "Total number of gift cards purchased.", required = false)
  public Integer getGiftcardCount() {
    return giftcardCount;
  }

  public void setGiftcardCount(Integer giftcardCount) {
    this.giftcardCount = giftcardCount;
  }

  public OrderData giftCardAmount(Amount giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
    return this;
  }

  /**
   * Get giftCardAmount
   * @return giftCardAmount
  */
  @Valid 
  @Schema(name = "giftCardAmount", required = false)
  public Amount getGiftCardAmount() {
    return giftCardAmount;
  }

  public void setGiftCardAmount(Amount giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderData orderData = (OrderData) o;
    return Objects.equals(this.orderDate, orderData.orderDate) &&
        Objects.equals(this.itemCount, orderData.itemCount) &&
        Objects.equals(this.itemDetails, orderData.itemDetails) &&
        Objects.equals(this.preOrder, orderData.preOrder) &&
        Objects.equals(this.preOrderDate, orderData.preOrderDate) &&
        Objects.equals(this.reOrder, orderData.reOrder) &&
        Objects.equals(this.goodsSoldCode, orderData.goodsSoldCode) &&
        Objects.equals(this.giftcardCount, orderData.giftcardCount) &&
        Objects.equals(this.giftCardAmount, orderData.giftCardAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDate, itemCount, itemDetails, preOrder, preOrderDate, reOrder, goodsSoldCode, giftcardCount, giftCardAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderData {\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
    sb.append("    preOrder: ").append(toIndentedString(preOrder)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    reOrder: ").append(toIndentedString(reOrder)).append("\n");
    sb.append("    goodsSoldCode: ").append(toIndentedString(goodsSoldCode)).append("\n");
    sb.append("    giftcardCount: ").append(toIndentedString(giftcardCount)).append("\n");
    sb.append("    giftCardAmount: ").append(toIndentedString(giftCardAmount)).append("\n");
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

