/*
1 Collect the input of the price and the discount percentage
2 Divide the percentage by 100 and multiply
3 multiply by the price to get the discount amount
4 subtract the discounted price from the price to get the final price
5 print the final price
*/

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Price: ");
		double price = input.nextInt();

		System.out.println("Enter Discount(%): ");
		double discountPercentage = input.nextInt();

		double discountPrice = (discountPercentage / 100) * price;
		double finalPrice = price - discountPrice;

		System.out.println("Discount amount: " + discountPrice);
		System.out.println("Final Price: " + finalPrice);

	}
}