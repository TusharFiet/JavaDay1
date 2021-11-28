package com.tushar.exercise1;

public class MainEggs {

	public static void main(String[] args) {
		Eggs eOb = new Eggs();
		eOb.setTotalEggs(440);
		eOb.getCalculate();
		System.out.println("Nos of Gross Eggs: "+eOb.getGrossEgg());
		System.out.println("Nos of Dozen Eggs: "+eOb.getDozenEgg());
		System.out.println("Nos of Remaining Eggs: "+eOb.getRemainingEgg());	
	}

}
