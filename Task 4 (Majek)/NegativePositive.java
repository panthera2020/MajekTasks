// QUESTION 3

/*
1 Initialize counter, number largest, smallest, negativecounter, positivecounter
2 Use loop to collect 10 input
3 check for negative numbers and increase negative counter by 1 using an if statement
4 check for positive numbers and increase positive counter by 1 using an if statement
5 inside the positive if statement, check for the largest
6 print the negative counter, positive counter, and largest number
*/

import java.util.Scanner;

	public class NegativePositive{ // changed class name
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int number = 0;
			int counter = 1;
			int largest = 0;
			int negativeCounter = 0;
			int positiveCounter = 0;
			int smallest = 0;

//Initialize negative and positive counters
//Initialize smallest number

				
			while(counter <= 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt();
	

				if(number < 0){ // check for values less than 0 and count as negative numbers
					negativeCounter++;
					number = smallest;
				}
				if(number > 0){ // check for values greater than 0 and count as positive numbers
					positiveCounter++;
					if(number > largest){ // check for the largest number
						largest = number;
					}
				}
			counter++;
			}

			System.out.println("Positive Numbers are " + positiveCounter);
			System.out.println("Negative Numbers are " + negativeCounter);
			System.out.println("Largest Number is " + largest);		
		}
	}