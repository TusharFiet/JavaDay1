package com.tushar.learning;

public class City {

	public static void main(String[] args) {
		
		Vehicle tOb = new Truck("Brown", "Tata Prima", 16);
		Vehicle bOb = new Bus("Orange", "Scania", 6);
		Vehicle cOb = new Car("Golden","Lamborghini", 4);
		
		tOb.display();
		bOb.display();
		cOb.display();
		
		//tOb.Type();
	}

}
