package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * VehicleCU
 */
@Validated

public class VehicleCU   {
  @JsonProperty("model")
  private VehicleModel model = null;

  @JsonProperty("vehicleInfo")
  private VehicleInfo vehicleInfo = null;

  public VehicleCU model(VehicleModel model) {
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

  public VehicleCU vehicleInfo(VehicleInfo vehicleInfo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleCU vehicleCU = (VehicleCU) o;
    return Objects.equals(this.model, vehicleCU.model) &&
        Objects.equals(this.vehicleInfo, vehicleCU.vehicleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, vehicleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleCU {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
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

