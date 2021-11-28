package com.tushar.learning;

public class Bus extends Vehicle {
	
	public Bus(String color, String model, int noOfWheels) {
		this.setColor(color);
		this.setModel(model);
		this.setNoOfWheels(noOfWheels);
	}
	
	
	public String Type() {
		return "Public Transport";
	}



}
