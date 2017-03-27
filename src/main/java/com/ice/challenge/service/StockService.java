package com.ice.challenge.service;

import com.ice.challenge.entity.Stock;
import com.ice.challenge.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock create(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock findOne(String stockSymbol) {
        return stockRepository.findOne(stockSymbol);
    }

    public List<Stock> findAll() {
        List<Stock> listOfStock = new ArrayList<>();
        stockRepository.findAll().forEach(listOfStock::add);
        return  listOfStock;
    }

    public void delete(String stockSymbol) {
        stockRepository.delete(stockSymbol);
    }
}
