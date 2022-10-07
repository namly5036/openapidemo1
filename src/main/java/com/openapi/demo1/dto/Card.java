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
 * Common &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Card.md\&quot;&gt;card&lt;/a&gt; data for a transaction request and response.
 */

@Schema(name = "Card", description = "Common <a href=\"../docs?path=docs/Resources/Master-Data/Card.md\">card</a> data for a transaction request and response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Card {

  @JsonProperty("cardData")
  private String cardData;

  @JsonProperty("nameOnCard")
  private String nameOnCard;

  @JsonProperty("expirationMonth")
  private String expirationMonth;

  @JsonProperty("expirationYear")
  private String expirationYear;

  @JsonProperty("securityCode")
  private String securityCode;

  @JsonProperty("securityCodeIndicator")
  private String securityCodeIndicator;

  @JsonProperty("bin")
  private String bin;

  @JsonProperty("last4")
  private String last4;

  @JsonProperty("scheme")
  private String scheme;

  @JsonProperty("beginningBalance")
  private BigDecimal beginningBalance;

  @JsonProperty("endingBalance")
  private BigDecimal endingBalance;

  public Card cardData(String cardData) {
    this.cardData = cardData;
    return this;
  }

  /**
   * Card number or encrypted data.
   * @return cardData
  */
  @Size(max = 256) 
  @Schema(name = "cardData", example = "4005550000000019", description = "Card number or encrypted data.", required = false)
  public String getCardData() {
    return cardData;
  }

  public void setCardData(String cardData) {
    this.cardData = cardData;
  }

  public Card nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

  /**
   * Cardholder name.
   * @return nameOnCard
  */
  @Size(max = 256) 
  @Schema(name = "nameOnCard", example = "Jane Smith", description = "Cardholder name.", required = false)
  public String getNameOnCard() {
    return nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  public Card expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * 2-digit expiration month.
   * @return expirationMonth
  */
  @Pattern(regexp = "^(0[1-9]|1[012])$") 
  @Schema(name = "expirationMonth", example = "05", description = "2-digit expiration month.", required = false)
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Card expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * 4-digit expiration year.
   * @return expirationYear
  */
  @Pattern(regexp = "^[0-9]{4}$") @Size(max = 4) 
  @Schema(name = "expirationYear", example = "2035", description = "4-digit expiration year.", required = false)
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Card securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

  /**
   * Card Security Code (CSC), Card Verification Data (CVD), Card Verification Number (CVN), Card Verification Value (CVV), Card Verification Code (CVC), Verification Code (V-code or V code), or Signature Panel Code (SPC).
   * @return securityCode
  */
  @Size(max = 4) 
  @Schema(name = "securityCode", example = "111", description = "Card Security Code (CSC), Card Verification Data (CVD), Card Verification Number (CVN), Card Verification Value (CVV), Card Verification Code (CVC), Verification Code (V-code or V code), or Signature Panel Code (SPC).", required = false)
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public Card securityCodeIndicator(String securityCodeIndicator) {
    this.securityCodeIndicator = securityCodeIndicator;
    return this;
  }

  /**
   * Indicates how the security code is passed.  Valid Values: * NOT_SUPPORTED (Default) * PROVIDED * VALUE_ILLEGIBLE * NOT_AVAILABLE 
   * @return securityCodeIndicator
  */
  @Size(max = 15) 
  @Schema(name = "securityCodeIndicator", example = "PROVIDED", description = "Indicates how the security code is passed.  Valid Values: * NOT_SUPPORTED (Default) * PROVIDED * VALUE_ILLEGIBLE * NOT_AVAILABLE ", required = false)
  public String getSecurityCodeIndicator() {
    return securityCodeIndicator;
  }

  public void setSecurityCodeIndicator(String securityCodeIndicator) {
    this.securityCodeIndicator = securityCodeIndicator;
  }

  public Card bin(String bin) {
    this.bin = bin;
    return this;
  }

  /**
   * Bank Identification Number (BIN), the initial set of four to six numbers of the Primary Account Number (PAN). The BIN identifies the issuer and Level 2/3 qualifications.
   * @return bin
  */
  @Size(max = 8) 
  @Schema(name = "bin", example = "400555", description = "Bank Identification Number (BIN), the initial set of four to six numbers of the Primary Account Number (PAN). The BIN identifies the issuer and Level 2/3 qualifications.", required = false)
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public Card last4(String last4) {
    this.last4 = last4;
    return this;
  }

  /**
   * Contains the last four digits of the Primary Account Number (PAN).
   * @return last4
  */
  @Size(max = 4) 
  @Schema(name = "last4", example = "0019", description = "Contains the last four digits of the Primary Account Number (PAN).", required = false)
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public Card scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Card brand.
   * @return scheme
  */
  @Size(max = 256) 
  @Schema(name = "scheme", example = "VISA", description = "Card brand.", required = false)
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public Card beginningBalance(BigDecimal beginningBalance) {
    this.beginningBalance = beginningBalance;
    return this;
  }

  /**
   * Beginning card balance.
   * maximum: 1000000000000000000
   * @return beginningBalance
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "beginningBalance", example = "1.0", description = "Beginning card balance.", required = false)
  public BigDecimal getBeginningBalance() {
    return beginningBalance;
  }

  public void setBeginningBalance(BigDecimal beginningBalance) {
    this.beginningBalance = beginningBalance;
  }

  public Card endingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
    return this;
  }

  /**
   * Ending card balance.
   * maximum: 1000000000000000000
   * @return endingBalance
  */
  @Valid @DecimalMax("1000000000000000000") 
  @Schema(name = "endingBalance", example = "0.1", description = "Ending card balance.", required = false)
  public BigDecimal getEndingBalance() {
    return endingBalance;
  }

  public void setEndingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardData, card.cardData) &&
        Objects.equals(this.nameOnCard, card.nameOnCard) &&
        Objects.equals(this.expirationMonth, card.expirationMonth) &&
        Objects.equals(this.expirationYear, card.expirationYear) &&
        Objects.equals(this.securityCode, card.securityCode) &&
        Objects.equals(this.securityCodeIndicator, card.securityCodeIndicator) &&
        Objects.equals(this.bin, card.bin) &&
        Objects.equals(this.last4, card.last4) &&
        Objects.equals(this.scheme, card.scheme) &&
        Objects.equals(this.beginningBalance, card.beginningBalance) &&
        Objects.equals(this.endingBalance, card.endingBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardData, nameOnCard, expirationMonth, expirationYear, securityCode, securityCodeIndicator, bin, last4, scheme, beginningBalance, endingBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    cardData: ").append(toIndentedString(cardData)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    securityCodeIndicator: ").append(toIndentedString(securityCodeIndicator)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
    sb.append("    endingBalance: ").append(toIndentedString(endingBalance)).append("\n");
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

