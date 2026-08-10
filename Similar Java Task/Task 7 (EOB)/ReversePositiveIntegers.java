/*Question 8
Collect input
*/

import java.util.Scanner;

public class ReversePositiveIntegers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Positive Integer");
		int postiveInteger = input.nextInt();

		int digit = 0;
		int digitcounter = 0;
		int ten = 1;
		int eachNumber = 0;

		while(digit != 0){
			digit /= 10;
			//digit = postiveInteger % 10;
			digitcounter++;
		}

		for(int count = 1; count <=digitcounter; count++){
			eachNumber = (postiveInteger/ten) % 10;
			System.out.print(eachNumber);
			ten *= 10;
		}
	}
}