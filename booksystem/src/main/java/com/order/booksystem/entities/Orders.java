package com.order.booksystem.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="orders")
public class Orders {
	
	@Id
	private Long order_id;
	private Long user_id;
	private Long stock_id;
	private String order_type;
	private String order_quantity;
	private String order_status;
	private Date date;
	private int order_executed;
	
	public int getOrder_executed() {
		return order_executed;
	}
	public void setOrder_executed(int order_executed) {
		this.order_executed = order_executed;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getStock_id() {
		return stock_id;
	}
	public void setStock_id(Long stock_id) {
		this.stock_id = stock_id;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(String order_quantity) {
		this.order_quantity = order_quantity;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", user_id=" + user_id + ", stock_id=" + stock_id + ", order_type="
				+ order_type + ", order_quantity=" + order_quantity + ", order_status=" + order_status + ", date="
				+ date + ", order_executed=" + order_executed + "]";
	}
	

}
