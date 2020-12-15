package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.CountryEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.CountryRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CountryDAO implements CountryDataAccess{
    private ProviderConverter converter;
    private CountryRepository countryRepository;

    @Autowired
    public CountryDAO(CountryRepository repository){
        this.countryRepository = repository;
        converter = new ProviderConverter();
    }

    @Override
    public Country getCountryByNameFr(String name) {
        CountryEntity countryEntity = countryRepository.findByNameFR(name);
        return converter.CountryEntityToCountryModel(countryEntity);
    }

    @Override
    public ArrayList<Country> getAllCountries() {
        List<CountryEntity> countryEntities = countryRepository.findAll();
        ArrayList<Country> list = new ArrayList<>();
        for(CountryEntity countryEntity : countryEntities){
            list.add(converter.CountryEntityToCountryModel(countryEntity));
        }
        return list;
    }
}
