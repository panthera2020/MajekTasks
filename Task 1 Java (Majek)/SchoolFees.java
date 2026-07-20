//Question 13
/*PSEUDOCODE
1 Input school fee
2 Get how many 1000 we can get
3 then how many 500
4 then how many 200
5 and then 50
6 Print result
*/

import java.util.Scanner;
	public class SchoolFees{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter school fees: ");
			int fees = input.nextInt();

			int thousand = fees / 1000;
			int fiveHundred = (fees % 1000) / 500;
			int twoHundred = (fees % 500) / 200;
			int fifty = (fees % 200) / 50;

			System.out.println("Number of 1000 notes: " + thousand);
			System.out.println("Number of 500 notes: " + fiveHundred);
			System.out.println("Number of 200 notes: " + twoHundred);
			System.out.println("Number of 50 notes: " + fifty);
		}
}
