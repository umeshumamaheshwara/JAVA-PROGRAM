//WAP to Add the elements in to the ArrayList without using Add method.

package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class WithoutUsingAddMethod {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,"hello",null,true,'A'));
		for(Object arr:a)
		{
			System.out.println(arr);
		}
		
		
	}

}
