package Patterns;

public class Pattern6 {
	public static void main(String[] args) {
		int n =5;
		for(int row=1 ; row<=n ; row++)
		{
			for(int col=n ; col>=1 ; col--)
			{
				if(row <= col)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}


}
