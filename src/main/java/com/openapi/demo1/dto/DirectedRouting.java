package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.openapi.demo1.dto.Processor;
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
 * Used to directly route debit transactions to a specific processing network.
 */

@Schema(name = "DirectedRouting", description = "Used to directly route debit transactions to a specific processing network.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DirectedRouting {

  @JsonProperty("network")
  private String network;

  @JsonProperty("cardFunction")
  private String cardFunction;

  @JsonProperty("processors")
  @Valid
  private List<Processor> processors = null;

  public DirectedRouting network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Identifies the debit card processing network.  Valid Values: * NYCE * PULSE * VISA 
   * @return network
  */
  @Size(max = 16) 
  @Schema(name = "network", example = "VISA", description = "Identifies the debit card processing network.  Valid Values: * NYCE * PULSE * VISA ", required = false)
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public DirectedRouting cardFunction(String cardFunction) {
    this.cardFunction = cardFunction;
    return this;
  }

  /**
   * Identifies if the processing method is CREDIT or DEBIT.
   * @return cardFunction
  */
  @Size(max = 6) 
  @Schema(name = "cardFunction", example = "CREDIT", description = "Identifies if the processing method is CREDIT or DEBIT.", required = false)
  public String getCardFunction() {
    return cardFunction;
  }

  public void setCardFunction(String cardFunction) {
    this.cardFunction = cardFunction;
  }

  public DirectedRouting processors(List<Processor> processors) {
    this.processors = processors;
    return this;
  }

  public DirectedRouting addProcessorsItem(Processor processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<>();
    }
    this.processors.add(processorsItem);
    return this;
  }

  /**
   * Identifies the card processor.
   * @return processors
  */
  @Valid 
  @Schema(name = "processors", description = "Identifies the card processor.", required = false)
  public List<Processor> getProcessors() {
    return processors;
  }

  public void setProcessors(List<Processor> processors) {
    this.processors = processors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectedRouting directedRouting = (DirectedRouting) o;
    return Objects.equals(this.network, directedRouting.network) &&
        Objects.equals(this.cardFunction, directedRouting.cardFunction) &&
        Objects.equals(this.processors, directedRouting.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, cardFunction, processors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectedRouting {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    cardFunction: ").append(toIndentedString(cardFunction)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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

