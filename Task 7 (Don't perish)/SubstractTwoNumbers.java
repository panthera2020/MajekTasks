/* Question 10
(Difference of Two Numbers) Write a method that takes two integers and returns the
result of subtracting the second from the first. Incorporate the method into an application
that reads two values from the user and displays the result. 
*/

import java.util.Scanner;

public class SubstractTwoNumbers {
	public static int subNumbers(int a, int b){
		int subOfNumbers = b - a ;
		return subOfNumbers;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Substract Two numbers");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		int subBothNumbers = subNumbers(firstNumber, secondNumber);

		System.out.println();
		System.out.println(secondNumber + " - "+ firstNumber + " = " + subBothNumbers);
	}
}