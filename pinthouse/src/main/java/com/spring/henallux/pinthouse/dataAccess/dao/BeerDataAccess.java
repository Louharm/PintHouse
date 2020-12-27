package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.Beer;

import java.util.ArrayList;

public interface BeerDataAccess {
    ArrayList<Beer> getAllBeers();

    ArrayList<Beer> getAllBeersByCategory(String categoryName, String elem);
}
