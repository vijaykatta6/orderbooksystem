package com.order.booksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="stocks")
public class Stocks {
	
	@Id
	private Long stock_id;
	private String stock_name;
	private String stock_price;
	public Long getStock_id() {
		return stock_id;
	}
	public void setStock_id(Long stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getStock_price() {
		return stock_price;
	}
	public void setStock_price(String stock_price) {
		this.stock_price = stock_price;
	}
	@Override
	public String toString() {
		return "Stocks [stock_id=" + stock_id + ", stock_name=" + stock_name + ", stock_price=" + stock_price + "]";
	}
	
	
	

}
