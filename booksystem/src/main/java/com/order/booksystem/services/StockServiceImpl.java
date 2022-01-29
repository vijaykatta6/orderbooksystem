package com.order.booksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.booksystem.dao.StocksDao;
import com.order.booksystem.entities.Stocks;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StocksDao stocksDao;

	@Override
	public List<Stocks> getStocks() {
	
		return stocksDao.findAll();
	}

	@Override
	public void addStock(Stocks stocks) {
		// TODO Auto-generated method stub
		stocksDao.save(stocks);
	}

	
	

}
