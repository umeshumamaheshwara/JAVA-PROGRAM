package Practice;

public class pali {
	public static void main(String[] args) {
		String str = "level";
		int Left = 0;
		int right = str.length()-1;
		while(Left<right)
		{
			if(str.charAt(Left)!=str.charAt(right))
			{
				System.out.println("It is not Palindrome");
			}
			Left++;
			right--;
		}
	  System.out.println("Palindrome");
		
		
	}

}
