package com.shad;

import org.springframework.stereotype.Component;

@Component("pulsar")
public class Bike {
	
	public void move() {

		System.out.println("Bike is moving...");
	}

}
