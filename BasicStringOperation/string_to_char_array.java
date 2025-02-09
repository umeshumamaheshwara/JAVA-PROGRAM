//WAP to convert string in to char Array
package BasicStringOperation;

public class string_to_char_array {
	public static void main(String[] args) {
		String str = "Hello java";
		str = str.replaceAll(" ", "");
		char[] s1 = str.toCharArray();
		for(int i=0 ; i<s1.length ; i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println(s1.length);
	}
	
	

}
