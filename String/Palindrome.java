//Write a program to check the given String is Palindrome
package String;

public class Palindrome {
	public static void main(String[] args) {
		String Str = "java";
		String rev = "";
		for(int i=Str.length()-1 ; i>=0; i--)
		{
			rev =  rev + Str.charAt(i);
			
		}
		System.out.println(rev);
		if(Str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Polindrome");
		}
	}
	

}
