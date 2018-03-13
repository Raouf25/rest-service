package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * VehicleInfo
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleInfo   {
  @JsonProperty("vin")
  private String vin = null;

  @JsonProperty("mileage")
  private Long mileage = null;

  @JsonProperty("vKmNextMaintenance")
  private Long vKmNextMaintenance = null;

  @JsonProperty("tank")
  private Tank tank = null;

  @JsonProperty("tire")
  private Tire tire = null;

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.STOPPED;

}

