//Task 6

import java.util.Scanner;
	public class SimpleInterest{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Principal Amount: ");
			double amount = input.nextDouble();

			System.out.println("Enter Rate: ");
			double rate = input.nextDouble();

			System.out.println("Enter Period of years: ");
			int time = input.nextInt();

			double simpleInterest = (amount * rate * time) / 100;

			System.out.printf("Interest: %.2f%n", simpleInterest);
		}
	}