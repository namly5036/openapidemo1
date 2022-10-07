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
 * Debit network PINless details based on account/card info BIN data.
 */

@Schema(name = "DebitNetworkPinlessDetails", description = "Debit network PINless details based on account/card info BIN data.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DebitNetworkPinlessDetails {

  @JsonProperty("debitNetworkId")
  private String debitNetworkId;

  @JsonProperty("pinlessPOS")
  private String pinlessPOS;

  @JsonProperty("pinlessBillPay")
  private String pinlessBillPay;

  @JsonProperty("eCommerce")
  private String eCommerce;

  @JsonProperty("dualIndicator")
  private String dualIndicator;

  @JsonProperty("pinnedPOS")
  private String pinnedPOS;

  public DebitNetworkPinlessDetails debitNetworkId(String debitNetworkId) {
    this.debitNetworkId = debitNetworkId;
    return this;
  }

  /**
   *  Valid Values: * PAVD_FISERV - A5: PAVD FISERV * SHAZAM - 01: SHAZAM * NYCE - 02: NYCE * PULSE - 03: PULSE * STAR_WEST - 05: STAR-WEST * STAR_EAST - 07: STAR-EAST * JETS - 11: JETS * INFOLINKS - 12: INFOLINKS * CARLFS - 13: CARLFS * STAR_NE - 14: STAR NE * PAVD - 15: PAVD * CNB_ENID - 16: CNB-ENID * ATH_SCOTIA_BANK - 17: ATH-SCOTIA BANK * ATH_DIRECT - 18: ATH-DIRECT * INTERLINK - 19: INTERLINK * INTERAC_EVERLINK - 20: INTERAC EVERLINK * EVERLINK_INTERAC_ICU - 21: EVERLINK INTERAC ICU * UNIONPAY - 23: UNIONPAY * MAESTRO_DIRECT - 25: MAESTRO DIRECT * MCX - 26: MCX * EBT_SOLUTRAN - 28: EBT SOLUTRAN * EBT_ACS - 29: EBT ACS * MAESTRO_STAR_WEST - 30: MAESTRO STAR WEST * STAR_WEST_OPTION - 31: STAR WEST OPTION * JEANIE_STAR_WEST - 33: JEANIE STAR WEST * JEANIE_DIRECT - 34: JEANIE DIRECT * AFFN_DIRECT - 35: AFFN DIRECT * CU24_DIRECT - 36: CU24-DIRECT * EBT_TEAM_OF_TEXAS - 37: EBT TEAM OF TEXAS * EBT_JPCHASE - 39: EBT JPCHASE * SVS - 41: SVS * EXXON - 42: EXXON * BASE_24/INTERAC - 43: BASE 24/INTERAC * CU24_FIDELITY - 46: CU24-FIDELITY * EBT_EFUNDS - 47: EBT EFUNDS * AFFN_FIDELITY - 48: AFFN FIDELITY * EBT_NORTHRUP_GRUMMAN - 49: EBT NORTHRUP GRUMMAN * CU24_FISERV - 51: CU24-FISERV * AFFN_FISERV - 52: AFFN FISERV * STAR_EAST_FISERV - 56: STAR-EAST FISERV * PULSE_FISERV - 57: PULSE FISERV * NYCE_FISERV - 59: NYCE FISERV * STAR_WEST_FISERV - 62: STAR-WEST FISERV * STAR_NE_FISERV - 63: STAR NE FISERV * MAESTRO_FISERV - 64: MAESTRO FISERV * INTERLINK_FISERV - 65: INTERLINK FISERV * EBT_FISERV - 67: EBT-FISERV * ACCEL_FISERV - 68: ACCEL FISERV * OPTION_FISERV - 69: OPTION-FISERV 
   * @return debitNetworkId
  */
  @Size(max = 20) 
  @Schema(name = "debitNetworkId", example = "STAR_WEST", description = " Valid Values: * PAVD_FISERV - A5: PAVD FISERV * SHAZAM - 01: SHAZAM * NYCE - 02: NYCE * PULSE - 03: PULSE * STAR_WEST - 05: STAR-WEST * STAR_EAST - 07: STAR-EAST * JETS - 11: JETS * INFOLINKS - 12: INFOLINKS * CARLFS - 13: CARLFS * STAR_NE - 14: STAR NE * PAVD - 15: PAVD * CNB_ENID - 16: CNB-ENID * ATH_SCOTIA_BANK - 17: ATH-SCOTIA BANK * ATH_DIRECT - 18: ATH-DIRECT * INTERLINK - 19: INTERLINK * INTERAC_EVERLINK - 20: INTERAC EVERLINK * EVERLINK_INTERAC_ICU - 21: EVERLINK INTERAC ICU * UNIONPAY - 23: UNIONPAY * MAESTRO_DIRECT - 25: MAESTRO DIRECT * MCX - 26: MCX * EBT_SOLUTRAN - 28: EBT SOLUTRAN * EBT_ACS - 29: EBT ACS * MAESTRO_STAR_WEST - 30: MAESTRO STAR WEST * STAR_WEST_OPTION - 31: STAR WEST OPTION * JEANIE_STAR_WEST - 33: JEANIE STAR WEST * JEANIE_DIRECT - 34: JEANIE DIRECT * AFFN_DIRECT - 35: AFFN DIRECT * CU24_DIRECT - 36: CU24-DIRECT * EBT_TEAM_OF_TEXAS - 37: EBT TEAM OF TEXAS * EBT_JPCHASE - 39: EBT JPCHASE * SVS - 41: SVS * EXXON - 42: EXXON * BASE_24/INTERAC - 43: BASE 24/INTERAC * CU24_FIDELITY - 46: CU24-FIDELITY * EBT_EFUNDS - 47: EBT EFUNDS * AFFN_FIDELITY - 48: AFFN FIDELITY * EBT_NORTHRUP_GRUMMAN - 49: EBT NORTHRUP GRUMMAN * CU24_FISERV - 51: CU24-FISERV * AFFN_FISERV - 52: AFFN FISERV * STAR_EAST_FISERV - 56: STAR-EAST FISERV * PULSE_FISERV - 57: PULSE FISERV * NYCE_FISERV - 59: NYCE FISERV * STAR_WEST_FISERV - 62: STAR-WEST FISERV * STAR_NE_FISERV - 63: STAR NE FISERV * MAESTRO_FISERV - 64: MAESTRO FISERV * INTERLINK_FISERV - 65: INTERLINK FISERV * EBT_FISERV - 67: EBT-FISERV * ACCEL_FISERV - 68: ACCEL FISERV * OPTION_FISERV - 69: OPTION-FISERV ", required = false)
  public String getDebitNetworkId() {
    return debitNetworkId;
  }

  public void setDebitNetworkId(String debitNetworkId) {
    this.debitNetworkId = debitNetworkId;
  }

  public DebitNetworkPinlessDetails pinlessPOS(String pinlessPOS) {
    this.pinlessPOS = pinlessPOS;
    return this;
  }

  /**
   * PINless POS indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return pinlessPOS
  */
  @Size(max = 13) 
  @Schema(name = "pinlessPOS", example = "SUPPORTED", description = "PINless POS indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getPinlessPOS() {
    return pinlessPOS;
  }

  public void setPinlessPOS(String pinlessPOS) {
    this.pinlessPOS = pinlessPOS;
  }

  public DebitNetworkPinlessDetails pinlessBillPay(String pinlessBillPay) {
    this.pinlessBillPay = pinlessBillPay;
    return this;
  }

  /**
   * PINless BillPay indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return pinlessBillPay
  */
  @Size(max = 13) 
  @Schema(name = "pinlessBillPay", example = "SUPPORTED", description = "PINless BillPay indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getPinlessBillPay() {
    return pinlessBillPay;
  }

  public void setPinlessBillPay(String pinlessBillPay) {
    this.pinlessBillPay = pinlessBillPay;
  }

  public DebitNetworkPinlessDetails eCommerce(String eCommerce) {
    this.eCommerce = eCommerce;
    return this;
  }

  /**
   * e-Commerce indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return eCommerce
  */
  @Size(max = 13) 
  @Schema(name = "eCommerce", example = "SUPPORTED", description = "e-Commerce indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String geteCommerce() {
    return eCommerce;
  }

  public void seteCommerce(String eCommerce) {
    this.eCommerce = eCommerce;
  }

  public DebitNetworkPinlessDetails dualIndicator(String dualIndicator) {
    this.dualIndicator = dualIndicator;
    return this;
  }

  /**
   * Dual indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return dualIndicator
  */
  @Size(max = 13) 
  @Schema(name = "dualIndicator", example = "SUPPORTED", description = "Dual indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getDualIndicator() {
    return dualIndicator;
  }

  public void setDualIndicator(String dualIndicator) {
    this.dualIndicator = dualIndicator;
  }

  public DebitNetworkPinlessDetails pinnedPOS(String pinnedPOS) {
    this.pinnedPOS = pinnedPOS;
    return this;
  }

  /**
   * Pinned POS indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported 
   * @return pinnedPOS
  */
  @Size(max = 13) 
  @Schema(name = "pinnedPOS", example = "SUPPORTED", description = "Pinned POS indicator.  Valid Values: * NOT_SUPPORTED - (Default) No / Not Supported * SUPPORTED - Yes / Supported ", required = false)
  public String getPinnedPOS() {
    return pinnedPOS;
  }

  public void setPinnedPOS(String pinnedPOS) {
    this.pinnedPOS = pinnedPOS;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitNetworkPinlessDetails debitNetworkPinlessDetails = (DebitNetworkPinlessDetails) o;
    return Objects.equals(this.debitNetworkId, debitNetworkPinlessDetails.debitNetworkId) &&
        Objects.equals(this.pinlessPOS, debitNetworkPinlessDetails.pinlessPOS) &&
        Objects.equals(this.pinlessBillPay, debitNetworkPinlessDetails.pinlessBillPay) &&
        Objects.equals(this.eCommerce, debitNetworkPinlessDetails.eCommerce) &&
        Objects.equals(this.dualIndicator, debitNetworkPinlessDetails.dualIndicator) &&
        Objects.equals(this.pinnedPOS, debitNetworkPinlessDetails.pinnedPOS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debitNetworkId, pinlessPOS, pinlessBillPay, eCommerce, dualIndicator, pinnedPOS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitNetworkPinlessDetails {\n");
    sb.append("    debitNetworkId: ").append(toIndentedString(debitNetworkId)).append("\n");
    sb.append("    pinlessPOS: ").append(toIndentedString(pinlessPOS)).append("\n");
    sb.append("    pinlessBillPay: ").append(toIndentedString(pinlessBillPay)).append("\n");
    sb.append("    eCommerce: ").append(toIndentedString(eCommerce)).append("\n");
    sb.append("    dualIndicator: ").append(toIndentedString(dualIndicator)).append("\n");
    sb.append("    pinnedPOS: ").append(toIndentedString(pinnedPOS)).append("\n");
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

