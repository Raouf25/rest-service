package com.raouf.backend.api.impl;

import com.raouf.backend.api.AffectApi;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AffectApiController implements AffectApi {

    public ResponseEntity<Void> affectDriverVehicleToTrip(@ApiParam(value = "the driver ID",required=true) @PathVariable("driverId") Long driverId,
                                                          @ApiParam(value = "the vehicle ID",required=true) @PathVariable("vehicleId") Long vehicleId,
                                                          @ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
