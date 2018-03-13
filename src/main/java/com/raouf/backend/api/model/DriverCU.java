package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * DriverCU
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverCU   {
  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("lastname")
  private String lastname = null;

  @JsonProperty("mail")
  private String mail = null;

  @JsonProperty("phone")
  private Integer phone = null;

  @JsonProperty("address")
  private Address address = null;

}

