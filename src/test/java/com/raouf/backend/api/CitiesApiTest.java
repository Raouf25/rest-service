package com.raouf.backend.api;

import com.raouf.backend.api.model.City;
import com.raouf.backend.common.RaoufApiEndpoints;
import com.raouf.backend.fixture.CityFixture;
import com.raouf.backend.service.CityService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = CitiesApi.class)
public class CitiesApiTest extends AbstractRaoufApiTest {

    @MockBean
    private CityService cityService;

    private List<City> cities;
    private List<City> citiesEmpty = new ArrayList<>();
    private String searchTerm;
    private String wrongTerm;


    @Before
    public void setUp() {

        cities = CityFixture.provideCities();
        searchTerm = "Lille";
        wrongTerm = "abcd123";
    }

    @Test
    public void testSearchCitiesWhenIsOK() throws Exception {
        when(cityService.search(eq(searchTerm), any(Pageable.class))).thenReturn(cities);

        String citiesAsJson = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cities);
        mockMvc.perform(
                MockMvcRequestBuilders.get(RaoufApiEndpoints.CITIES_SEARCH)
                                      .accept(MediaType.APPLICATION_JSON_VALUE)
                                      .contentType(MediaType.APPLICATION_JSON_VALUE)
                                      .param("q", searchTerm))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json;charset=UTF-8"))
               .andExpect(content().json(citiesAsJson));
    }

    @Test
    public void testSearchCitiesWhenIsEmpty() throws Exception {
        when(cityService.search(eq(wrongTerm), any(Pageable.class))).thenReturn(citiesEmpty);

        String citiesAsJson = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(citiesEmpty);
        mockMvc.perform(
                MockMvcRequestBuilders.get(RaoufApiEndpoints.CITIES_SEARCH)
                                      .accept(MediaType.APPLICATION_JSON_VALUE)
                                      .contentType(MediaType.APPLICATION_JSON_VALUE)
                                      .param("q", wrongTerm))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json;charset=UTF-8"))
               .andExpect(content().json(citiesAsJson));
    }

}
