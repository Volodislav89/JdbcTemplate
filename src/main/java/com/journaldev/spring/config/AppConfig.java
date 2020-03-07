package com.journaldev.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.journaldev.spring")
//@PropertySource("classpath:database.properties")
public class AppConfig {

//	@Autowired
//	Environment environment;

	private final String URL = "jdbc:postgresql://ec2-54-246-100-246.eu-west-1.compute.amazonaws.com:5432/da2sstjso3raqk?sslmode=require";
	private final String USER = "qrxmeekdlwgmyq";
	private final String DRIVER = "org.postgresql.Driver";
	private final String PASSWORD = "c4128d4ae246aa0357d2ef2b910827fecb472297ba22e08a8dc50f02e822b7ff";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		driverManagerDataSource.setUsername(USER);
		driverManagerDataSource.setPassword(PASSWORD);
		driverManagerDataSource.setDriverClassName(DRIVER);
		return driverManagerDataSource;
	}
}
