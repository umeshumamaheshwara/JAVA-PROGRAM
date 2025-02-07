//Write a program to print only Upper Case Character in a given Sentence
package String;

public class UpperCase {
	public static void main(String[] args) {
		String Str = "Hello JaVa";
		System.out.println(Str.replaceAll("[^A-Z]",""));
	}

}
