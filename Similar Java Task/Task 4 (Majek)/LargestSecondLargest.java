// QUESTION 4

/*
1 initialize input, counter, largest and secondLargest
2 use loop to collect integers
3 using if statement, declare  number as largest 
4 use if statement to check if number is less than largest, then number is secondLargest
5 use if statement to check if number is less than largest but greater than secondlargest, then it becomes the secondlargest
6 print largest and secondLargest
*/

import java.util.Scanner;

	public class LargestSecondLargest{ // changed class name
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			int counter = 1;


				System.out.print("Enter Integer: ");
				int number = input.nextInt();
				int largest = number;
				int secondLargest = 0;

				
			while(counter < 10){
				System.out.print("Enter Integer: ");
				number = input.nextInt();

				if(number > largest){
					secondLargest = largest;
					largest = number;
				}
				if(number < largest && number > secondLargest){
					secondLargest = number;
				}

			counter++;
			}
			System.out.println("Largest Number is " + largest);
			System.out.println("SecondLargest Number is " + secondLargest);		
		}
	}