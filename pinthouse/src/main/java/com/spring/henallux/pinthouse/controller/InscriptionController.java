package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/inscription")
public class InscriptionController extends SuperController {
    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title","Pinthouse");
        return "integrated:inscription";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String inscription(Model model,
                              @ModelAttribute(value = Constants.CURRENT_USER) User user){
        return "integrated:inscription";
    }

}


