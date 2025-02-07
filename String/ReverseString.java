//Write a program to Reverse a given String 
package String;

public class ReverseString {
	public static void main(String[] args) {
		String Str = "java";
		String rev = "";
		for(int i=Str.length()-1 ; i>=0; i--)
		{
			rev =  rev + Str.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
	

}
