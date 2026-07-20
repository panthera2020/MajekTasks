/* Question 6
 (Celsius to Fahrenheit) Write a method that takes a temperature in Celsius and returns
the equivalent in Fahrenheit. Incorporate the method into an application that reads a value
from the user and displays the result.
*/

import java.util.Scanner; 

public class CelciusToFarenheit {
	public static double toFarenheit(double celcius){
		double farenheit = (celcius * 1.8) + 32;
		return farenheit;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Convert celcius to Farenheit");
		System.out.println("Enter Temprature(celcius): ");
		double celcius = input.nextDouble();

		double convertToFarenheit = toFarenheit(celcius);
		System.out.println(celcius + "C = " + convertToFarenheit + "F");
	}
}