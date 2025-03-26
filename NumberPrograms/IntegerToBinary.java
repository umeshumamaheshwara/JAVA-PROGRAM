//WAp to find the sum of the Numbers.
package NumberPrograms;

public class IntegerToBinary {
	public static void main(String[] args) {
		int no=6;
		String result = "";
		while(no!=0)
		{
			int rem = no %2;
			result = rem + result;
			no = no /2;
		}
		System.out.println(result);
	}

}
