package com.tushar.learning;

public class Road {

	public static void main(String[] args) {
		
		Truck tOb = new Truck("Brown", "Tata Prima", 16);
		Bus bOb = new Bus("Orange", "Scania", 6);
		Car cOb = new Car("Golden","Lamborghini", 4);
		
		System.out.println("Truck color is "+tOb.getColor()+", model is "+tOb.getModel()+", Nos of wheels are "+tOb.getNoOfWheels()+", fuel type is "+tOb.fuel()+ ", and used for "+tOb.Type());
		System.out.println("Bus color is "+bOb.getColor()+", model is "+bOb.getModel()+", Nos of wheels are "+bOb.getNoOfWheels()+", fuel type is "+bOb.fuel()+ ", and used for "+bOb.Type());
		System.out.println("Car color is "+cOb.getColor()+", model is "+cOb.getModel()+", Nos of wheels are "+cOb.getNoOfWheels()+", fuel type is "+cOb.fuel()+ ", and used for "+cOb.Type());

	}

}
