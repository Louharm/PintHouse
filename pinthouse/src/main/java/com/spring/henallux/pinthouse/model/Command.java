package com.spring.henallux.pinthouse.model;

import java.util.GregorianCalendar;

public class Command {
    private Integer id;
    private GregorianCalendar commandeDate;
    private Integer userId;

    public Command(Integer id, GregorianCalendar commandeDate, Integer userId) {
        this.id = id;
        this.commandeDate = commandeDate;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GregorianCalendar getCommandeDate() {
        return commandeDate;
    }

    public void setCommandeDate(GregorianCalendar commandeDate) {
        this.commandeDate = commandeDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
