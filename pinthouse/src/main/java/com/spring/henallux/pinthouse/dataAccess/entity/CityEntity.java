package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="city")
public class CityEntity {
    @Id
    @Column(name = "id")
    private Integer idCity;

    @Column(name = "name")
    private String name;
    @Column(name = "postcode")
    private String postCode;
    @Column(name = "countryname")
    private String countryName;

    public CityEntity() {
    }

    public Integer getIdCity() {
        return idCity;
    }

    public String getName() {
        return name;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountryName() {
        return countryName;
    }
}
