package com.ice.challenge.controller;

import com.ice.challenge.dto.StockDto;
import com.ice.challenge.service.StockService;
import com.ice.challenge.util.ConversionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path ="/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping(value = "/{stockSymbol}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody StockDto findOne(@PathVariable("stockSymbol") String stockSymbol) {
        if (stockSymbol != null) {
            return ConversionUtil.internalToExternal(stockService.findOne(stockSymbol));
        } else
            return null;
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody List<StockDto> findAll() {
        return stockService.findAll().stream().map(stock -> ConversionUtil.internalToExternal(stock)).collect(Collectors.toList());
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StockDto create(@RequestBody StockDto stockDto) {
        return ConversionUtil.internalToExternal(stockService.create(ConversionUtil.externalToInternal(stockDto)));
    }

    @RequestMapping(value = "/{stockSymbol}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable("stockSymbol") String stockSymbol) {
        stockService.delete(stockSymbol);
    }

}


