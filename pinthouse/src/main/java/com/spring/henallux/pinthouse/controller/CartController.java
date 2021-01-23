package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.BeerDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.OrderDataAccess;
import com.spring.henallux.pinthouse.model.Beer;
import com.spring.henallux.pinthouse.model.CommandLine;
import com.spring.henallux.pinthouse.model.Order;
import com.spring.henallux.pinthouse.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping(value= "/cart")
@SessionAttributes(Constants.BASKET)
public class CartController extends SuperController {
    private final BeerDataAccess beerDataAccess;
    private final OrderDataAccess orderDataAccess;
    private Double total;

    @Autowired
    CartController(BeerDataAccess beerDataAccess, OrderDataAccess orderDataAccess){
        this.beerDataAccess = beerDataAccess;
        this.orderDataAccess = orderDataAccess;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        if (basket != null) {
            ArrayList<Beer> beers = new ArrayList<>();
            total = 0.0;
            for (String nameBeer : basket.keySet()) {
                Beer beer = beerDataAccess.getBeerByName(nameBeer, getCurrentLanguage());
                total += beer.getPrice() * basket.get(nameBeer);
                beers.add(beer);
            }
            model.addAttribute("beers", beers);
        }
        model.addAttribute("total", total);
        model.addAttribute("basket", basket);
        model.addAttribute("title","Pinthouse");
        return "integrated:cart";
    }

    @RequestMapping (method = RequestMethod.GET, value="/{operation}/{beer}")
    public String less (@PathVariable String beer, @PathVariable String operation, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        if (basket != null) {
            if (!operation.equals("delete")){
                int quantity = basket.get(beer);
                quantity += operation.equals("less") ? -1 : 1;
                if (quantity == 0) {
                    basket.remove(beer);
                } else {
                    basket.replace(beer, quantity);
                }
            }else{
                basket.remove(beer);
            }
        }
        return "redirect:/cart";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/paypal")
    public String paypal(Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket, Authentication authentication){
        if (basket != null) {
            ArrayList<CommandLine> commandLines = new ArrayList<>();
            for (String nameBeer : basket.keySet()) {
                Beer beer = beerDataAccess.getBeerByName(nameBeer, getCurrentLanguage());
                commandLines.add(new CommandLine(beer.getPrice(), beer.getName(), 0, basket.get(nameBeer)));
            }

            User user = (User) authentication.getPrincipal();
            orderDataAccess.save(new Order(new Date(), user.getIdUser(), commandLines));
            model.addAttribute("total", total);
            basket.clear();
        }

        model.addAttribute("title","Pinthouse");
        return "integrated:paypal";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/paypal/success")
    public String success(Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:confirmationPayment";
    }
}
