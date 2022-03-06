package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_append {
	public static void main(String[] args) throws IOException {
		  
        try {
        	File appendfile = new File("/home/madhurajogimpha/madhura_jfs/append.txt");
        	FileWriter filewrite = new FileWriter(appendfile, true);
        	filewrite.write("hello world append program  \n");
        	filewrite.close();
        }
        catch (FileNotFoundException ex) {
			System.out.println("FNF try again");
        }
        System.out.println("append successful");
    }
}
