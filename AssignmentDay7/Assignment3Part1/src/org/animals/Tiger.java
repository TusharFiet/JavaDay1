package org.animals;

public class Tiger {
	private int weight, age;
	private String color;
	
	public Tiger(String color, int weight, int age) {
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	public int getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	public boolean isVegetarian(){
		return true;
	}
	
	public boolean canClimb(){
		return false;
	}
	
	public String sound(){
		return "Roar";
	}

}
