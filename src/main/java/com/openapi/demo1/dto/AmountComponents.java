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
 * Used in transactions where additional &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Amount-Components.md\&quot;&gt;amount&lt;/a&gt; fields such as tax, surcharge, or fees are required as part of the request.
 */

@Schema(name = "AmountComponents", description = "Used in transactions where additional <a href=\"../docs?path=docs/Resources/Master-Data/Amount-Components.md\">amount</a> fields such as tax, surcharge, or fees are required as part of the request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AmountComponents {

  @JsonProperty("subTotal")
  private BigDecimal subTotal;

  @JsonProperty("vatAmount")
  private BigDecimal vatAmount;

  @JsonProperty("localTax")
  private BigDecimal localTax;

  @JsonProperty("shippingAmount")
  private BigDecimal shippingAmount;

  @JsonProperty("cashback")
  private BigDecimal cashback;

  @JsonProperty("tip")
  private BigDecimal tip;

  @JsonProperty("surcharge")
  private BigDecimal surcharge;

  @JsonProperty("ITBISTaxAmount")
  private BigDecimal itBISTaxAmount;

  @JsonProperty("convenienceFee")
  private BigDecimal convenienceFee;

  public AmountComponents subTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Subtotal amount.
   * maximum: 1000000000000000000
   * @return subTotal
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "subTotal", example = "1.5", description = "Subtotal amount.", required = false)
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }

  public AmountComponents vatAmount(BigDecimal vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

  /**
   * Level 2 VAT (Value Added Tax) or alternate tax amount applied at the order level.
   * maximum: 1000000000000000000
   * @return vatAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "vatAmount", example = "1.5", description = "Level 2 VAT (Value Added Tax) or alternate tax amount applied at the order level.", required = false)
  public BigDecimal getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(BigDecimal vatAmount) {
    this.vatAmount = vatAmount;
  }

  public AmountComponents localTax(BigDecimal localTax) {
    this.localTax = localTax;
    return this;
  }

  /**
   * Local sales tax amount included in a transaction.
   * maximum: 1000000000000000000
   * @return localTax
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "localTax", example = "1.5", description = "Local sales tax amount included in a transaction.", required = false)
  public BigDecimal getLocalTax() {
    return localTax;
  }

  public void setLocalTax(BigDecimal localTax) {
    this.localTax = localTax;
  }

  public AmountComponents shippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
    return this;
  }

  /**
   * Shipping amount included in a transaction.
   * maximum: 1000000000000000000
   * @return shippingAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "shippingAmount", example = "1.5", description = "Shipping amount included in a transaction.", required = false)
  public BigDecimal getShippingAmount() {
    return shippingAmount;
  }

  public void setShippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public AmountComponents cashback(BigDecimal cashback) {
    this.cashback = cashback;
    return this;
  }

  /**
   * For Debit, EBTCash, or Credit: The amount of cash requested by the cardholder at the time of purchase.
   * maximum: 1000000000000000000
   * @return cashback
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "cashback", example = "1.5", description = "For Debit, EBTCash, or Credit: The amount of cash requested by the cardholder at the time of purchase.", required = false)
  public BigDecimal getCashback() {
    return cashback;
  }

  public void setCashback(BigDecimal cashback) {
    this.cashback = cashback;
  }

  public AmountComponents tip(BigDecimal tip) {
    this.tip = tip;
    return this;
  }

  /**
   * The portion of the transaction amount that represents the tip.
   * maximum: 1000000000000000000
   * @return tip
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "tip", example = "1.5", description = "The portion of the transaction amount that represents the tip.", required = false)
  public BigDecimal getTip() {
    return tip;
  }

  public void setTip(BigDecimal tip) {
    this.tip = tip;
  }

  public AmountComponents surcharge(BigDecimal surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Identifies the transaction surcharge amount as an extra fee, tax, or cost added to the already existent cost of a good or service. Note: Not all processors and acquirers allow surcharge fees. For more information, please contact your account representative.
   * maximum: 1000000000000000000
   * @return surcharge
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "surcharge", example = "1.5", description = "Identifies the transaction surcharge amount as an extra fee, tax, or cost added to the already existent cost of a good or service. Note: Not all processors and acquirers allow surcharge fees. For more information, please contact your account representative.", required = false)
  public BigDecimal getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(BigDecimal surcharge) {
    this.surcharge = surcharge;
  }

  public AmountComponents itBISTaxAmount(BigDecimal itBISTaxAmount) {
    this.itBISTaxAmount = itBISTaxAmount;
    return this;
  }

  /**
   * Tax amount on the transfer of Industrialised Goods and Services (ITBIS).
   * maximum: 1000000000000000000
   * @return itBISTaxAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "ITBISTaxAmount", example = "1.5", description = "Tax amount on the transfer of Industrialised Goods and Services (ITBIS).", required = false)
  public BigDecimal getItBISTaxAmount() {
    return itBISTaxAmount;
  }

  public void setItBISTaxAmount(BigDecimal itBISTaxAmount) {
    this.itBISTaxAmount = itBISTaxAmount;
  }

  public AmountComponents convenienceFee(BigDecimal convenienceFee) {
    this.convenienceFee = convenienceFee;
    return this;
  }

  /**
   * Optional convenience fee for payments made through an alternative channel. rather than by cash, check, or ACH. Note: Not all processors and acquirers allow convenience fees. For more information, please contact your account representative.
   * maximum: 1000000000000000000
   * @return convenienceFee
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "convenienceFee", example = "1.5", description = "Optional convenience fee for payments made through an alternative channel. rather than by cash, check, or ACH. Note: Not all processors and acquirers allow convenience fees. For more information, please contact your account representative.", required = false)
  public BigDecimal getConvenienceFee() {
    return convenienceFee;
  }

  public void setConvenienceFee(BigDecimal convenienceFee) {
    this.convenienceFee = convenienceFee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountComponents amountComponents = (AmountComponents) o;
    return Objects.equals(this.subTotal, amountComponents.subTotal) &&
        Objects.equals(this.vatAmount, amountComponents.vatAmount) &&
        Objects.equals(this.localTax, amountComponents.localTax) &&
        Objects.equals(this.shippingAmount, amountComponents.shippingAmount) &&
        Objects.equals(this.cashback, amountComponents.cashback) &&
        Objects.equals(this.tip, amountComponents.tip) &&
        Objects.equals(this.surcharge, amountComponents.surcharge) &&
        Objects.equals(this.itBISTaxAmount, amountComponents.itBISTaxAmount) &&
        Objects.equals(this.convenienceFee, amountComponents.convenienceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTotal, vatAmount, localTax, shippingAmount, cashback, tip, surcharge, itBISTaxAmount, convenienceFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountComponents {\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    localTax: ").append(toIndentedString(localTax)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    cashback: ").append(toIndentedString(cashback)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    itBISTaxAmount: ").append(toIndentedString(itBISTaxAmount)).append("\n");
    sb.append("    convenienceFee: ").append(toIndentedString(convenienceFee)).append("\n");
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

