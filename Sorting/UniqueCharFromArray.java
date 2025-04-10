package Sorting;

import java.util.HashMap;
import java.util.Map;


public class UniqueCharFromArray {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "Programming";
		//char[] ch =  str.toCharArray();
		
		for(char ch: str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer>entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()); 
			}
		}
	}

}
