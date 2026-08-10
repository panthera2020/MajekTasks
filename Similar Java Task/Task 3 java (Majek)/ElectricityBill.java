//Question 9 

/*PSUEDOCODE
1 Input number of electricity units consumed
2 input cost per unit
3 Calculate total bill
4 Print result
*/

import java.util.Scanner;

	public class ElectricityBill{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter Unit of Electricity Used: ");
			double unitUsed = input.nextDouble();

			System.out.print("Enter Cost Per Unit: ");
			double costPerUnit = input.nextDouble();

			double totalBill = unitUsed * costPerUnit;

			System.out.printf("Total Bill: %.2f%n", totalBill);
		}
	}