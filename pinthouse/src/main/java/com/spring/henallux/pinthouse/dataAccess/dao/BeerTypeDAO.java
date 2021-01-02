package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBeerTypeEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.TranslationBeerTypeRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.BeerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BeerTypeDAO implements BeerTypeDataAccess{
    private ProviderConverter converter;
    private TranslationBeerTypeRepository translationBeerTypeRepository;

    @Autowired
    public BeerTypeDAO(ProviderConverter converter, TranslationBeerTypeRepository translationBeerTypeRepository){
        this.translationBeerTypeRepository = translationBeerTypeRepository;
        this.converter = converter;
    }
    @Override
    public ArrayList<BeerType> getAllBeerType(String language){
        List<TranslationBeerTypeEntity> translationEntities = translationBeerTypeRepository.findAllByLanguage(language);
        ArrayList<BeerType> beerTypes = new ArrayList<>();
        for (TranslationBeerTypeEntity translationEntity: translationEntities) {
            beerTypes.add(converter.beerTypeEntityToModel(translationEntity));
        }
        return beerTypes;
    }
}
