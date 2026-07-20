/* Question 5
(Divisibility by Three) Write a method that takes an integer and returns true if it is
evenly divisible by 3, false otherwise. Incorporate the method into an application that reads
a value from the user and displays the result.
*/

import java.util.Scanner;

public class DivisibleByThree {
	public static boolean divisbleByThree(int a){
		if(a % 3 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Is Number divisible by three");
		System.out.print("Enter number: ");
		int number = input.nextInt();

		boolean numberDivisbleByThree = divisbleByThree(number);

		System.out.println("Is number divisble by Three?");
		System.out.println();
		System.out.println(numberDivisbleByThree);
	}
}