/*Question 7
Collect the number from the user
Use a loop to check numbers that are factors of the number
Divide the number by each iteration count
If its divisible, print out as a factor
*/

import java.util.Scanner;

public class FactorsOfNumbers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = input.nextInt();

		System.out.print("Factors of " + number + " are: ");
		for(int count = 1; count <=50; count++){
			if(number % count == 0){
				System.out.print(count + ", ");
			}
		}
	}
}