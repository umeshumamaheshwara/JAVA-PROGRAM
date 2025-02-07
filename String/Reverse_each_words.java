//Write a Program to reverse Each words in a given sentence.
package String;

public class Reverse_each_words {
	public static void main(String[] args) {
		
		String str = "Hello Java";
		String[] s1 = str.split("");
	
		for(int i =s1.length-1; i>=0 ; i--)
		{
			System.out.println(s1[i]+ " ");
			
		}
	}


}
