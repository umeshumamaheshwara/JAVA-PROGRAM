//Write a program to find the Largest of Two numbers
package program;
import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter 1st Number:");
	int a = Sc.nextInt();
	System.out.println("Enter 2nd Number:");
	int b = Sc.nextInt();
	if(a > b)
	{
		System.out.println(a+ "\t Is greater than" + b);
	}
	else
	{
		System.out.println(b+ "\t Is greater than" + a);
		
	}
	
	Sc.close();
		
	}

}
