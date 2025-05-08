package Dynamic_Number_Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		boolean f = true;
		for(int i = 2 ; i<=Math.sqrt(n); i++)
		{
			if(n % i == 0)
			{
				f = false;
				break;
				
			}
			
		}
		if(f)
		{
			System.out.println(n+" is a Prime Number");
		}
		else {
			System.out.println(n+" is not a Prime Number:");
		}
		
	}

}
