package com.spring.henallux.pinthouse.dataAccess.entity;

import com.spring.henallux.pinthouse.model.CommandLine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "commandline")
public class CommandLineEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "realprice")
    private Double realPrice;

    @Column(name = "beername")
    private String beerName;

    @Column(name = "commandeid")
    private Integer commandId;

    public CommandLineEntity(){

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
