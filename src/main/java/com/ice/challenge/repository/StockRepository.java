package com.ice.challenge.repository;

import com.ice.challenge.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, String>{
}
