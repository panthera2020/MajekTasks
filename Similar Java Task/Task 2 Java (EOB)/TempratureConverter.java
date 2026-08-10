//Task 3

import java.util.Scanner;
	public class TempratureConverter{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter Temperature(K): ");
			double k = input.nextInt();

			double f = ((k - 273.15) * (9 / 5) + 32);
			double c = k - 273.15;

			System.out.printf("Temp in Kelvin: %.2f%nTemp in Celcius: %.2f%nTemp in Farenheit: %.2f%n", k, c, f);
		}
	}