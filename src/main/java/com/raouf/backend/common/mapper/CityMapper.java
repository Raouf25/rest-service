
package com.raouf.backend.common.mapper;

import com.raouf.backend.api.model.City;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
    @Mapping(source = "name", target = "label")
    City toModel(com.raouf.backend.entity.City city);

    List<City> toModelList(List<com.raouf.backend.entity.City> cities);

    @InheritInverseConfiguration
    com.raouf.backend.entity.City toEntity(City city);
}
