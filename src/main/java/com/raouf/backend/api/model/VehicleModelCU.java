package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * VehicleModelCU
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleModelCU   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("modelName")
  private String modelName = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("averageFuelConsumption")
  private Integer averageFuelConsumption = null;

  @JsonProperty("tankCapacity")
  private Integer tankCapacity = null;

  @JsonProperty("weight")
  private Integer weight = null;

  @JsonProperty("maxVelocity")
  private Integer maxVelocity = null;

 }

