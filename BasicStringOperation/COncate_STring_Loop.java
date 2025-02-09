// Concatenate a string using Loop
package BasicStringOperation;

public class COncate_STring_Loop {

	    public static void main(String[] args) {
	        String str = "Hello";
	        String str1 = "Java";
	        
	        for (int i = 0; i < str1.length(); i++) {
	            str = str + " " + str1.charAt(i); 
	            
	        }

	        System.out.println(str);  
	    }
	}



