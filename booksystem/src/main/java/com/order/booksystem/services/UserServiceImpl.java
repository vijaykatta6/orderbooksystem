package com.order.booksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.booksystem.dao.UserDao;
import com.order.booksystem.entities.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Users> getUsers() {
		
		return userDao.findAll();
	}

	@Override
	public void addUser(Users users) {
		
		userDao.save(users);
		
	}

	Users obj = new Users();
	
	@Override
	public void verifyLogin(String email) {
		// TODO Auto-generated method stub
		if(email.equalsIgnoreCase(obj.getEmail()))
		{
			userDao.verify(email);
			
		}
		
		
	}
	
	

}
