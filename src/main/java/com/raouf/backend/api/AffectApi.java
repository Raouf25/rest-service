package com.raouf.backend.api;

import com.raouf.backend.api.model.Error400;
import com.raouf.backend.common.RaoufApiEndpoints;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "affect", description = "the affect API", tags = {"process",})
public interface AffectApi {

    @ApiOperation(value = "Affect driver and vehicle for each trip", nickname = "affectDriverVehicleToTrip", notes = "Affect driver and vehicle for each trip", tags={ "process", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation"),
        @ApiResponse(code = 400, message = "Malformed trip delete request", response = Error400.class),
        @ApiResponse(code = 404, message = "No driver found with this Id") })
    @RequestMapping(value = RaoufApiEndpoints.TRIPS_AFFECTATIONS,
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> affectDriverVehicleToTrip(@ApiParam(value = "the driver ID",required=true) @PathVariable("driverId") Long driverId,@ApiParam(value = "the vehicle ID",required=true) @PathVariable("vehicleId") Long vehicleId,@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId);

}
