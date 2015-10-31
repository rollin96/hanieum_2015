package com.exmaple.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.IntegrationTest;

public class UserServiceTest extends IntegrationTest {

	@Autowired private UserService userService;
	
	@Test
	public void testFindByUserName() {
		Assert.assertNotNull( userService.findByUserName("user"));
	}

	@Test
	public void testFindAll() {
		Assert.assertNotNull( userService.findAll() );
	}

}
