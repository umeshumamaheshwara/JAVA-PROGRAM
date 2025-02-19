//Write a program to check if a number is Even or Odd
package program;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no = Sc.nextInt();
	    if(no % 2 == 0)
	    {
	    	System.out.println("It is a Even Number:");
	    }
	    else
	    {
	    	System.out.println("It is a Odd Number:");
	    }
	    Sc.close();
	}

}
