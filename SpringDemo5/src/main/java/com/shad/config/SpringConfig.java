package com.shad.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.shad.model, com.shad.dao")
public class SpringConfig {

	@Bean
	public JdbcTemplate getJdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

		return jdbcTemplate;
	}
	
	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:3306/boot_camp_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	

}
