//Write a program to reverse Each words in a given Sentence.
package String;

public class Reverse_Each_word_in_a_sentence {
	public static void main(String[] args) {
		String str = "Hi hello How are You";
				String[] s1 = str.split(" ");
				
				for(int i = 0 ; i<s1.length ; i++)
				{
					String word = s1[i];
					 String reversedWord = "";
					 for (int j = word.length() - 1; j >= 0; j--) {
			                reversedWord = reversedWord + word.charAt(j);
		
				}
					 System.out.println( word + " " + reversedWord + " ");
					 
			}

		
	}
	}


