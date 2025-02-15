	//Split a String BY Spaces.
	package BasicStrigOP;
	
	public class SplitAStringBYSPaces {
		public static void main(String[] args) {
			String str = "Hello Java Bye";
			String[] split = str.split(" ");
			for(int i = 0 ; i<split.length ; i++)
			{
				System.out.println(split[i]);
			}
		}
	
	}
