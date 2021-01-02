package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBreweryEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.TranslationBreweryRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.Brewery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BreweryDAO implements BreweryDataAccess{
    private ProviderConverter converter;
    private TranslationBreweryRepository translationRepository;

    @Autowired
    public BreweryDAO(ProviderConverter converter, TranslationBreweryRepository translationRepository){
        this.translationRepository = translationRepository;
        this.converter = converter;
    }

    @Override
    public ArrayList<Brewery> getAllBrewery(String language) {
        List<TranslationBreweryEntity> translationEntities = translationRepository.findAllByLanguage(language);
        ArrayList<Brewery> breweries = new ArrayList<>();
        for (TranslationBreweryEntity translationEntity : translationEntities) {
            breweries.add(converter.breweryEntityToModel(translationEntity));
        }
        return breweries;
    }
}
