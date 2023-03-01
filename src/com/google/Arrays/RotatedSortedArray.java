package com.google.Arrays;

public class RotatedSortedArray {
	
	public int findIndex(int[] arr,int K)
	{
		int left=0, right=arr.length-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			if(arr[mid]==K)
				return mid;
			
			if(arr[mid]>=arr[left])
			{
				if(arr[left]<=K && K<=arr[mid] )
					right=mid-1;
				else
					left=mid+1;
			}
			
			else
			{
				if(arr[mid]<=K && K<=arr[right])
					left=mid+1;
				else
					right=mid-1;
			}
			
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		int[] array= {8,9,4,5};
		RotatedSortedArray rotated=new RotatedSortedArray();
		System.out.println(rotated.findIndex(array, 5));
		
	}

}
