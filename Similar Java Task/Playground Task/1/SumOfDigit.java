/*
1 collect input from the user
2 
*/

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[]args){
		Scanner input =  new Scanner(System.in);

		System.out.print("Enter Integer: ");
		int number = input.nextInt();

		int digits = number;
		int sum = 0;
		int ten = 1;
		int digitSeperator = 0;

		for(int count = 0; digits > 0; count++){
			digits = number / ten;
			digitSeperator = digits % 10;
			sum = sum + digitSeperator;

		ten *= 10;
		}

		System.out.print("The sum of the digits are " + sum);
	}
}