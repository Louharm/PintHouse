package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="country")
public class CountryEntity {
    @Id
    @Column(name = "nameen")
    private String nameEn;

    @Column(name = "namefr")
    private String nameFR;

    public CountryEntity() {
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameFR() {
        return nameFR;
    }
}
