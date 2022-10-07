package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.AdditionalData;
import com.openapi.demo1.dto.AmountComponents;
import com.openapi.demo1.dto.DeferredPayments;
import com.openapi.demo1.dto.DirectedRouting;
import com.openapi.demo1.dto.Installments;
import com.openapi.demo1.dto.KeyValuePair;
import com.openapi.demo1.dto.PrivateLabel;
import com.openapi.demo1.dto.Recurring;
import com.openapi.demo1.dto.SubMerchant;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Additional-Data.md\&quot;&gt;Common data&lt;/a&gt; passed during a transaction request based on business requirements.
 */

@Schema(name = "AdditionalDataCommon", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Additional-Data.md\">Common data</a> passed during a transaction request based on business requirements.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class AdditionalDataCommon {

  @JsonProperty("additionalData")
  private AdditionalData additionalData;

  @JsonProperty("amountComponents")
  private AmountComponents amountComponents;

  @JsonProperty("directedRouting")
  private DirectedRouting directedRouting;

  @JsonProperty("subMerchant")
  private SubMerchant subMerchant;

  @JsonProperty("installments")
  private Installments installments;

  @JsonProperty("privateLabel")
  private PrivateLabel privateLabel;

  @JsonProperty("customFields")
  @Valid
  private List<KeyValuePair> customFields = null;

  @JsonProperty("deferredPayments")
  private DeferredPayments deferredPayments;

  @JsonProperty("billPaymentType")
  private String billPaymentType;

  @JsonProperty("recurring")
  private Recurring recurring;

  public AdditionalDataCommon additionalData(AdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
  */
  @Valid 
  @Schema(name = "additionalData", required = false)
  public AdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(AdditionalData additionalData) {
    this.additionalData = additionalData;
  }

  public AdditionalDataCommon amountComponents(AmountComponents amountComponents) {
    this.amountComponents = amountComponents;
    return this;
  }

  /**
   * Get amountComponents
   * @return amountComponents
  */
  @Valid 
  @Schema(name = "amountComponents", required = false)
  public AmountComponents getAmountComponents() {
    return amountComponents;
  }

  public void setAmountComponents(AmountComponents amountComponents) {
    this.amountComponents = amountComponents;
  }

  public AdditionalDataCommon directedRouting(DirectedRouting directedRouting) {
    this.directedRouting = directedRouting;
    return this;
  }

  /**
   * Get directedRouting
   * @return directedRouting
  */
  @Valid 
  @Schema(name = "directedRouting", required = false)
  public DirectedRouting getDirectedRouting() {
    return directedRouting;
  }

  public void setDirectedRouting(DirectedRouting directedRouting) {
    this.directedRouting = directedRouting;
  }

  public AdditionalDataCommon subMerchant(SubMerchant subMerchant) {
    this.subMerchant = subMerchant;
    return this;
  }

  /**
   * Get subMerchant
   * @return subMerchant
  */
  @Valid 
  @Schema(name = "subMerchant", required = false)
  public SubMerchant getSubMerchant() {
    return subMerchant;
  }

  public void setSubMerchant(SubMerchant subMerchant) {
    this.subMerchant = subMerchant;
  }

  public AdditionalDataCommon installments(Installments installments) {
    this.installments = installments;
    return this;
  }

  /**
   * Get installments
   * @return installments
  */
  @Valid 
  @Schema(name = "installments", required = false)
  public Installments getInstallments() {
    return installments;
  }

  public void setInstallments(Installments installments) {
    this.installments = installments;
  }

  public AdditionalDataCommon privateLabel(PrivateLabel privateLabel) {
    this.privateLabel = privateLabel;
    return this;
  }

  /**
   * Get privateLabel
   * @return privateLabel
  */
  @Valid 
  @Schema(name = "privateLabel", required = false)
  public PrivateLabel getPrivateLabel() {
    return privateLabel;
  }

  public void setPrivateLabel(PrivateLabel privateLabel) {
    this.privateLabel = privateLabel;
  }

  public AdditionalDataCommon customFields(List<KeyValuePair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public AdditionalDataCommon addCustomFieldsItem(KeyValuePair customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Used to submit merchant custom values.
   * @return customFields
  */
  @Valid 
  @Schema(name = "customFields", description = "Used to submit merchant custom values.", required = false)
  public List<KeyValuePair> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<KeyValuePair> customFields) {
    this.customFields = customFields;
  }

  public AdditionalDataCommon deferredPayments(DeferredPayments deferredPayments) {
    this.deferredPayments = deferredPayments;
    return this;
  }

  /**
   * Get deferredPayments
   * @return deferredPayments
  */
  @Valid 
  @Schema(name = "deferredPayments", required = false)
  public DeferredPayments getDeferredPayments() {
    return deferredPayments;
  }

  public void setDeferredPayments(DeferredPayments deferredPayments) {
    this.deferredPayments = deferredPayments;
  }

  public AdditionalDataCommon billPaymentType(String billPaymentType) {
    this.billPaymentType = billPaymentType;
    return this;
  }

  /**
   * Indicates the type of bill payment.  Valid Values: * SINGLE - Single charge not for recurring services or installment plan. * RECURRING - Agreement where charges will occur on a periodic basis. * INSTALLMENT - Single purchase where the cardholder is billed (charged) in installments. * DEFERRED - A charge for an order with a delayed payment for a specified amount of time. 
   * @return billPaymentType
  */
  @Size(max = 11) 
  @Schema(name = "billPaymentType", example = "RECURRING", description = "Indicates the type of bill payment.  Valid Values: * SINGLE - Single charge not for recurring services or installment plan. * RECURRING - Agreement where charges will occur on a periodic basis. * INSTALLMENT - Single purchase where the cardholder is billed (charged) in installments. * DEFERRED - A charge for an order with a delayed payment for a specified amount of time. ", required = false)
  public String getBillPaymentType() {
    return billPaymentType;
  }

  public void setBillPaymentType(String billPaymentType) {
    this.billPaymentType = billPaymentType;
  }

  public AdditionalDataCommon recurring(Recurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   * @return recurring
  */
  @Valid 
  @Schema(name = "recurring", required = false)
  public Recurring getRecurring() {
    return recurring;
  }

  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataCommon additionalDataCommon = (AdditionalDataCommon) o;
    return Objects.equals(this.additionalData, additionalDataCommon.additionalData) &&
        Objects.equals(this.amountComponents, additionalDataCommon.amountComponents) &&
        Objects.equals(this.directedRouting, additionalDataCommon.directedRouting) &&
        Objects.equals(this.subMerchant, additionalDataCommon.subMerchant) &&
        Objects.equals(this.installments, additionalDataCommon.installments) &&
        Objects.equals(this.privateLabel, additionalDataCommon.privateLabel) &&
        Objects.equals(this.customFields, additionalDataCommon.customFields) &&
        Objects.equals(this.deferredPayments, additionalDataCommon.deferredPayments) &&
        Objects.equals(this.billPaymentType, additionalDataCommon.billPaymentType) &&
        Objects.equals(this.recurring, additionalDataCommon.recurring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, amountComponents, directedRouting, subMerchant, installments, privateLabel, customFields, deferredPayments, billPaymentType, recurring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataCommon {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amountComponents: ").append(toIndentedString(amountComponents)).append("\n");
    sb.append("    directedRouting: ").append(toIndentedString(directedRouting)).append("\n");
    sb.append("    subMerchant: ").append(toIndentedString(subMerchant)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    privateLabel: ").append(toIndentedString(privateLabel)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    deferredPayments: ").append(toIndentedString(deferredPayments)).append("\n");
    sb.append("    billPaymentType: ").append(toIndentedString(billPaymentType)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
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

