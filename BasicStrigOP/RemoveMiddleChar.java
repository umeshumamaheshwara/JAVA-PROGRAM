//write a Program to remove the middle of the character from the string.
package BasicStrigOP;

public class RemoveMiddleChar {
	public static void main(String[] args) {
		String str = "HelloJava";
		str = str.replaceAll(" ", "");
		int mid = str.length()/2;
		
		
			String st1 = str.substring(0,mid);
			String st2 = str.substring(mid+1);
			
			System.out.println(st1 + st2);
			
			

	}

}
