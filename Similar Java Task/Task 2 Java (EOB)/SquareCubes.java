//Task 10

import java.util.Scanner;

	public class SquareCubes{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter number: ");
			int a = input.nextInt();

			System.out.printf("Square: %d%nCube: %d", a * a, a * a * a);
		}
	}