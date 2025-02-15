//Count the Number of Vowels In the String
package BasicStrigOP;

public class CountNoOfVowels {
	public static void main(String[] args) {
		String str = "Hello How Are You";
		str = str.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(str.length());
	}

}
