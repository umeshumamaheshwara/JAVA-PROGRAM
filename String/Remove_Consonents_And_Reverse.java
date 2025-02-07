package String;

public class Remove_Consonents_And_Reverse {
		public static void main(String[] args) {
			String str = "Hello Java";
			String S1 = str.replaceAll("[^aeiouAEIOU]", "");
			System.out.println(S1);
			String reverse = "";
			for(int i=S1.length()-1 ; i>=0 ; i--)
			{
				reverse = reverse + S1.charAt(i);
				
			}
			System.out.println(reverse);
		}
		

	}



