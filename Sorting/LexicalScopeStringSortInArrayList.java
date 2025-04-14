package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicalScopeStringSortInArrayList {
	public static void main(String[] args) {
		List<String> l1 =  new ArrayList<String>(Arrays.asList("mango","banana","Apple","jackfriut"));
		System.out.println(l1);
		for(int i=0 ; i<l1.size() ; i++)
		{
			for(int j=0 ; j<l1.size()-1-i ; j++)
			{
				if(l1.get(j).compareToIgnoreCase(l1.get(j+1))>0)
				{
					String temp=l1.get(j);
					l1.set(j,l1.get(j+1));
					l1.set(j+1, temp);
					
				}
			}
		}
		l1.forEach( (a)->{System.out.println(a);});
	}

}
