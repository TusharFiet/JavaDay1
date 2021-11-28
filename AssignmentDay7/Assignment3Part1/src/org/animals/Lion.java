package org.animals;

public class Lion {
	private int weight, age;
	private String color;
	
	public Lion(String color, int weight, int age) {
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
		return false;
	}
	
	public boolean canClimb(){
		return true;
	}
	
	public String sound(){
		return "Roar";
	}
	
}
