package Sorting;

public class LexiCalScope {
	public static void main(String[] args) {
		String[] str= {"mango","banana","orrange","apple","jackfruit"};
		for(int i = 0 ; i<str.length ; i++)
		{
			for(int j = 0 ; j<str.length-1-i ; j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					String temp = str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
			
		}
		for(String a: str)
		{
			System.out.println(a);
		}
	}

}
