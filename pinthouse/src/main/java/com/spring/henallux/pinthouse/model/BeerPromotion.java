package com.spring.henallux.pinthouse.model;

public class BeerPromotion {
    private String beerName;
    private Integer promotionId;

    public BeerPromotion(String beerName, Integer promotionId) {
        this.beerName = beerName;
        this.promotionId = promotionId;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }
}
