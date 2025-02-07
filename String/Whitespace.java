//write  a program to remove all the Space white Space in a given String.
package String;

public class Whitespace {
	public static void main(String[] args) {
		String Str = " Hello     java";
		System.out.println(Str.replaceAll(" +", " "));
	}

}
