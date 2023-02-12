package com.google.Oops.Inheritance;

public class Employee {
	
	
	private String name;
	private long id;
	private Object object;
	
	public Employee(String name,long id)
	{
		this.name=name;
		this.id=id;
	}
	
	
	public void doWork()
	{
		System.out.println("Employee marking attendance");
	}
	
	
	//only 5 methods from Object class which we can override from Object class
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee emp=(Employee)obj;
			return emp.id==this.id;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

}
