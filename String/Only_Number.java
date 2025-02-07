//write a program to print only Numbers in a given String 
package String;

public class Only_Number {
	public static void main(String[] args) {
		String Str = "Hello123@ Java123 ";
		System.out.println(Str.replaceAll("[^0-9]"," "));
	}
	

}
