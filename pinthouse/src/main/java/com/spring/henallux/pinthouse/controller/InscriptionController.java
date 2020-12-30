package com.spring.henallux.pinthouse.controller;

import com.spring.henallux.pinthouse.Constants;
import com.spring.henallux.pinthouse.dataAccess.dao.CityDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.CountryDataAccess;
import com.spring.henallux.pinthouse.dataAccess.dao.UserDataAccess;
import com.spring.henallux.pinthouse.model.City;
import com.spring.henallux.pinthouse.model.Country;
import com.spring.henallux.pinthouse.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.regex.Pattern;


@Controller
@RequestMapping(value="/inscription")
public class InscriptionController extends SuperController {
    private UserDataAccess userDataAccess;
    private CityDataAccess cityDataAccess;
    private CountryDataAccess countryDataAccess;
    ArrayList<Country> countries;

    @Autowired
    public InscriptionController(UserDataAccess userDataAccess, CityDataAccess cityDataAccess, CountryDataAccess countryDataAccess){
        this.userDataAccess = userDataAccess;
        this.cityDataAccess = cityDataAccess;
        this.countryDataAccess = countryDataAccess;
        countries = countryDataAccess.getAllCountries();
    }

    @ModelAttribute(Constants.CURRENT_USER)
    public User user(){
        return new User();
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("countries", countries);
        model.addAttribute("title","Pinthouse");
        model.addAttribute("userForm", new User());
        return "integrated:inscription";
    }

    @RequestMapping (value="/send",method = RequestMethod.POST)
    public String getFormData(Model model, @Valid @ModelAttribute(value="userForm") User user, final BindingResult errors){
        if(!errors.hasErrors()){
            if(user.getConfirmPassword().equals(user.getPassword())){
                Country country = countryDataAccess.getCountryByNameFr(user.getCountry());
                City city = new City(user.getCity(), user.getPostCode(), country.getNameEn());
                City cityFound = cityDataAccess.getCityByNameAndCountry(user.getCity(), country.getNameEn());
                if(cityFound == null){
                    city.setId(0);
                    cityDataAccess.save(city);
                    cityFound = cityDataAccess.getCityByNameAndCountry(user.getCity(), country.getNameEn());
                }

                user.setAuthorities("ROLE_USER");
                user.setAccountNonLocked(true);
                user.setAccountNonExpired(true);
                user.setCredentialsNonExpired(true);
                user.setEnabled(true);
                user.setCityId(cityFound.getId());
                user.setIdUser(0);
                user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
                userDataAccess.save(user);
                return "redirect:/authenticated";
            }
        }
        model.addAttribute("title", "Pinthouse");
        model.addAttribute("userForm", user);
        model.addAttribute("countries", countries);
        return "integrated:inscription";
    }

}


