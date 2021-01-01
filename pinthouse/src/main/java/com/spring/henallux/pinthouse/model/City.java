package com.spring.henallux.pinthouse.model;

public class City {
    private Integer id;
    private String name;
    private String postCode;
    private Integer country;

    public City(String name, String postCode, Integer country) {
        this.name = name;
        this.postCode = postCode;
        this.country = country;
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

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }
}
