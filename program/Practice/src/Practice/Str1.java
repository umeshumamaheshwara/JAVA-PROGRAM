//write a program a given string except 1st and Last Character.

package Practice;

public class Str1 {
	public static void main(String[] args) {
		String str = "Hello";
		String sub = str.substring(1 , str.length()-1);
		System.out.println(sub);
		String reverse = "";
		for(int i =sub.length()-1 ; i>=0 ; i--)
		{
		    reverse = reverse + sub.charAt(i);	
		    
		}
		System.out.println(reverse);
		System.out.println( str.charAt(0) + reverse + str.charAt(str.length()-1) );
	}

}
