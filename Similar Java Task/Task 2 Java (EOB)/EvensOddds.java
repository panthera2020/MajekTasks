//Task 8

import java.util.Scanner;

	public class EvensOddds{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter integer: ");
			int number = input.nextInt();

			if(number % 2 == 0){
				System.out.printf("%d is a even number", number);
			}
			if(number % 2 != 0){
				System.out.printf("%d is an odd number", number);
			}

		}
	}