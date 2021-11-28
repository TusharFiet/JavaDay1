package com.tushar.learning;

	class DailyWorker extends Worker
	{
	int rate;
	
	DailyWorker(int no,String n,int r)
	{
	super(no,n);
	rate=r;
	}
	
	public void calculateSalary(int h)
	{
	display();
	System.out.println("Salary : "+rate*h);
	}
	}