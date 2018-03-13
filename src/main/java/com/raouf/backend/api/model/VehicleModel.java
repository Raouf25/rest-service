package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * VehicleModel
 */
@Validated

public class VehicleModel   {
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

  public VehicleModel id(Long id) {
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

  public VehicleModel modelName(String modelName) {
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

  public VehicleModel brand(String brand) {
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

  public VehicleModel averageFuelConsumption(Integer averageFuelConsumption) {
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

  public VehicleModel tankCapacity(Integer tankCapacity) {
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

  public VehicleModel weight(Integer weight) {
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

  public VehicleModel maxVelocity(Integer maxVelocity) {
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
    VehicleModel vehicleModel = (VehicleModel) o;
    return Objects.equals(this.id, vehicleModel.id) &&
        Objects.equals(this.modelName, vehicleModel.modelName) &&
        Objects.equals(this.brand, vehicleModel.brand) &&
        Objects.equals(this.averageFuelConsumption, vehicleModel.averageFuelConsumption) &&
        Objects.equals(this.tankCapacity, vehicleModel.tankCapacity) &&
        Objects.equals(this.weight, vehicleModel.weight) &&
        Objects.equals(this.maxVelocity, vehicleModel.maxVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modelName, brand, averageFuelConsumption, tankCapacity, weight, maxVelocity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleModel {\n");
    
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

