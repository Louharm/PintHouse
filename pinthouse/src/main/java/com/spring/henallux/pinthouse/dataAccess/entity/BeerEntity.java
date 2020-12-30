package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="beer")
public class BeerEntity {
    @Id
    @Column(name= "name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="alcoholperc")
    private Double alcoholPerc;

    @Column(name="capacitycl")
    private Double capacityCl;

    @Column(name="price")
    private Double price;

    @Column(name = "breweryname")
    private String breweryName;

    @Column(name = "countryname")
    private String countryName;

    @Column(name = "beertypename")
    private String beerTypeName;

    @Column(name = "beercolor")
    private String beerColor;

    public BeerEntity() {
    }

    public Double getCapacityCl() {
        return capacityCl;
    }

    public void setCapacityCl(Double capacityCl) {
        this.capacityCl = capacityCl;
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
