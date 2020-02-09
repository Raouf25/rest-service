package com.raouf.backend.api;

import com.raouf.backend.api.model.Driver;
import com.raouf.backend.api.model.DriverCU;
import com.raouf.backend.api.model.Error400;
import com.raouf.backend.common.RaoufApiEndpoints;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Api(value = "drivers", description = "the drivers API", tags = {"drivers",})
public interface DriversApi {

    @ApiOperation(value = "add new driver", nickname = "addDriver", notes = "Add a new driver", response = Driver.class, tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Succesful operation", response = Driver.class),
            @ApiResponse(code = 400, message = "Malformed driver create request", response = Error400.class)})
    @PostMapping(value = RaoufApiEndpoints.DRIVERS,
            produces = {"application/json"},
            consumes = {"application/json"})
    ResponseEntity<Driver> addDriver(@ApiParam(value = "the new driver to add") @Valid @RequestBody DriverCU driver);


    @ApiOperation(value = "deletes a driver", nickname = "deleteDriver", notes = "Deletes the given driver. Be careful, all dependencies will be removed.", tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Succesful operation"),
            @ApiResponse(code = 400, message = "Malformed driver delete request", response = Error400.class),
            @ApiResponse(code = 404, message = "No driver found with this Id")})
    @DeleteMapping(value = RaoufApiEndpoints.DRIVERS_DETAIL,
            produces = {"application/json"})
    ResponseEntity<Void> deleteDriver(@ApiParam(value = "the driver ID", required = true) @PathVariable("driverId") Long driverId);


    @ApiOperation(value = "returns all drivers", nickname = "getAllDrivers", notes = "Returns all drivers", response = Driver.class, responseContainer = "List", tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfull operation", response = Driver.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Malformed status", response = Error400.class),
            @ApiResponse(code = 404, message = "Driver not found")})
    @GetMapping(value = RaoufApiEndpoints.DRIVERS,
            produces = {"application/json"})
    ResponseEntity<List<Driver>> getAllDrivers();


    @ApiOperation(value = "returns information for the specific driver", nickname = "getDriver", notes = "Returns information for the specific driver", response = Driver.class, tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfull operation", response = Driver.class),
            @ApiResponse(code = 400, message = "Malformed offices request", response = Error400.class),
            @ApiResponse(code = 404, message = "No driver found with this driverId")})
    @GetMapping(value = RaoufApiEndpoints.DRIVERS_DETAIL,
            produces = {"application/json"})
    ResponseEntity<Driver> getDriver(@ApiParam(value = "the driver ID", required = true) @PathVariable("driverId") Long driverId);


    @ApiOperation(value = "updates personal informations of the driver", nickname = "updateDriver", notes = "Updates personal informations about the given driver", response = Driver.class, tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Succesful operation", response = Driver.class),
            @ApiResponse(code = 400, message = "Malformed driver update request", response = Error400.class),
            @ApiResponse(code = 404, message = "No driver found with this Id")})
    @PatchMapping(value = RaoufApiEndpoints.DRIVERS_DETAIL,
            produces = {"application/json"},
            consumes = {"application/json"})
    ResponseEntity<Driver> updateDriver(@ApiParam(value = "the driver ID", required = true) @PathVariable("driverId") Long driverId, @ApiParam(value = "the driver to update") @Valid @RequestBody DriverCU driver);

}
