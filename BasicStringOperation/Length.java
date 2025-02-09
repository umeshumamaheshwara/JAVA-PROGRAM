//Find the length of the string.
package BasicStringOperation;

public class Length {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println("With considering spaces :" +str.length());
		System.out.println("Without spaces :" +str.replaceAll(" ","").length());
		
	}
	

}
