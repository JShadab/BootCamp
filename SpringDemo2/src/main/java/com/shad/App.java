package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("Hello From Maven Project..");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bike bike = (Bike) context.getBean("pulsar");
		bike.move();

	}

}
