package Sorting;

import java.util.HashMap;
import java.util.Map;

public class UniqueArrayEments {
	
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int[] arr = {1, 2, 2, 3, 4, 4, 5};

		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println("Unique Array Elements Are.. ");
		for(Map.Entry<Integer,Integer>entry: map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
	}
}
