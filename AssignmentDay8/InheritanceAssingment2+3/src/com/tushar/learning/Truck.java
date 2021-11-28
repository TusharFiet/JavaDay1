package com.tushar.learning;

public class Truck extends Vehicle{
	
	public Truck(String color, String model, int noOfWheels) {
		this.setColor(color);
		this.setModel(model);
		this.setNoOfWheels(noOfWheels);
	}
	
	public String Type() {
		return "Goods Transport";
	}

}
