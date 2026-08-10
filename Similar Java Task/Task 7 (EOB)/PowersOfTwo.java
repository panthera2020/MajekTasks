/*Question 5
Collect input for the n powers of two
Use loop to get the powers of two for that value
Using Math.pow, get the powers of 2 for each count
*/

import java.util.Scanner;

public class PowersOfTwo {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = input.nextInt();

		int powerOfTwo = 0;

		for(int count = 1; count <= number; count++){
			powerOfTwo = (int)Math.pow(2, count);

			System.out.print(powerOfTwo + ", ");
		}
	}
}