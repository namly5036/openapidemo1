package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Used to initiate an initial or subsequent &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Stored-Credentials.md\&quot;&gt;stored credentials&lt;/a&gt; transaction.
 */

@Schema(name = "StoredCredentials", description = "Used to initiate an initial or subsequent <a href=\"../docs?path=docs/Resources/Guides/Stored-Credentials.md\">stored credentials</a> transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class StoredCredentials {

  @JsonProperty("scheduled")
  private Boolean scheduled;

  @JsonProperty("initiator")
  private String initiator;

  @JsonProperty("sequence")
  private String sequence;

  @JsonProperty("schemeReferenceTransactionId")
  private String schemeReferenceTransactionId;

  @JsonProperty("originationDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate originationDate;

  @JsonProperty("accountAge")
  private String accountAge;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("lastUpdated")
  private String lastUpdated;

  @JsonProperty("age")
  private String age;

  @JsonProperty("attempts")
  private Integer attempts;

  @JsonProperty("accountPasswordReset")
  private String accountPasswordReset;

  @JsonProperty("sixMonthTransactionCount")
  private Integer sixMonthTransactionCount;

  @JsonProperty("twentyFourHourTransactionCount")
  private Integer twentyFourHourTransactionCount;

  @JsonProperty("retryAttempts")
  private Integer retryAttempts;

  @JsonProperty("networkTransactionReference")
  private String networkTransactionReference;

  public StoredCredentials scheduled(Boolean scheduled) {
    this.scheduled = scheduled;
    return this;
  }

  /**
   * Indicator if this is a scheduled transaction.
   * @return scheduled
  */
  
  @Schema(name = "scheduled", example = "true", description = "Indicator if this is a scheduled transaction.", required = false)
  public Boolean getScheduled() {
    return scheduled;
  }

  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
  }

  public StoredCredentials initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Indicates whether it is a merchant-initiated or explicitly consented to by card holder.  Valid Values: * MERCHANT * CARD_HOLDER 
   * @return initiator
  */
  @Size(max = 11) 
  @Schema(name = "initiator", example = "MERCHANT", description = "Indicates whether it is a merchant-initiated or explicitly consented to by card holder.  Valid Values: * MERCHANT * CARD_HOLDER ", required = false)
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public StoredCredentials sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Indicates if the transaction is first or subsequent.  Valid Values: * FIRST * SUBSEQUENT * SINGLE 
   * @return sequence
  */
  @Size(max = 10) 
  @Schema(name = "sequence", example = "FIRST", description = "Indicates if the transaction is first or subsequent.  Valid Values: * FIRST * SUBSEQUENT * SINGLE ", required = false)
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public StoredCredentials schemeReferenceTransactionId(String schemeReferenceTransactionId) {
    this.schemeReferenceTransactionId = schemeReferenceTransactionId;
    return this;
  }

  /**
   * The transaction ID received from the issuer for the initial transaction. May be required if sequence is subsequent.
   * @return schemeReferenceTransactionId
  */
  @Size(max = 256) 
  @Schema(name = "schemeReferenceTransactionId", example = "54231235467", description = "The transaction ID received from the issuer for the initial transaction. May be required if sequence is subsequent.", required = false)
  public String getSchemeReferenceTransactionId() {
    return schemeReferenceTransactionId;
  }

  public void setSchemeReferenceTransactionId(String schemeReferenceTransactionId) {
    this.schemeReferenceTransactionId = schemeReferenceTransactionId;
  }

  public StoredCredentials originationDate(LocalDate originationDate) {
    this.originationDate = originationDate;
    return this;
  }

  /**
   * Date the customer account was created with merchant, in YYYY-MM-DD format.
   * @return originationDate
  */
  @Valid @Size(max = 10) 
  @Schema(name = "originationDate", example = "Fri Nov 20 07:00:00 ICT 2020", description = "Date the customer account was created with merchant, in YYYY-MM-DD format.", required = false)
  public LocalDate getOriginationDate() {
    return originationDate;
  }

  public void setOriginationDate(LocalDate originationDate) {
    this.originationDate = originationDate;
  }

  public StoredCredentials accountAge(String accountAge) {
    this.accountAge = accountAge;
    return this;
  }

  /**
   * Indicator on the age of customer account with merchant.  Valid Values:  * GUEST * NEW_ACCOUNT * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS 
   * @return accountAge
  */
  @Size(max = 32) 
  @Schema(name = "accountAge", example = "GUEST ", description = "Indicator on the age of customer account with merchant.  Valid Values:  * GUEST * NEW_ACCOUNT * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS ", required = false)
  public String getAccountAge() {
    return accountAge;
  }

  public void setAccountAge(String accountAge) {
    this.accountAge = accountAge;
  }

  public StoredCredentials count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of cards on file with this account.
   * @return count
  */
  
  @Schema(name = "count", example = "1", description = "Number of cards on file with this account.", required = false)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public StoredCredentials lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Age of most recent card add/modify.  Valid Values:  * NEVER * NOW * LESS_THAN_30_DAYS * 30_60_DAYS * Over 60 DAYS 
   * @return lastUpdated
  */
  @Size(max = 32) 
  @Schema(name = "lastUpdated", example = "NEVER", description = "Age of most recent card add/modify.  Valid Values:  * NEVER * NOW * LESS_THAN_30_DAYS * 30_60_DAYS * Over 60 DAYS ", required = false)
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public StoredCredentials age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Indicator on the age of this payment card on file with merchant.    Valid Values:  * GUEST * NEW_ACCOUNT * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS 
   * @return age
  */
  @Size(max = 32) 
  @Schema(name = "age", example = "GUEST", description = "Indicator on the age of this payment card on file with merchant.    Valid Values:  * GUEST * NEW_ACCOUNT * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS ", required = false)
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public StoredCredentials attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Number of attempts to add a payment card in prior 24 hours.
   * @return attempts
  */
  
  @Schema(name = "attempts", example = "1", description = "Number of attempts to add a payment card in prior 24 hours.", required = false)
  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  public StoredCredentials accountPasswordReset(String accountPasswordReset) {
    this.accountPasswordReset = accountPasswordReset;
    return this;
  }

  /**
   * Indicator of the last time the account password was reset.  Valid Values:  * NEVER * NOW * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS 
   * @return accountPasswordReset
  */
  @Size(max = 32) 
  @Schema(name = "accountPasswordReset", example = "NEVER", description = "Indicator of the last time the account password was reset.  Valid Values:  * NEVER * NOW * LESS_THAN_30_DAYS * 30_60_DAYS * 60_90_DAYS * OVER_90_DAYS ", required = false)
  public String getAccountPasswordReset() {
    return accountPasswordReset;
  }

  public void setAccountPasswordReset(String accountPasswordReset) {
    this.accountPasswordReset = accountPasswordReset;
  }

  public StoredCredentials sixMonthTransactionCount(Integer sixMonthTransactionCount) {
    this.sixMonthTransactionCount = sixMonthTransactionCount;
    return this;
  }

  /**
   * Number of transaction on this account in prior 6 months.
   * @return sixMonthTransactionCount
  */
  
  @Schema(name = "sixMonthTransactionCount", example = "5", description = "Number of transaction on this account in prior 6 months.", required = false)
  public Integer getSixMonthTransactionCount() {
    return sixMonthTransactionCount;
  }

  public void setSixMonthTransactionCount(Integer sixMonthTransactionCount) {
    this.sixMonthTransactionCount = sixMonthTransactionCount;
  }

  public StoredCredentials twentyFourHourTransactionCount(Integer twentyFourHourTransactionCount) {
    this.twentyFourHourTransactionCount = twentyFourHourTransactionCount;
    return this;
  }

  /**
   * Number of transaction on this account in prior 24 hours.
   * @return twentyFourHourTransactionCount
  */
  
  @Schema(name = "twentyFourHourTransactionCount", example = "1", description = "Number of transaction on this account in prior 24 hours.", required = false)
  public Integer getTwentyFourHourTransactionCount() {
    return twentyFourHourTransactionCount;
  }

  public void setTwentyFourHourTransactionCount(Integer twentyFourHourTransactionCount) {
    this.twentyFourHourTransactionCount = twentyFourHourTransactionCount;
  }

  public StoredCredentials retryAttempts(Integer retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

  /**
   * Number of retry attempt if the initial transaction was unsuccessful.
   * @return retryAttempts
  */
  
  @Schema(name = "retryAttempts", example = "0", description = "Number of retry attempt if the initial transaction was unsuccessful.", required = false)
  public Integer getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(Integer retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public StoredCredentials networkTransactionReference(String networkTransactionReference) {
    this.networkTransactionReference = networkTransactionReference;
    return this;
  }

  /**
   * Allows linking of the transaction to the original or previous one in a subscription/card-on-file chain.
   * @return networkTransactionReference
  */
  @Size(max = 64) 
  @Schema(name = "networkTransactionReference", example = "123456788", description = "Allows linking of the transaction to the original or previous one in a subscription/card-on-file chain.", required = false)
  public String getNetworkTransactionReference() {
    return networkTransactionReference;
  }

  public void setNetworkTransactionReference(String networkTransactionReference) {
    this.networkTransactionReference = networkTransactionReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredCredentials storedCredentials = (StoredCredentials) o;
    return Objects.equals(this.scheduled, storedCredentials.scheduled) &&
        Objects.equals(this.initiator, storedCredentials.initiator) &&
        Objects.equals(this.sequence, storedCredentials.sequence) &&
        Objects.equals(this.schemeReferenceTransactionId, storedCredentials.schemeReferenceTransactionId) &&
        Objects.equals(this.originationDate, storedCredentials.originationDate) &&
        Objects.equals(this.accountAge, storedCredentials.accountAge) &&
        Objects.equals(this.count, storedCredentials.count) &&
        Objects.equals(this.lastUpdated, storedCredentials.lastUpdated) &&
        Objects.equals(this.age, storedCredentials.age) &&
        Objects.equals(this.attempts, storedCredentials.attempts) &&
        Objects.equals(this.accountPasswordReset, storedCredentials.accountPasswordReset) &&
        Objects.equals(this.sixMonthTransactionCount, storedCredentials.sixMonthTransactionCount) &&
        Objects.equals(this.twentyFourHourTransactionCount, storedCredentials.twentyFourHourTransactionCount) &&
        Objects.equals(this.retryAttempts, storedCredentials.retryAttempts) &&
        Objects.equals(this.networkTransactionReference, storedCredentials.networkTransactionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduled, initiator, sequence, schemeReferenceTransactionId, originationDate, accountAge, count, lastUpdated, age, attempts, accountPasswordReset, sixMonthTransactionCount, twentyFourHourTransactionCount, retryAttempts, networkTransactionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredCredentials {\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    schemeReferenceTransactionId: ").append(toIndentedString(schemeReferenceTransactionId)).append("\n");
    sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
    sb.append("    accountAge: ").append(toIndentedString(accountAge)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    accountPasswordReset: ").append(toIndentedString(accountPasswordReset)).append("\n");
    sb.append("    sixMonthTransactionCount: ").append(toIndentedString(sixMonthTransactionCount)).append("\n");
    sb.append("    twentyFourHourTransactionCount: ").append(toIndentedString(twentyFourHourTransactionCount)).append("\n");
    sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
    sb.append("    networkTransactionReference: ").append(toIndentedString(networkTransactionReference)).append("\n");
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

