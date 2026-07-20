/* Question 9
(Sum of Two Numbers) Write a method that takes two integers and
returns their sum. Incorporate the method into an application that reads
two values from the user and displays the result.
*/

import java.util.Scanner;

public class SumTwoNumbers {
	public static int sumNumbers(int a, int b){
		int sumOfNumbers = a + b ;
		return sumOfNumbers;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Sum Two numbers");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		int sumBothNumbers = sumNumbers(firstNumber, secondNumber);

		System.out.println();
		System.out.println("Sum: " + sumBothNumbers);
	}
}