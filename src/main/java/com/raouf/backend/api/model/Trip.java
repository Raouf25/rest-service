package com.raouf.backend.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Trip
 */
@Validated

public class Trip   {
  @JsonProperty("tripId")
  private Long tripId = null;

  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  @JsonProperty("departure")
  private String departure = null;

  @JsonProperty("arrival")
  private String arrival = null;

  @JsonProperty("distance")
  private BigDecimal distance = null;

  @JsonProperty("trafficTime")
  private BigDecimal trafficTime = null;

  @JsonProperty("departureDate")
  private LocalDate departureDate = null;

  @JsonProperty("arrivalDate")
  private LocalDate arrivalDate = null;

  @JsonProperty("traveledTime")
  private BigDecimal traveledTime = null;

  @JsonProperty("traveledDistance")
  private BigDecimal traveledDistance = null;

  public Trip tripId(Long tripId) {
    this.tripId = tripId;
    return this;
  }

  /**
   * Get tripId
   * @return tripId
  **/
  @ApiModelProperty(value = "")


  public Long getTripId() {
    return tripId;
  }

  public void setTripId(Long tripId) {
    this.tripId = tripId;
  }

  public Trip vehicleId(Long vehicleId) {
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

  public Trip departure(String departure) {
    this.departure = departure;
    return this;
  }

  /**
   * Get departure
   * @return departure
  **/
  @ApiModelProperty(example = "Lille", value = "")


  public String getDeparture() {
    return departure;
  }

  public void setDeparture(String departure) {
    this.departure = departure;
  }

  public Trip arrival(String arrival) {
    this.arrival = arrival;
    return this;
  }

  /**
   * Get arrival
   * @return arrival
  **/
  @ApiModelProperty(example = "Paris", value = "")


  public String getArrival() {
    return arrival;
  }

  public void setArrival(String arrival) {
    this.arrival = arrival;
  }

  public Trip distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "225,5", value = "")

  @Valid

  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public Trip trafficTime(BigDecimal trafficTime) {
    this.trafficTime = trafficTime;
    return this;
  }

  /**
   * 2:51:00 in second
   * @return trafficTime
  **/
  @ApiModelProperty(example = "10260.0", value = "2:51:00 in second")

  @Valid

  public BigDecimal getTrafficTime() {
    return trafficTime;
  }

  public void setTrafficTime(BigDecimal trafficTime) {
    this.trafficTime = trafficTime;
  }

  public Trip departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * the start date of the trip
   * @return departureDate
  **/
  @ApiModelProperty(example = "2017-12-30", value = "the start date of the trip")

  @Valid

  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public Trip arrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * the end date of the trip
   * @return arrivalDate
  **/
  @ApiModelProperty(example = "2017-12-30", value = "the end date of the trip")

  @Valid

  public LocalDate getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public Trip traveledTime(BigDecimal traveledTime) {
    this.traveledTime = traveledTime;
    return this;
  }

  /**
   * 1:30:00 in second
   * @return traveledTime
  **/
  @ApiModelProperty(example = "5400.0", value = "1:30:00 in second")

  @Valid

  public BigDecimal getTraveledTime() {
    return traveledTime;
  }

  public void setTraveledTime(BigDecimal traveledTime) {
    this.traveledTime = traveledTime;
  }

  public Trip traveledDistance(BigDecimal traveledDistance) {
    this.traveledDistance = traveledDistance;
    return this;
  }

  /**
   * Get traveledDistance
   * @return traveledDistance
  **/
  @ApiModelProperty(example = "175,5", value = "")

  @Valid

  public BigDecimal getTraveledDistance() {
    return traveledDistance;
  }

  public void setTraveledDistance(BigDecimal traveledDistance) {
    this.traveledDistance = traveledDistance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(this.tripId, trip.tripId) &&
        Objects.equals(this.vehicleId, trip.vehicleId) &&
        Objects.equals(this.departure, trip.departure) &&
        Objects.equals(this.arrival, trip.arrival) &&
        Objects.equals(this.distance, trip.distance) &&
        Objects.equals(this.trafficTime, trip.trafficTime) &&
        Objects.equals(this.departureDate, trip.departureDate) &&
        Objects.equals(this.arrivalDate, trip.arrivalDate) &&
        Objects.equals(this.traveledTime, trip.traveledTime) &&
        Objects.equals(this.traveledDistance, trip.traveledDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tripId, vehicleId, departure, arrival, distance, trafficTime, departureDate, arrivalDate, traveledTime, traveledDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    
    sb.append("    tripId: ").append(toIndentedString(tripId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    trafficTime: ").append(toIndentedString(trafficTime)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    traveledTime: ").append(toIndentedString(traveledTime)).append("\n");
    sb.append("    traveledDistance: ").append(toIndentedString(traveledDistance)).append("\n");
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

