package Practice;

class Gobi
{
	void gobi()
	{
		System.out.println("Ready to Eat");
	}
}
class Gobimanchrian
{
	void order(Gobi G2)
	{
		G2.gobi();
		
	}
}

public class Gobicorner {
	public static void main(String[] args) {
        Gobi G1 = new Gobi();
        Gobimanchrian m1 = new Gobimanchrian();
        m1.order(G1);
		
	}

}
