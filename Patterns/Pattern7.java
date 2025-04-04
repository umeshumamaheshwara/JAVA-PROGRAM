package Patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n =5;
		int i = 0;
		for(int row=1 ; row<=n ; row++)
		{
			for(int col=1 ; col<=n ; col++)
			{
				if(row >= col)
				{
				System.out.print(i++ +" ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}


}
