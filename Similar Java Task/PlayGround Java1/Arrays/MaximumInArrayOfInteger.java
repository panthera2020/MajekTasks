/*
collect user input and put in an array
check through the integers and then check for the largest
Display largest
*/

import java.util.Scanner;

public class MaximumInArrayOfInteger {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int largest = 0;
		int[] numbers = new int[5];

		for(int userInput = 0; userInput < numbers.length; userInput++){
			System.out.print("Enter Integer: ");
			numbers[userInput] = input.nextInt();
			if(numbers[userInput] > largest){
				largest = numbers[userInput];
			}
		}

		System.out.println();
		System.out.println("Largest: " + largest);
	}
}