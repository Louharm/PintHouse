package com.spring.henallux.pinthouse.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value= {"/cart", "/cart/delete/{name}"})
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
            Beer beer = beerDataAccess.getBeerByName(name);
            total += beer.getPrice() * basket.get(name);
            beers.add(beer);
        }
        model.addAttribute("total", total);
        model.addAttribute("beers", beers);
        model.addAttribute("basket", basket);
        model.addAttribute("title","Pinthouse");
        return "integrated:cart";
    }

    @RequestMapping (value="/send", method = RequestMethod.POST)
    public String getCart(Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        return "redirect:/home";
    }

    @RequestMapping (value="/delete", method = RequestMethod.POST)
    public String deleteElemCart(@PathVariable(required = true) final String name, Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        basket.remove(name);
        return "redirect:/home";
    }
}
