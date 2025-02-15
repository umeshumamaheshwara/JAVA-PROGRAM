//COunt the Number of words in a String.
package BasicStrigOP;

public class CountNoOfWords {
	public static void main(String[] args) {
		String str = "Hello How are You";
		String[] arr = str.split(" ");
		int count = 0;
		for(int i = 0 ; i<arr.length ; i++)
		{
			count++;
		}
		System.out.println(count);
		System.out.println(arr.length);
	}

}
