package Sorting;

public class FindMiniMumValueInUnsortedArray {
	public static void main(String[] args) {
		int [] arr = {20,30,10,40,50};
		int max=0;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum Value IS: "+max);
		int min = max;
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
		}
		System.out.println("Minimum Vale Is: "+min);
		
	}

}
