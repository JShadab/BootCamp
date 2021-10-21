package com.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("Hello From Maven Project..");

//		Engine engine= new Engine();
//
//		Car obj1 = new Car();

//		obj1.setEngine(engine);
//		obj1.setBrand("BMW");

//		obj1.move();
//
//		Vehicle obj2 = new Bike();
//		obj2.move();

		// -----------------------------------------------------------------------

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //relative path
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("D:\\workspace_Oct_7\\SpringDemo1\\src\\main\\java\\spring.xml"); // absolute path

//		Car car1 = (Car) context.getBean("car");
//		System.out.println(car1);
//		
//		Car car2 = (Car) context.getBean("car");
//		System.out.println(car2);
//		
//		Car car3 = (Car) context.getBean("car");
//		System.out.println(car3);
		

		Bike bike = (Bike) context.getBean("bike");
		bike.move();

	}

}
