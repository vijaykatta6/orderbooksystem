package com.order.booksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.booksystem.dao.OrdersDao;
import com.order.booksystem.entities.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersDao ordersDao;

	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		return ordersDao.findAll();
	}

	@Override
	public void addOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.save(orders);
	}

}
