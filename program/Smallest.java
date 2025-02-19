package program;
import java.util.Scanner;

//write a program to find the smallest of two numbers; 

public class Smallest {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number:");
		int a = Sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b = Sc.nextInt();
		if(a<b)
		{
			System.out.println(a + "\t is Smaller than" + b);
		}
		else {
			System.out.println(b + " \t is Smaller than" + a);
		}
	}

}
