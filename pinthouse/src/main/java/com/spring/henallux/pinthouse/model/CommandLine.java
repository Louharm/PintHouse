package com.spring.henallux.pinthouse.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CommandLine {
    private Integer id;
    private Double realPrice;
    private String beerName;
    private Integer commandId;
    @NotNull
    private Integer quantity;

    public CommandLine(Integer id, Double realPrice, String beerName, Integer commandId, Integer quantity) {
        this.id = id;
        this.realPrice = realPrice;
        this.beerName = beerName;
        this.commandId = commandId;
        this.quantity = quantity;
    }

    public CommandLine(Integer quantity){
        this.quantity = quantity;
    }

    public CommandLine() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }
}
