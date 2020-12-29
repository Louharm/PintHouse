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
    private CountryDataAccess countryDataAccess;
    private BeerColorDataAccess beerColorDataAccess;
    private BeerTypeDataAccess beerTypeDataAccess;
    private BreweryDataAccess breweryDataAccess;
    private BeerDataAccess beerDataAccess;

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
        ArrayList listElemCategory = new ArrayList();
        switch(name){
            case "country":
                listElemCategory = countryDataAccess.getAllCountries();
                break;
            case "brewery":
                listElemCategory = breweryDataAccess.getAllBrewery();
                break;
            case "beerType":
                listElemCategory = beerTypeDataAccess.getAllBeerType();
                break;
            case "beerColor":
                listElemCategory = beerColorDataAccess.getAllBeerColor();
                break;
        }
        if(elemCategory != null){
            ArrayList<Beer> beers = beerDataAccess.getAllBeersByCategory(name, elemCategory);
            model.addAttribute("beersList", beers);
        }else{
            ArrayList<Beer> beers = beerDataAccess.getAllBeers();
            model.addAttribute("beersList", beers);
        }
        model.addAttribute("listElemCategory",listElemCategory);

        return "integrated:category";
    }
}
