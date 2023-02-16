package com.google.Oops.Inheritance;

public class TShirt extends Cloth {
	Size size;

	public TShirt(String cloth_type) {
		super(cloth_type);
		// TODO Auto-generated constructor stub
	}
	
    public void tshirtSize(Size size)
    {
    	this.size=size;
    	System.out.println("Selected size is: "+size);
    }
    
 
}
