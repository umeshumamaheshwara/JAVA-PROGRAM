//Split a String By specific character.
package BasicStrigOP;

public class SplitBYspecificCharacter {
	public static void main(String[] args) {
	String str = "Hello Java Bye";
	String[] split = str.split("e");
	for(int i = 0 ; i<split.length ; i++)
				{
					System.out.println(split[i]);
				}
			}
		
		}
