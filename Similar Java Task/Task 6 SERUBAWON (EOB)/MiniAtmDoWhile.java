/* Question 76
1 ask for balance enquiry or cash withdrawal or cash deposit
2 use switch case to switch between each choice 
*/

import java.util.Scanner;

public class MiniAtmDoWhile {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int withdrawal = 0;
		int deposit = 0;
		int choice = 0;

		do{
			System.out.println("Enter 1 for Balance Enquiry");
			System.out.println("Enter 2 for Cash Withdrawal");
			System.out.println("Enter 3 for Cash Deposit");
			System.out.println("Enter 4 to Exit");
			choice = input.nextInt();

			switch(choice){
				case 1:
					System.out.println("Your Balance is: $1000");
					break;
				case 2:
					System.out.print("Enter Amount to Withdraw: ");
					withdrawal = input.nextInt();
					System.out.println("You have withdrawn: $" + withdrawal);
					break;
				case 3:
					System.out.print("Enter Amount to Deposit: ");
					deposit = input.nextInt();
					System.out.println("You have deposited: $" + deposit);
					break;
				case 4:
					System.out.println("Thank you for using the ATM. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			} 
		}while(choice != 4);
		
	
	}
}