package com.spring.henallux.pinthouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/beerDetails")
public class BeerDetailsController extends SuperController {
    public BeerDetailsController(){

    }

    @RequestMapping (method = RequestMethod.GET)
    public String beerDetails (Model model){
        model.addAttribute("title","Pinthouse");
        return "integretad:beerDetails";
    }
}
