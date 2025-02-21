package Practice;

public class stri {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "";
				for(int i=str.length()-2 ; i>=1 ; i--)
				{
					str1 = str1 + str.charAt(i);
				}
				System.out.println(str1);
				String result = str.charAt(0) + str1 + str.charAt(str.length()-1);
				System.out.println(result);
	}
	
}
