package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.Country;

import java.util.ArrayList;

public interface CountryDataAccess {
    Country getCountryByNameFr(String name);
    ArrayList<Country> getAllCountries();
}
