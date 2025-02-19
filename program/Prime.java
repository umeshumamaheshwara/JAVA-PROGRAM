//WAP to check whether the number is Prime or Not.
package program;

public class Prime {
	public static void main(String[] args) {
		int no = 5;
		boolean flag =  true;
		for(int i = 2 ; i<Math.sqrt(no) ;  i++)
		{
			if(no % i == 0)
			{
				flag = false;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println(no +"\t is a Prime Number:");
		}
		else {
			System.out.println(no +" is Not Prime Number:");
		}
		
		
	}

}
