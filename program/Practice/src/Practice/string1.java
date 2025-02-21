package Practice;

public class string1 {
	    public static void main(String[] args) {
	        char[] ch  = {'r','a','d','a','r'}; // Example palindrome string
	        boolean isPalindrome = true;
	        int left = 0;
	        int right = ch.length - 1;

	        while (left < right) {
	            if (ch[left] != ch[right]) {
	                isPalindrome = false;
	                break;
	            }
	            left++;
	            right--;
	        }

	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
	    }
	}



