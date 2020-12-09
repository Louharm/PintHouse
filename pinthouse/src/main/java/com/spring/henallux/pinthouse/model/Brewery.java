package com.spring.henallux.pinthouse.model;

public class Brewery {
    private String nameEn;
    private String nomFr;

    public Brewery(String nameEn, String nameFr) {
        this.nameEn = nameEn;
        this.nomFr = nameFr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameFr() {
        return nomFr;
    }

    public void setNameFr(String nameFr) {
        this.nomFr = nameFr;
    }
}
