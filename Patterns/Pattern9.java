package Patterns;

public class Pattern9 {
	public static void main(String[] args) {
		int n =5;
		char ch = 'a';
		for(int row=1 ; row<=n ; row++)
		{
			for(int col=1 ; col<=n ; col++)
			{
				if(row >= col)
				{
				System.out.print(ch++);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}


}
