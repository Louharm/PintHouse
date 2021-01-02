package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.CityEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.CityRepository;
import com.spring.henallux.pinthouse.dataAccess.repository.TranslationCountryRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityDAO implements CityDataAccess{
    private final ProviderConverter converter;
    private final CityRepository cityRepository;

    @Autowired
    public CityDAO(ProviderConverter converter, CityRepository cityRepository){
        this.cityRepository = cityRepository;
        this.converter = converter;
    }

    @Override
    public City getCityByNameAndCountry(String name, Integer country) {
        CityEntity cityEntity = cityRepository.findByCountryAndName(country,name);
        return cityEntity == null ? null : converter.cityEntityToModel(cityEntity);
    }

    @Override
    public void save(City city) {
        CityEntity cityEntity = converter.cityModelToEntity(city);
        cityRepository.save(cityEntity);
    }
}
