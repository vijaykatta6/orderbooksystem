package com.order.booksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.booksystem.entities.Users;
import com.order.booksystem.services.UserService;

@RestController
public class UserController {
	
	boolean flag = false;
	
	@Autowired
	private UserService userService;		
	
	@GetMapping("/users")
	public List<Users> getUsers()
	{
		return this.userService.getUsers();
	}
	
	@PostMapping("/users")
	public String addUser(@RequestBody Users users)
	{
		this.userService.addUser(users);
		return "add successfully";
	}
	
	@PostMapping("/login")
	public String verifyLogin(@RequestParam String email )
	{
		
		
		if(flag  == true)
		{
		this.userService.verifyLogin(email);
		return "verified....!!";
		}
		else
		{
			return "Unable to login please to and register...";
		}
	}
	
	
 
	
	
	

}
