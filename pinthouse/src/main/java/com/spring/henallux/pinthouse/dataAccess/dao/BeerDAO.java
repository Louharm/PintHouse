package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.*;
import com.spring.henallux.pinthouse.dataAccess.repository.*;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BeerDAO implements BeerDataAccess {
    private final ProviderConverter converter;
    private final BeerRepository beerRepository;
    private final TranslationBeerTypeRepository translationBeerTypeRepository;
    private final TranslationBeerColorRepository translationBeerColorRepository;
    private final TranslationBreweryRepository translationBreweryRepository;
    private final TranslationCountryRepository translationCountryRepository;

    @Autowired
    public BeerDAO(ProviderConverter converter, BeerRepository beerRepository, TranslationBeerTypeRepository translationBeerTypeRepository, TranslationBeerColorRepository translationBeerColorRepository, TranslationBreweryRepository translationBreweryRepository, TranslationCountryRepository translationCountryRepository) {
        this.converter = converter;
        this.beerRepository = beerRepository;
        this.translationBeerTypeRepository = translationBeerTypeRepository;
        this.translationBeerColorRepository = translationBeerColorRepository;
        this.translationBreweryRepository = translationBreweryRepository;
        this.translationCountryRepository = translationCountryRepository;
    }

    private ArrayList<Beer> converterBeerEntityToBeer(List<BeerEntity> beerEntities, String language){
        ArrayList<Beer> list = new ArrayList<>();
        if(beerEntities != null){
            List<TranslationBeerTypeEntity> translationBeerTypeEntities = translationBeerTypeRepository.findAllByLanguage(language);
            List<TranslationBreweryEntity> translationBreweryEntities = translationBreweryRepository.findAllByLanguage(language);
            List<TranslationBeerColorEntity> translationBeerColorEntities = translationBeerColorRepository.findAllByLanguage(language);
            List<TranslationCountryEntity> translationCountryEntities = translationCountryRepository.findAllByLanguage(language);
            for(BeerEntity beerEntity : beerEntities){
                TranslationBeerTypeEntity beerTypeEntity = translationBeerTypeEntities.get(beerEntity.getBeerType()-1);
                TranslationBeerColorEntity beerColorEntity = translationBeerColorEntities.get(beerEntity.getBeerColor()-1);
                TranslationBreweryEntity breweryEntity = translationBreweryEntities.get(beerEntity.getBrewery()-1);
                TranslationCountryEntity translationCountryEntity = translationCountryEntities.get(beerEntity.getCountry()-1);
                list.add(converter.beerEntityToBeerModel(beerEntity, beerTypeEntity, beerColorEntity, breweryEntity, translationCountryEntity));
            }
        }
        return list;
    }

    @Override
    public ArrayList<Beer> getAllBeers(String language) {
        List<BeerEntity> beerEntities = beerRepository.findAll();
        return converterBeerEntityToBeer(beerEntities, language);
    }

    @Override
    public ArrayList<Beer> getAllBeersByCategory(String categoryName, String elem, Integer beerType, String language) {
        List<BeerEntity> beerEntities;
        categoryName = categoryName.toLowerCase();
        switch (categoryName){
            case "country" :
                beerEntities = beerRepository.getAllByCountry(elem);
                break;
            case "brewery" :
                beerEntities = beerRepository.getAllByBrewery(beerType);
                break;
            case "beercolor" :
                beerEntities = beerRepository.getAllByBeerColor(beerType);
                break;
            case "beertype" :
                beerEntities = beerRepository.getAllByBeerType(beerType);
                break;
            default:
                beerEntities = null;
        }
        return converterBeerEntityToBeer(beerEntities, language);
    }

    @Override
    public Beer getBeerByName(String name, String language) {
        BeerEntity beerEntity = beerRepository.getByName(name);
        TranslationBeerTypeEntity translationBeerTypeEntity = translationBeerTypeRepository.findByLanguageAndItem(language, beerEntity.getBeerType());
        TranslationBeerColorEntity translationBeerColorEntity = translationBeerColorRepository.findByLanguageAndItem(language, beerEntity.getBeerColor());
        TranslationBreweryEntity translationBreweryEntity = translationBreweryRepository.findByLanguageAndItem(language, beerEntity.getBrewery());
        TranslationCountryEntity translationCountryEntity = translationCountryRepository.findByLanguageAndItem(language, beerEntity.getCountry());
        return converter.beerEntityToBeerModel(beerEntity, translationBeerTypeEntity, translationBeerColorEntity, translationBreweryEntity, translationCountryEntity);
    }
}
