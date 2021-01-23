package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.*;

@Entity(name = "Command_Line")
public class CommandLineEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "real_price")
    private Double realPrice;

    @Column(name = "beer_name")
    private String beerName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "command_id")
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
