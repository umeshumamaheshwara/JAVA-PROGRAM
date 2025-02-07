//Write a program to print Palindrome words in a given Sentence
package String;

public class palindrome_words_in {
	public static void main(String[] args) {
		String str = "My Mom Said to learn MALAyalam but i am from Katak place it is GadAg disTrict";
		String[] s1 = str.split(" ");
		
		for(int i=0 ; i<s1.length ; i++ )
		{
		    String word = s1[i];
		    String revword = "";
		    for (int j = word.length() - 1; j >= 0; j--) 
		    {
		    	revword = revword + word.charAt(j);
		    	
		    	
		    }
		    
		    if (word.equalsIgnoreCase(revword)) {
		    	
                System.out.println(word);
		    }
		
			
		}

		
					
			 
	}

		
		

}
