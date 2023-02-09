package com.google.Basics;

import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rev=0,i;
		
		while(num>0)
		{
			i=num%10;
			rev=(rev*10)+i;
			num=num/10;
		}
		System.out.println(rev);
		
	}

}
