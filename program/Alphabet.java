// Write a program to check if a character is alphabet or not;
package program;
import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner Sc =  new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch = Sc.next().charAt(0);
		if( (ch >='A' && ch<= 'Z') || (ch >='a' && ch<= 'z'))
		{
			System.out.println("Character is  a Alphabet...");
			
		}
		else {
			System.out.println("Character is not a Alphabet...");
			
		}
	}

}
