package com.raouf.backend.api.impl;

import com.raouf.backend.api.TripsApi;
import com.raouf.backend.api.model.Trip;
import com.raouf.backend.api.model.VehicleCU;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TripsApiController implements TripsApi {

    public ResponseEntity<Trip> addTrip(@ApiParam(value = "the new employer to add"  )  @Valid @RequestBody Trip trip) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTrip(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Trip>> getAllTrips() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Trip> getTripById(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Trip> updateTrip(@ApiParam(value = "the trip ID",required=true) @PathVariable("tripId") Long tripId,@ApiParam(value = "the pratitionner to update"  )  @Valid @RequestBody VehicleCU trip) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
