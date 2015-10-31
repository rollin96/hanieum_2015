package com.example.persistence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.IntegrationTest;

public class AuthorityMapperTest extends IntegrationTest{

	Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Autowired AuthorityMapper authorityMapper;
	
	@Test
	public void testFindByName() {
		logger.info( this.authorityMapper.findByName("user").toString() );
	}
}
