package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.SplitTenderMethod;
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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Split-Tender.md\&quot;&gt;Split tender&lt;/a&gt; information passed during a transaction request.
 */

@Schema(name = "SplitTender", description = "<a href=\"../docs?path=docs/Resources/Guides/Split-Tender.md\">Split tender</a> information passed during a transaction request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SplitTender {

  @JsonProperty("splitTenderId")
  private String splitTenderId;

  @JsonProperty("splitTenderMethod")
  @Valid
  private List<SplitTenderMethod> splitTenderMethod = null;

  public SplitTender splitTenderId(String splitTenderId) {
    this.splitTenderId = splitTenderId;
    return this;
  }

  /**
   * A partially-authorized transaction will generate a split tender ID. Subsequent transactions to complete the authorization should include the split tender ID so that all the transactions comprising that authorization can be linked.
   * @return splitTenderId
  */
  @Size(max = 1024) 
  @Schema(name = "splitTenderId", example = "12423434", description = "A partially-authorized transaction will generate a split tender ID. Subsequent transactions to complete the authorization should include the split tender ID so that all the transactions comprising that authorization can be linked.", required = false)
  public String getSplitTenderId() {
    return splitTenderId;
  }

  public void setSplitTenderId(String splitTenderId) {
    this.splitTenderId = splitTenderId;
  }

  public SplitTender splitTenderMethod(List<SplitTenderMethod> splitTenderMethod) {
    this.splitTenderMethod = splitTenderMethod;
    return this;
  }

  public SplitTender addSplitTenderMethodItem(SplitTenderMethod splitTenderMethodItem) {
    if (this.splitTenderMethod == null) {
      this.splitTenderMethod = new ArrayList<>();
    }
    this.splitTenderMethod.add(splitTenderMethodItem);
    return this;
  }

  /**
   * Get splitTenderMethod
   * @return splitTenderMethod
  */
  @Valid 
  @Schema(name = "splitTenderMethod", required = false)
  public List<SplitTenderMethod> getSplitTenderMethod() {
    return splitTenderMethod;
  }

  public void setSplitTenderMethod(List<SplitTenderMethod> splitTenderMethod) {
    this.splitTenderMethod = splitTenderMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTender splitTender = (SplitTender) o;
    return Objects.equals(this.splitTenderId, splitTender.splitTenderId) &&
        Objects.equals(this.splitTenderMethod, splitTender.splitTenderMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitTenderId, splitTenderMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTender {\n");
    sb.append("    splitTenderId: ").append(toIndentedString(splitTenderId)).append("\n");
    sb.append("    splitTenderMethod: ").append(toIndentedString(splitTenderMethod)).append("\n");
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

