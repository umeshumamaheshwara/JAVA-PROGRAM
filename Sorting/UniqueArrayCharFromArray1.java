package Sorting;

import java.util.HashMap;
import java.util.Map;

public class UniqueArrayCharFromArray1 {
	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
	 String str = "programming";
	 for(char ch : str.toCharArray())
	 {
		 map.put(ch, map.getOrDefault(ch,0)+1);
		 
	 }
	 System.out.println("Unique Array Elements...");
	 for(char c1: str.toCharArray())
	 {
		 if(map.get(c1)==1)
		 {
			 System.out.print(c1+" ");
		 }
	 }
		
	}

}
