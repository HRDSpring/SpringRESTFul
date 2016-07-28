package com.kshrd.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshrd.model.Role;
import com.kshrd.model.User;
import com.kshrd.repository.UserRepository;
import com.kshrd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public ArrayList<User> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public boolean addUser(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userRepository.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId , int roleId) {
		return userRepository.deleteUser(userId , roleId);
	}

}
