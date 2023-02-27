package com.google.Arrays;

public class FirstLastPosition {

	public void findPosition(int[] arr,int K)
	{ 
		int flag=0;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==K&& flag==0)
			{
				System.out.println("First index: "+i);
				flag++;
				index=i;
				continue;
			}
			
			
			else if(arr[i]==K && flag!=0)
			{
				index=i;
			}
			
			
		}
		System.out.println("Last Index: "+index);
		
	}
	
	
	
	public int firstOccurenceBinarySearch(int arr[],int K)
	{
		 int left=0, right=arr.length;
		 while(left<=right)
		 {
			int mid=left+(right-left)/2;
			
			//System.out.println(mid);
			if((mid==0|| arr[mid-1]<K) && arr[mid]==K)
				return mid;
			else if(arr[mid]>=K)
				right=mid-1;
			else
				left=mid+1;
		 }
		 return -1;
		 	 
	}
	
	public int lastOccurenceBinarySearch(int arr[],int K)
	{
		int left=0,right=arr.length;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if((mid==arr.length-1 || arr[mid+1]>K) && arr[mid]==K)
				return mid;
			else if(arr[mid]>K)
				right=mid-1;
			else
				left=mid+1;
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] array= {0,2,5,5,5,6,6,6};
		FirstLastPosition position=new FirstLastPosition();
		//position.findPosition(array,5);
		System.out.println("First Occurance: "+position.firstOccurenceBinarySearch(array, 5));
		System.out.println("Last Occurance: "+position.lastOccurenceBinarySearch(array, 5));
		
	}
	
}
