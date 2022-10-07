package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Phone;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Master-Data/Customer-Details.md\&quot;&gt;Customer&lt;/a&gt; specific data.
 */

@Schema(name = "Customer", description = "<a href=\"../docs?path=docs/Resources/Master-Data/Customer-Details.md\">Customer</a> specific data.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Customer {

  @JsonProperty("merchantCustomerId")
  private String merchantCustomerId;

  @JsonProperty("processorCustomerId")
  private String processorCustomerId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("dob")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dob;

  @JsonProperty("email")
  private String email;

  @JsonProperty("ipAddress")
  private String ipAddress;

  @JsonProperty("hostName")
  private String hostName;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("driverLicenseNumber")
  private String driverLicenseNumber;

  @JsonProperty("ssn")
  private String ssn;

  @JsonProperty("phone")
  @Valid
  private List<Phone> phone = null;

  public Customer merchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

  /**
   * Unique customer identifier.
   * @return merchantCustomerId
  */
  @Size(max = 1024) 
  @Schema(name = "merchantCustomerId", example = "234567", description = "Unique customer identifier.", required = false)
  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public Customer processorCustomerId(String processorCustomerId) {
    this.processorCustomerId = processorCustomerId;
    return this;
  }

  /**
   * Unique customer identifier on processor network.
   * @return processorCustomerId
  */
  @Size(max = 1024) 
  @Schema(name = "processorCustomerId", example = "1122334", description = "Unique customer identifier on processor network.", required = false)
  public String getProcessorCustomerId() {
    return processorCustomerId;
  }

  public void setProcessorCustomerId(String processorCustomerId) {
    this.processorCustomerId = processorCustomerId;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Customer first name.
   * @return firstName
  */
  @Size(max = 256) 
  @Schema(name = "firstName", example = "Joe", description = "Customer first name.", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Customer last name.
   * @return lastName
  */
  @Size(max = 256) 
  @Schema(name = "lastName", example = "Smith", description = "Customer last name.", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Customer date of birth in YYYY-MM-DD format.
   * @return dob
  */
  @Valid @Size(max = 10) 
  @Schema(name = "dob", example = "Mon Jan 01 07:00:00 ICT 1990", description = "Customer date of birth in YYYY-MM-DD format.", required = false)
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Customer email address.
   * @return email
  */
  @Size(max = 256) 
  @Schema(name = "email", example = "customer@domain.com", description = "Customer email address.", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The IP address of the customer.
   * @return ipAddress
  */
  @Size(max = 39) 
  @Schema(name = "ipAddress", example = "170.165.02.26", description = "The IP address of the customer.", required = false)
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Customer hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * The name of the server the customer is connected to.
   * @return hostName
  */
  @Size(max = 1024) 
  @Schema(name = "hostName", example = "dreamwave.com", description = "The name of the server the customer is connected to.", required = false)
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Customer locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Language/region code of user in IETF BCP47 format.
   * @return locale
  */
  @Size(max = 256) 
  @Schema(name = "locale", example = "en-US", description = "Language/region code of user in IETF BCP47 format.", required = false)
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Customer driverLicenseNumber(String driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

  /**
   * Customer driver license number, including state.
   * @return driverLicenseNumber
  */
  @Size(max = 256) 
  @Schema(name = "driverLicenseNumber", example = "GA456183789", description = "Customer driver license number, including state.", required = false)
  public String getDriverLicenseNumber() {
    return driverLicenseNumber;
  }

  public void setDriverLicenseNumber(String driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
  }

  public Customer ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Customer SSN or US federal tax ID number (business checks only).
   * @return ssn
  */
  @Size(max = 9) 
  @Schema(name = "ssn", example = "123456789", description = "Customer SSN or US federal tax ID number (business checks only).", required = false)
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Customer phone(List<Phone> phone) {
    this.phone = phone;
    return this;
  }

  public Customer addPhoneItem(Phone phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @Valid 
  @Schema(name = "phone", required = false)
  public List<Phone> getPhone() {
    return phone;
  }

  public void setPhone(List<Phone> phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.merchantCustomerId, customer.merchantCustomerId) &&
        Objects.equals(this.processorCustomerId, customer.processorCustomerId) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.dob, customer.dob) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.ipAddress, customer.ipAddress) &&
        Objects.equals(this.hostName, customer.hostName) &&
        Objects.equals(this.locale, customer.locale) &&
        Objects.equals(this.driverLicenseNumber, customer.driverLicenseNumber) &&
        Objects.equals(this.ssn, customer.ssn) &&
        Objects.equals(this.phone, customer.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCustomerId, processorCustomerId, firstName, lastName, dob, email, ipAddress, hostName, locale, driverLicenseNumber, ssn, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    processorCustomerId: ").append(toIndentedString(processorCustomerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

