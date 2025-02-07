//write a program to count Number of words from a given sentence.
package String;

public class Count_Numberofords {
	public static void main(String[] args) {
		String str = "Hi Hello How Are You";
		String[] s1 = str.split(" ");
		System.out.println(s1.length);
		
		//or 
		
		
		int count = 0;
		for(int i =0 ; i<=s1.length-1 ; i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
