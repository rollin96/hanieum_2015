package com.example.persistence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.IntegrationTest;

public class UserMapperTest extends IntegrationTest{

	Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Autowired UserMapper userMapper;
	
	@Test
	public void testFindByName() {
		logger.info( this.userMapper.findByName("user").toString() );
	}

}
