package com.exmaple.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.IntegrationTest;
import com.example.persistence.model.User;
import com.example.service.UserService;

public class UserServiceTest extends IntegrationTest {

	@Autowired private UserService userService;
	
	@Test
	public void testFindByUserName() {
		User user = userService.findByUserName("user");
		System.out.println(user);
		Assert.assertNotNull( user );
	}

	@Test
	public void testFindAll() {
		Assert.assertNotNull( userService.findAll() );
	}

}
