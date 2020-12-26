package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.BreweryEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.BreweryRepository;
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
    private BreweryRepository breweryRepository;

    @Autowired
    public BreweryDAO(BreweryRepository breweryRepository, ProviderConverter converter){
        this.breweryRepository = breweryRepository;
        this.converter = converter;
    }

    @Override
    public ArrayList<Brewery> getAllBrewery() {
        List<BreweryEntity> breweryEntities = breweryRepository.findAll();
        ArrayList<Brewery> breweries = new ArrayList<>();
        for (BreweryEntity breweryEntity : breweryEntities) {
            breweries.add(converter.breweryEntityToModel(breweryEntity));
        }
        return breweries;
    }
}
