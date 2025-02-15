//check if a string starts with a specific substring.
package BasicStrigOP;

public class Starts_With {
	public static void main(String[] args) {
		String str = "Hello java";
		String str1 = "Hello";
		if(str.startsWith(str1))
		{
			System.out.println("Starts with specific string:");
		}
		else {
			System.out.println("Not start with a specific string:");
		}
	}

}
