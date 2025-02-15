//Find the all the occurrence of the Character
package BasicStrigOP;

public class ALLtheOCCURANCE {
	public static void main(String[] args) {
		String str ="Hello Java";
		char [] ch = str.toCharArray();
		for(int i =0 ; i<ch.length ; i++)
		{
			if(ch[i]=='a')
			{
				System.out.println(i+ " ");
				
			}
		}
	}

}
