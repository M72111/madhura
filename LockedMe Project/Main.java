package lockerMe;

import java.util.Scanner;

public class Main{
	
	
	public static void main(String args[]) {
		System.out.println("Welcome Screen");
		welcomescreen();
		while(true) {
		MainMenu();
		}
	}
	public static void welcomescreen() {
		System.out.println("Application name = LockedMe.com");
		System.out.println("Developer name = Madhura jogi\n");
	}
	public static void MainMenu() {
			Scanner scan=new Scanner(System.in);
			System.out.println("1.Retrieving the file names in an ascending order\n2.Business-level operations\n3.close the application");
			System.out.println("Choose one option");
			try {
			int n=scan.nextInt();
			switch(n) {
			case 1:
				RetrievingFile.AscendingOrder();
				break;
			case 2:BusinessOperation.Menu();
				break;
			case 3:System.out.println("Thank you for using LockedMe.com\nexiting application");
			System.exit(0);
			default :
				System.out.println("Choose a valid option from above menu");
			
			}
		}catch(Exception e ) {
			System.out.println("Error occured try again");
		}
		}
		
}
