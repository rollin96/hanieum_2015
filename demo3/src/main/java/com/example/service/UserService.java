package com.example.service;

import java.util.List;

import com.example.persistence.model.User;

public interface UserService {
	
	public User findByUserName(String username);
	
	public List<User> findAll();
}
