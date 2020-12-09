package com.spring.henallux.pinthouse.model;

public class CommandLine {
    private Integer id;
    private Double realPrice;
    private String beerName;
    private Integer commandId;

    public CommandLine(Integer id, Double realPrice, String beerName, Integer commandId) {
        this.id = id;
        this.realPrice = realPrice;
        this.beerName = beerName;
        this.commandId = commandId;
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
