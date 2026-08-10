/*
collect first input and insert it into the array
declare first number as smallest
use loop to keep asking for input
Compare each of the integers in the arrays with the smallest to determine smallest
Display smallest
*/


import java.util.Scanner;

public class MinimumInArrayOfInteger {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int smallest = 0;
		int[] numbers = new int[5];

		System.out.print("Enter Integer: ");
		numbers[0] = input.nextInt();
		smallest = numbers[0];

		for(int userInput = 1; userInput < numbers.length; userInput++){
			System.out.print("Enter Integer: ");
			numbers[userInput] = input.nextInt();
			if(numbers[userInput] < smallest){
				smallest = numbers[userInput];
			}
		}

		System.out.println();
		System.out.println("Smallest: " + smallest);
	}
}