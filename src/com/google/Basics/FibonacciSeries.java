package com.google.Basics;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
	
int[] table=new int[100];
//Map<Integer, Integer> table=new HashMap<Integer, Integer>();
	public int printFib(int count) {
		if (count <= 1) {
			return 1;
		}
		
		if(table[count-1]==0)
		{
			 table[count - 1] =printFib(count-1);
		}
		if(table[count-2]==0)
		{
			 table[count - 2] =printFib(count-2);
		}
		
		return table[count-1]+table[count-2];

		

	}

	public static void main(String[] args) {
		
		FibonacciSeries fib = new FibonacciSeries();

		System.out.println(fib.printFib(10));

	}
}
