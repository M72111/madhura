package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filehandling_read {
	public static void main(String [] args) throws IOException {
		try {
			File readfile = new File("/home/madhurajogimpha/madhura_jfs/madhu.txt");
		BufferedReader bufread= new BufferedReader(new FileReader(readfile));
		String s;

        while ((s = bufread.readLine()) != null)

            System.out.println(s);
        bufread.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("FNF try again");
			
		}        
	}
}
