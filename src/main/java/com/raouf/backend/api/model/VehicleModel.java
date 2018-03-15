package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * VehicleModel
 */
@Validated

@Data
public class VehicleModel  extends  VehicleModelCU {
  @JsonProperty("id")
  private Long id = null;
}

