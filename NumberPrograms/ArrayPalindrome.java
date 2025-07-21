package StaticProgram.Number;

import java.util.Arrays;

public class ArrayPalindrome 
{
	public static void main(String[] args) 
	{
		int [] arr = {4,3,1,3,4};
		int i = 0 ;
		int j = arr.length-1 ; 
		boolean isPalindrome = true;
		while(i<j)
		{
			if(arr[i] != arr[j])
			{
				isPalindrome = false;
				break;
				
			}
			i++;
			j--;
		}
		if(isPalindrome)
		{
			System.out.println("It is a palindrome Array --->" + Arrays.toString(arr));
			
		}
		else {
			System.out.println("It is Not a Palidrome Array...");
		}
	}

}
