package com.raouf.backend.api.impl;

import com.raouf.backend.api.CitiesApi;
import com.raouf.backend.api.model.City;
import com.raouf.backend.service.CityService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;


@Controller
public class CitiesApiController implements CitiesApi {

    @Autowired
    private CityService cityService;

//    private final static Logger logger = LoggerFactory.getLogger(CitiesApiController.class);

    @Override
    public ResponseEntity<List<City>> searchCities(@ApiParam(value = "the search query") @RequestParam(value = "q", required = false) String searchTerm,
                                                   @SortDefault(sort = "name", direction = Sort.Direction.ASC)
                                                   @NotNull Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(cityService.search(searchTerm, pageable));
    }
}
