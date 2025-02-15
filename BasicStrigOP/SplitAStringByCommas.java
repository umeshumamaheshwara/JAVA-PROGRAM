//Split a String By Commas.
package BasicStrigOP;

public class SplitAStringByCommas {
		public static void main(String[] args) {
			String str = "Hello,Java,Bye";
			String[] split = str.split(",");
			for(int i = 0 ; i<split.length ; i++)
			{
				System.out.println(split[i]);
			}
		}
	
	}

