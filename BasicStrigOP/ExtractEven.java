//Extract the Character at even position
package BasicStrigOP;

public class ExtractEven {
	public static void main(String[] args) {
		String str = "hello Java";
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

}
