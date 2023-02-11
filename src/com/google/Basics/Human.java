package com.google.Basics;

public class Human {

	//state
	private int eyes, ears, nose;
	private String skin;
	
	//behavior
	public void talk()
	{
		System.out.println("Human is talking");
	}
	
	public void sleep()
	{
		System.out.println("HUman is sleeping");
	}
	
	public void polite()
	{
		System.out.println("HUman is polite");
	}
	
	//identity
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	//main
	public static void main(String[] args)
	{
		Human human=new Human();
		human.sleep();
		
	}
}
