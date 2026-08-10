//4.31

/*
1 collect integer 
2 check if the number is between 0 to 1000
3 now separate each of the number and declare each into a variable
4 now add each of the number
5 print sum of the digits
*/

import java.util.Scanner;

public class SumDigitsOfIntegers {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int number = input.nextInt();

		if((number < 0) || (number >= 1000)){
			System.out.println("Invalid integer");
		}
		else if(number >= 0 && number <1000){
			int firstDigit = (number / 100) % 10;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;

			int sum = firstDigit + secondDigit + thirdDigit;

			System.out.println("The sum of the digits is " + sum);
		}	
	}
}