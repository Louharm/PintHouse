package com.spring.henallux.pinthouse.model;

public class Beer {
    private String name;
    private String description;
    private Double alcoholPerc;
    private Double capacityCl;
    private Double price;
    private String brewery;
    private String country;
    private String beerType;
    private String beerColor;

    public Beer(String name, String description, Double alcoholPerc, Double capacityCl, Double price, String brewery, String country, String beerType, String beerColor) {
        this.name = name;
        this.description = description;
        this.alcoholPerc = alcoholPerc;
        this.capacityCl = capacityCl;
        this.price = price;
        this.brewery = brewery;
        this.country = country;
        this.beerType = beerType;
        this.beerColor = beerColor;
    }

    public Beer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAlcoholPerc() {
        return alcoholPerc;
    }

    public void setAlcoholPerc(Double alcoholPerc) {
        this.alcoholPerc = alcoholPerc;
    }

    public Double getCapacityCl() {
        return capacityCl;
    }

    public void setCapacityCl(Double capacityCl) {
        this.capacityCl = capacityCl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    public String getBeerColor() {
        return beerColor;
    }

    public void setBeerColor(String beerColor) {
        this.beerColor = beerColor;
    }
}
