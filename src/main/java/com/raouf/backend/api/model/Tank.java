package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Tank
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tank   {
  @JsonProperty("totalCapacity")
  private String totalCapacity = null;

  @JsonProperty("currentQuantity")
  private String currentQuantity = null;

  public Tank totalCapacity(String totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

}

