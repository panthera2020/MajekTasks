import java.util.Scanner;

public class VerifyCard{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Check Your Card Validity");
		System.out.println();

		System.out.print("Enter card Number:   ");
		long userCardNumber = input.nextLong();

		System.out.println();

		if(userCardNumber > 10000000000000000l && userCardNumber < 1000000000000l){
			System.out.println("********************************************");
			System.out.println("** Credit Card Type: " + CreditCardVerification.typeOfCreditCard(userCardNumber));
			System.out.println("** Credit Card Number:  " + userCardNumber);
			System.out.println("** Credit Card Digit Length:  " + CreditCardVerification.lengthOfCardDigit(userCardNumber));
			System.out.println("** Credit Card Validity Status: Invalid");
			System.out.println("********************************************");
		}else{
			if(CreditCardVerification.isCardValidTotatally(userCardNumber)){
				System.out.println("********************************************");
				System.out.println("** Credit Card Type: " + CreditCardVerification.typeOfCreditCard(userCardNumber));
				System.out.println("** Credit Card Number:  " + userCardNumber);
				System.out.println("** Credit Card Digit Length:  " + CreditCardVerification.lengthOfCardDigit(userCardNumber));
				System.out.println("** Credit Card Validity Status: Valid");
				System.out.println("********************************************");
			}else{
				System.out.println("********************************************");
				System.out.println("** Credit Card Type: " + CreditCardVerification.typeOfCreditCard(userCardNumber));
				System.out.println("** Credit Card Number:  " + userCardNumber);
				System.out.println("** Credit Card Digit Length:  " + CreditCardVerification.lengthOfCardDigit(userCardNumber));
				System.out.println("** Credit Card Validity Status: Invalid");
				System.out.println("********************************************");
			}
		}
	}
}