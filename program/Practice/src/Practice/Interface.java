package Practice;

interface Demo
{
    void demo();
    void display();  
}

abstract class Sampl implements Demo
{
    public void demo()
    {
        System.out.println("Hiii");
    }
    
}
class sam extends Sampl
{
	public void display() 
    {
        System.out.println("Hello");
    }
}

public class Interface { 
    public static void main(String[] args) {
        sam s1 = new sam();
        s1.demo();
        s1.display();
        
    }
}
