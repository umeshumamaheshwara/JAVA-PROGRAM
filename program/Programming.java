package program;

public class Programming {
	
	public static  String Revstr(String str)
	{
      String result  = "";
      for(int i = str.length()-1 ; i>=0 ; i--)
      {
    	  result = result +str.charAt(i);
    	  
      }
      return result;
      
		
	}
	
	
	public static void main(String[] args) {
		
		String x =Revstr("Programming");
		System.out.println(x);
		String str = "Programming";
		int mid = (0 + str.length()-1)/2;
		String str1 = str.substring(0 , mid);
		String str2 = str.substring(mid);
		
		System.out.println(str1 + Revstr(str2) );
		
		System.out.println(Revstr(str1) + str2);
		
		
		String vowels = str.replaceAll("[^aeiouAEIOU]", "");
		
		String consonants = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(vowels+consonants);
		System.out.println(vowels + Revstr(consonants));
		
				
	}

}


