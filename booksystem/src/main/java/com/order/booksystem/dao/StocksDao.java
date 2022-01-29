package com.order.booksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.booksystem.entities.Stocks;

public interface StocksDao extends JpaRepository<Stocks, Long> {

}
