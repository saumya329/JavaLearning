package com.google.Basics;

public class FibonacciSeries {
	static int num1=0, num2=1, num3;
	public static void printFib(int count)
	{
		if(count>0)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
			printFib(count-1);
		}
	}
	
	
	public static void main(String[] args)
	{
		int count=20;
		System.out.print(num1+" "+num2);
		printFib(count-2);

     }
}
