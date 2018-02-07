package com.raouf.backend.service;

import com.raouf.backend.api.model.City;
import com.raouf.backend.common.mapper.CityMapper;
import com.raouf.backend.repository.CityRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityMapper cityMapper;

    public List<City> search(String searchTerm, Pageable pageable) {
        Page<com.raouf.backend.entity.City> citiesPage;
        if (StringUtils.isNotEmpty(searchTerm)) {
            searchTerm = StringUtils.stripAccents(searchTerm);
            citiesPage = cityRepository.findAllByNameOrPostalCodeIgnoreCaseContaining(searchTerm, pageable);
        } else {
            citiesPage = cityRepository.findAll(pageable);
        }
        return cityMapper.toModelList(citiesPage.getContent());
    }

    public City byId(Long id) {
        return cityMapper.toModel(cityRepository.findOne(id));
    }

}
