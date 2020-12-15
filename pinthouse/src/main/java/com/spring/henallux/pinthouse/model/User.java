package com.spring.henallux.pinthouse.model;

import java.util.GregorianCalendar;

public class User {
    private Integer id;
    private String lastName;
    private String firstName;
    private String password;
    private String email;
    private GregorianCalendar birthdate;
    private String street;
    private Integer numHouse;
    private String phoneNumber;
    private Integer cityId;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumHouse() {
        return numHouse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getCityId() {
        return cityId;
    }
}
