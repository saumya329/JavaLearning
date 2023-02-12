package com.google.Oops.Inheritance;

public class MainStaffEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employe1=new Employee("Radha", 101);
		employe1.doWork();
		
		Employee employe2=new Doctor("Heera",104);
		employe2.doWork();
		
		System.out.println(employe1.equals(employe2));
		
		

	}

}
