//WAP to convert char array to a String
package BasicStringOperation;

public class Char_Array_To_String {
	public static void main(String[] args) {
		char[] s1 = {'h','e','l','l','o'};
		System.out.println(s1.length);
		String str = "";
		for(int i =0 ; i<s1.length ; i++)
		{
			str = str + s1[i];
		}
		System.out.println(str);
		
		// or 
		 String str1 = new String(s1);
		 System.out.println(str1);
//		 System.out.println(s1.toString());
	}

}
