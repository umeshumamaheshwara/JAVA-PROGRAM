//Write a program to remove numbers from a given string
package String;

public class Remove_No {
	public static void main(String[] args) {
		String Str = "ja123va is45 Progra123mming082 Lang197vage832";
		System.out.println(Str.replaceAll("[0-9]", ""));
	}

}
