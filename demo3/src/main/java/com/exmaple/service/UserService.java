package com.exmaple.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.persistence.AuthorityMapper;
import com.example.persistence.UserMapper;
import com.example.persistence.model.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AuthorityMapper authorityMapper;

	public User findByUserName(String username) {
		
		return new User();
	}
	
	public List<User> findAll() {
		
		return new ArrayList<>();
	}
}
