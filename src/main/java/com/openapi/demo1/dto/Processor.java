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
 * Identifies the card processor.
 */

@Schema(name = "Processor", description = "Identifies the card processor.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class Processor {

  @JsonProperty("processorName")
  private String processorName;

  @JsonProperty("processingPlatform")
  private String processingPlatform;

  @JsonProperty("priority")
  private String priority;

  public Processor processorName(String processorName) {
    this.processorName = processorName;
    return this;
  }

  /**
   * Identifies the payment processor.  Valid Values: * FISERV * CHASE 
   * @return processorName
  */
  @Size(max = 256) 
  @Schema(name = "processorName", description = "Identifies the payment processor.  Valid Values: * FISERV * CHASE ", required = false)
  public String getProcessorName() {
    return processorName;
  }

  public void setProcessorName(String processorName) {
    this.processorName = processorName;
  }

  public Processor processingPlatform(String processingPlatform) {
    this.processingPlatform = processingPlatform;
    return this;
  }

  /**
   * Identifies the payment platform of the processor.  Valid Values: * NASHVILLE * TAMPA * SALEM 
   * @return processingPlatform
  */
  @Size(max = 256) 
  @Schema(name = "processingPlatform", description = "Identifies the payment platform of the processor.  Valid Values: * NASHVILLE * TAMPA * SALEM ", required = false)
  public String getProcessingPlatform() {
    return processingPlatform;
  }

  public void setProcessingPlatform(String processingPlatform) {
    this.processingPlatform = processingPlatform;
  }

  public Processor priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Identifies the priority to use each processor.  Valid Values: * PRIMARY * SECONDARY 
   * @return priority
  */
  @Size(max = 256) 
  @Schema(name = "priority", description = "Identifies the priority to use each processor.  Valid Values: * PRIMARY * SECONDARY ", required = false)
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor processor = (Processor) o;
    return Objects.equals(this.processorName, processor.processorName) &&
        Objects.equals(this.processingPlatform, processor.processingPlatform) &&
        Objects.equals(this.priority, processor.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorName, processingPlatform, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor {\n");
    sb.append("    processorName: ").append(toIndentedString(processorName)).append("\n");
    sb.append("    processingPlatform: ").append(toIndentedString(processingPlatform)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

