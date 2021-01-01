package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBeerColorEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.TranslationBeerColorRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.BeerColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BeerColorDAO implements BeerColorDataAccess{
    private ProviderConverter converter;
    private TranslationBeerColorRepository translationRepository;

    @Autowired
    public BeerColorDAO(ProviderConverter converter, TranslationBeerColorRepository translationRepository){
        this.converter = converter;
        this.translationRepository = translationRepository;
    }

    @Override
    public ArrayList<BeerColor> getAllBeerColor(String language){
        List<TranslationBeerColorEntity> translationEntities = translationRepository.findAllByLanguage(language);
        ArrayList<BeerColor> beerColors = new ArrayList<>();
        for (TranslationBeerColorEntity translationEntity: translationEntities) {
            beerColors.add(converter.beerColorEntityToModel(translationEntity));
        }
        return beerColors;
    }
}
