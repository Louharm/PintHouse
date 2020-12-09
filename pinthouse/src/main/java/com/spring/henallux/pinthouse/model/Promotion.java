package com.spring.henallux.pinthouse.model;

import java.util.GregorianCalendar;

public class Promotion {
    private Integer id;
    private GregorianCalendar dateStart;
    private GregorianCalendar dateEnd;
    private Integer value;

    public Promotion(Integer id, GregorianCalendar dateStart, GregorianCalendar dateEnd, Integer value) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GregorianCalendar getDateStart() {
        return dateStart;
    }

    public void setDateStart(GregorianCalendar dateStart) {
        this.dateStart = dateStart;
    }

    public GregorianCalendar getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(GregorianCalendar dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
