package com.raouf.backend.api;

import com.raouf.backend.api.model.City;
import com.raouf.backend.common.RaoufApiEndpoints;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-20T08:55:39.049Z")

@Api(value = "cities", description = "the cities API", tags = {"cities",})
public interface CitiesApi {

    @ApiOperation(value = "searches a city with the given request. The query is pageable", notes = "Searches a city with the given request. The query format is key/value as ?q=59000 or ?q=Lille. Partial values like ?q=59 or ?q=Lil are supported. That means all ressources begining with this value are returned.",
            responseContainer = "List", response = City.class, tags = {"cities",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation", response = City.class, responseContainer = "List")
    })
    //spring pageable definition
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "page number to display while paging", required = true, defaultValue = "0", name = "page", dataType = "string", paramType = "query"),
            @ApiImplicitParam(value = "page size", required = true, defaultValue = "25", name = "size", dataType = "string", paramType = "query"),
            @ApiImplicitParam(value = "sort to apply ex : field1,asc ", required = false, allowMultiple = true, name = "sort", dataType = "string", paramType = "query", collectionFormat = "multi")
    })
    @RequestMapping(value = RaoufApiEndpoints.CITIES_SEARCH,
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    ResponseEntity<List<City>> searchCities(@ApiParam(value = "the search query") @RequestParam(value = "q", required = false) String searchTerm, @NotNull Pageable pageable);

}
