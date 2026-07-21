/* Question 11
 (Decimal Division) Write a method that takes two integers and returns the result of
dividing the first by the second as a decimal value. Incorporate the method into an
application that reads two values from the user and displays the result. 
*/

import java.util.Scanner;

public class DecimalDivision {
	public static double divNumber(double a, double b){
		double divideNumbers = a / b;
		return divideNumbers;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Divide Two Numbers");
		System.out.print("Enter first Number: ");
		double firstNumber = input.nextDouble();

		System.out.print("Enter second Number: ");
		double secondNumber = input.nextDouble();

		double dividedNumber = divNumber(firstNumber, secondNumber);

		System.out.println();
		System.out.println(secondNumber + " / "+ firstNumber + " = " + dividedNumber);
	}
}