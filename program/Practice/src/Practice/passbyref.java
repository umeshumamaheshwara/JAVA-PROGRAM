package Practice;

class Demo1 {
    int a = 10; 

   static  void sample(Demo1 d1) {
        System.out.println(d1.a);
    }

    void demo() {
        System.out.println(a);
    }
}

public class passbyref {
    public static void main(String[] args) {
        Demo1 d2 = new Demo1(); // Create an instance of Demo1
        d2.demo();            // Pass the same instance to the demo method
        d2.sample(d2);            // Call the sample method
    }
}

