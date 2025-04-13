package Sorting;

public class LinearSearch1 
{
	public static void main(String[] args) 
	{
		int [] arr = {4,1,6,3,5,2,8};
		int search= 2;
		linearSearch(arr,search);
	}
	static void linearSearch(int [] a , int key)
	
	
	{
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i]==key)
			{
				System.out.println("The value is Present in the Index position:" + i);
		
			}
				
		}
		System.out.println("Not there..");
		
	}
}


