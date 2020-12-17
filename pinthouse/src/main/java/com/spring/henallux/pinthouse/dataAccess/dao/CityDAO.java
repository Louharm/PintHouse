package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.CityEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.CityRepository;
import com.spring.henallux.pinthouse.dataAccess.repository.UserRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityDAO implements CityDataAccess{
    private ProviderConverter converter;
    private CityRepository cityRepository;

    @Autowired
    public CityDAO(CityRepository cityRepository, ProviderConverter converter){
        this.cityRepository = cityRepository;
        this.converter = converter;
    }

    @Override
    public City getCityByNameAndCountry(String name, String country) {
        CityEntity cityEntity = cityRepository.findByCountryNameAndName(country,name);
        return converter.cityEntityToCityModel(cityEntity);
    }

    @Override
    public void save(City city) {
        CityEntity cityEntity = converter.cityModelToCityEntity(city);
        cityRepository.save(cityEntity);
    }
}
