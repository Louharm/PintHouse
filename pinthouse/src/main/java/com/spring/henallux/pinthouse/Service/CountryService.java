package com.spring.henallux.pinthouse.Service;

import com.spring.henallux.pinthouse.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {
    private ArrayList<Country> country = new ArrayList<>();

    public CountryService(){}

    public void setCountry(ArrayList<Country> country) {
        this.country = country;
    }
    public ArrayList<Country> getCountry() {
        return country;
    }
}
