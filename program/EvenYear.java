package program;

import java.util.Scanner;

public class EvenYear {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter The year:");
		int Year = Sc.nextInt();
		if(Year % 2 == 0)
		{
			System.out.println("It is a Even Year");
			if((Year % 4 == 0 && Year % 100 != 0 ) || (Year % 400 == 0))
			{
				System.out.println("It is a Leap Year ");
				
			}
			else
			{
				System.out.println("It Is not a Leap Year");
			}
		}
		else if(Year % 3 == 0 && Year % 7 == 0  ) {
			System.out.println("FizzBuzz");
		}
		else if(Year % 3 == 0)
		{
			System.out.println("Fizzfizz");
		}
		else if(Year % 7 == 0)
		{
		 System.out.println("BuzzBuzz");
		}
		else
		{
			System.out.println(Year +"It is odd Year And not divide by 3 and 7");
		}
	}

}
