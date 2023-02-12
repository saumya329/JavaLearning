package com.google.Oops.Inheritance;

public class Doctor extends Employee {

	public Doctor(String name, long id) {
		super(name, id);
		
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		super.doWork();
		System.out.println("Doctor is seeing patients");
	}
}
