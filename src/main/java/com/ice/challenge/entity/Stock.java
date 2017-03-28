package com.ice.challenge.entity;

import javax.persistence.*;

@Entity
public class Stock {

    @Id
    @Column(name = "stockSymbol")
    private String stockSymbol;

    private int sharesOwned;

    public int getSharesOwned() {
        return sharesOwned;
    }

    public void setSharesOwned(int sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }


}
