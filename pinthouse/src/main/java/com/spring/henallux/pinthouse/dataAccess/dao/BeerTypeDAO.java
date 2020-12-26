package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerTypeEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.BeerTypeRepository;
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
    private BeerTypeRepository beerTypeRepository;

    @Autowired
    public BeerTypeDAO(BeerTypeRepository beerTypeRepository, ProviderConverter converter){
        this.beerTypeRepository = beerTypeRepository;
        this.converter = converter;
    }
    @Override
    public ArrayList<BeerType> getAllBeerType(){
        List<BeerTypeEntity> beerTypeEntities = beerTypeRepository.findAll();
        ArrayList<BeerType> beerTypes = new ArrayList<>();
        for (BeerTypeEntity beerTypeEntity: beerTypeEntities) {
            beerTypes.add(converter.beerTypeEntityToModel(beerTypeEntity));
        }
        return beerTypes;
    }
}
