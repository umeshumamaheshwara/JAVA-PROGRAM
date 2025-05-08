package Dynamic_Number_Programs;

public class GCD {
	    public static void main(String[] args) {
	        int num1 = 36; 
	        int num2 = 60;

	       
	        while (num2 != 0) 
	        {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }

	        System.out.println("GCD is: " + num1);
	    }
	}

