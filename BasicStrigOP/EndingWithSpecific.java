//Find all the words Ending with a specific letter.
package BasicStrigOP;

public class EndingWithSpecific {
			    public static void main(String[] args) {
			        String str = "Hello Java Program";
			        char specificChar = 'a';
			        
			        String[] words = str.split(" "); // Splitting the sentence into words
			        
			        for (int i = 0; i < words.length; i++) { // Using traditional for loop
			            if (words[i].endsWith(String.valueOf(specificChar))) { 
			                System.out.println(words[i]);
			    }
			}
		}
		




		
	}
