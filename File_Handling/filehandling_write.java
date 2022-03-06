package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class filehandling_write {
	public static void main(String[] args) throws FileNotFoundException
    
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the data to write");
       String writedata=in.nextLine();
       File writefile = new File("/home/madhurajogimpha/madhura_jfs/writeexample.txt"); 
        PrintWriter writer = new PrintWriter(writefile);
        writer.write(writedata);
        writer.close();
        System.out.println("Write successful");
        in.close();
    }

}
