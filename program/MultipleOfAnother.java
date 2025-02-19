//Write a program t check if a Number is a Multiple of another Number
package program;

import java.util.Scanner;

public class MultipleOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter the 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b = sc.nextInt();

       
        if (a % b == 0) {
            System.out.println(a + " is a multiple of " + b);
        } else if (b % a == 0) {
            System.out.println(b + " is a multiple of " + a);
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }
        
        sc.close();
    }
}

