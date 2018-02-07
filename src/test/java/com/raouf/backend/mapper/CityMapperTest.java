package com.raouf.backend.mapper;

import com.raouf.backend.api.model.City;
import com.raouf.backend.common.mapper.CityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@EnableTransactionManagement
@ComponentScan(basePackageClasses = {CityMapper.class})
public class CityMapperTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void shouldMapToEntity() {
        City model = com.raouf.backend.api.model.City.builder().id(1L).label("Lille").postalCode("59000").build();
        com.raouf.backend.entity.City city = cityMapper.toEntity(model);
        assertThat(city.getId()).isEqualTo(model.getId());
        assertThat(city.getName()).isEqualTo(model.getLabel());
        assertThat(city.getPostalCode()).isEqualTo(model.getPostalCode());
    }

    @Test
    public void shouldEntityToMap() {
        com.raouf.backend.entity.City entity = com.raouf.backend.entity.City.builder().id(1L).name("LILLE").postalCode("59000").build();
        City city = cityMapper.toModel(entity);
        assertThat(city.getId()).isEqualTo(entity.getId());
        assertThat(city.getLabel()).isEqualTo(entity.getName());
        assertThat(city.getPostalCode()).isEqualTo(entity.getPostalCode());
    }
}
