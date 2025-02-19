//write a program to check if a number is divisible by another number
package program;
import java.util.Scanner;

public class DivideAnotherNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println(a + " is divisible by " + b);
        } else if (b % a == 0) {
            System.out.println(b + " is divisible by " + a);
        } else {
            System.out.println("Neither number is divisible by the other.");
        }
    }
}

