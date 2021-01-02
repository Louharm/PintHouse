package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;

@Controller
@RequestMapping(value= {"/paypal"})
@SessionAttributes(Constants.BASKET)
public class PaypalController extends SuperController {

    public PaypalController() {

    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model, @ModelAttribute(Constants.BASKET) HashMap<String, Integer> basket){
        model.addAttribute("title","Pinthouse");
        return "integrated:paypal";
    }
}
