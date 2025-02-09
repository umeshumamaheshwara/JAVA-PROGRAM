//Write a program to reverse a string by word by word.
package BasicStringOperation;

public class Reverse_String_By_Word_By_Word {
	public static void main(String[] args) {
		String str = "Hello java";
		String [] s1 = str.split(" ");
		System.out.println(s1.length);
		
		for(int i=s1.length-1; i>= 0 ; i--)
		{
	
			String reverse = "";
			for(int j = s1[i].length()-1 ; j>=0 ; j--)
			{
				reverse = reverse + s1[i].charAt(j);
			}
			System.out.print(reverse + " ");
		}
	}
	

	
}
