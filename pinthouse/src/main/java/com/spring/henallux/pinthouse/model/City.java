package com.spring.henallux.pinthouse.model;

public class City {
    private Integer id;
    private String name;
    private String postCode;
    private String countryName;

    public City(String name, String postCode, String countryName) {
        this.name = name;
        this.postCode = postCode;
        this.countryName = countryName;
    }

    public City() {}

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
