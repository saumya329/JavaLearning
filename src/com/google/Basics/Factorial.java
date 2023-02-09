package com.google.Basics;

public class Factorial {
	
	static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return(num*fact(num-1));
	}
	

	public static void main(String[] args) {
		int factorial=fact(7);
		System.out.println("Factorial: "+factorial);
		

	}

}
