//QUESTION 2

/*
1 Initialize number and counter
2 Collect input number
3 Initialize the smallest to number 
4 Use a loop to check the other number for the smallest 
5 Print smallest number
*/

import java.util.Scanner;

	public class SmallestValue{ // changed class name
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int number = 0;
			int counter = 1;
			int smallest = 0;

				System.out.print("Enter Integer: ");
				number = input.nextInt();
				smallest = number; // changes first input to the smallest number
				
			while(counter < 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt(); 
				
				if(number < smallest){ // Compared the new set of numbers to the new input
					smallest = number;
				}
			
			counter++;
			}

			System.out.printf("Smallest Number: %d ", smallest);
		}
	}