package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Tire
 */
@Validated

public class Tire   {
  @JsonProperty("pressure")
  private BigDecimal pressure = null;

  @JsonProperty("traveledKm")
  private Integer traveledKm = null;

  @JsonProperty("probaOfLeak")
  private BigDecimal probaOfLeak = null;

  public Tire pressure(BigDecimal pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPressure() {
    return pressure;
  }

  public void setPressure(BigDecimal pressure) {
    this.pressure = pressure;
  }

  public Tire traveledKm(Integer traveledKm) {
    this.traveledKm = traveledKm;
    return this;
  }

  /**
   * Get traveledKm
   * @return traveledKm
  **/
  @ApiModelProperty(value = "")


  public Integer getTraveledKm() {
    return traveledKm;
  }

  public void setTraveledKm(Integer traveledKm) {
    this.traveledKm = traveledKm;
  }

  public Tire probaOfLeak(BigDecimal probaOfLeak) {
    this.probaOfLeak = probaOfLeak;
    return this;
  }

  /**
   * Get probaOfLeak
   * @return probaOfLeak
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getProbaOfLeak() {
    return probaOfLeak;
  }

  public void setProbaOfLeak(BigDecimal probaOfLeak) {
    this.probaOfLeak = probaOfLeak;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tire tire = (Tire) o;
    return Objects.equals(this.pressure, tire.pressure) &&
        Objects.equals(this.traveledKm, tire.traveledKm) &&
        Objects.equals(this.probaOfLeak, tire.probaOfLeak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pressure, traveledKm, probaOfLeak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tire {\n");
    
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    traveledKm: ").append(toIndentedString(traveledKm)).append("\n");
    sb.append("    probaOfLeak: ").append(toIndentedString(probaOfLeak)).append("\n");
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

