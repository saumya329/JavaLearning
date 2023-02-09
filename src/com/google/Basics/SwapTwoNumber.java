package com.google.Basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		//Using 3rd variable
		int temp;
		temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("Swapping using 3 variables, num1: "+num1+" num2: "+num2);
        
		//Not using 3 variables
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swapping using 2 variables, num1: "+num1+" num2: "+num2);
        
		//Using bitwise operator
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("Swapping using bit-wise operator, num1: "+num1+" num2: "+num2);
        
		//In one line swap
		//num1=num1^num2^(num2=num1);
		//3^4^(num2=3)
		//num1=num1+num2-(num2=num1);
		
		
	}

}
