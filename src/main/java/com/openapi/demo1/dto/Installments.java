package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Installment bill payment transaction information.
 */

@Schema(name = "Installments", description = "Installment bill payment transaction information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Installments {

  @JsonProperty("installmentAmount")
  private BigDecimal installmentAmount;

  @JsonProperty("lastInstallmentAmount")
  private BigDecimal lastInstallmentAmount;

  @JsonProperty("installmentCount")
  private Integer installmentCount;

  @JsonProperty("interestRate")
  private BigDecimal interestRate;

  @JsonProperty("paymentFirstDay")
  private BigDecimal paymentFirstDay;

  @JsonProperty("invoiceId")
  private String invoiceId;

  @JsonProperty("invoiceDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate invoiceDate;

  @JsonProperty("deliveryDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate deliveryDate;

  @JsonProperty("dueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  public Installments installmentAmount(BigDecimal installmentAmount) {
    this.installmentAmount = installmentAmount;
    return this;
  }

  /**
   * Amount the customer will be charged per installment.
   * maximum: 1000000000000000000
   * @return installmentAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "installmentAmount", example = "20.0", description = "Amount the customer will be charged per installment.", required = false)
  public BigDecimal getInstallmentAmount() {
    return installmentAmount;
  }

  public void setInstallmentAmount(BigDecimal installmentAmount) {
    this.installmentAmount = installmentAmount;
  }

  public Installments lastInstallmentAmount(BigDecimal lastInstallmentAmount) {
    this.lastInstallmentAmount = lastInstallmentAmount;
    return this;
  }

  /**
   * Amount the customer will be charged on the last installment.
   * maximum: 1000000000000000000
   * @return lastInstallmentAmount
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "lastInstallmentAmount", example = "20.0", description = "Amount the customer will be charged on the last installment.", required = false)
  public BigDecimal getLastInstallmentAmount() {
    return lastInstallmentAmount;
  }

  public void setLastInstallmentAmount(BigDecimal lastInstallmentAmount) {
    this.lastInstallmentAmount = lastInstallmentAmount;
  }

  public Installments installmentCount(Integer installmentCount) {
    this.installmentCount = installmentCount;
    return this;
  }

  /**
   * Number of installment payments in the plan
   * maximum: 999
   * @return installmentCount
  */
  @Max(999) 
  @Schema(name = "installmentCount", example = "12", description = "Number of installment payments in the plan", required = false)
  public Integer getInstallmentCount() {
    return installmentCount;
  }

  public void setInstallmentCount(Integer installmentCount) {
    this.installmentCount = installmentCount;
  }

  public Installments interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Indicates the installment interest rate if applicable.
   * maximum: 100
   * @return interestRate
  */
  @Valid @DecimalMax("100") 
  @Schema(name = "interestRate", example = "1.32", description = "Indicates the installment interest rate if applicable.", required = false)
  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public Installments paymentFirstDay(BigDecimal paymentFirstDay) {
    this.paymentFirstDay = paymentFirstDay;
    return this;
  }

  /**
   * Amount the customer will be charged on the first day.
   * maximum: 1000000000000000000
   * @return paymentFirstDay
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "paymentFirstDay", example = "15.0", description = "Amount the customer will be charged on the first day.", required = false)
  public BigDecimal getPaymentFirstDay() {
    return paymentFirstDay;
  }

  public void setPaymentFirstDay(BigDecimal paymentFirstDay) {
    this.paymentFirstDay = paymentFirstDay;
  }

  public Installments invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Invoice Number of an installment bill payment transaction. Note: This field has limited platform availability. For more information, please contact your account representative.
   * @return invoiceId
  */
  @Size(max = 256) 
  @Schema(name = "invoiceId", example = "534242", description = "Invoice Number of an installment bill payment transaction. Note: This field has limited platform availability. For more information, please contact your account representative.", required = false)
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Installments invoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Date that the installment invoice was created in YYYY-MM-DD format.
   * @return invoiceDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "invoiceDate", example = "Fri May 01 07:00:00 ICT 2020", description = "Date that the installment invoice was created in YYYY-MM-DD format.", required = false)
  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Installments deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Date the product or service is delivered in YYYY-MM-DD format.
   * @return deliveryDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "deliveryDate", example = "Fri May 01 07:00:00 ICT 2020", description = "Date the product or service is delivered in YYYY-MM-DD format.", required = false)
  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Installments dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Date final payment is due for the installment invoice in YYYY-MM-DD format.
   * @return dueDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "dueDate", example = "Wed May 01 07:00:00 ICT 2030", description = "Date final payment is due for the installment invoice in YYYY-MM-DD format.", required = false)
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installments installments = (Installments) o;
    return Objects.equals(this.installmentAmount, installments.installmentAmount) &&
        Objects.equals(this.lastInstallmentAmount, installments.lastInstallmentAmount) &&
        Objects.equals(this.installmentCount, installments.installmentCount) &&
        Objects.equals(this.interestRate, installments.interestRate) &&
        Objects.equals(this.paymentFirstDay, installments.paymentFirstDay) &&
        Objects.equals(this.invoiceId, installments.invoiceId) &&
        Objects.equals(this.invoiceDate, installments.invoiceDate) &&
        Objects.equals(this.deliveryDate, installments.deliveryDate) &&
        Objects.equals(this.dueDate, installments.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentAmount, lastInstallmentAmount, installmentCount, interestRate, paymentFirstDay, invoiceId, invoiceDate, deliveryDate, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installments {\n");
    sb.append("    installmentAmount: ").append(toIndentedString(installmentAmount)).append("\n");
    sb.append("    lastInstallmentAmount: ").append(toIndentedString(lastInstallmentAmount)).append("\n");
    sb.append("    installmentCount: ").append(toIndentedString(installmentCount)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    paymentFirstDay: ").append(toIndentedString(paymentFirstDay)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

