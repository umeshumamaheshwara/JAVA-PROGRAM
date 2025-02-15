//String contains Only digit
package BasicStrigOP;

public class ContainsOnlyDigit {
	public static void main(String[] args) {
		String str = "12345";
		if(str.matches("\\d+"))
		{
			System.out.println("True");
		}
		else {
			System.out.println("Not");
		}
		System.out.println(str.matches("\\d+"));
	}

}
