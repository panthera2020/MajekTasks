/* Question 3
(Halving a Number) Write a method that takes an integer and returns half of it as a
decimal value. For example, given 5, the method should return 2.5. Incorporate the method
into an application that reads a value from the user and displays the result. */

import java.util.Scanner;

public class HalvingNumber {
	public static double halfNumber(double n){
		double halfOfN = n / 2;
		return halfOfN;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		double number = input.nextDouble();

		double halfOfNumber = halfNumber(number);

		System.out.println("Half of " + number + " = " + halfOfNumber);
	}
}