package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TransactionBatch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class TransactionBatch {

  @JsonProperty("julianDay")
  private String julianDay;

  @JsonProperty("batchNumber")
  private String batchNumber;

  @JsonProperty("transactionClass")
  private String transactionClass;

  @JsonProperty("sequenceNumber")
  private String sequenceNumber;

  public TransactionBatch julianDay(String julianDay) {
    this.julianDay = julianDay;
    return this;
  }

  /**
   * The day of the year the current batch was opened, 001-366 format.
   * @return julianDay
  */
  
  @Schema(name = "julianDay", example = "001", description = "The day of the year the current batch was opened, 001-366 format.", required = false)
  public String getJulianDay() {
    return julianDay;
  }

  public void setJulianDay(String julianDay) {
    this.julianDay = julianDay;
  }

  public TransactionBatch batchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

  /**
   * The batch number within the Julian day for this transaction. values range from 000001 through 000999.
   * @return batchNumber
  */
  
  @Schema(name = "batchNumber", example = "000001", description = "The batch number within the Julian day for this transaction. values range from 000001 through 000999.", required = false)
  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }

  public TransactionBatch transactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
    return this;
  }

  /**
   * Code that indicates the transaction that was logged under, ranges from 1 through 4--Captured- approved, Captured- Authorised Only, Declinced, Batch Control.
   * @return transactionClass
  */
  
  @Schema(name = "transactionClass", example = "1", description = "Code that indicates the transaction that was logged under, ranges from 1 through 4--Captured- approved, Captured- Authorised Only, Declinced, Batch Control.", required = false)
  public String getTransactionClass() {
    return transactionClass;
  }

  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }

  public TransactionBatch sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Sequence number of this transaction within the current batch, ranges from 000001 through 000999.
   * @return sequenceNumber
  */
  
  @Schema(name = "sequenceNumber", example = "000001", description = "Sequence number of this transaction within the current batch, ranges from 000001 through 000999.", required = false)
  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionBatch transactionBatch = (TransactionBatch) o;
    return Objects.equals(this.julianDay, transactionBatch.julianDay) &&
        Objects.equals(this.batchNumber, transactionBatch.batchNumber) &&
        Objects.equals(this.transactionClass, transactionBatch.transactionClass) &&
        Objects.equals(this.sequenceNumber, transactionBatch.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(julianDay, batchNumber, transactionClass, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionBatch {\n");
    sb.append("    julianDay: ").append(toIndentedString(julianDay)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    transactionClass: ").append(toIndentedString(transactionClass)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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

