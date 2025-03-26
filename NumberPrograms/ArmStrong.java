//WAP to check a given Number is Armstrong or Not.
package NumberPrograms;

public class ArmStrong {
	public static void main(String[] args) {
		int no = 153;
		int copy = no;
		int n = no;
		int count = 0;
		int sum = 0;
		
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		while(no!=0)
		{
			int rem = no % 10;
			sum = sum + (int)Math.pow(rem, count);
			no = no / 10;
			
		}
		if(copy==sum)
		{
			System.out.println("ArmStrong Number..");
		}
		}
		
		
	}


