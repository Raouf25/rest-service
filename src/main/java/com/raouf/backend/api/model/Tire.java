package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

/**
 * Tire
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tire   {
  @JsonProperty("pressure")
  private BigDecimal pressure = null;

  @JsonProperty("traveledKm")
  private Integer traveledKm = null;

  @JsonProperty("probaOfLeak")
  private BigDecimal probaOfLeak = null;

  public Tire pressure(BigDecimal pressure) {
    this.pressure = pressure;
    return this;
  }

}

