package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/authenticated")
public class AuthenticatedController extends SuperController {

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Pinthouse");
        model.addAttribute(Constants.CURRENT_USER, new User());
        return "integrated:authenticated";
    }
}
