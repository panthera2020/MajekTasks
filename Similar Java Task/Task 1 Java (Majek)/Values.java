//Question 15
/*PSUEDOCODE
1 Input six integers
2 Check if they are less than 0, negative
3 Check if they are equal to 0
4 Check if they are greater than 0, positive numbers
5 Initialize a positive number counter
6 Initialize a negative number counter
7 Initialize a zero counter
8 Initialize a variable for positive numbers
9 Initialize a variable for negative numbers
10 Add the positive number, and then add the negative numbers
11 Print Result
*/

import java.util.Scanner;
	public class Values{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter 6 integers: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();
			int num5 = input.nextInt();
			int num6 = input.nextInt();


			int positiveCounter = 0;
			int negativeCounter = 0;
			int zeroCounter = 0;
		
			int positiveSum = 0;
			int negativeSum = 0;
	
			if(num1 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num1;
			}
			if(num1 == 0){
				zeroCounter++;
			}
			if(num1 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num1;
			}

			if(num2 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num2;
			}
			if(num2 == 0){
				zeroCounter++;
			}
			if(num2 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num2;
			}

			if(num3 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num3;
			}
			if(num3 == 0){
				zeroCounter++;
			}
			if(num3 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num3;
			}

			if(num4 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num4;
			}
			if(num4 == 0){
				zeroCounter++;
			}
			if(num4 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num4;
			}

			if(num5 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num5;
			}
			if(num5 == 0){
				zeroCounter++;
			}
			if(num5 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num5;
			}

			if(num6 < 0){
				negativeCounter++;
				negativeSum = negativeSum + num6;
			}
			if(num6 == 0){
				zeroCounter++;
			}
			if(num6 > 0){
				positiveCounter++;
				positiveSum = positiveSum + num6;
			}	

			System.out.printf("Positive numbers: %d%nNegative numbers: %d%nZeroes: %d%n", positiveCounter, negativeCounter, zeroCounter);
			System.out.printf("Sum of positive numbers: %d%nSum of negative numbers: %d", positiveSum, negativeSum);

		} 

	}