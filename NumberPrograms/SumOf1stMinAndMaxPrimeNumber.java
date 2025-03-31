//WAP to find the Sum of 1st Minimum and maximum Prime Number in the Given Range Of 8 to 20.

package NumberPrograms;

import java.util.ArrayList;

public class SumOf1stMinAndMaxPrimeNumber {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1  = new ArrayList<>();
		
		
	    for(int j =8 ; j<=20 ; j++)
	    {
		int no = j;
		boolean f = true;
		for(int i = 2 ; i<=Math.sqrt(no); i++)
		{
			if(no % i == 0)
			{
				f = false;
				break;
				
			}
		}
		if(f)
	    {
			a1.add(no);
	    	
	    }	
	   }
	    System.out.println(a1);
	    System.out.println(a1.get(0)+a1.get(a1.size()-1));
	    
	    
    }

  }
