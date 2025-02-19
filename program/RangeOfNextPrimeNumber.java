//WAP to Print Range of Next Prime Number.
package program;

public class RangeOfNextPrimeNumber {
	
			public static void main(String[] args) {
				int n = 5;
				for(int j =n+1 ; j<=100 ; j++)
				{
				int no = j;
				boolean flag =  true;
				for(int i = 2 ; i<=Math.sqrt(no) ;  i++)
				{
					if(no % i == 0)
					{
						flag = false;
						break;
						
					}
				}
				if(flag)
				{
					System.out.println(n + " \t next prime number is "+ no);
					break;
					
				}
				
				
				
			}

		}
	}

