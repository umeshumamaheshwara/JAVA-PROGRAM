
package Practice;

public class stringstr {
	
	public  String Revstr(String str)
	{
      String result  = "";
      for(int i = str.length()-1 ; i>=0 ; i--)
      {
    	  result = result +str.charAt(i);
    	  
      }
      return result;
      
		
	}
	
	public static void main(String[] args) {
		
		stringstr s1 = new stringstr();
		String x = s1.Revstr("Programming");
		System.out.println(x);
		String str = "Programming";
		int mid = (0 + str.length()-1)/2;
		String str1 = str.substring(0 , mid);
		String str2 = str.substring(mid);
		
		System.out.println(str1 + s1.Revstr(str2) );
		
		System.out.println(s1.Revstr(str1) + str2);
		String vowels = str.replaceAll("[^aeiouAEIOU]", "");
		String consonants = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(vowels + s1.Revstr(consonants));
		
				
	}

}
