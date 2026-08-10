import java.util.Scanner;
public class BankChallenge{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int balance = 10000;
		
		
		System.out.print("Welcome to P-Bank\n Enter M to get the menu \n");
		String choice1 = input.nextLine();

			if(choice1.equalsIgnoreCase("M")){
				System.out.print("B for Balance \nD for Deposit \nW for Withdrawal \n");
				String choice2 = input.nextLine();
			
					if(choice2.equalsIgnoreCase("B")){
						System.out.printf("Your balance is %d%n", balance);
					}
					if(choice2.equalsIgnoreCase("D")){
						System.out.print("Deposit Amount: ");
						int depositAmount = input.nextInt();
						int newBalance1 = balance + depositAmount;
						balance = newBalance1;
						System.out.printf("Your new balance is %d%n", balance);
					}
					if(choice2.equalsIgnoreCase("W")){
						System.out.print("Withdraw Amount: ");
						int withdrawalAmount = input.nextInt();
							if(withdrawalAmount > balance){
							System.out.print("Insufficient Balance");
							}
							else{
							int newBalance2 = balance - withdrawalAmount;
							balance = newBalance2;
							System.out.printf("Withdrawal Successful\n Your new balance is %d%n", balance);
							}
					}
			}
  	}
}