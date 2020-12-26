package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="beertype")
public class BeerTypeEntity {
    @Id
    @Column(name = "nameen")
    private String nameEn;

    @Column(name = "namefr")
    private String nameFr;

    public BeerTypeEntity() {
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }
}
