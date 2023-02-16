package com.google.Arrays;

public class ReverseArray {
	
	public void reverse(int[] arr)
	{
		
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] array= {34,44,1,2,5};
		ReverseArray rev=new ReverseArray();
		rev.reverse(array);
	}

}
