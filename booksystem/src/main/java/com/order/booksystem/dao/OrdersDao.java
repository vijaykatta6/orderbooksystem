package com.order.booksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.booksystem.entities.Orders;

public interface OrdersDao extends JpaRepository<Orders, Long> {

}
