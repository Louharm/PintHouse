package com.spring.henallux.pinthouse.model;

public class Beer {
    private String name;
    private String description;
    private Double alcoholPerc;
    private Double capacityCl;
    private Double price;
    private String breweryName;
    private String countryName;
    private String beerTypeName;
    private String beerColor;

    public Beer(String name, String description, Double alcoholPerc, Double capacityCl, Double price, String breweryName, String countryName, String beerTypeName, String beerColor) {
        this.name = name;
        this.description = description;
        this.alcoholPerc = alcoholPerc;
        this.capacityCl = capacityCl;
        this.price = price;
        this.breweryName = breweryName;
        this.countryName = countryName;
        this.beerTypeName = beerTypeName;
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

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBeerTypeName() {
        return beerTypeName;
    }

    public void setBeerTypeName(String beerTypeName) {
        this.beerTypeName = beerTypeName;
    }

    public String getBeerColor() {
        return beerColor;
    }

    public void setBeerColor(String beerColor) {
        this.beerColor = beerColor;
    }
}
