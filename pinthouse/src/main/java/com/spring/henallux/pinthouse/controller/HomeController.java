package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import com.spring.henallux.pinthouse.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value="/home")
@SessionAttributes(Constants.BASKET)
public class HomeController extends SuperController {
    private final CountryDataAccess countryDataAccess;
    private final BeerDataAccess beerDataAccess;

    @ModelAttribute(Constants.BASKET)
    public HashMap<String, Integer> basket(){
        return new HashMap<>();
    }

    @Autowired
    public HomeController(CountryDataAccess countryDataAccess, BeerDataAccess beerDataAccess){
        this.countryDataAccess = countryDataAccess;
        this.beerDataAccess = beerDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        ArrayList<Country> countries = countryDataAccess.getAllCountries(getCurrentLanguage());
        ArrayList<Beer> beers = beerDataAccess.getAllBeers(getCurrentLanguage());
        model.addAttribute("countryList",countries);
        model.addAttribute("title","Pinthouse");
        model.addAttribute("beersList", beers);
        return "integrated:home";
    }


}
