package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<BeerEntity, String> {
   List<BeerEntity> getAllByCountryName(String country);
   List<BeerEntity> getAllByBeerColor(String beerColor);
   List<BeerEntity> getAllByBreweryName(String brewery);
   List<BeerEntity> getAllByBeerTypeName(String beerType);
   BeerEntity getByName(String name);
}
