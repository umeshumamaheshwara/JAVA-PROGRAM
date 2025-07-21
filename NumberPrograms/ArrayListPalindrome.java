package StaticProgram.Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPalindrome 
{
	public static void main(String[] args) 
	{
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(4,1,3,1,4));
		
		int i = 0;
		int j = a.size()-1;
		boolean isPalindrome = true;
		while(i<j)
		{
			if(a.get(i) != a.get(j))
			{
				isPalindrome = false;
				break;
				
			}
			i++;
			j--;
		}
		if(isPalindrome)
		{
			System.out.println("The given Array List is Palindrome-->" + a.toString());
		}
		else {
			System.out.println("It is Not palindrome..");
		}
		
	}

}
