package com.raouf.backend.service;

import com.raouf.backend.api.model.City;
import com.raouf.backend.common.mapper.CityMapper;
import com.raouf.backend.fixture.CityFixture;
import org.assertj.core.groups.Tuple;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@EnableTransactionManagement
@ComponentScan("com.raouf.backend.service")
@ComponentScan(basePackageClasses = {CityMapper.class})
@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    public void shouldFindCitiesByNameIfNameExists() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("Maubeuge", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(1);
        assertThat(cities.get(0).getPostalCode()).isEqualTo("59600");
        assertThat(cities.get(0).getLabel()).isEqualTo("MAUBEUGE");
    }

    @Test
    public void shouldFindCitiesByPostalCodeIfPostalCodeExists() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("59000", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(1);
        assertThat(cities.get(0).getLabel()).isEqualTo("LILLE");
        assertThat(cities.get(0).getPostalCode()).isEqualTo("59000");
    }

    @Test
    public void shouldFindCitiesByNameIfSearchTermIsWrong() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("abcd123", pageRequest);

        assertThat(cities).isNullOrEmpty();
        assertThat(cities).hasSize(0);
    }

    @Test
    public void shouldFindCitiesByNameIfSearchTermIsEmpty() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(10);
    }

    @Test
    public void shouldFindCitiesByNameIfSearchTermIsNull() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search(null, pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(10);
    }

    @Test
    public void shouldFindCitiesByPartialNameIfNameExists() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("Maubeu", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(1);
        assertThat(cities.get(0).getPostalCode()).isEqualTo("59600");
        assertThat(cities.get(0).getLabel()).isEqualTo("MAUBEUGE");
    }

    @Test
    public void shouldFindCitiesByPartialPostalCodeIfPostalCodeExists() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("5900", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(1);
        assertThat(cities.get(0).getLabel()).isEqualTo("LILLE");
        assertThat(cities.get(0).getPostalCode()).isEqualTo("59000");
    }

    @Test
    public void shouldFindCitiesByNameIfHaveMultipleResults() {
        PageRequest pageRequest = new PageRequest(0, 25, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("LILLE", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(4)
                          .extracting("label", "postalCode")
                          .containsExactlyInAnyOrder(Tuple.tuple("LILLE", "59000"),
                                                     Tuple.tuple("LILLE", "59260"),
                                                     Tuple.tuple("LILLE", "59777"),
                                                     Tuple.tuple("LILLE", "59800"));
    }

    @Test
    public void shouldFindCitiesByPostalCodeIfHaveMultipleResults() {
        PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.ASC, "id");
        List<City> cities = cityService.search("59112", pageRequest);

        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(2)
                          .extracting("label", "postalCode")
                          .containsExactlyInAnyOrder(Tuple.tuple("ANNOEULLIN", "59112"),
                                                     Tuple.tuple("CARNIN", "59112"));
    }

    @Test
    public void shouldFindOneCityById() {
        City city = cityService.byId(1L);

        assertThat(city).isNotNull();
        assertThat(city.getId()).isEqualTo(1L);
        assertThat(city.getLabel()).isEqualTo("MAUBEUGE");
        assertThat(city.getPostalCode()).isEqualTo("59600");
    }

    @Test
    public void shouldNotFindCityByIdAndReturnNull() {
        City city = cityService.byId(CityFixture.ID.INVALID_CITY_ID);
        assertThat(city).isNull();
    }

    @Test
    public void given_ASearchTermWithAccent_When_SearchCity_Then_CityIsReturned() {
        // arrange
        PageRequest pageRequest = new PageRequest(0, 25, Sort.Direction.ASC, "id");

        // act
        List<City> cities = cityService.search("Uzès", pageRequest);

        // assert
        assertThat(cities).isNotNull()
                          .isNotEmpty()
                          .hasSize(1)
                          .contains(cityService.byId(CityFixture.ID.UZES));
    }
}
