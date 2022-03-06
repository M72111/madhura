package Validation_of_an_Email_ID;

import java.util.ArrayList;
import java.util.Scanner;

public class emailValidator {
	public static void main(String[] args){
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter an email ID");
		  String emailid = in.nextLine();
		  emailid=emailid.toLowerCase();
	      ArrayList <String> emailValidatorlist = new ArrayList<String>();
	      emailValidatorlist.add("madhura@gmail.com");
	      emailValidatorlist.add("kenny@gmail.com");
	      emailValidatorlist.add("micky@yahoo.com");
	      emailValidatorlist.add("tweety@yahoo.com");	     
	         if (emailValidatorlist.contains(emailid)){
	               System.out.println("The Email ID is present in the ArrayList");
	         }
	         else {
	        	 System.out.println("The Email ID is not present in the ArrayList");
	         }
	         in.close();
	   }

}
