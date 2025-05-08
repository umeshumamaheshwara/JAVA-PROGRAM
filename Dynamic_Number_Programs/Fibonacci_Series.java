package Dynamic_Number_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range 1 to :");
		int n = sc.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		
		for(int i = 1 ; i<n ; i++)
		{
			f3 = f1 + f2 ;
			f1=f2;
			f2=f3;
		}
		System.out.println(f3);
		
	}

}
