package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Vehicle
 */
@Validated

public class Vehicle   {
  @JsonProperty("model")
  private VehicleModel model = null;

  @JsonProperty("vehicleInfo")
  private VehicleInfo vehicleInfo = null;

  @JsonProperty("vehicleId")
  private Long vehicleId = null;
  public Vehicle model(VehicleModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VehicleModel getModel() {
    return model;
  }

  public void setModel(VehicleModel model) {
    this.model = model;
  }

  public Vehicle vehicleInfo(VehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }

  /**
   * Get vehicleInfo
   * @return vehicleInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }

  public void setVehicleInfo(VehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }

  public Vehicle vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")


  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.vehicleInfo, vehicle.vehicleInfo) &&
        Objects.equals(this.vehicleId, vehicle.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, vehicleInfo, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

