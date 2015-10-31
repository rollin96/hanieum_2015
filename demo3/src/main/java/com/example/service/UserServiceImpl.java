package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.persistence.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
//	@Autowired
//	private UserMapper userMapper;
//	
//	@Autowired
//	private AuthorityMapper authorityMapper;
//
	public User findByUserName(String username) {
		
		return new User();
	}
	
	public List<User> findAll() {
		
		return new ArrayList<>();
	}
}
