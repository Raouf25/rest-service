package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * Driver
 */
@Validated

@Data
public class Driver extends DriverCU  {
  @JsonProperty("id")
  private Long id = null;

 }

