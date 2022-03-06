package lockerMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperation {

	public static void Menu() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("1.Add file\n2.Delete file\n3.Search file\n4.Back to main menu");
			System.out.println("Choose one option");
			try {
			int n=scan.nextInt();
			switch(n) {
			case 1:
				addfile();
				break;
			case 2:
				deletefile();
				break;
			case 3:
				searchfile();
			break;
			case 4:
				Main.MainMenu();
				break;
			default :
				System.out.println("Choose a valid option from above menu");
			
			}
		}catch(Exception e ) {
			System.out.println("Error occured try again");
		}
		}
		
		
	}
	public static void  addfile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************************");
        System.out.print("Enter the desired name of your file: ");
        String fileName = scan.nextLine();
        fileName = "/home/madhurajogimpha/madhura_jfs/LockedMe Project/storage/"+fileName;
		try {
		      File myObj = new File(fileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println("*************************************");
		
	}
	public static void deletefile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************************");
        System.out.print("Enter the name of the file to  delete: ");
        String fileName = scan.nextLine();
        fileName = "/home/madhurajogimpha/madhura_jfs/LockedMe Project/storage/"+fileName;	
        File f= new File(fileName);            
        if(f.delete())                  
        {  
        System.out.println(f.getName() + " deleted");   
        }
        else {
        	System.out.println("The file "+f.getName()+" doesnot exist please try again");
        }
        System.out.println("*************************************");
	}
	public static void searchfile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************************");
        System.out.print("Enter the name of the file to search: ");
        String fileName = scan.nextLine();
        fileName = "/home/madhurajogimpha/madhura_jfs/LockedMe Project/storage/"+fileName;
        File search=new File(fileName);
        boolean check = new File(fileName).exists();
        if(check == true) {
        	System.out.println("File found");
        }
        else {
        	System.out.println("File not found ");
        }
        System.out.println("*************************************");
	}

}
