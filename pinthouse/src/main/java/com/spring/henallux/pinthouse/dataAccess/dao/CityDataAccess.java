package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.City;

public interface CityDataAccess {
    void save(City city);

    City getCityByNameAndCountry(String name, String country);
}
