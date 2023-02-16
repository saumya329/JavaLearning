package com.google.Arrays;

public class ReverseArray {
	
	public void reverse(int[] arr,int num)
	{
		
		int start=num+1;
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
		int[] array= {34,44,1,2,5,6};
		ReverseArray rev=new ReverseArray();
		rev.reverse(array,3);
	}

}
