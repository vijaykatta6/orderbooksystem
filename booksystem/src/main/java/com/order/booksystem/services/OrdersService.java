package com.order.booksystem.services;

import java.util.List;

import com.order.booksystem.entities.Orders;

public interface OrdersService {

	public List<Orders> getOrders();

	public void addOrders(Orders orders);

}
