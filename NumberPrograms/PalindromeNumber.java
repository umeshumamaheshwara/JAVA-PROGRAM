//WAP to chheck given Number is Palindrome Or Not.
package NumberPrograms;

public class PalindromeNumber {
	public static void main(String[] args) {
		int no = 532;
		int res = 0;
		int copy = no;
		while(no!=0)
		{
			int rem = no %10;
			res = res*10 + rem;
			no = no / 10;
			
		}
		if(copy==res)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
	

}
