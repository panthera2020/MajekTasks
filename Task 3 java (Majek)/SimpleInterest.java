//Question 7

/*PSEDOCODE
1 input principal
2 input rate
3 input time in years
4 calculate simple interest
5 calculate total amount
6 print result
*/

import java.util.Scanner;

	public class SimpleInterest{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter Principal amount: ");
			double principal = input.nextDouble();

			System.out.print("Enter Rate(%): ");
			double rate = input.nextDouble();

			System.out.print("Enter Time(years): ");
			double time = input.nextDouble();

			double simpleInterest = (principal * rate * time) / 100;
			double totalAmount = principal + simpleInterest;

			System.out.printf("Simple Interest: %.2f%nTotal Amount: %.2f", simpleInterest, totalAmount);
		}
	}