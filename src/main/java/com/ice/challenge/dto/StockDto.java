package com.ice.challenge.dto;

public class StockDto {
    private String name;
    private String stockSymbol;
    private String lastTradePrice;
    private String numberOfShares;
    private String marketValueOfStake;

    public String getMarketValueOfStake() {
        return marketValueOfStake;
    }

    public void setMarketValueOfStake(String marketValueOfStake) {
        this.marketValueOfStake = marketValueOfStake;
    }

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

    public String getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(String lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public String getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(String numberOfShares) {
        this.numberOfShares = numberOfShares;
    }
}