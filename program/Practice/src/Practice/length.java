package Practice;

public class length {
	public static void main(String[] args) {
		String str = "Chethan is a Robo";
		String [] s1 = str.split(" ");
		for(int i =0 ; i<s1.length  ; i++)
		{
		   for(int j =s1[i].length()-1 ; j>=0 ; j--)
		   {
			   System.out.print( s1[i].charAt(j));
		   }
		   System.out.print(" ");
		}
		
	
		
		
	}

}
