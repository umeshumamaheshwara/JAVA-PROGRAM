//WAP to checkGiven Number is Perfect number or Not.
package NumberPrograms;

public class PerfectNumber {
	public static void main(String[] args) {
		int no =28 ;
		int sum = 0;
		for(int i =1 ; i<=no/2 ; i++) 
		{
			if(no%i==0)
			{
				sum = sum + i ;
			}
			
		}
		if(sum==no)
		{
			System.out.println("Perfect Number...");
		}
	}
	

}
