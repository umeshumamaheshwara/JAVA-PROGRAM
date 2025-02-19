//Write a program to find the Largest of Two numbers
package program;
import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter 1st Number:");
	int a = Sc.nextInt();
	System.out.println("Enter 2nd Number:");
	int b = Sc.nextInt();
	System.out.println("Enter 3rd Number:");
	int c = Sc.nextInt();
	if(a > b && a > c  )
	{
		System.out.println(a+ "\t Is greater than" + b + "And " + c);
	}
	else if(b > c)
	{
		System.out.println(b+ "\t Is greater than" + a + "And " + c );
		
	}
	else {
		System.out.println(c+ "\t Is greater than" + a + "And " + b);
	}
	
	Sc.close();
		
	}

}
