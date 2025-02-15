//Check if a string contains only alpha numeric character.
package BasicStrigOP;

public class AlphaNumeric {
	public static void main(String[] args) {
		String str = "Hello12@!34";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		if(str.equals(str1))
		{
			System.out.println("OnlyAlpahaNumeric character");
		}
		else {
			System.out.println("Not OnlyAlpahaNumeric character");
		}
	}

}
