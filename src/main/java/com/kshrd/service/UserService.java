package com.kshrd.service;

import java.util.ArrayList;

import com.kshrd.model.User;

public interface UserService {

	public ArrayList<User> getUsers();
	
	
	public boolean addUser(User user);
	
	
	public boolean updateUser(User user);
	
	
	public boolean deleteUser(int userId , int roleId );
	
}
