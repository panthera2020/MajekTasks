// QUESTION 5

/*
1 initialize counter, first input as the smallest.
2 initialize secondSmallest 
3 intialized variable for input
4 create a loop to check which is the smallest number between the next input and the smallest
5 inside the loop check for the second smallest number
6 Print result 
*/

import java.util.Scanner;

	public class SmallestSmallest{ // changed class name
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int counter = 1;


				System.out.print("Enter Integer: ");
				int number = input.nextInt();
				int smallest = number;
				int secondSmallest = 0;

				
			while(counter < 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt();

				if(number < smallest){
					secondSmallest = smallest;
					smallest = number;
				}
				if(number > secondSmallest && number < smallest){
					secondSmallest = number;
				}

			counter++;
			
			}
			System.out.println("Smallest Number is " + smallest);
			System.out.println("SecondSmallest Number is " + secondSmallest);		
		}
	}