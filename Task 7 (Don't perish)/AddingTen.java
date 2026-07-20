/* Question 2
 (Adding Ten) Write a method that takes an integer and returns the result of adding 10 to
it. Incorporate the method into an application that reads a value from the user and displays
the result.*/

import java.util.Scanner;

public class AddingTen {
	public static int addTen(int n){
		int nPlusTen = n + 10;
		return nPlusTen;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		int addTenToNumber = addTen(number);

		System.out.println(number + " + 10 = " + addTenToNumber);
	}
}