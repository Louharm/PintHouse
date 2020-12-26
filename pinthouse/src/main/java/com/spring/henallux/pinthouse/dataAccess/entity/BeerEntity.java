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
}
