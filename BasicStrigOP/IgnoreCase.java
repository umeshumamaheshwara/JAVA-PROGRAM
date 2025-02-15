//Write if two strings are equal ignoring case.

package BasicStrigOP;

public class IgnoreCase {
	public static void main(String[] args) {
		String str = "heLlo";
		String str1 = "Hello";
		
		System.out.println(str.equals(str1));
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("Strings are Equal");
			
		}
		else {
			System.out.println("Strings Not are Equal");
			
		}
	}
	

}
