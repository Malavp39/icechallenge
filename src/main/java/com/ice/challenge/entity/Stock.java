package com.ice.challenge.entity;

import javax.persistence.*;

@Entity
public class Stock {

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "stockSymbol")
    private String stockSymbol;

    @Column(name = "lastTradePrice")
    private Float lastTradePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Float getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(Float lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(Integer numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    @Column(name = "numberOfShares")
    private Integer numberOfShares;

}
