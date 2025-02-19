//Write a program to Check if a Number is Divisible by 7 but not 11
package program;

import java.util.Scanner;


public class Divide_By_Seven {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no = Sc.nextInt();
		if(no % 7 == 0 && no % 11 !=0)
		{
			System.out.println(no +" \t Is divisible by only 7");
		}
		else {
			System.out.println(no +" \t Is not Dived by 7");
		}
	}

}
