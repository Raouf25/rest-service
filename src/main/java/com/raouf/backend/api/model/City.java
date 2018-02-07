package com.raouf.backend.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @NotNull
    @ApiModelProperty(required = true)
    private Long id;
    private String label;
    private String postalCode;
}
