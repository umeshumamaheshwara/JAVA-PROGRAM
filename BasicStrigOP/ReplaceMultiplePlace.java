//Replace Multiple Spaces with a single space.
package BasicStrigOP;

public class ReplaceMultiplePlace {
 public static void main(String[] args) {
	String str = "  Java   is  a  Programming      Language  ";
	System.out.println(str.replaceAll("\\s+", " "));
}
}
