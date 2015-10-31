package com.example.persistence;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.persistence.model.User;

public interface UserMapper {
    
	public User findByName(@Param("username")String username);
	
	public List<User> findAll();
}
