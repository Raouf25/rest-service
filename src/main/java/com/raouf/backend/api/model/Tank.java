package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Tank
 */
@Validated

public class Tank   {
  @JsonProperty("totalCapacity")
  private String totalCapacity = null;

  @JsonProperty("currentQuantity")
  private String currentQuantity = null;

  public Tank totalCapacity(String totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

  /**
   * Get totalCapacity
   * @return totalCapacity
  **/
  @ApiModelProperty(value = "")


  public String getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(String totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public Tank currentQuantity(String currentQuantity) {
    this.currentQuantity = currentQuantity;
    return this;
  }

  /**
   * Get currentQuantity
   * @return currentQuantity
  **/
  @ApiModelProperty(value = "")


  public String getCurrentQuantity() {
    return currentQuantity;
  }

  public void setCurrentQuantity(String currentQuantity) {
    this.currentQuantity = currentQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tank tank = (Tank) o;
    return Objects.equals(this.totalCapacity, tank.totalCapacity) &&
        Objects.equals(this.currentQuantity, tank.currentQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCapacity, currentQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tank {\n");
    
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    currentQuantity: ").append(toIndentedString(currentQuantity)).append("\n");
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

