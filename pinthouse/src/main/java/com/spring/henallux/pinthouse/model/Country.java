package com.spring.henallux.pinthouse.model;

public class Country {
    private String nameEn;
    private String nomFr;

    public Country(String nameEn, String nomFr) {
        this.nameEn = nameEn;
        this.nomFr = nomFr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }
}
