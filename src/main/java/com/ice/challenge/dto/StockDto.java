package com.ice.challenge.dto;

public class StockDto {

    private String stockSymbol;

    private String sharesOwned;

    public String getSharesOwned() {
        return sharesOwned;
    }

    public void setSharesOwned(String sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
}