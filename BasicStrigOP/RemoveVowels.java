//Remove All vowels from the string.
package BasicStrigOP;

public class RemoveVowels {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.replaceAll("[aeiouAEIOU]",""));
	}

}
