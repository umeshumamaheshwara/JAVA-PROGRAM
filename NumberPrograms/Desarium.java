//WAP to check the given number is Desarium Number.

package NumberPrograms;

public class Desarium {
	public static void main(String[] args) {
		int no = 135;
		int n = no;
		int copy = no;
	    int count =0;
	    int sum = 0;
	    while(n!=0)
	    {
	    	n = n / 10;
	    	count++;
	    }
	    while(no!=0)
	    {
	    	int rem = no %10;
	    	sum = sum + (int) Math.pow(rem,count);
	    	count--;
	    	no = no / 10;
	    }
	    if(copy==sum) 
	    {
	    	System.out.println("Desarium...");
	    }
	    else {
	    	System.out.println("Not a Desarium Number...");
	    }
	    
		
	}

}
