/* Question 13 
 (Larger of Two Numbers) Write a method that takes two integers and returns the larger
one. Incorporate the method into an application that reads two values from the user and
displays the result. 
*/

import java.util.Scanner;

public class LargestNumber {
	public static int lar(int x, int y){
		int largest = 0;
		if(x > y ){
			largest = x;
			return largest;
		}else{
			largest = y;
			return largest;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine the largest number");
		System.out.print("Enter first Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second Number: ");
		int secondNumber = input.nextInt();

		int largestOfNumbers = lar(firstNumber, secondNumber);

		System.out.println();
		System.out.println("Largest: " + largestOfNumbers);
	}
}