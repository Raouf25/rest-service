package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Vehicle
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle   {
  @JsonProperty("vehicleId")
  private Long vehicleId = null;
  @JsonProperty("model")
  private VehicleModel model = null;

  @JsonProperty("vehicleInfo")
  private VehicleInfo vehicleInfo = null;
}

