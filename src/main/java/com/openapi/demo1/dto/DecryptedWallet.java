package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openapi.demo1.dto.Card;
import com.openapi.demo1.dto.Source;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DecryptedWallet
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DecryptedWallet extends Source {

  @JsonProperty("card")
  private Card card;

  @JsonProperty("cavv")
  private String cavv;

  @JsonProperty("xid")
  private String xid;

  @JsonProperty("walletType")
  private String walletType;

  public DecryptedWallet card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @Valid 
  @Schema(name = "card", required = false)
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public DecryptedWallet cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

  /**
   * Cryptogram.
   * @return cavv
  */
  @Size(max = 40) 
  @Schema(name = "cavv", example = "01ade6ae340005c681c3a1890418b53000020000", description = "Cryptogram.", required = false)
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public DecryptedWallet xid(String xid) {
    this.xid = xid;
    return this;
  }

  /**
   * Cryptogram.
   * @return xid
  */
  @Size(max = 40) 
  @Schema(name = "xid", description = "Cryptogram.", required = false)
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public DecryptedWallet walletType(String walletType) {
    this.walletType = walletType;
    return this;
  }

  /**
   * Identifies the wallet as APPLE_PAY, GOOGLE_PAY, or SAMSUNG_PAY.
   * @return walletType
  */
  @Size(max = 256) 
  @Schema(name = "walletType", example = "APPLE_PAY", description = "Identifies the wallet as APPLE_PAY, GOOGLE_PAY, or SAMSUNG_PAY.", required = false)
  public String getWalletType() {
    return walletType;
  }

  public void setWalletType(String walletType) {
    this.walletType = walletType;
  }

  public DecryptedWallet sourceType(String sourceType) {
    super.setSourceType(sourceType);
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
    DecryptedWallet decryptedWallet = (DecryptedWallet) o;
    return Objects.equals(this.card, decryptedWallet.card) &&
        Objects.equals(this.cavv, decryptedWallet.cavv) &&
        Objects.equals(this.xid, decryptedWallet.xid) &&
        Objects.equals(this.walletType, decryptedWallet.walletType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, cavv, xid, walletType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptedWallet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
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

