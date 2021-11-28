package com.tushar.learning;

public class Car extends Vehicle {
	
	public Car(String color, String model, int noOfWheels) {
		this.setColor(color);
		this.setModel(model);
		this.setNoOfWheels(noOfWheels);
	}
	
	public String Type() {
		return "Personal Transport";
	}


}
