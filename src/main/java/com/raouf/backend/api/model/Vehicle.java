package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Vehicle
 */
@Validated

@Data
public class Vehicle extends VehicleCU  {
  @JsonProperty("vehicleId")
  private Long vehicleId = null;
}

