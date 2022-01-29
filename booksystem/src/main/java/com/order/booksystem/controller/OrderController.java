package com.order.booksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.booksystem.entities.Orders;
import com.order.booksystem.services.OrdersService;

@RestController
public class OrderController {
	
	@Autowired
	private OrdersService ordersService;
	
	
	@GetMapping("/orders")
	public List<Orders> getOrders()
	{
		return this.ordersService.getOrders();
		
	}
	
	@PostMapping("/orders")
	public String addOrders(@RequestBody Orders orders)
	{
		this.ordersService.addOrders(orders);
		return "orders Added  !!!!";
	}
	
	

}
