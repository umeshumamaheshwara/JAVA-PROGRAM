//Write a program to check if a character is a vowel or Consonant 
package program;
import java.util.Scanner;


public class AlphabetOrConsonent {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		char ch = Sc.next().charAt(0);
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' ) {
			System.out.println(ch+ " \t  is Vowel ");
		}
		else {
			System.out.println(ch + "is not a Vowel");
		}
	}

}
