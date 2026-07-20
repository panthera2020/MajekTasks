/* Question 4
(Absolute Value) Write a method that takes an integer and returns its absolute value,
without using Math.abs. Incorporate the method into an application that reads a value from
the user and displays the result.
*/

import java.util.Scanner;

public class AbsoluteValue {
	public static int absValue(int n){
		if(n < 0){
			return n * -1;
		}else{
			return n;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = input.nextInt();

		int numberAbsoluteNumber = absValue(number);

		System.out.println("Absolute Value: " + numberAbsoluteNumber);
	}
}