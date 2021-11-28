package com.tushar.learning;

public class Main {

	public static void main(String[] args) {
		DailyWorker dOb=new DailyWorker(225,"Govind",65);
		SalariedWorker sOb=new SalariedWorker(122,"Tushar",80);
		dOb.calculateSalary(45);
		sOb.calculateSalary();

	}

}
