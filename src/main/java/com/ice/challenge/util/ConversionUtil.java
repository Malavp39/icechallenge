package com.ice.challenge.util;

import com.ice.challenge.dto.StockDto;
import com.ice.challenge.entity.Stock;

public class ConversionUtil {

    public static Stock externalToInternal(StockDto external) {
        Stock stock = new Stock();
        stock.setLastTradePrice(new Float(external.getLastTradePrice()));
        stock.setName(external.getName());
        stock.setNumberOfShares(new Integer(external.getNumberOfShares()));
        stock.setStockSymbol(external.getStockSymbol());
        return stock;
    }

    public static StockDto internalToExternal(Stock internal) {
        StockDto stockDto = new StockDto();
        stockDto.setName(internal.getName());
        stockDto.setLastTradePrice(Float.toString(internal.getLastTradePrice()));
        stockDto.setNumberOfShares(Integer.toString(internal.getNumberOfShares()));
        stockDto.setStockSymbol(internal.getStockSymbol());
        if(internal.getLastTradePrice() != null && internal.getNumberOfShares() != null){
            stockDto.setMarketValueOfStake(String.valueOf(internal.getLastTradePrice()* new Float(internal.getNumberOfShares())));
        }
        return stockDto;
    }

}
