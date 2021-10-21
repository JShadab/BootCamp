package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.config.SpringConfig;
import com.shad.model.Bike;
import com.shad.model.Car;

public class App {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml"); //relative path
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("D:\\workspace_Oct_7\\SpringDemo1\\src\\main\\java\\spring.xml");
		// // absolute path

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Bike bike1 = (Bike) context.getBean("bike");
		Bike bike2 = (Bike) context.getBean("bike");
		System.out.println(bike1);
		System.out.println(bike2);

		System.out.println();

		Car car1 = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car1);
		System.out.println(car2);

	}

}
