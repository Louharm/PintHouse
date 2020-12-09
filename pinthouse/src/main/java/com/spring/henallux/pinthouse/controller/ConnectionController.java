package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.model.form.ConnectionForm;
import com.spring.henallux.pinthouse.model.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/connection")
public class ConnectionController extends SuperController {
    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Pinthouse");
        model.addAttribute(Constants.CURRENT_USER, new ConnectionForm());
        return "integrated:connection";
    }
    @RequestMapping (value="/send",method = RequestMethod.POST)
    public String getFormData(Model model, @ModelAttribute(value= Constants.CURRENT_USER) ConnectionForm user){
        return "integrated:connection";
    }

    @RequestMapping(value = "/inscriptioner", method = RequestMethod.POST)
    public String goToInscription(Model model) {
        System.out.println("hey");
        return "integrated:inscription";
    }
}