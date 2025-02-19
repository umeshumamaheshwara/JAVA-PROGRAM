// Write a program to check if a number is divisible by both 2 and 3 
package program;

import java.util.Scanner;

public class Divide_By_2and3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no = Sc.nextInt();
		if(no % 2 == 0 && no % 3 == 0)
		{
			System.out.println(no +" \t Is divisible by both 2 and 3.");
		}
		else {
			System.out.println(no +" \t Is not divisible by both 2 and 3.");
		}
		
	}
	

}
