package StaticProgram.Number;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPalindrome_Method_With_Parameter 
{
	public static boolean palindrome(ArrayList<Integer> a)
	{
		int i = 0;
		int j = a.size() - 1;
		boolean isPalindrome = true;

		while(i < j)
		{
			if(!a.get(i).equals(a.get(j)))  
			{
				isPalindrome = false;
				break;
			}
			i++;
			
			
			j--;
		}

		return  isPalindrome;
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(4, 1, 3, 1, 4));
		boolean x = palindrome(a);  
		System.out.println(x);
	}
}
