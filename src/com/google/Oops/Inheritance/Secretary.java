package com.google.Oops.Inheritance;

public class Secretary extends Employee {

	public Secretary(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		super.doWork();
		System.out.println("Secretary is typing the letter");
	}
	
}
