package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Error400
 */
@Validated

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Error400   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("message")
  private String message = null;

}

