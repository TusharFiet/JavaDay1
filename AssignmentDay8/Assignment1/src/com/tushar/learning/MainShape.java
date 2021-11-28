package com.tushar.learning;

public class MainShape {
	public static void main(String[] args) {
		
		Cylinder cOb = new Cylinder(11,5);
		Sphere sOb = new Sphere(4);
		Cube ccOb = new Cube(10);
		
		cOb.volume();
		cOb.surfaceArea();
		
		sOb.volume();
		sOb.surfaceArea();
		
		ccOb.volume();
		ccOb.surfaceArea();
		
		
		System.out.println("Cylinder Volume is "+cOb.getVolume());
		System.out.println("Cylinder SurfaceArea is "+cOb.getsA());
		
		System.out.println("Sphere Volume is "+sOb.getVolume());
		System.out.println("Sphere SurfaceArea is "+sOb.getsA());
		
		System.out.println("Cube Volume is "+ccOb.getVolume());
		System.out.println("Cube SurfaceArea is "+ccOb.getsA());
	}

}
