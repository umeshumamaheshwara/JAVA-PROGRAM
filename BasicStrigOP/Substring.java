//check if a string contains a substring.

package BasicStrigOP;

public class Substring {
	public static void main(String[] args) {
		String str = "Hello Java";
		String substr = "Java";
		if(str.contains(substr))
		{
			System.out.println("Contains Sub string:");
		}
		else {
			System.out.println("Not Contains Sub string:");
		}
		System.out.println(str.contains(substr));
	}

}
