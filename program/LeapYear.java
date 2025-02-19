//Write a program to check if a Year is a Leap Year or not.
package program;
import java.util.Scanner;


public class LeapYear {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter A Year:");
		int Year = Sc.nextInt();
		if((Year % 4  == 0 && Year % 100 !=0) || (Year % 400 == 0))
		{
			System.out.println(Year + "\t Is a Leap Year");
		}
		else {
			System.out.println(Year+"\t is not a Leap Year..");
		}
	}

}
