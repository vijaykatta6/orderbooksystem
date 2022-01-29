package com.order.booksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.booksystem.entities.Stocks;
import com.order.booksystem.services.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping("/stocks")
	public List<Stocks> getStocks()
	{
		return this.stockService.getStocks();	
	}
	
	@PostMapping("/stocks")
	public String addStock(@RequestBody Stocks stocks)
	{
		this.stockService.addStock(stocks);
		return "Stocks added successfully";
	}
	
	
	
	

}
