package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Address
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address   {
  @JsonProperty("streetAddress")
  private String streetAddress = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("city")
  private String city = null;

}

