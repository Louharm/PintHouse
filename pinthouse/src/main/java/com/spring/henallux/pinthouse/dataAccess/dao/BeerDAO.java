package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.BeerRepository;
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
    private ProviderConverter converter;
    private BeerRepository beerRepository;

    @Autowired
    public BeerDAO(ProviderConverter converter, BeerRepository beerRepository) {
        this.converter = converter;
        this.beerRepository = beerRepository;
    }

    @Override
    public ArrayList<Beer> getAllBeers() {
        List<BeerEntity> beerEntities = beerRepository.findAll();
        ArrayList<Beer> list = new ArrayList<>();
        for(BeerEntity beerEntity : beerEntities){
            list.add(converter.BeerEntityToBeerModel(beerEntity));
        }
        return list;
    }

    @Override
    public ArrayList<Beer> getAllBeersByCategory(String categoryName, String elem) {
        List<BeerEntity> beerEntities;
        categoryName = categoryName.toLowerCase();
        switch (categoryName){
            case "country" :
                beerEntities = beerRepository.getAllByCountryName(elem);
                break;
            case "brewery" :
                beerEntities = beerRepository.getAllByBreweryName(elem);
                break;
            case "beercolor" :
                beerEntities = beerRepository.getAllByBeerColor(elem);
                break;
            case "beertype" :
                beerEntities = beerRepository.getAllByBeerTypeName(elem);
                break;
            default:
                beerEntities = null;
        }

        ArrayList<Beer> list = new ArrayList<>();
        for(BeerEntity beerEntity : beerEntities){
            list.add(converter.BeerEntityToBeerModel(beerEntity));
        }
        return list;
    }
}
