package com.tushar.learning;

public class Sphere extends Shape3D {
    private double radius, volume, sA;
	
	public Sphere(int r) {
		this.radius = r;
		}


	public double getVolume() {
		return volume;
	}

	
	public double getsA() {
		return sA;
	}


	public void volume() {
		volume = 1.33*PI*radius*radius*radius;
		
	}

	public void surfaceArea() {
		sA = 4*PI*radius;
		
	}

}
