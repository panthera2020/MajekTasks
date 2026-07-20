//4.31

/*
1 collect the integer
2 Check if the number is < 0 or greater than 99999
3 get the values of each digit 
4 Check if the first digits is the same as the last digit and second digit is the same as the second to the last digit
5 if they are, the number is a palindrome, if not display error message
*/

import java.util.Scanner;

public class Palindromes {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter Integer: ");
		int number = input.nextInt();

		if(number < 9999 || number > 99999){
			System.out.print("Invalid input");
		}
		else if(number > 0 && number <= 99999){
			int firstDigit = (number / 10000) % 10;
			int secondDigit = (number / 1000) % 10;
			int thirdDigit = (number / 100) % 10;
			int fourthDigit = (number / 10) % 10;
			int fifthDigit = number % 10;

			if(firstDigit == fifthDigit && secondDigit == fourthDigit){
				System.out.print("Integer is a palidrome");
			}else{
				System.out.print("Error");
			}
		}
	}
}