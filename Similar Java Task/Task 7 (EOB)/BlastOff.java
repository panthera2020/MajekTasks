/*Question 6
Collect input for the count down
Using loop start counting down from the input to 1
Print out each iteration as a count down
Print 0 as blastoff
*/

import java.util.Scanner;

public class BlastOff {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);

		System.out.println("Enter countdown number: ");
		int countdownNumber = input.nextInt();

		System.out.println();
		
		for(int count = countdownNumber; count >= 0; count--){
			if(count == 0){
				System.out.println("BlastOff");
			}else{
				System.out.println(count);
			}
		}
	}
}