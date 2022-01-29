package com.order.booksystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.order.booksystem.entities.Users;

public interface UserDao extends JpaRepository<Users, Long> {
	
	@Query(value="from users where email=?1")
	void verify(String email);

}
