package Practice;

class single1
{ 
	void single()
	{
		System.out.println("Super Class");
	}
	
}
class single2 extends single1
{ 
	void singl()
	{
	
		System.out.println("!1st Child  Class");
	}
	
}
class single3 extends single2
{
	void single1()
	{

		System.out.println("2nd child  Class");
	}
}
class single4 extends single1
{
	void single1()
	{

		System.out.println("2nd child  Class");
	}
}


public class single {
  public static void main(String[] args) {
	single2 s1  = new single2();
	single3 s2 = new single3();
	single4 s4 =  new single4();
	s1.singl();
	s1.single();
	s2.single();
	s2.single1();
	s4.single();
	s4.single1();
	
	
	
}
}
