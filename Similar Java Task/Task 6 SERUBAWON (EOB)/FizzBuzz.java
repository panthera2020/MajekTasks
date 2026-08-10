/* Question 74
1 Start count from 1 to 50
2 check if the count divided by 5 equals zero, then print buzz 
3 check if the count divided by 3 equals zero, then print fizz
4 if the number is divisible by both 3 and 5, print FizzBuzz
*/

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);

		
		for(int count = 1; count <= 50; count++){
			if(count % 3 == 0 && count % 5 != 0){
				System.out.print("FIZZ");
				System.out.print(" ");
			}
			else if(count % 5 == 0 && count % 3 != 0){
				System.out.print("BUZZ");
				System.out.print(" ");
			}
			else if(count % 3 == 0 && count % 5 == 0){
				System.out.print("FIZZBUZZ");
				System.out.print(" ");
			}
			else{
				System.out.print(count);
				System.out.print(" ");
			}
		}
	}
}