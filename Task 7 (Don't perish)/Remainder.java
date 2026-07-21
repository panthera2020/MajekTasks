/* Question 12
 (Remainder) Write a method that takes two integers and returns the remainder when
the first is divided by the second. Incorporate the method into an application that reads two
values from the user and displays the result.
*/

import java.util.Scanner;

public class Remainder {
	public static int rem(int a, int b){
		int remNumber = a % b;
		return remNumber;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Get the Remainder between Two Numbers");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		int remainderOfNumbers = rem(firstNumber, secondNumber);

		System.out.println();
		System.out.println("Remainder: " + remainderOfNumbers);
	}
}