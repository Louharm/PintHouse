package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.Brewery;

import java.util.ArrayList;

public interface BreweryDataAccess {
    ArrayList<Brewery> getAllBrewery(String language);
}
