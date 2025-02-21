package Practice;


class method
{ 
	int c = 10;
	static void d(method m2)
	{
		System.out.println(m2.c);
		
	}
}


public class Array {

	   int a =10;
	static void B (Array b1)
	{
		System.out.println(b1.a);
		
	}
	
	public static void main(String[] args) {
		Array a1 = new Array();
	System.out.println(a1.a);	
	 B(a1);
	 method m1 = new method();
	 System.out.println(m1.c);
	 m1.d(m1);
	
		
		
	 
	 
		
		
		
	}

}
