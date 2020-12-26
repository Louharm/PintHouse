package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.dataAccess.dao.BeerColorDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerTypeDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.BreweryDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping(value="/category")
public class CategoryController extends SuperController {
    private CountryDataAccess countryDataAccess;
    private BeerColorDataAccess beerColorDataAccess;
    private BeerTypeDataAccess beerTypeDataAccess;
    private BreweryDataAccess breweryDataAccess;

    @Autowired
    public CategoryController(CountryDataAccess countryDataAccess, BeerColorDataAccess beerColorDataAccess, BeerTypeDataAccess beerTypeDataAccess, BreweryDataAccess breweryDataAccess){
        this.countryDataAccess = countryDataAccess;
        this.beerColorDataAccess = beerColorDataAccess;
        this.beerTypeDataAccess = beerTypeDataAccess;
        this.breweryDataAccess = breweryDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model,@RequestParam() final String name,@RequestParam(required = false) final String elemCategory){
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
            //mettre toutes les bières
        }else{
            //mettre les bières en fonction de ce qu'il y a
        }
        model.addAttribute("listElemCategory",listElemCategory);

        return "integrated:category";
    }
}
