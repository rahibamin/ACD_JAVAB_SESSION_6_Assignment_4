package Session6.Assignment4;

import java.util.Scanner;

public class Bank {



	public static void main(String[] args) {

		String action="";
		
		
		BankATM batm = new BankATM();
		batm.display();

		
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println();
		System.out.println();
		System.out.print("Would you like to Withdraw (W) or Deposit (D) or Exit (E)? ");
		action = sc.next();


		if(action.equalsIgnoreCase("w")){

			try {
				batm.withdraw(0);
			} catch (bankATMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(action.equalsIgnoreCase("D")){
				batm.deposit(0);
			}
		
		else if(action.equalsIgnoreCase("E")){
			batm.Edisplay();
			System.exit(0);
		}
		
	}
		
		
	}
}
