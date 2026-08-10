/*
1 Collect a number integer
2 Print multiplication table of input
3 multiply that number by 1 through to 12 using loop and print each answer in every loop
*/

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[]args){
		Scanner input =  new Scanner(System.in);

		System.out.print("Enter the multipication table you want: ");
		int multipleOf = input.nextInt();

		System.out.println("Multilication table of " + multipleOf);

		for(int count = 1; count <= 12; count++){
			System.out.printf("%d       x%5d = %4d%n", count, multipleOf, count * multipleOf);
		}
	}
}