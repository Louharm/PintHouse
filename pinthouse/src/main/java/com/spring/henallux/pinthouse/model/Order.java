package com.spring.henallux.pinthouse.model;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Integer id;
    private Date commandeDate;
    private Integer userId;
    private ArrayList<CommandLine> commandLines;

    public Order() {
    }

    public Order(Date commandeDate, Integer userId, ArrayList<CommandLine> commandLines) {
        this.commandeDate = commandeDate;
        this.userId = userId;
        this.commandLines = commandLines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCommandeDate() {
        return commandeDate;
    }

    public void setCommandeDate(Date commandeDate) {
        this.commandeDate = commandeDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ArrayList<CommandLine> getCommandLines() {
        return commandLines;
    }

    public void setCommandLines(ArrayList<CommandLine> commandLines) {
        this.commandLines = commandLines;
    }
}
