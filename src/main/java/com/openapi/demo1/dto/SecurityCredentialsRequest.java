package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.MerchantDetails;
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
 * SecurityCredentialsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SecurityCredentialsRequest {

  @JsonProperty("domains")
  @Valid
  private List<String> domains = null;

  @JsonProperty("publicKeyRequired")
  private Boolean publicKeyRequired;

  @JsonProperty("accessTokenRequired")
  private Boolean accessTokenRequired;

  @JsonProperty("accessTokenTimeToLive")
  private String accessTokenTimeToLive;

  @JsonProperty("responseRedirectURL")
  private String responseRedirectURL;

  @JsonProperty("merchantDetails")
  private MerchantDetails merchantDetails;

  public SecurityCredentialsRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public SecurityCredentialsRequest addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * A whitelist of domains that are applicable for this credentials request.
   * @return domains
  */
  
  @Schema(name = "domains", example = "http://checkout.example.com, http://_*.example.com", description = "A whitelist of domains that are applicable for this credentials request.", required = false)
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public SecurityCredentialsRequest publicKeyRequired(Boolean publicKeyRequired) {
    this.publicKeyRequired = publicKeyRequired;
    return this;
  }

  /**
   * If the signedCert is expired or invalid then merchant would send a request.
   * @return publicKeyRequired
  */
  
  @Schema(name = "publicKeyRequired", example = "true", description = "If the signedCert is expired or invalid then merchant would send a request.", required = false)
  public Boolean getPublicKeyRequired() {
    return publicKeyRequired;
  }

  public void setPublicKeyRequired(Boolean publicKeyRequired) {
    this.publicKeyRequired = publicKeyRequired;
  }

  public SecurityCredentialsRequest accessTokenRequired(Boolean accessTokenRequired) {
    this.accessTokenRequired = accessTokenRequired;
    return this;
  }

  /**
   * If the access token is expired then merchant would request for a new token.
   * @return accessTokenRequired
  */
  
  @Schema(name = "accessTokenRequired", example = "true", description = "If the access token is expired then merchant would request for a new token.", required = false)
  public Boolean getAccessTokenRequired() {
    return accessTokenRequired;
  }

  public void setAccessTokenRequired(Boolean accessTokenRequired) {
    this.accessTokenRequired = accessTokenRequired;
  }

  public SecurityCredentialsRequest accessTokenTimeToLive(String accessTokenTimeToLive) {
    this.accessTokenTimeToLive = accessTokenTimeToLive;
    return this;
  }

  /**
   * Time to live (expiration time) in milliseconds. 1800000 ms, max 30 minutes.
   * @return accessTokenTimeToLive
  */
  
  @Schema(name = "accessTokenTimeToLive", example = "889", description = "Time to live (expiration time) in milliseconds. 1800000 ms, max 30 minutes.", required = false)
  public String getAccessTokenTimeToLive() {
    return accessTokenTimeToLive;
  }

  public void setAccessTokenTimeToLive(String accessTokenTimeToLive) {
    this.accessTokenTimeToLive = accessTokenTimeToLive;
  }

  public SecurityCredentialsRequest responseRedirectURL(String responseRedirectURL) {
    this.responseRedirectURL = responseRedirectURL;
    return this;
  }

  /**
   * Response URL redirect.
   * @return responseRedirectURL
  */
  
  @Schema(name = "responseRedirectURL", example = "https://www.somedomain.com", description = "Response URL redirect.", required = false)
  public String getResponseRedirectURL() {
    return responseRedirectURL;
  }

  public void setResponseRedirectURL(String responseRedirectURL) {
    this.responseRedirectURL = responseRedirectURL;
  }

  public SecurityCredentialsRequest merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  */
  @Valid 
  @Schema(name = "merchantDetails", required = false)
  public MerchantDetails getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityCredentialsRequest securityCredentialsRequest = (SecurityCredentialsRequest) o;
    return Objects.equals(this.domains, securityCredentialsRequest.domains) &&
        Objects.equals(this.publicKeyRequired, securityCredentialsRequest.publicKeyRequired) &&
        Objects.equals(this.accessTokenRequired, securityCredentialsRequest.accessTokenRequired) &&
        Objects.equals(this.accessTokenTimeToLive, securityCredentialsRequest.accessTokenTimeToLive) &&
        Objects.equals(this.responseRedirectURL, securityCredentialsRequest.responseRedirectURL) &&
        Objects.equals(this.merchantDetails, securityCredentialsRequest.merchantDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, publicKeyRequired, accessTokenRequired, accessTokenTimeToLive, responseRedirectURL, merchantDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityCredentialsRequest {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    publicKeyRequired: ").append(toIndentedString(publicKeyRequired)).append("\n");
    sb.append("    accessTokenRequired: ").append(toIndentedString(accessTokenRequired)).append("\n");
    sb.append("    accessTokenTimeToLive: ").append(toIndentedString(accessTokenTimeToLive)).append("\n");
    sb.append("    responseRedirectURL: ").append(toIndentedString(responseRedirectURL)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
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

