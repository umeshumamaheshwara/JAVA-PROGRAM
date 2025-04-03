package NumberPrograms;

public class SumOfSqureGettingSingleDigit {
	public static void main(String[] args) {
		int no = 256;
		while(no>9)
		{
			int sum =0 ;
		    while(no!=0)
		    {
		    	int rem = no % 10 ;
		    	sum = sum + (rem * rem);
		    	no = no / 10;
		    }
		    no = sum;
		    
		
		}
		System.out.println(no);
		
		
		
	}

}
