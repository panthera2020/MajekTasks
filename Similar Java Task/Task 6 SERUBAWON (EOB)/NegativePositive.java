// QUESTION 63

/*
1 Initialize counter, number, zeroCounter, negativecounter, positivecounter
2 Use loop to collect 10 input
3 check for negative numbers and increase negative counter by 1 using an if statement
4 check for positive numbers and increase positive counter by 1 using an if statement
5 chech for numbers equals to zero and increase zero counter
6 print the negative counter, positive counter, and zero Counter
*/

import java.util.Scanner;

	public class NegativePositive { 
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int number = 0;
			int counter = 1;
			int negativeCounter = 0;
			int positiveCounter = 0;
			int zeroCounter = 0;
				
			while(counter <= 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt();
	

				if(number < 0){ 
					negativeCounter++;
				}
				if(number > 0){ 
					positiveCounter++;
				}
				if(number == 0){
					zeroCounter++;
				}
			counter++;
			}

			System.out.println("Positive Numbers are " + positiveCounter);
			System.out.println("Negative Numbers are " + negativeCounter);
			System.out.println("Zero Numbers are " + zeroCounter);		
		}
	}