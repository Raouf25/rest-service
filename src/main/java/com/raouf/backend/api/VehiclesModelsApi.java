package com.raouf.backend.api;

import com.raouf.backend.api.model.Error400;
import com.raouf.backend.api.model.VehicleModel;
import com.raouf.backend.api.model.VehicleModelCU;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Api(value = "vehicles", description = "the vehicles API", tags = {"vehicles models",})
public interface VehiclesModelsApi {

    @ApiOperation(value = "create a new vehicle model", nickname = "createVehicleModel", notes = "Creates a new vehicle model", response = VehicleModel.class, tags={ "vehicles models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succesful operation", response = VehicleModel.class),
        @ApiResponse(code = 400, message = "Malformed vehicle model creation request", response = Error400.class) })
    @RequestMapping(value = "/vehiclesModels",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<VehicleModel> createVehicleModel(@ApiParam(value = "the vehicle model to create"  )  @Valid @RequestBody VehicleModelCU vehicle);


    @ApiOperation(value = "deletes a vehicle model", nickname = "deleteVehicleModel", notes = "Deletes the given vehicle. Be careful, all dependencies will be removed.", tags={ "vehicles models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful operation"),
        @ApiResponse(code = 400, message = "Malformed vehicle model delete request", response = Error400.class),
        @ApiResponse(code = 404, message = "No vehicle found with this Id") })
    @RequestMapping(value = "/vehiclesModels/{vehicleModelId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVehicleModel(@ApiParam(value = "the vehicle model Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId);


    @ApiOperation(value = "returns all vehicle model", nickname = "getAllVehicleModel", notes = "Returns all vehicle model", response = VehicleModel.class, responseContainer = "List", tags={ "vehicles models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = VehicleModel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Malformed status", response = Error400.class),
        @ApiResponse(code = 404, message = "Vehicle Model not found") })
    @RequestMapping(value = "/vehiclesModels",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<VehicleModel>> getAllVehicleModel();


    @ApiOperation(value = "returns a vehicle model data", nickname = "getVehicleModel", notes = "Returns a vehicle model data", response = VehicleModel.class, tags={ "vehicles models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = VehicleModel.class),
        @ApiResponse(code = 400, message = "Malformed vehicle ID", response = Error400.class),
        @ApiResponse(code = 404, message = "Vehicle not found") })
    @RequestMapping(value = "/vehiclesModels/{vehicleModelId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VehicleModel> getVehicleModel(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId);


    @ApiOperation(value = "updates vehicle model data", nickname = "updateVehicleModel", notes = "Updates vehicle model data", response = VehicleModel.class, tags={ "vehicles models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = VehicleModel.class),
        @ApiResponse(code = 400, message = "Malformed vehicle update request", response = Error400.class),
        @ApiResponse(code = 404, message = "No vehicle model found with this Id") })
    @RequestMapping(value = "/vehiclesModels/{vehicleModelId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<VehicleModel> updateVehicleModel(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId,@ApiParam(value = "the vehicle model to update"  )  @Valid @RequestBody VehicleModelCU vehicleModelCU);

}
