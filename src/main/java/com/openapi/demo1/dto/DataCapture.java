package com.openapi.demo1.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Data capture details.
 */

@Schema(name = "DataCapture", description = "Data capture details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public class DataCapture {

  @JsonProperty("rawData")
  private String rawData;

  @JsonProperty("dataEventId")
  private String dataEventId;

  @JsonProperty("captureTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime captureTime;

  public DataCapture rawData(String rawData) {
    this.rawData = rawData;
    return this;
  }

  /**
   * Raw data from the data capture.
   * @return rawData
  */
  @Size(max = 256) 
  @Schema(name = "rawData", example = "aaaaaXREUVZGRlFY...aMV", description = "Raw data from the data capture.", required = false)
  public String getRawData() {
    return rawData;
  }

  public void setRawData(String rawData) {
    this.rawData = rawData;
  }

  public DataCapture dataEventId(String dataEventId) {
    this.dataEventId = dataEventId;
    return this;
  }

  /**
   * Unique ID for the data capture.
   * @return dataEventId
  */
  @Size(max = 256) 
  @Schema(name = "dataEventId", example = "BB8E4E92...Fz1E063113", description = "Unique ID for the data capture.", required = false)
  public String getDataEventId() {
    return dataEventId;
  }

  public void setDataEventId(String dataEventId) {
    this.dataEventId = dataEventId;
  }

  public DataCapture captureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
    return this;
  }

  /**
   * Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ
   * @return captureTime
  */
  @Valid @Size(max = 20) 
  @Schema(name = "captureTime", example = "2016-04-16T16:06:05Z", description = "Timestamp in ISO 8601 format YYYY-MM-DDThh:mm:ssZ", required = false)
  public OffsetDateTime getCaptureTime() {
    return captureTime;
  }

  public void setCaptureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCapture dataCapture = (DataCapture) o;
    return Objects.equals(this.rawData, dataCapture.rawData) &&
        Objects.equals(this.dataEventId, dataCapture.dataEventId) &&
        Objects.equals(this.captureTime, dataCapture.captureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawData, dataEventId, captureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCapture {\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    dataEventId: ").append(toIndentedString(dataEventId)).append("\n");
    sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
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

