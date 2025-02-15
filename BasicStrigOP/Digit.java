//check if the string contains only digits.
package BasicStrigOP;

public class Digit {
	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str.matches(".*[^0-9]*."));
	}

}
