package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * VehicleInfo
 */
@Validated

public class VehicleInfo   {
  @JsonProperty("vin")
  private String vin = null;

  @JsonProperty("mileage")
  private Long mileage = null;

  @JsonProperty("vKmNextMaintenance")
  private Long vKmNextMaintenance = null;

  @JsonProperty("tank")
  private Tank tank = null;

  @JsonProperty("tire")
  private Tire tire = null;

  /**
   * The vehicle status to retrieve
   */
  public enum StatusEnum {
    ON_TRIP("on_trip"),
    
    ON_REST("on_rest"),
    
    AT_ARRIVAL("at_arrival"),
    
    TIRE_DOWN("tire_down"),
    
    FUEL_DOWN("fuel_down"),
    
    REPAIR_DOWN_STATE("repair_down_state"),
    
    STOPPED("stopped");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.STOPPED;

  public VehicleInfo vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Get vin
   * @return vin
  **/
  @ApiModelProperty(value = "")


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public VehicleInfo mileage(Long mileage) {
    this.mileage = mileage;
    return this;
  }

  /**
   * Get mileage
   * @return mileage
  **/
  @ApiModelProperty(value = "")


  public Long getMileage() {
    return mileage;
  }

  public void setMileage(Long mileage) {
    this.mileage = mileage;
  }

  public VehicleInfo vKmNextMaintenance(Long vKmNextMaintenance) {
    this.vKmNextMaintenance = vKmNextMaintenance;
    return this;
  }

  /**
   * Get vKmNextMaintenance
   * @return vKmNextMaintenance
  **/
  @ApiModelProperty(value = "")


  public Long getVKmNextMaintenance() {
    return vKmNextMaintenance;
  }

  public void setVKmNextMaintenance(Long vKmNextMaintenance) {
    this.vKmNextMaintenance = vKmNextMaintenance;
  }

  public VehicleInfo tank(Tank tank) {
    this.tank = tank;
    return this;
  }

  /**
   * Get tank
   * @return tank
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Tank getTank() {
    return tank;
  }

  public void setTank(Tank tank) {
    this.tank = tank;
  }

  public VehicleInfo tire(Tire tire) {
    this.tire = tire;
    return this;
  }

  /**
   * Get tire
   * @return tire
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Tire getTire() {
    return tire;
  }

  public void setTire(Tire tire) {
    this.tire = tire;
  }

  public VehicleInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The vehicle status to retrieve
   * @return status
  **/
  @ApiModelProperty(value = "The vehicle status to retrieve")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleInfo vehicleInfo = (VehicleInfo) o;
    return Objects.equals(this.vin, vehicleInfo.vin) &&
        Objects.equals(this.mileage, vehicleInfo.mileage) &&
        Objects.equals(this.vKmNextMaintenance, vehicleInfo.vKmNextMaintenance) &&
        Objects.equals(this.tank, vehicleInfo.tank) &&
        Objects.equals(this.tire, vehicleInfo.tire) &&
        Objects.equals(this.status, vehicleInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vin, mileage, vKmNextMaintenance, tank, tire, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleInfo {\n");
    
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    vKmNextMaintenance: ").append(toIndentedString(vKmNextMaintenance)).append("\n");
    sb.append("    tank: ").append(toIndentedString(tank)).append("\n");
    sb.append("    tire: ").append(toIndentedString(tire)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

