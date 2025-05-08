package Dynamic_Number_Programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		int mul = 1;
		for(int i = n ; i>=1 ; i--)
		{
			mul = mul * i ;
		}
		System.out.println(mul);
		
	}

}
