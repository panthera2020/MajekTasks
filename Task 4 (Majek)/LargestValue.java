//QUESTION 3

/*
1 Initialize number and counter
2 Collect input number
3 Initialize the smallest to number 
4 Use a loop to check the other number for the smallest 
5 Print smallest number
*/

import java.util.Scanner;

	public class SmallestValue{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int number = 0;
			int counter = 1;
			int smallest = 0;

				System.out.print("Enter Integer: ");
				number = input.nextInt();
				smallest = number;
				
			while(counter < 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt(); 
				
				if(number < smallest){
					smallest = number;
				}
				
				
			
			counter++;
			}

			System.out.printf("Smallest Number: %d ", smallest);
		}
	}