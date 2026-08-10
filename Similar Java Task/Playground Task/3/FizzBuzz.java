/*
1 collect input as an integer
2 check if the integer divided by 5 equals zero, then print buzz 
3 check if the integer divided by 3 equals zero, then print fizz
4 if the number is divisible by both 3 and 5, print FizzBuzz
*/

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Integer: ");
		int number = input.nextInt();

		if(number % 3 == 0 && number % 5 != 0){
			System.out.println("FIZZ");
		}
		else if(number % 5 == 0 && number % 3 != 0){
			System.out.println("BUZZ");
		}
		else if(number % 3 == 0 && number % 5 == 0){
			System.out.println("FIZZBUZZ");
		}
		else{
			System.out.println("Number not divsible by either 3 or 5");
		}
	}
}