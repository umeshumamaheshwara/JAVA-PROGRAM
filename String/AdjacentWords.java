//WAP Remove Adjacent words In a Given Sentence.
package String;

public class AdjacentWords {
	public static void main(String[] args) {
		String str = "Hi Hi Hi how are are hi you you";
		String[] s1 = str.split(" ");
		for(int i=0 ; i<s1.length-1 ; i++)
		{
			if(!s1[i].equals(s1[i+1]))
			{
				System.out.print(s1[i]+ " ");
			}
			
		}
		System.out.print(s1[s1.length-1]);
	}

	
}
