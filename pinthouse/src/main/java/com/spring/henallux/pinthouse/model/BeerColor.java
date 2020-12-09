package com.spring.henallux.pinthouse.model;

public class BeerColor {
    private String nameColorEn;
    private String nomFr;

    public BeerColor(String nameColorEn, String nomFr) {
        this.nameColorEn = nameColorEn;
        this.nomFr = nomFr;
    }

    public String getNameColorEn() {
        return nameColorEn;
    }

    public void setNameColorEn(String nameColorEn) {
        this.nameColorEn = nameColorEn;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }
}
