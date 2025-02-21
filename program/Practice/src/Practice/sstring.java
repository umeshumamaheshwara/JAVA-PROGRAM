package Practice;

public class sstring {
	
	public  void Revstr(String str)
	{
		int mid = (0 +str.length()-1)/2;
		System.out.println(mid);
		String str1 = str.substring(0,mid);
		System.out.println(str1);
		String str2 = str.substring(mid , str.length()); 
		System.out.println(str2);
		String result = ""; 
		for(int i = str2.length()-1 ; i>=0 ; i-- )
		{
		   result = result + str2.charAt(i);	
		}
		System.out.println(result);
		System.out.println(">>>>>>>>>>>>>>>"+str1+result);
		
	}
	
	public void Revstr1(String str)
	{
		int mid = (0 +str.length()-1)/2;
		System.out.println(mid);
		String result = ""; 
		for(int i = mid-1 ; i>=0 ; i--)
		{
			  result = result + str.charAt(i);
		}
		System.out.println(result);
		String str1 = str.substring(mid);
		System.out.println(result + str1);
		
	}
	
	public void Revstr2(String str)
	{
		String str1 = str.replaceAll("[^aeiouAEIOU]", "");
		String str2 = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str1+str2);
		
	}
	
	public void Revstr3(String str)
	{
		String str1 = str.replaceAll("[^aeiouAEIOU]", "");
		String str2 = str.replaceAll("[aeiouAEIOU]", "");
		String rev = "";
		for(int i = str2.length()-1 ; i>=0 ; i--)
		{
			rev = rev + str2.charAt(i);
		}
		System.out.println(">>>>>>"+str1+rev);
		
	}
	
	
	
	public static void main(String[] args) {
		
	  sstring s1 = new sstring();
	  s1.Revstr("Programming");
	  sstring s2 = new sstring();
	  s2.Revstr1("Programming");
	  sstring s3 = new sstring();
	  s3.Revstr2("Programming");
	  sstring s4 = new sstring();
	  s4.Revstr3("Programming");

	  
	  
	  
		
	}

}
