package com.spring.henallux.pinthouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/aboutUs")
public class InfosController extends SuperController {
    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:infos";
    }
}

