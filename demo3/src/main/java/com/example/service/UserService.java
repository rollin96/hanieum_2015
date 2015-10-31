package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persistence.AuthorityMapper;
import com.example.persistence.UserMapper;
import com.example.persistence.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AuthorityMapper authorityMapper;

	public User findByUserName(String username) {
		
		User user = this.userMapper.findByName(username);
		user.setAuthority( this.authorityMapper.findByName(username));
		return user;
	}
	
	public List<User> findAll() {
		
		return new ArrayList<>();
	}
}
