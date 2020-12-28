package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import com.spring.henallux.pinthouse.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/home")
public class HomeController extends SuperController {
    private CountryDataAccess countryDataAccess;
    private BeerDataAccess beerDataAccess;

    @Autowired
    public HomeController(CountryDataAccess countryDataAccess, BeerDataAccess beerDataAccess){
        this.countryDataAccess = countryDataAccess;
        this.beerDataAccess = beerDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        ArrayList<Country> countries = countryDataAccess.getAllCountries();
        ArrayList<Beer> beers = beerDataAccess.getAllBeers();
        model.addAttribute("countryList",countries);
        model.addAttribute("title","Pinthouse");
        model.addAttribute("beersList", beers);
        return "integrated:home";
    }

    @RequestMapping (value ="/beerDetails", method = RequestMethod.POST)
    public String beerDetailsLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:beerDetails";
    }


}
