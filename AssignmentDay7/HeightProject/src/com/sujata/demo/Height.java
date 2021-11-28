package com.sujata.demo;

public class Height {
	
	private int feet, inch;
	
	public Height(int feet, int inch) {
		this.feet = feet;
		if(inch > 12) {
			this.feet += (inch / 12);
			this.inch = inch%12;
		}
	}
	
	public void displayHeight() {
		System.out.println("Height is "+feet + " feet "+ inch + " inch.");
	}
}
