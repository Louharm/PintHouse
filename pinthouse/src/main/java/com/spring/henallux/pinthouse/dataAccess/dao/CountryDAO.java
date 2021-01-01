package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationCountryEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.TranslationCountryRepository;
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
    private TranslationCountryRepository translationCountryRepository;

    @Autowired
    public CountryDAO(TranslationCountryRepository repository, ProviderConverter converter){
        this.translationCountryRepository = repository;
        this.converter = converter;
    }

    @Override
    public ArrayList<Country> getAllCountries(String language) {
        List<TranslationCountryEntity> countryEntities = translationCountryRepository.findAllByLanguage(language);
        ArrayList<Country> list = new ArrayList<>();
        for(TranslationCountryEntity translationCountryEntity : countryEntities){
            list.add(converter.countryEntityToModel(translationCountryEntity));
        }
        return list;
    }
}
