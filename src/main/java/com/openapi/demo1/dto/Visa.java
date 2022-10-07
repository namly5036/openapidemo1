package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Network;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Visa
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Visa extends Network {

  @JsonProperty("VISABID")
  private String VISABID;

  @JsonProperty("VISAAUR")
  private String VISAAUR;

  @JsonProperty("cardAuthenticationResultCode")
  private String cardAuthenticationResultCode;

  @JsonProperty("spendQualificationIndicator")
  private Boolean spendQualificationIndicator;

  public Visa VISABID(String VISABID) {
    this.VISABID = VISABID;
    return this;
  }

  /**
   * The Business Identifier (BID) provided by Visa to Third Party Services (TPS).
   * @return VISABID
  */
  @Size(max = 128) 
  @Schema(name = "VISABID", example = "0123456789", description = "The Business Identifier (BID) provided by Visa to Third Party Services (TPS).", required = false)
  public String getVISABID() {
    return VISABID;
  }

  public void setVISABID(String VISABID) {
    this.VISABID = VISABID;
  }

  public Visa VISAAUR(String VISAAUR) {
    this.VISAAUR = VISAAUR;
    return this;
  }

  /**
   * Agent Unique Account Result (AUAR) provided by Visa to Third Party Services (TPS) in 12 hex digit format.
   * @return VISAAUR
  */
  @Size(max = 128) 
  @Schema(name = "VISAAUR", example = "12345AD89012", description = "Agent Unique Account Result (AUAR) provided by Visa to Third Party Services (TPS) in 12 hex digit format.", required = false)
  public String getVISAAUR() {
    return VISAAUR;
  }

  public void setVISAAUR(String VISAAUR) {
    this.VISAAUR = VISAAUR;
  }

  public Visa cardAuthenticationResultCode(String cardAuthenticationResultCode) {
    this.cardAuthenticationResultCode = cardAuthenticationResultCode;
    return this;
  }

  /**
   * Card Authentication Results Code returned by Visa for EMV chip transactions.
   * @return cardAuthenticationResultCode
  */
  @Size(max = 1) 
  @Schema(name = "cardAuthenticationResultCode", description = "Card Authentication Results Code returned by Visa for EMV chip transactions.", required = false)
  public String getCardAuthenticationResultCode() {
    return cardAuthenticationResultCode;
  }

  public void setCardAuthenticationResultCode(String cardAuthenticationResultCode) {
    this.cardAuthenticationResultCode = cardAuthenticationResultCode;
  }

  public Visa spendQualificationIndicator(Boolean spendQualificationIndicator) {
    this.spendQualificationIndicator = spendQualificationIndicator;
    return this;
  }

  /**
   * A field used by Visa to establish annual point-of-sale spending requirements.
   * @return spendQualificationIndicator
  */
  
  @Schema(name = "spendQualificationIndicator", example = "false", description = "A field used by Visa to establish annual point-of-sale spending requirements.", required = false)
  public Boolean getSpendQualificationIndicator() {
    return spendQualificationIndicator;
  }

  public void setSpendQualificationIndicator(Boolean spendQualificationIndicator) {
    this.spendQualificationIndicator = spendQualificationIndicator;
  }

  public Visa network(String network) {
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
    Visa visa = (Visa) o;
    return Objects.equals(this.VISABID, visa.VISABID) &&
        Objects.equals(this.VISAAUR, visa.VISAAUR) &&
        Objects.equals(this.cardAuthenticationResultCode, visa.cardAuthenticationResultCode) &&
        Objects.equals(this.spendQualificationIndicator, visa.spendQualificationIndicator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(VISABID, VISAAUR, cardAuthenticationResultCode, spendQualificationIndicator, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visa {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    VISABID: ").append(toIndentedString(VISABID)).append("\n");
    sb.append("    VISAAUR: ").append(toIndentedString(VISAAUR)).append("\n");
    sb.append("    cardAuthenticationResultCode: ").append(toIndentedString(cardAuthenticationResultCode)).append("\n");
    sb.append("    spendQualificationIndicator: ").append(toIndentedString(spendQualificationIndicator)).append("\n");
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

