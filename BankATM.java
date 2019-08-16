package Session6.Assignment4;

import java.util.Scanner;

public class BankATM {

	int atmID;
	String bankName = "Fast Bank", location = "Atlanta, GA";
	Double userBalace =  20000.00; 
	Double withdrawAmount;
	double depositAmount;

	Scanner sc = new Scanner(System.in);
	
	
	void withdraw(double amt) throws bankATMException{

		System.out.println();
		System.out.print("How much would you like to Withdraw? $");
		 withdrawAmount = sc.nextDouble();
		 if (userBalace < 10000|| withdrawAmount >= userBalace) {
		throw new bankATMException();
		
	}
		 else {
			 userBalace = userBalace - withdrawAmount;
			 System.out.println("Your new Balance is $" + userBalace);
		 }
	}

	void deposit(double amt) {
		System.out.println();
		System.out.print("How much would you like to Depoit? $");
		depositAmount = sc.nextDouble();
		userBalace = userBalace+depositAmount;
		System.out.println("Your new Balance is $" + userBalace);
	}
	
	void display() {
		System.out.println("Welcome to " + bankName + " in " + location );
		System.out.println("As of now you current Balance is $" + userBalace);
		
	}
	void Edisplay() {
		System.out.println("Thank you for Choosing " + bankName + " in " + location );
		System.out.println("Have a Nice Day.");
		
	}
}
