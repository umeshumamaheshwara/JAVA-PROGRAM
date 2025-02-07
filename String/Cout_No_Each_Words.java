//Write a program to count the number of Character in a each words.

package String;

public class Cout_No_Each_Words {
	public static void main(String[] args) {
		String str = "Hi hello How are You";
		String[] s1 = str.split(" ");
		for(int i = 0 ; i<s1.length ; i++)
		{
			System.out.println(s1[i]+ " "+ s1[i].length());
		}
		
	}

}
