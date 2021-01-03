package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.City;

public interface CityDataAccess {
    City save(City city);

    City getCityByNameAndCountry(String name, Integer country);
}
