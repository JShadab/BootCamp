package com.shad;

public class Car implements Vehicle {

	private Engine engine;
	
	private String brand;

	public void move() {

		engine.start();

		System.out.println(brand + " Car is moving...");

	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
