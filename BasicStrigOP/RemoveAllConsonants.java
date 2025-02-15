//Remove All Consonants from the string.

package BasicStrigOP;

public class RemoveAllConsonants {
		public static void main(String[] args) {
			String str = "Hello Java";
			System.out.println(str.replaceAll("[^aeiouAEIOU]"," "));
		}

	}



