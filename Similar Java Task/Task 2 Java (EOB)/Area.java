//Task 5

import java.util.Scanner;
	public class Area{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter length: ");
			int lenght = input.nextInt();

			System.out.println("Enter width: ");
			int width = input.nextInt();

			int area = width * lenght;

			System.out.printf("Area: %d%n", area);

		}
	}