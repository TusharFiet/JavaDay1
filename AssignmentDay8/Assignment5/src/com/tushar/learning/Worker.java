package com.tushar.learning;

public class Worker {
	private String Name;
	private int Empno;
	
	
	public Worker(int no,String n)
	{ 
		this.Empno=no; 
		this.Name=n; 
	}
	
	
	public void display()
	{
	System.out.println("Employee number : "+Empno);
	System.out.println("Employee name : "+Name);
	}

}
