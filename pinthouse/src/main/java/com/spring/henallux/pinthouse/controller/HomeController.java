package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import com.spring.henallux.pinthouse.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/home")
public class HomeController extends SuperController {
    private CountryDataAccess countryDataAccess;

    @Autowired
    public HomeController(CountryDataAccess countryDataAccess){
        this.countryDataAccess = countryDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        ArrayList<Country> countries = countryDataAccess.getAllCountries();
        model.addAttribute("countryList",countries);
        model.addAttribute("title","Pinthouse");
        return "integrated:home";
    }

}
