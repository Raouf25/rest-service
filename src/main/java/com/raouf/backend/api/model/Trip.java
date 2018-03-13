package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Trip
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trip   {
  @JsonProperty("tripId")
  private Long tripId = null;

  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  @JsonProperty("departure")
  private String departure = null;

  @JsonProperty("arrival")
  private String arrival = null;

  @JsonProperty("distance")
  private BigDecimal distance = null;

  @JsonProperty("trafficTime")
  private BigDecimal trafficTime = null;

  @JsonProperty("departureDate")
  private LocalDate departureDate = null;

  @JsonProperty("arrivalDate")
  private LocalDate arrivalDate = null;

  @JsonProperty("traveledTime")
  private BigDecimal traveledTime = null;

  @JsonProperty("traveledDistance")
  private BigDecimal traveledDistance = null;

}

