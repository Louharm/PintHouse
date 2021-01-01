package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.dataAccess.dao.*;
import com.spring.henallux.pinthouse.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping(value={"/category/","/category/{name}","category/{name}/{elemCategory}"})
public class CategoryController extends SuperController {
    private final CountryDataAccess countryDataAccess;
    private final BeerColorDataAccess beerColorDataAccess;
    private final BeerTypeDataAccess beerTypeDataAccess;
    private final BreweryDataAccess breweryDataAccess;
    private final BeerDataAccess beerDataAccess;

    @Autowired
    public CategoryController(CountryDataAccess countryDataAccess, BeerColorDataAccess beerColorDataAccess, BeerTypeDataAccess beerTypeDataAccess, BreweryDataAccess breweryDataAccess, BeerDataAccess beerDataAccess){
        this.countryDataAccess = countryDataAccess;
        this.beerColorDataAccess = beerColorDataAccess;
        this.beerTypeDataAccess = beerTypeDataAccess;
        this.breweryDataAccess = breweryDataAccess;
        this.beerDataAccess = beerDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @PathVariable() final String name, @PathVariable(required = false) final String elemCategory){
        model.addAttribute("category",name);
        model.addAttribute("title","Pinthouse");
        String langue = getCurrentLanguage();

        ArrayList listElemCategory = new ArrayList();
        switch(name){
            case "country":
                listElemCategory = countryDataAccess.getAllCountries(langue);
                break;
            case "brewery":
                listElemCategory = breweryDataAccess.getAllBrewery(langue);
                break;
            case "beerType":
                listElemCategory = beerTypeDataAccess.getAllBeerType(langue);
                break;
            case "beerColor":
                listElemCategory = beerColorDataAccess.getAllBeerColor(langue);
                break;
        }
        ArrayList<Beer> beers;
        if(elemCategory != null){
            if(name.equals("country")){
                beers = beerDataAccess.getAllBeersByCategory(name, elemCategory, null,langue);
            }else{
                beers = beerDataAccess.getAllBeersByCategory(name, null, Integer.valueOf(elemCategory),langue);
            }
        }else{
            beers = beerDataAccess.getAllBeers(langue);
        }
        model.addAttribute("beersList", beers);
        model.addAttribute("listElemCategory",listElemCategory);

        return "integrated:category";
    }
}
