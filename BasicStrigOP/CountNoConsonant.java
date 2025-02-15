//Count the number of consonants in a string.
package BasicStrigOP;

public class CountNoConsonant {
	public static void main(String[] args) {
		String str = "Hello How are you";
		str = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str.length());
	}

}
