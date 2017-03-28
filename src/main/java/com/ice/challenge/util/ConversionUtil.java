package com.ice.challenge.util;

import com.ice.challenge.dto.StockDto;
import com.ice.challenge.entity.Stock;

public class ConversionUtil {

    public static Stock externalToInternal(StockDto external) {
        Stock stock = new Stock();
        stock.setStockSymbol(external.getStockSymbol());
        if (external.getSharesOwned() != null) {
            stock.setSharesOwned(Integer.parseInt(external.getSharesOwned()));
        }
        return stock;
    }

    public static StockDto internalToExternal(Stock internal) {
        StockDto stockDto = new StockDto();
        stockDto.setStockSymbol(internal.getStockSymbol());
        stockDto.setSharesOwned(String.valueOf(internal.getSharesOwned()));
        return stockDto;
    }
}
