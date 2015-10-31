package com.example.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.example.persistence")        // mapperScannerConfigurer 설명 참고.
@EnableTransactionManagement
public class MybatisConfig {
	
	/*
	 * DataSource에 대한 설정은 spring-boot-stater-jdbc를 이용하여 한다.
	 * application.properties에 DataSource에 대한 정보가 있다. 
	 */
	@Bean
	public SqlSessionFactory userSqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		
		// typeAliase 설정: xml 파일에 <typeAlias>를 지정하는 대신 아래와 같이 특정 패키지의 모든 POJO를 등록해줄 수 있다.
		// 참고: https://mybatis.github.io/spring/ko/sample.html
		factory.setTypeAliasesPackage("com.example.persistence.model");
		
		// settings라던가 typeHandler 등의 설정을 담아두는 파일 지정.
		factory.setConfigLocation(new PathMatchingResourcePatternResolver()
		    .getResource("classpath:/config/mybatis-config.xml"));
		
		return factory.getObject();
	}


	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
}
