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

    public User(Integer id, String lastName, String firstName, String password, String email, GregorianCalendar birthdate, String street, Integer numHouse, String phoneNumber, Integer cityId) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.email = email;
        this.birthdate = birthdate;
        this.street = street;
        this.numHouse = numHouse;
        this.phoneNumber = phoneNumber;
        this.cityId = cityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(GregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(Integer numHouse) {
        this.numHouse = numHouse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
