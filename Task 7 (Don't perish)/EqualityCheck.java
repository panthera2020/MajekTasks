/* Question 15
(Equality Check) Write a method that takes two integers and returns true if they are
equal. Incorporate the method into an application that reads two values from the user and
displays the result.
*/

import java.util.Scanner;

public class EqualityCheck {
	public static boolean isEqual(int x, int y){
		if(x == y){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Check if numbers are Equal");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		boolean areNumbersEqual = isEqual(firstNumber, secondNumber);

		System.out.println();
		System.out.println("Is " + firstNumber + " Equal to " + secondNumber + "?");
		System.out.println();
		System.out.println(areNumbersEqual);
	}
}