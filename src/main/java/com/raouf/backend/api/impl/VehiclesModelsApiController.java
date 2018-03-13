package com.raouf.backend.api.impl;

import com.raouf.backend.api.VehiclesModelsApi;
import com.raouf.backend.api.model.VehicleModel;
import com.raouf.backend.api.model.VehicleModelCU;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class VehiclesModelsApiController implements VehiclesModelsApi {

    public ResponseEntity<VehicleModel> createVehicleModel(@ApiParam(value = "the vehicle model to create"  )  @Valid @RequestBody VehicleModelCU vehicle) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteVehicleModel(@ApiParam(value = "the vehicle model Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<VehicleModel>> getAllVehicleModel() {

       return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VehicleModel> getVehicleModel(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VehicleModel> updateVehicleModel(@ApiParam(value = "the member Id",required=true) @PathVariable("vehicleModelId") Long vehicleModelId,@ApiParam(value = "the vehicle model to update"  )  @Valid @RequestBody VehicleModelCU vehicleModelCU) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
