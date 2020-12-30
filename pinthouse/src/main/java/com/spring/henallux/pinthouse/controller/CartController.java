package com.spring.henallux.pinthouse.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.spring.henallux.pinthouse.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;

@Controller
@RequestMapping(value="/cart")
@SessionAttributes(Constants.BASKET)
public class CartController extends SuperController {
    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        if(basket.size() > 0){
            System.out.println("hey");
        }
        model.addAttribute("title","Pinthouse");
        return "integrated:cart";
    }
}
