package org.zoo;

import org.animals.*;

public class DelhiZoo {
	
	Lion lOb = new Lion("Brown", 300, 30);
	Tiger tOb = new Tiger("Yello", 250, 28);
	Deer dOb = new Deer("Red-Brown", 100, 12);
	Monkey mOb = new Monkey("Brown", 30, 12);
	Elephant eOb = new Elephant("Grey", 4000, 10);
	Giraffe gOb = new Giraffe("Brown", 150, 25);
	
	public void display() {
		System.out.print("\nweight of a lion is " +lOb.getWeight()+" kg. age of a lion is "+lOb.getAge() +" years. colour of a lion is "+lOb.getColor()+". lion is a vegetarian "+lOb.isVegetarian()+". lion can climb on the tree "+ lOb.canClimb()+". the sound of a lion is "+lOb.sound()+".\n\n");
		
		System.out.print("weight of a tiger is " +tOb.getWeight()+" kg. age of a tiger is "+tOb.getAge() +" years. colour of a tiger is "+tOb.getColor()+". tiger is a vegetarian "+tOb.isVegetarian()+". tiger can climb on the tree "+ tOb.canClimb()+". the sound of a tiger is "+tOb.sound()+".\n\n");
		
		System.out.print("weight of a deer is " +dOb.getWeight()+" kg. age of a deer is "+dOb.getAge() +" years. colour of a deer is "+dOb.getColor()+". deer is a vegetarian "+dOb.isVegetarian()+". deer can climb on the tree "+ dOb.canClimb()+". the sound of a deer is "+dOb.sound()+".\n\n");
		
		System.out.print("weight of a monkey is " +mOb.getWeight()+" kg. age of a monkey is "+mOb.getAge() +" years. colour of a monkey is "+mOb.getColor()+". monkey is a vegetarian "+mOb.isVegetarian()+". monkey can climb on the tree "+ mOb.canClimb()+". the sound of a monkey is "+mOb.sound()+".\n\n");
		
		System.out.print("weight of a elephant is " +eOb.getWeight()+" kg. age of a elephant is "+eOb.getAge() +" years. colour of a elephant is "+eOb.getColor()+". elephant is a vegetarian "+eOb.isVegetarian()+". elephant can climb on the tree "+ eOb.canClimb()+". the sound of a elephant is "+eOb.sound()+".\n\n");
		
		System.out.print("weight of a giraffe is " +gOb.getWeight()+" kg. age of a giraffe is "+gOb.getAge() +" years. colour of a giraffe is "+gOb.getColor()+". giraffe is a vegetarian "+gOb.isVegetarian()+". giraffe can climb on the tree "+ gOb.canClimb()+". the sound of a giraffe is "+gOb.sound()+".");
	}	
}
