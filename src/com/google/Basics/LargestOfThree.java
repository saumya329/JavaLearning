package com.google.Basics;


public class LargestOfThree {
	private int num1, num2, num3;
	
	public LargestOfThree(int number1, int number2, int number3)
	{
		this.num1=number1;
		this.num2=number2;
		this.num3=number3;
	}
	
	
	public int largest()
	{
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num3)
			return num2;
		else
			return num3;
		
	}
	
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		LargestOfThree large=new LargestOfThree(a,b,c);
		int big=large.largest();
		System.out.println("Largest: "+big);
		
	}
}
