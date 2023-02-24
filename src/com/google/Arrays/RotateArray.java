package com.google.Arrays;

import java.util.Scanner;

public class RotateArray {
	
	public void rotate(int[] arr, int K)
	{
	     int[] outputArray=new int[arr.length];
	     int rotatingPoint=K;
	     
	     int i=0;
	     while(rotatingPoint<arr.length)
	     {
	    	 outputArray[i]=arr[rotatingPoint];
	    	 i++;
	    	 rotatingPoint++;
	     }
	     //System.out.println("First Split");
	     rotatingPoint=0;
	     while(rotatingPoint<K)
	     {
	    	 //System.out.println("Processing second split");
	    	 outputArray[i]=arr[rotatingPoint];
	    	 i++;
	    	 rotatingPoint++;
	     }
	     
	     for(int j=0;j<outputArray.length;j++)
	     {
	    	 System.out.print(outputArray[j]+" ");
	     }
	}
		
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array= {43,66,54,87,98,23};
		RotateArray rotating=new RotateArray();
		rotating.rotate(array, num);
		
		
	}

}
