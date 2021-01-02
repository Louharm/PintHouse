package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<BeerEntity, String> {
   List<BeerEntity> getAllByCountry(Integer country);
   List<BeerEntity> getAllByBeerColor(Integer beerColor);
   List<BeerEntity> getAllByBrewery(Integer brewery);
   List<BeerEntity> getAllByBeerType(Integer beerType);
   BeerEntity getByName(String name);
}
