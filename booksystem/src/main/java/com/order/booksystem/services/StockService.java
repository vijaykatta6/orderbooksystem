package com.order.booksystem.services;

import java.util.List;

import com.order.booksystem.entities.Stocks;

public interface StockService {

 public	List<Stocks> getStocks();

public void addStock(Stocks stocks);



}
