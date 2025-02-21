package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\umamaheshwarayn\\OneDrive\\Desktop\\Umesh\\doctext");
		FileReader fr = new FileReader(f);
		BufferedReader bf = new  BufferedReader(fr);
		
	    String str = bf.readLine();
	    while(str != null)
	    {
	    	System.out.println(str);
	    	str = bf.readLine();
	    }
	
	}

}
