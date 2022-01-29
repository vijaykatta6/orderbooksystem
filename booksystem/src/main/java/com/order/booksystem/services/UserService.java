package com.order.booksystem.services;

import java.util.List;

import com.order.booksystem.entities.Users;

public interface UserService {

  public List<Users> getUsers();

public void addUser(Users users);

public void verifyLogin(String email);



}
