//QUESTION 2
/* PSUEDOCODE
1 Enter integer
2 Calculate cube of the integer
3 Print if the number is greater than, equal to or less than 500
*/

import java.util.Scanner;
	public class CompareIntegers{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter Integer: ");
			int number = input.nextInt();

			int cube = number * number * number;

			if(number > 500 && cube > 500){
				System.out.print("Greater than 500");
			}
		
			if(number == 500 && cube == 500){
				System.out.print("Equals to 500");
			}
		
			if(number < 500 && cube < 500 ){
				System.out.print("Less than 500");
			}
		}
	}