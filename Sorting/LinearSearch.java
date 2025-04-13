package Sorting;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 1, 6, 3, 5, 2, 8};
		int search = 2;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == search) 
			{
				System.out.println("The value is present in the index position: " + i);
				found = true;
				break; 
			}
		}
		
		if (!found) 
		{
			System.out.println("Not there..");
		}
	}
}
