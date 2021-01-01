package com.spring.henallux.pinthouse.controller;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class SuperController {
    @RequestMapping (value="/home", method = RequestMethod.POST)
    public String titleLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:home";
    }
    @RequestMapping (value="/cart", method = RequestMethod.POST)
    public String cartLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:cart";
    }

    @RequestMapping (value="/inscription", method = RequestMethod.POST)
    public String signUpButton (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:inscription";
    }

    @RequestMapping (value="/language", method = RequestMethod.POST)
    public String languageLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:home";
    }

    @RequestMapping (value="/aboutUs", method = RequestMethod.POST)
    public String aboutUsLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:infos";
    }

    @RequestMapping (value="/contact", method = RequestMethod.POST)
    public String contactLink (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:contact";
    }
    @RequestMapping (value="/category", method = RequestMethod.POST)
    public String category (Model model){
        return "integrated:category";
    }

    @RequestMapping (value ="/beerDetails", method = RequestMethod.POST)
    public String beerDetailsLink (Model model){
        return "integrated:beerDetails";
    }

    public String getCurrentLanguage(){
        Locale locale = LocaleContextHolder.getLocale();
        return locale.getLanguage();
    }
}
