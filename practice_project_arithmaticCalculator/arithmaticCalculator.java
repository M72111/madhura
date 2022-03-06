package praticelab1;

import java.util.Scanner;

class Calculation {
	int result;
	public int add(int a, int b){
		result = a+b;
		return result;
	}
	public int sub(int a, int b){
		result = a-b;
		return result;
	}
	public int mul(int a, int b){
		result = a*b;
		return result;
	}
	public float div(int a, int b){
		result = a/b;
		return result;
	}	
}


class Initialisation {
	private int num1;
	private int num2;
	
	public int getnum1() {
		return num1;
	}
	public void setnum1(int num1) {
		this.num1 = num1;
	}
	public int getnum2() {
		return num2;
	}
	public void setnum2(int num2) {
		this.num2 = num2;
	}
}

public class arithmaticCalculator {
	public static void main(String[] args) {
			final int check=1;
			Scanner scan = new Scanner(System.in);
			while(check==1) {
			System.out.println("###MENU###");
			System.out.println("Choose one option from menu below");
			System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
			int opration = scan.nextInt();
			if (opration==5) {
				System.out.println("Thank you for using Arithmatic Calculator");
				System.exit(0);
			}
			System.out.println("Enter the 1st number");
			int num1 = scan.nextInt();
			System.out.println("Enter the 2nd number");
			int num2 = scan.nextInt();
			
			Initialisation ig = new Initialisation();
			ig.setnum1(num1); 
			ig.setnum2(num2);
			Calculation cal = new Calculation();
			switch(opration) {
			case 1:int addResult = cal.add(ig.getnum1(), ig.getnum2());
			System.out.println("Addition of two number = "+addResult);
			break;
			case 2:int subResult = cal.sub(ig.getnum1(), ig.getnum2());
			System.out.println("Subtraction of two number = "+subResult);
			break;
			case 3:int mulResult = cal.mul(ig.getnum1(), ig.getnum2());
			System.out.println("Multiplication of two number = "+mulResult);
			break;
			case 4:float divResult = cal.div(ig.getnum1(), ig.getnum2());
			System.out.println("Division of two number = "+divResult);
			break;
			default :System.out.println("Invalid Option");

			}
			}
		}
	}

