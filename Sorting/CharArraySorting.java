package Sorting;

import java.util.Arrays;

public class CharArraySorting {
	public static void main(String[] args) {
		char[] ch= {'d','a','c','b','e','f'};
		for(int i=0 ; i<ch.length ; i++)
		{
			for(int j=0 ; j<ch.length-1-i ; j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
