package com.shad;

public class Engine {

	private double power;

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void start() {

		System.out.println("Engine is starting.... with power "+ power + " CC");
	}

}
