package com.spring.henallux.pinthouse.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value="/cart")
@SessionAttributes(Constants.BASKET)
public class CartController extends SuperController {
    private BeerDataAccess beerDataAccess;
    @Autowired
    CartController(BeerDataAccess beerDataAccess){
        this.beerDataAccess = beerDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        ArrayList<Beer> beers = new ArrayList<>();
        Double total = 0.0;
        for (String name: basket.keySet()) {
            Beer beer = beerDataAccess.getBeerByName(name,getCurrentLanguage());
            total += beer.getPrice() * basket.get(name);
            beers.add(beer);
        }
        Math.round(total * 100.0);
        model.addAttribute("total", total);
        model.addAttribute("beers", beers);
        model.addAttribute("basket", basket);
        model.addAttribute("title","Pinthouse");
        return "integrated:cart";
    }
}
