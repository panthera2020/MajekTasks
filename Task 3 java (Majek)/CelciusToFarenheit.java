//Question 6
/*PSEUDOCODE
1 input celcius number
2 Calculate conversion of celsius to farenheit
3 Print Result
*/

import java.util.Scanner;

	public class CelciusToFarenheit{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Convert celsius to farenheit\nInput number:  ");
			double celsius = input.nextDouble();

			double farenheit = (9 * celsius) + 32;
    
			System.out.printf("your celcius is now %.2f farenhiet", farenheit);

		}
	}

