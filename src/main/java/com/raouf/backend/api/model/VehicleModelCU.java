package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * VehicleModelCU
 */
@Validated

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

  public VehicleModelCU id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VehicleModelCU modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Get modelName
   * @return modelName
  **/
  @ApiModelProperty(value = "")


  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public VehicleModelCU brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public VehicleModelCU averageFuelConsumption(Integer averageFuelConsumption) {
    this.averageFuelConsumption = averageFuelConsumption;
    return this;
  }

  /**
   * Get averageFuelConsumption
   * @return averageFuelConsumption
  **/
  @ApiModelProperty(value = "")


  public Integer getAverageFuelConsumption() {
    return averageFuelConsumption;
  }

  public void setAverageFuelConsumption(Integer averageFuelConsumption) {
    this.averageFuelConsumption = averageFuelConsumption;
  }

  public VehicleModelCU tankCapacity(Integer tankCapacity) {
    this.tankCapacity = tankCapacity;
    return this;
  }

  /**
   * Get tankCapacity
   * @return tankCapacity
  **/
  @ApiModelProperty(value = "")


  public Integer getTankCapacity() {
    return tankCapacity;
  }

  public void setTankCapacity(Integer tankCapacity) {
    this.tankCapacity = tankCapacity;
  }

  public VehicleModelCU weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public VehicleModelCU maxVelocity(Integer maxVelocity) {
    this.maxVelocity = maxVelocity;
    return this;
  }

  /**
   * Get maxVelocity
   * @return maxVelocity
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxVelocity() {
    return maxVelocity;
  }

  public void setMaxVelocity(Integer maxVelocity) {
    this.maxVelocity = maxVelocity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleModelCU vehicleModelCU = (VehicleModelCU) o;
    return Objects.equals(this.id, vehicleModelCU.id) &&
        Objects.equals(this.modelName, vehicleModelCU.modelName) &&
        Objects.equals(this.brand, vehicleModelCU.brand) &&
        Objects.equals(this.averageFuelConsumption, vehicleModelCU.averageFuelConsumption) &&
        Objects.equals(this.tankCapacity, vehicleModelCU.tankCapacity) &&
        Objects.equals(this.weight, vehicleModelCU.weight) &&
        Objects.equals(this.maxVelocity, vehicleModelCU.maxVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modelName, brand, averageFuelConsumption, tankCapacity, weight, maxVelocity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleModelCU {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    averageFuelConsumption: ").append(toIndentedString(averageFuelConsumption)).append("\n");
    sb.append("    tankCapacity: ").append(toIndentedString(tankCapacity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    maxVelocity: ").append(toIndentedString(maxVelocity)).append("\n");
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

