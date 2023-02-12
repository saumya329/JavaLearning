package com.google.Oops.Inheritance;

public class Manager extends Employee{

	public Manager(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		super.doWork();
		System.out.println("Manager is managing the staff");
	}

}
