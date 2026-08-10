// Question 10

/*PSEUDOCODE
1 input hours worked
2 input hourly rate
3 input bonus
4 input tax rate 
5 Calculate gross pay
6 calculate the tax to be removed
7 calculate the pay after the tax has been removed
8 calculate netpay including bonus
9 print gross pay, taxed pay, and netpay
*/

import java.util.Scanner;
	public class Netpay{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter Hours worked: ");
			double hoursWorked = input.nextDouble();

			System.out.print("Enter Hourly rate: ");
			double hourlyRate = input.nextDouble();

			System.out.print("Enter Bonus: ");
			double bonus = input.nextDouble();

			System.out.print("Enter Tax rate(%): ");
			double taxRate = input.nextDouble();

			double grossPay = hourlyRate * hoursWorked;
			double taxedRemoved = (grossPay * taxRate) / 100;
			double taxedPay = grossPay - taxedRemoved;
			double netPay =  taxedPay + bonus;

			System.out.printf("Gross Pay: %.2f%nTaxed Pay: %.2f%nNet Pay: %.2f%n", grossPay, taxedPay, netPay);
		}
	}