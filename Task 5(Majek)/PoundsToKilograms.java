//2.4

/*
1 collect input of weight in pounds
2 convert weight in pounds to kilograms
3 print weight in kilograms
*/

import java.util.Scanner;

public class PoundsToKilograms {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();

		double weightInKilograms = weightInPounds * 0.45359237;

		System.out.println(weightInPounds + " pounds is " + weightInKilograms + " kilograms.");
	}
}