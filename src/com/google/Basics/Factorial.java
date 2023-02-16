package com.google.Basics;

public class Factorial {
	
	public int fact(int num)
	{
		if(num==0) {
			return 1;
			}
		else
			{
			return(num*fact(num-1));
			}
			
	}
	
	public int fact2(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
	
		System.out.println("Factorial: "+factorial.fact(7));
		

	}

}
