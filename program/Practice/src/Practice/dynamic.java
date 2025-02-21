package Practice;

public class dynamic {
	public static void main(String[] args) {
		int range = 20;
		boolean[] arr = new boolean[range+1];
		for(int i =0 ; i<arr.length ; i++)
		{
			arr[i]=true;
		}
		for(int i =2 ; i*i<arr.length ; i++)
		{
			if(arr[i])
			{
				for(int j =i*i ; j<arr.length ; j=j+i)
				{
					arr[j]=false;
				}
				
			}
		}
		for(int i = 2 ; i<arr.length; i++)
		{
			if(arr[i])
			{
				System.out.println(i);
			}
		}
		
		
	}

}
