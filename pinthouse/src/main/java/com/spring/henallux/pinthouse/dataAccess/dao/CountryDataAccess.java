package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.Country;

import java.util.ArrayList;

public interface CountryDataAccess {
    ArrayList<Country> getAllCountries(String language);
}
