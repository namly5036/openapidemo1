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
 * Terminal or software feature information.
 */

@Schema(name = "PosFeatures", description = "Terminal or software feature information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class PosFeatures {

  @JsonProperty("hostProcessingPlatform")
  private String hostProcessingPlatform;

  @JsonProperty("messageFormatSupport")
  private String messageFormatSupport;

  @JsonProperty("emvSupport")
  private String emvSupport;

  @JsonProperty("peripheralInformation1")
  private String peripheralInformation1;

  @JsonProperty("peripheralInformation2")
  private String peripheralInformation2;

  @JsonProperty("communicationInformation1")
  private String communicationInformation1;

  @JsonProperty("communicationInformation2")
  private String communicationInformation2;

  @JsonProperty("industryInformation1")
  private String industryInformation1;

  @JsonProperty("industryInformation2")
  private String industryInformation2;

  @JsonProperty("classAndComplianceCertification")
  private String classAndComplianceCertification;

  @JsonProperty("otherCapabilities")
  private String otherCapabilities;

  @JsonProperty("cardCaptureCapability")
  private Boolean cardCaptureCapability;

  @JsonProperty("pinAuthenticationCapability")
  private String pinAuthenticationCapability;

  @JsonProperty("authenticationCapability")
  private String authenticationCapability;

  @JsonProperty("taxPromptCapability")
  private String taxPromptCapability;

  @JsonProperty("terminalEntryCapability")
  private String terminalEntryCapability;

  @JsonProperty("PINcaptureCapability")
  private String piNcaptureCapability;

  public PosFeatures hostProcessingPlatform(String hostProcessingPlatform) {
    this.hostProcessingPlatform = hostProcessingPlatform;
    return this;
  }

  /**
   * Indicates which system is being used by the payment application and to what extent it is being used.
   * @return hostProcessingPlatform
  */
  
  @Schema(name = "hostProcessingPlatform", example = "TAS", description = "Indicates which system is being used by the payment application and to what extent it is being used.", required = false)
  public String getHostProcessingPlatform() {
    return hostProcessingPlatform;
  }

  public void setHostProcessingPlatform(String hostProcessingPlatform) {
    this.hostProcessingPlatform = hostProcessingPlatform;
  }

  public PosFeatures messageFormatSupport(String messageFormatSupport) {
    this.messageFormatSupport = messageFormatSupport;
    return this;
  }

  /**
   * Indicates which message format the application uses to communicate with the Chase merchant services PNS Host.
   * @return messageFormatSupport
  */
  
  @Schema(name = "messageFormatSupport", description = "Indicates which message format the application uses to communicate with the Chase merchant services PNS Host.", required = false)
  public String getMessageFormatSupport() {
    return messageFormatSupport;
  }

  public void setMessageFormatSupport(String messageFormatSupport) {
    this.messageFormatSupport = messageFormatSupport;
  }

  public PosFeatures emvSupport(String emvSupport) {
    this.emvSupport = emvSupport;
    return this;
  }

  /**
   * Indicates the payment brands supported by the application for EMV processing. Required for any application that supports EMV processing.
   * @return emvSupport
  */
  
  @Schema(name = "emvSupport", description = "Indicates the payment brands supported by the application for EMV processing. Required for any application that supports EMV processing.", required = false)
  public String getEmvSupport() {
    return emvSupport;
  }

  public void setEmvSupport(String emvSupport) {
    this.emvSupport = emvSupport;
  }

  public PosFeatures peripheralInformation1(String peripheralInformation1) {
    this.peripheralInformation1 = peripheralInformation1;
    return this;
  }

  /**
   * Indicates the type of peripheral device attached to or being used by the payment application or point of sale device. Only the highest level of support should be indicated unless multiple devices are attached.
   * @return peripheralInformation1
  */
  
  @Schema(name = "peripheralInformation1", description = "Indicates the type of peripheral device attached to or being used by the payment application or point of sale device. Only the highest level of support should be indicated unless multiple devices are attached.", required = false)
  public String getPeripheralInformation1() {
    return peripheralInformation1;
  }

  public void setPeripheralInformation1(String peripheralInformation1) {
    this.peripheralInformation1 = peripheralInformation1;
  }

  public PosFeatures peripheralInformation2(String peripheralInformation2) {
    this.peripheralInformation2 = peripheralInformation2;
    return this;
  }

  /**
   * Reserved for future use.
   * @return peripheralInformation2
  */
  
  @Schema(name = "peripheralInformation2", description = "Reserved for future use.", required = false)
  public String getPeripheralInformation2() {
    return peripheralInformation2;
  }

  public void setPeripheralInformation2(String peripheralInformation2) {
    this.peripheralInformation2 = peripheralInformation2;
  }

  public PosFeatures communicationInformation1(String communicationInformation1) {
    this.communicationInformation1 = communicationInformation1;
    return this;
  }

  /**
   * Indicates the methods of communication supported by the payment application. It is possible for an application to support more than one type of communication at a time.
   * @return communicationInformation1
  */
  
  @Schema(name = "communicationInformation1", example = "DIAL", description = "Indicates the methods of communication supported by the payment application. It is possible for an application to support more than one type of communication at a time.", required = false)
  public String getCommunicationInformation1() {
    return communicationInformation1;
  }

  public void setCommunicationInformation1(String communicationInformation1) {
    this.communicationInformation1 = communicationInformation1;
  }

  public PosFeatures communicationInformation2(String communicationInformation2) {
    this.communicationInformation2 = communicationInformation2;
    return this;
  }

  /**
   * Reserved for future use.
   * @return communicationInformation2
  */
  
  @Schema(name = "communicationInformation2", description = "Reserved for future use.", required = false)
  public String getCommunicationInformation2() {
    return communicationInformation2;
  }

  public void setCommunicationInformation2(String communicationInformation2) {
    this.communicationInformation2 = communicationInformation2;
  }

  public PosFeatures industryInformation1(String industryInformation1) {
    this.industryInformation1 = industryInformation1;
    return this;
  }

  /**
   * Indicates the industries supported by the payment application. More than one industry can be indicated.
   * @return industryInformation1
  */
  
  @Schema(name = "industryInformation1", description = "Indicates the industries supported by the payment application. More than one industry can be indicated.", required = false)
  public String getIndustryInformation1() {
    return industryInformation1;
  }

  public void setIndustryInformation1(String industryInformation1) {
    this.industryInformation1 = industryInformation1;
  }

  public PosFeatures industryInformation2(String industryInformation2) {
    this.industryInformation2 = industryInformation2;
    return this;
  }

  /**
   * Reserved for future use.
   * @return industryInformation2
  */
  
  @Schema(name = "industryInformation2", description = "Reserved for future use.", required = false)
  public String getIndustryInformation2() {
    return industryInformation2;
  }

  public void setIndustryInformation2(String industryInformation2) {
    this.industryInformation2 = industryInformation2;
  }

  public PosFeatures classAndComplianceCertification(String classAndComplianceCertification) {
    this.classAndComplianceCertification = classAndComplianceCertification;
    return this;
  }

  /**
   * Indicates the type of application or device sending the transaction, Class A or Class B.
   * @return classAndComplianceCertification
  */
  
  @Schema(name = "classAndComplianceCertification", example = "A", description = "Indicates the type of application or device sending the transaction, Class A or Class B.", required = false)
  public String getClassAndComplianceCertification() {
    return classAndComplianceCertification;
  }

  public void setClassAndComplianceCertification(String classAndComplianceCertification) {
    this.classAndComplianceCertification = classAndComplianceCertification;
  }

  public PosFeatures otherCapabilities(String otherCapabilities) {
    this.otherCapabilities = otherCapabilities;
    return this;
  }

  /**
   * Indicates whether the transaction originated from a mobile device that uses Chase merchant services’ mobile payment gateway or originated from a device that does not use Chase merchant services’ Mobile Payment Gateway. Note: It is required for merchants to send the appropriate information in this element in the case where a mobile terminal is supported.
   * @return otherCapabilities
  */
  
  @Schema(name = "otherCapabilities", description = "Indicates whether the transaction originated from a mobile device that uses Chase merchant services’ mobile payment gateway or originated from a device that does not use Chase merchant services’ Mobile Payment Gateway. Note: It is required for merchants to send the appropriate information in this element in the case where a mobile terminal is supported.", required = false)
  public String getOtherCapabilities() {
    return otherCapabilities;
  }

  public void setOtherCapabilities(String otherCapabilities) {
    this.otherCapabilities = otherCapabilities;
  }

  public PosFeatures cardCaptureCapability(Boolean cardCaptureCapability) {
    this.cardCaptureCapability = cardCaptureCapability;
    return this;
  }

  /**
   * Identifies if the terminal is able to capture the card data.
   * @return cardCaptureCapability
  */
  
  @Schema(name = "cardCaptureCapability", example = "true", description = "Identifies if the terminal is able to capture the card data.", required = false)
  public Boolean getCardCaptureCapability() {
    return cardCaptureCapability;
  }

  public void setCardCaptureCapability(Boolean cardCaptureCapability) {
    this.cardCaptureCapability = cardCaptureCapability;
  }

  public PosFeatures pinAuthenticationCapability(String pinAuthenticationCapability) {
    this.pinAuthenticationCapability = pinAuthenticationCapability;
    return this;
  }

  /**
   * PIN entry capability of the Point of Sale.  Valid Values: * UNSPECIFIED * CAN_ACCEPT_PIN * CANNOT_ACCEPT_PIN * PIN_PAD_IS_DOWN * PIN_VERIFIED_BY_TERMINAL 
   * @return pinAuthenticationCapability
  */
  @Size(max = 25) 
  @Schema(name = "pinAuthenticationCapability", example = "CAN_ACCEPT_PIN", description = "PIN entry capability of the Point of Sale.  Valid Values: * UNSPECIFIED * CAN_ACCEPT_PIN * CANNOT_ACCEPT_PIN * PIN_PAD_IS_DOWN * PIN_VERIFIED_BY_TERMINAL ", required = false)
  public String getPinAuthenticationCapability() {
    return pinAuthenticationCapability;
  }

  public void setPinAuthenticationCapability(String pinAuthenticationCapability) {
    this.pinAuthenticationCapability = pinAuthenticationCapability;
  }

  public PosFeatures authenticationCapability(String authenticationCapability) {
    this.authenticationCapability = authenticationCapability;
    return this;
  }

  /**
   * Identifies the terminals capability to authenticate  the cardholder.  Valid Values: * UNSPECIFIED * NONE * PIN * ELECTRONIC_SIGNATURE * INOPERATIVE * OTHER 
   * @return authenticationCapability
  */
  @Size(max = 50) 
  @Schema(name = "authenticationCapability", example = "UNSPECIFIED", description = "Identifies the terminals capability to authenticate  the cardholder.  Valid Values: * UNSPECIFIED * NONE * PIN * ELECTRONIC_SIGNATURE * INOPERATIVE * OTHER ", required = false)
  public String getAuthenticationCapability() {
    return authenticationCapability;
  }

  public void setAuthenticationCapability(String authenticationCapability) {
    this.authenticationCapability = authenticationCapability;
  }

  public PosFeatures taxPromptCapability(String taxPromptCapability) {
    this.taxPromptCapability = taxPromptCapability;
    return this;
  }

  /**
   * This field indicates the capability of the terminal to prompt for the Tax Amount, and then handle the Commercial card type in the response message.  Valid Values: * CAPABLE * NOT_CAPABLE 
   * @return taxPromptCapability
  */
  @Size(max = 25) 
  @Schema(name = "taxPromptCapability", example = "CAPABLE", description = "This field indicates the capability of the terminal to prompt for the Tax Amount, and then handle the Commercial card type in the response message.  Valid Values: * CAPABLE * NOT_CAPABLE ", required = false)
  public String getTaxPromptCapability() {
    return taxPromptCapability;
  }

  public void setTaxPromptCapability(String taxPromptCapability) {
    this.taxPromptCapability = taxPromptCapability;
  }

  public PosFeatures terminalEntryCapability(String terminalEntryCapability) {
    this.terminalEntryCapability = terminalEntryCapability;
    return this;
  }

  /**
   * Identifies how data can be entered in the terminal or software.  Valid Values: * UNSPECIFIED - Default * ECOMMERCE - E-commerce no terminal used * MAG_STRIPE_ONLY - Track read only * MAG_STRIPE_MANUAL - Track read or manual key * MAG_STRIPE_MANUAL_CHIP - Track read, manual key or chip * BARCODE - Barcode scan * CONTACTLESS - Contactless integrated circuit read * OCR - Opitcal character reader * CHIP_ONLY - Chip only * CHIP_MAG_STRIPE - Chip with track fallback * MANUAL_ONLY - Manual key only * CONTACTLESS_MAG_STRIPE - Contactless or track read * HYBRID - Hybrid entry mode\" 
   * @return terminalEntryCapability
  */
  @Size(max = 28) 
  @Schema(name = "terminalEntryCapability", example = "CHIP_ONLY", description = "Identifies how data can be entered in the terminal or software.  Valid Values: * UNSPECIFIED - Default * ECOMMERCE - E-commerce no terminal used * MAG_STRIPE_ONLY - Track read only * MAG_STRIPE_MANUAL - Track read or manual key * MAG_STRIPE_MANUAL_CHIP - Track read, manual key or chip * BARCODE - Barcode scan * CONTACTLESS - Contactless integrated circuit read * OCR - Opitcal character reader * CHIP_ONLY - Chip only * CHIP_MAG_STRIPE - Chip with track fallback * MANUAL_ONLY - Manual key only * CONTACTLESS_MAG_STRIPE - Contactless or track read * HYBRID - Hybrid entry mode\" ", required = false)
  public String getTerminalEntryCapability() {
    return terminalEntryCapability;
  }

  public void setTerminalEntryCapability(String terminalEntryCapability) {
    this.terminalEntryCapability = terminalEntryCapability;
  }

  public PosFeatures piNcaptureCapability(String piNcaptureCapability) {
    this.piNcaptureCapability = piNcaptureCapability;
    return this;
  }

  /**
   * Identifies the terminals capability to caputer a PIN.  Valid Values: * UNSPECIFIED - Default * PIN_4 - PIN capability 4 characters maximum * PIN_5 - PIN capture capability 5 characters maximum * PIN_6 - PIN capture capability 6 characters maximum * PIN_7 - PIN capture capability 7 characters maximum * PIN_8 - PIN capture capability 8 characters maximum * PIN_9 - PIN capture capability 9 characters maximum * PIN_10 - PIN capture capability 10 characters maximum * PIN_11 - PIN capture capability 11 characters maximum * PIN_12 - PIN capture capability 12 characters maximum * NONE 
   * @return piNcaptureCapability
  */
  @Size(max = 50) 
  @Schema(name = "PINcaptureCapability", example = "UNSPECIFIED", description = "Identifies the terminals capability to caputer a PIN.  Valid Values: * UNSPECIFIED - Default * PIN_4 - PIN capability 4 characters maximum * PIN_5 - PIN capture capability 5 characters maximum * PIN_6 - PIN capture capability 6 characters maximum * PIN_7 - PIN capture capability 7 characters maximum * PIN_8 - PIN capture capability 8 characters maximum * PIN_9 - PIN capture capability 9 characters maximum * PIN_10 - PIN capture capability 10 characters maximum * PIN_11 - PIN capture capability 11 characters maximum * PIN_12 - PIN capture capability 12 characters maximum * NONE ", required = false)
  public String getPiNcaptureCapability() {
    return piNcaptureCapability;
  }

  public void setPiNcaptureCapability(String piNcaptureCapability) {
    this.piNcaptureCapability = piNcaptureCapability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosFeatures posFeatures = (PosFeatures) o;
    return Objects.equals(this.hostProcessingPlatform, posFeatures.hostProcessingPlatform) &&
        Objects.equals(this.messageFormatSupport, posFeatures.messageFormatSupport) &&
        Objects.equals(this.emvSupport, posFeatures.emvSupport) &&
        Objects.equals(this.peripheralInformation1, posFeatures.peripheralInformation1) &&
        Objects.equals(this.peripheralInformation2, posFeatures.peripheralInformation2) &&
        Objects.equals(this.communicationInformation1, posFeatures.communicationInformation1) &&
        Objects.equals(this.communicationInformation2, posFeatures.communicationInformation2) &&
        Objects.equals(this.industryInformation1, posFeatures.industryInformation1) &&
        Objects.equals(this.industryInformation2, posFeatures.industryInformation2) &&
        Objects.equals(this.classAndComplianceCertification, posFeatures.classAndComplianceCertification) &&
        Objects.equals(this.otherCapabilities, posFeatures.otherCapabilities) &&
        Objects.equals(this.cardCaptureCapability, posFeatures.cardCaptureCapability) &&
        Objects.equals(this.pinAuthenticationCapability, posFeatures.pinAuthenticationCapability) &&
        Objects.equals(this.authenticationCapability, posFeatures.authenticationCapability) &&
        Objects.equals(this.taxPromptCapability, posFeatures.taxPromptCapability) &&
        Objects.equals(this.terminalEntryCapability, posFeatures.terminalEntryCapability) &&
        Objects.equals(this.piNcaptureCapability, posFeatures.piNcaptureCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostProcessingPlatform, messageFormatSupport, emvSupport, peripheralInformation1, peripheralInformation2, communicationInformation1, communicationInformation2, industryInformation1, industryInformation2, classAndComplianceCertification, otherCapabilities, cardCaptureCapability, pinAuthenticationCapability, authenticationCapability, taxPromptCapability, terminalEntryCapability, piNcaptureCapability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosFeatures {\n");
    sb.append("    hostProcessingPlatform: ").append(toIndentedString(hostProcessingPlatform)).append("\n");
    sb.append("    messageFormatSupport: ").append(toIndentedString(messageFormatSupport)).append("\n");
    sb.append("    emvSupport: ").append(toIndentedString(emvSupport)).append("\n");
    sb.append("    peripheralInformation1: ").append(toIndentedString(peripheralInformation1)).append("\n");
    sb.append("    peripheralInformation2: ").append(toIndentedString(peripheralInformation2)).append("\n");
    sb.append("    communicationInformation1: ").append(toIndentedString(communicationInformation1)).append("\n");
    sb.append("    communicationInformation2: ").append(toIndentedString(communicationInformation2)).append("\n");
    sb.append("    industryInformation1: ").append(toIndentedString(industryInformation1)).append("\n");
    sb.append("    industryInformation2: ").append(toIndentedString(industryInformation2)).append("\n");
    sb.append("    classAndComplianceCertification: ").append(toIndentedString(classAndComplianceCertification)).append("\n");
    sb.append("    otherCapabilities: ").append(toIndentedString(otherCapabilities)).append("\n");
    sb.append("    cardCaptureCapability: ").append(toIndentedString(cardCaptureCapability)).append("\n");
    sb.append("    pinAuthenticationCapability: ").append(toIndentedString(pinAuthenticationCapability)).append("\n");
    sb.append("    authenticationCapability: ").append(toIndentedString(authenticationCapability)).append("\n");
    sb.append("    taxPromptCapability: ").append(toIndentedString(taxPromptCapability)).append("\n");
    sb.append("    terminalEntryCapability: ").append(toIndentedString(terminalEntryCapability)).append("\n");
    sb.append("    piNcaptureCapability: ").append(toIndentedString(piNcaptureCapability)).append("\n");
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

