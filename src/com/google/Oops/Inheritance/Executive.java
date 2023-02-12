package com.google.Oops.Inheritance;

public class Executive extends Manager
{

	public Executive(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
   
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		super.doWork();
	    System.out.println("Executive started following Manager's orders");
	}
	
}
