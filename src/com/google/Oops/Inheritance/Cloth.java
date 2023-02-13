package com.google.Oops.Inheritance;

public class Cloth 
{
	private String cloth_type;

	public Cloth(String cloth_type) 
	{
		this.cloth_type=cloth_type;
	}
	
	public void clothMaterial() {
		
			System.out.println("Cloth material required is "+cloth_type);
		
		
	}

}
