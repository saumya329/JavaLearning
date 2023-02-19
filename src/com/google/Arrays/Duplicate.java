package com.google.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Duplicate {
	
	public void duplicate(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[i]);
					
			}
		}
	}
	
	
	public void hashMapDuplicate(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int elements:arr)
		{
			if(map.get(elements)==null)
			{
				map.put(elements,1);
			}
			else
			{
				map.put(elements, map.get(elements)+1);
			}
			
		}
		
		
		Set<Entry<Integer,Integer>> entryMap=map.entrySet();
		for(Entry<Integer,Integer> entry: entryMap)
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
		
	}

	public static void main(String[] args)
	{
		int[] array= {2,6,5,2,2,3,1,3,11};
		Duplicate duplicates=new Duplicate();
		duplicates.duplicate(array);
		System.out.println("Identifying using HashMap");
		duplicates.hashMapDuplicate(array);
	}

}
