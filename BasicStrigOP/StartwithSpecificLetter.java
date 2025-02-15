//Find all words Starting with a specific Character.
package BasicStrigOP;

public class StartwithSpecificLetter {
	
	    public static void main(String[] args) {
	        String str = "Hello Java Program";
	        char specificChar = 'J'; // Change this to any character you want to filter by
	        
	        String[] words = str.split(" "); // Splitting the sentence into words
	        
	        for (int i = 0; i < words.length; i++) { // Using traditional for loop
	            if (words[i].startsWith(String.valueOf(specificChar))) { // Check if word starts with specificChar
	                System.out.println(words[i]);
	    }
	}
}
}



