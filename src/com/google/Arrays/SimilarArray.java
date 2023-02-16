package com.google.Arrays;

public class SimilarArray {
	
	public int similarity(int[] arr1, int[] arr2)
	{
		int count=0;
		for(Integer num:arr1)
		{
			for(Integer num2:arr2)
			{
				if(num==num2)
				{
					count++;
					System.out.print(num+" ");
				}
				
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int[] array1= {1,4,7,8,10};
		int[] array2= {1,4,6,23,78,10};
		SimilarArray similar=new SimilarArray();
		System.out.println(similar.similarity(array1, array2));
	}

}
