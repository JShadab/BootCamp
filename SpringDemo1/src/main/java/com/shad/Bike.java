package com.shad;

public class Bike implements Vehicle {

	private String company;
	private double cost;

	public Bike(double cost) {
		this.cost = cost;
	}

	public void move() {
		System.out.println(company + " Bike is moving... and cost is " + cost);
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
