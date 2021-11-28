package com.tushar.learning;

public class SalariedWorker extends Worker {

	private int rate;
	private int hour=30;
	
	SalariedWorker(int no,String n,int r)
	{
	super(no,n);
	this.rate=r;
	}
	
	
	public void calculateSalary()
	{
	display();
	System.out.println("Salary : "+rate*hour);
	}
}
