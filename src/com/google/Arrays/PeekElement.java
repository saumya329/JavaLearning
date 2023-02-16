package com.google.Arrays;

public class PeekElement {
	
	public void findPeekBruteForce(int arr[])
	{
		int len=arr.length;
		if(arr[0]>=arr[1])
			{
				System.out.println(arr[0]);
			}
		if(arr[len-1]>=arr[len-2])
		{
			System.out.println(arr[len-1]);
		}
			
		for(int i=1;i<len-1;i++)
		{
			if(arr[i]>arr[i+1]&& arr[i]>arr[i-1]) {
				System.out.println(arr[i]);
		    }
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1, 3, 20, 4, 1, 0};
		PeekElement peek=new PeekElement();
		peek.findPeekBruteForce(array);

	}


}