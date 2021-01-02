package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.Beer;

import java.util.ArrayList;

public interface BeerDataAccess {
    ArrayList<Beer> getAllBeers(String language);

    ArrayList<Beer> getAllBeersByCategory(String categoryName, Integer elem, String language);

    Beer getBeerByName(String name, String language);
}
