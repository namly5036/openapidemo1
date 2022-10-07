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
 * &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Resources/Guides/Split-Shipment.md\&quot;&gt;Split shipment&lt;/a&gt; information.
 */

@Schema(name = "SplitShipment", description = "<a href=\"../docs?path=docs/Resources/Guides/Split-Shipment.md\">Split shipment</a> information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class SplitShipment {

  @JsonProperty("totalCount")
  private Integer totalCount;

  @JsonProperty("finalShipment")
  private Boolean finalShipment;

  public SplitShipment totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Identifies the number of shipments if the transaction will contain multiple shipments. Can be set during pre-auth or the first post-auth.
   * maximum: 99
   * @return totalCount
  */
  @Max(99) 
  @Schema(name = "totalCount", example = "5", description = "Identifies the number of shipments if the transaction will contain multiple shipments. Can be set during pre-auth or the first post-auth.", required = false)
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public SplitShipment finalShipment(Boolean finalShipment) {
    this.finalShipment = finalShipment;
    return this;
  }

  /**
   * Identifies the final shipment.
   * @return finalShipment
  */
  
  @Schema(name = "finalShipment", example = "false", description = "Identifies the final shipment.", required = false)
  public Boolean getFinalShipment() {
    return finalShipment;
  }

  public void setFinalShipment(Boolean finalShipment) {
    this.finalShipment = finalShipment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitShipment splitShipment = (SplitShipment) o;
    return Objects.equals(this.totalCount, splitShipment.totalCount) &&
        Objects.equals(this.finalShipment, splitShipment.finalShipment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, finalShipment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitShipment {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    finalShipment: ").append(toIndentedString(finalShipment)).append("\n");
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

