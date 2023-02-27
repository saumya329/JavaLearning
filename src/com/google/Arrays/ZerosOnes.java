package com.google.Arrays;

import java.util.Arrays;

public class ZerosOnes {
	
	public void sortArray(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public void sortArrayCounting(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			
		}
		
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		for(int i=count;i<arr.length;i++)
		{
			arr[i]=1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void swappingPointers(int[] arr)
	{
		int left=0, right=arr.length-1;
		
		while(left<right)
		{
			if(arr[left]==1)
			{
				arr[left]=arr[left]+arr[right]-(arr[right]=arr[left]);
				right--;
			}
			else
			{
				left++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
     	}
	}
	
	
	public static void main(String[] args)
	{
		int[] array= {0,1,0,0,1,1,0};
		ZerosOnes zeroone=new ZerosOnes();
		System.out.println("Sorting using Arrays.sort()");
		zeroone.sortArray(array);
		System.out.println("Sorting using counting 0s using 2 loops in O(n) time");
		zeroone.sortArrayCounting(array);
		System.out.println();
		System.out.println("Sorting in 1 loop: Best case");
		zeroone.swappingPointers(array);
		
	}
}
