package com.tushar.learning;

public class Vehicle {
	private String color, model;
	private int noOfWheels;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColor() {
		return color;
	}
	

	public String getModel() {
		return model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public String fuel() {
		return "Disel";
	}
	
	public void display() {
		System.out.println("Vehicle color is "+color+", model is "+model+", Nos of wheels are "+noOfWheels);
	}

}
