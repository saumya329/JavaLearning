package com.google.Arrays;

import java.util.Arrays;

public class MinMax {

	public int maxArray(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public int minArray(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	public void arraySort(int[] arr,int K)
	{
		Arrays.sort(arr);
		System.out.println("Maximum "+K+ " value : "+arr[arr.length-K]);
		System.out.println("Minimum "+K+" value: "+arr[K-1]);
	}
	
	public static void main(String[] args)
	{
		int[] array= {90,89,445,67,87};
		//1,2 3,7,9,19 len=6 k=2
		MinMax max=new MinMax();
		System.out.println("Maximun element is: "+max.maxArray(array));
		max.arraySort(array,2);
	}
}
