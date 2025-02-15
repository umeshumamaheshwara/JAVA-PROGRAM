//Check if the string contains only letters.
package BasicStrigOP;

public class OnlyLetters {
		public static void main(String[] args) {
			String str = "Hello";
			String str1 = str.replaceAll("[^a-zA-z]", "");
			if(str.equals(str1))
			{
				System.out.println("Only Letters...");
			}
			else {
				System.out.println("Not Only Letters...");
			}
			
		}
	}


