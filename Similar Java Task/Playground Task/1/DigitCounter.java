/*
1 Collect input 
2 Divide the input by 10 till you get zero to determine the number of digits
3 Initialize a counter to keep count
*/

import java.util.Scanner;

public class DigitCounter {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Integer: ");
		int number = input.nextInt();

		int count = 0;
		for(count = 0; number > 0; count++){
			number /= 10;
		}

		System.out.print("The number of digit is " + count);
	}
}