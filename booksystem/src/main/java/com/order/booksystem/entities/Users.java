package com.order.booksystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class Users {
	
	@Id
	private Long user_id;
	private String name;
	private String email;
	private String password;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
