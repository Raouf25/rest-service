package com.raouf.backend.api.impl;

import com.raouf.backend.api.VehiclesApi;
import com.raouf.backend.api.model.Vehicle;
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
public class VehiclesApiController implements VehiclesApi {


    public ResponseEntity<Vehicle> createVehicle(@ApiParam(value = "the vehicle to create"  )  @Valid @RequestBody VehicleCU vehicle) {


        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteVehicle(@ApiParam(value = "the vehicle Id",required=true) @PathVariable("vehicleId") Long vehicleId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Vehicle>> getAllVehicle() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Vehicle> getVehicle(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleId") Long vehicleId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Vehicle> updateVehicleInformation(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleId") Long vehicleId,@ApiParam(value = "the pratitionner to update"  )  @Valid @RequestBody VehicleCU vehicle) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
