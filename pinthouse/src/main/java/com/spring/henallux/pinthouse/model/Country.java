package com.spring.henallux.pinthouse.model;

public class Country {
    private String nameEn;
    private String nameFr;

    public Country(String nameEn, String nameFr) {
        this.nameEn = nameEn;
        this.nameFr = nameFr;
    }

    public Country() {
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNomFr(String nameFr) {
        this.nameFr = nameFr;
    }
}
