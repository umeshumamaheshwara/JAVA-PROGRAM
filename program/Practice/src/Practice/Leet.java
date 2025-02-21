package Practice;

/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome. */

public class Leet {
	
	public static void main(String[] args) {
String s = "A man, a plan, a canal: Panama";
        
        // Convert to lowercase
        String s1 = s.toLowerCase();
        
        // Remove non-alphanumeric characters
        String s2 = s1.replaceAll("[^a-z0-9]", "");
        
        int si = 0;
        int ei = s2.length() - 1;
	 while (si < ei) {
         if (s2.charAt(si) != s2.charAt(ei)) {
             System.out.println("It is not a palindrome");
             return;
         }
         si++;
         ei--;
     }
     System.out.println("Palindrome");
	
	}

}
