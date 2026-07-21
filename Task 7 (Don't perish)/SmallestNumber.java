/* Question 14
(Smaller of Two Numbers) Write a method that takes two integers and returns the
smaller one. Incorporate the method into an application that reads two values from the user
and displays the result. 
*/

import java.util.Scanner;

public class SmallestNumber {
	public static int sma(int x, int y){
		int smallest = 0;
		if(x < y ){
			smallest = x;
			return smallest;
		}else{
			smallest = y;
			return smallest;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine the largest number");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		int smallestOfNumbers = sma(firstNumber, secondNumber);

		System.out.println();
		System.out.println("Smallest: " + smallestOfNumbers);
	}
}