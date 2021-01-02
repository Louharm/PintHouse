package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Beer")
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

    @Column(name = "brewery")
    private Integer brewery;

    @Column(name = "country")
    private Integer country;

    @Column(name = "Beer_Type")
    private Integer beerType;

    @Column(name = "Beer_Color")
    private Integer beerColor;

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

    public Integer getBrewery() {
        return brewery;
    }

    public void setBrewery(Integer brewery) {
        this.brewery = brewery;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getBeerType() {
        return beerType;
    }

    public void setBeerType(Integer beerType) {
        this.beerType = beerType;
    }

    public Integer getBeerColor() {
        return beerColor;
    }

    public void setBeerColor(Integer beerColor) {
        this.beerColor = beerColor;
    }
}
