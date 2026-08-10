/* Question 1
Collect input from users
use the number variable to collect intger input
Do this using do while loop, to keep collecting input
This only stops when a negative integer is inputed
Initialize sum and number outside the loop
Print the sum of numbers, but due to the negative number used to stop the loop, add the negative number to the sum when printing out
*/


import java.util.Scanner;

public class PositiveNumberInput {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int number;
		int counter = 1;

			System.out.println("Enter positive numbers: ");
			number = input.nextInt();

			while(number > 0){
				sum += number;

				System.out.println("Enter positive numbers: ");
				number = input.nextInt();

				counter++;
			}
			
		double average = (double) sum / (counter - 1);

		System.out.printf("The average is: %.2f", average);
	}
}