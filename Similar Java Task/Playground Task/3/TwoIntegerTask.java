/*
1 collect two integers
2 less than 0 shows its a negative number and greater than zero shows its positive
3 if integer one and integer two are greater than zero add them
4 if integer one and integer two are less than zero, multiply them
5 if integer one is less than zero and integer two is greater than zero find the difference
6 if integer two is less than zero and integer one is greater than zero, find the difference
*/

import java.util.Scanner;

public class TwoIntegerTask {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter integer: ");
		int numberOne = input.nextInt();

		System.out.print("Enter integer: ");
		int numberTwo = input.nextInt();

		int result = 0; 

		if(numberOne > 0 && numberTwo > 0){
			result = numberOne + numberTwo;
		}
		if(numberOne < 0 && numberTwo < 0){
			result = numberOne * numberTwo;
		}
		if(numberOne < 0 && numberTwo > 0){
			result = numberTwo - numberOne;
		}
		if(numberOne > 0 && numberTwo < 0){
			result = numberOne - numberTwo;
		}

		System.out.println("Result: " + result);
		
	}
}