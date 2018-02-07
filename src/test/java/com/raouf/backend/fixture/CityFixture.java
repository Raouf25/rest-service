package com.raouf.backend.fixture;

import com.raouf.backend.api.model.City;

import java.util.ArrayList;
import java.util.List;

public class CityFixture {

    public static class ID {
        public static final Long INVALID_CITY_ID = 9999999L;
        public static final Long UZES = 16L;
    }

    public static class POSTALCODE {
        public static final String LILLE = "59000";
        public static final String UZES = "30700";
    }


    public static List<City> provideCities() {
        List<City> cities = new ArrayList<>();
        cities.add(City.builder()
                       .id(1L)
                       .label("Lille")
                       .postalCode(POSTALCODE.LILLE)
                       .build());

        cities.add(City.builder()
                       .id(2L)
                       .label("Uzès")
                       .postalCode(POSTALCODE.UZES)
                       .build());

        return cities;
    }
}
