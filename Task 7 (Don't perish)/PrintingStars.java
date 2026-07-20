/* Question 8
(Printing Stars) Write a method that takes an integer and prints that many asterisks on a
single line. For example, given 4, the method should print ****. Incorporate the method into
an application that reads a value from the user and displays the result
*/

import java.util.Scanner;

public class PrintingStars {
	public static void printStar(int s){
		for(int stars = 1; stars <= s; stars++){
			System.out.print("*");
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Print Stars");
		System.out.print("Enter number of stars: ");
		int stars = input.nextInt();

		printStar(stars);
		System.out.println();
	}
}