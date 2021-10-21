package com.shad.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.shad.model.Bike;
import com.shad.model.Car;

@Configuration
@ComponentScan(basePackages = "com.shad.model")
public class SpringConfig {

	@Bean	
	public Bike getBike() {
		return new Bike();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Car getCar() {
		return new Car();
	}

}
