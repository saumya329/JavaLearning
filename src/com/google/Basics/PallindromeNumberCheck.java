package com.google.Basics;

import java.util.Scanner;

public class PallindromeNumberCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		int rev=0,a;
		
		while(num>0)
		{
		    a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
		
		if(temp==rev)
			System.out.println("Number is Pallindrome!");
		
		else
			System.out.println("Number is not Pallindrome!");

	}

}
