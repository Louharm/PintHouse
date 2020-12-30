package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import com.spring.henallux.pinthouse.model.CommandLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

@Controller
@RequestMapping(value="/beerDetails/{name}")
@SessionAttributes(Constants.BASKET)
public class BeerDetailsController extends SuperController {
    private BeerDataAccess beerDataAccess;
    @Autowired
    BeerDetailsController(BeerDataAccess beerDataAccess){
        this.beerDataAccess = beerDataAccess;
    }

    @ModelAttribute(Constants.COMMAND_LINE)
    public CommandLine commandLine() {return new CommandLine();}

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @PathVariable() final String name){
        model.addAttribute("name", name);
        model.addAttribute("title","Pinthouse");
        Beer beer = beerDataAccess.getBeerByName(name);
        model.addAttribute("beer", beer);
        model.addAttribute(Constants.COMMAND_LINE, new CommandLine());
        return "integrated:beerDetails";
    }

    @RequestMapping (value="/send", method = RequestMethod.POST)
    public String getFormData(@PathVariable("name") String name, Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket, @Valid @ModelAttribute(value = Constants.COMMAND_LINE) CommandLine commandLine, final BindingResult errors){
        if(!errors.hasErrors()){
            if(basket.containsKey(name)){
                int quantity = basket.get(name);
                basket.replace(name, commandLine.getQuantity() + quantity);
            } else {
                basket.put(name, commandLine.getQuantity());
            }
            return "redirect:/cart";
        } else {
            return "redirect:/home";
        }
    }
}
