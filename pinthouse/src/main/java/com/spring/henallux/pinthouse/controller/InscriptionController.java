package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.Service.CountryService;
import com.spring.henallux.pinthouse.dataAccess.dao.CityDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.UserDataAccess;
import com.spring.henallux.pinthouse.model.Country;
import com.spring.henallux.pinthouse.model.User;
import com.spring.henallux.pinthouse.model.form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;


@Controller
@RequestMapping(value="/inscription")
public class InscriptionController extends SuperController {
    private UserDataAccess userDataAccess;
    private CityDataAccess cityDataAccess;
    private CountryDataAccess countryDataAccess;
    private CountryService countryService;
    ArrayList<Country> countries;

    @Autowired
    public InscriptionController(UserDataAccess userDataAccess, CityDataAccess cityDataAccess, CountryDataAccess countryDataAccess, CountryService countryService){
        this.userDataAccess = userDataAccess;
        this.cityDataAccess = cityDataAccess;
        this.countryDataAccess = countryDataAccess;
        this.countryService = countryService;
    }

    @ModelAttribute(Constants.CURRENT_USER)
    public UserForm user(){
        return new UserForm();
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        countries = countryDataAccess.getAllCountries();
        countryService.setCountry(countries);
        model.addAttribute("countries", countryService.getCountry());
        model.addAttribute("title","Pinthouse");
        model.addAttribute(Constants.CURRENT_USER, new UserForm());
        return "integrated:inscription";
    }
    @RequestMapping (value="/send",method = RequestMethod.POST)
    public String getFormData(Model model, @ModelAttribute(value=Constants.CURRENT_USER) UserForm user){
        System.out.println(user.getCountry());
        if(user.getConfirmPassword().equals(user.getPassword())){
            //userDataAccess.save(user);
            return "";
        }else{
            return "integrated:userInscription";
        }
    }

}


