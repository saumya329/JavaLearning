package com.google.Arrays;

public class BinarySearch {

	
	
	public int binarySearch(int[] arr, int num)
	{
		int left=0;
		int right= arr.length;
		while(left<=right) {
			int mid=left+(right-left)/2;
			System.out.println("Running");
			if(arr[mid]==num)
			{
				return mid;
			   
				
			}
			
			else if(arr[mid]<num)
			{
				left=mid+1;
			}
			
			else
			{
				right=mid-1;
			}
			
		}
		
		return -1;
	}
		
	 public static void main(String[] args)
	   {
		   int[] array= {2,4,5,10,66,89,111,678};
		   BinarySearch search=new BinarySearch();
		   System.out.println(search.binarySearch(array, 89));
	   }
	}
	
	

