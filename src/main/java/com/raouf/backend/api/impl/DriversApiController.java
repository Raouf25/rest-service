package com.raouf.backend.api.impl;

import com.raouf.backend.api.DriversApi;
import com.raouf.backend.api.model.Driver;
import com.raouf.backend.api.model.DriverCU;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DriversApiController implements DriversApi {

    public ResponseEntity<Driver> addDriver(@ApiParam(value = "the new driver to add"  )  @Valid @RequestBody DriverCU driver) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDriver(@ApiParam(value = "the driver ID",required=true) @PathVariable("driverId") Long driverId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Driver>> getAllDrivers() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Driver> getDriver(@ApiParam(value = "the driver ID",required=true) @PathVariable("driverId") Long driverId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Driver> updateDriver(@ApiParam(value = "the driver ID",required=true) @PathVariable("driverId") Long driverId,@ApiParam(value = "the driver to update"  )  @Valid @RequestBody DriverCU driver) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
