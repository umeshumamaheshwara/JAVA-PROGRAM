//WAP to print duplicate elements in a array
package Sorting;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArrayElement {
	public static void main(String[] args) {
		char[] cha = {'a','a','b','c','d','d','b'};
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : cha)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
		
//		for(char ch: cha)
//		{
//			if(map.get(ch)>1)
//			{
//				System.out.println(ch);
//			}
//		}
	}
	

}
