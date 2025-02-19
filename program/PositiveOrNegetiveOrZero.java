//Write a program to check if a number is Positive, Negative, or Zero. 
package program;
import java.util.Scanner;


public class PositiveOrNegetiveOrZero {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int no = Sc.nextInt();
		if(no > 0 )
		{
			System.out.println(no+" \t is positive");
		}
		else if(no < 0)
		{
			System.out.println(no+" \t is Negative");
		}
		else {
			System.out.println(no+" \t Number Zero");
		}
		Sc.close();
		}

}
