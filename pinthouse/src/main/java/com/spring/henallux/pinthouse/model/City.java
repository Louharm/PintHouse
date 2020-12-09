package com.spring.henallux.pinthouse.model;

public class City {
    private Integer id;
    private String name;
    private Integer postCode;
    private String countryName;

    public City(Integer id, String name, Integer postCode, String countryName) {
        this.id = id;
        this.name = name;
        this.postCode = postCode;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
