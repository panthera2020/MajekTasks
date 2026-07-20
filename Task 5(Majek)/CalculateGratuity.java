//2.5

/*
1 collect input for subtotal 
2 collect input for gratuityrate(percentage)
3 Divide gratuity rate by 100 and multipy by subtotal to get gratuity
4 add subtotal to gratuity to get total
5 print gratuity and total
*/

import java.util.Scanner;

public class CalculateGratuity {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		System.out.println("The gratuity is " + gratuity + " and the total is " + total);
	}
}