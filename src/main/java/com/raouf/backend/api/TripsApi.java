package com.raouf.backend.api;

import com.raouf.backend.api.model.Error400;
import com.raouf.backend.api.model.Trip;
import com.raouf.backend.api.model.VehicleCU;
import com.raouf.backend.common.RaoufApiEndpoints;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Api(value = "trips", description = "the trips API", tags = {"trips",})
public interface TripsApi {

    @ApiOperation(value = "add new employer", nickname = "addTrip", notes = "Add a new trip", response = Trip.class, tags={ "trips", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Trip.class),
        @ApiResponse(code = 400, message = "Malformed driver create request", response = Error400.class),
        @ApiResponse(code = 404, message = "No trip found with this Id") })
    @RequestMapping(value = RaoufApiEndpoints.TRIPS,
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Trip> addTrip(@ApiParam(value = "the new employer to add"  )  @Valid @RequestBody Trip trip);


    @ApiOperation(value = "deletes a trip", nickname = "deleteTrip", notes = "Deletes the given trip. Be careful, all dependencies will be removed.", tags={ "trips", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Succesful operation"),
        @ApiResponse(code = 400, message = "Malformed trip delete request", response = Error400.class),
        @ApiResponse(code = 404, message = "No trip found with this Id") })
    @RequestMapping(value = "/trips/{tripId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTrip(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId);


    @ApiOperation(value = "returns all trips", nickname = "getAllTrips", notes = "Returns all trips", response = Trip.class, responseContainer = "List", tags={ "trips", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfull operation", response = Trip.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Malformed status", response = Error400.class),
        @ApiResponse(code = 404, message = "Trip not found") })
    @RequestMapping(value = RaoufApiEndpoints.TRIPS,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Trip>> getAllTrips();


    @ApiOperation(value = "returns all vehicle for the specific client", nickname = "getTripById", notes = "Returns all vehicle for the specific client", response = Trip.class, tags={ "trips", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfull operation", response = Trip.class),
        @ApiResponse(code = 400, message = "Malformed offices request", response = Error400.class),
        @ApiResponse(code = 404, message = "No vehicle found with this client") })
    @RequestMapping(value = RaoufApiEndpoints.TRIPS_DETAIL,
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Trip> getTripById(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId);


    @ApiOperation(value = "updates personal informations of the trip", nickname = "updateTrip", notes = "Updates informations about the given trip", response = Trip.class, tags={ "trips", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = Trip.class),
        @ApiResponse(code = 400, message = "Malformed trip update request", response = Error400.class),
        @ApiResponse(code = 404, message = "No trip found with this Id") })
    @RequestMapping(value = RaoufApiEndpoints.TRIPS_DETAIL,
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Trip> updateTrip(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId,@ApiParam(value = "the pratitionner to update"  )  @Valid @RequestBody VehicleCU trip);

}
