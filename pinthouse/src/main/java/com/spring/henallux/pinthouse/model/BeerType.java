package com.spring.henallux.pinthouse.model;

public class BeerType {
    private String typeNameEn;
    private String nomFr;

    public BeerType(String typeNameEn, String nomFr) {
        this.typeNameEn = typeNameEn;
        this.nomFr = nomFr;
    }

    public String getTypeNameEn() {
        return typeNameEn;
    }

    public void setTypeNameEn(String typeNameEn) {
        this.typeNameEn = typeNameEn;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }
}
