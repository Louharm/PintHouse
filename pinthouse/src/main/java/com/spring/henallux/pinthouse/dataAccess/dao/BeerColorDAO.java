package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerColorEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.BeerColorRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.Beer;
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
    private BeerColorRepository beerColorRepository;

    @Autowired
    public BeerColorDAO(BeerColorRepository beerColorRepository, ProviderConverter converter){
        this.beerColorRepository = beerColorRepository;
        this.converter = converter;
    }
    @Override
    public ArrayList<BeerColor> getAllBeerColor(){
        List<BeerColorEntity> beerColorEntities = beerColorRepository.findAll();
        ArrayList<BeerColor> beerColors = new ArrayList<>();
        for (BeerColorEntity beerColorEntity: beerColorEntities) {
            beerColors.add(converter.beerColorEntityToModel(beerColorEntity));
        }
        return beerColors;
    }
}
