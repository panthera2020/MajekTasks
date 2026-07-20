/* 1.(Arimethic)
Write an application that asks the user to enter two integers, obtains them from the user and print the cube of each number, the product of their cubes, and the remainder when the larger cube is divided by the smaller cube*/

/* PSUEDOCODE
1 Input the integers
2 Calculate the cubes of each number
3 Calculate the product of the cubes
4 Calculate the remainder when the larger is divided by the smaller cube
5 Print result*/

import java.util.Scanner;
	public class Arithmetic{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter two integers: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			int cube1 = num1 * num1 * num1;
			int cube2 = num2 * num2 * num2;

			int product = cube1 * cube2;
			int rem = 0;
			

			if(num1 > num2){
				rem = num1 % num2;
			}
			if(num2 > num1){
				rem = num2 % num1;
			}


			System.out.printf("Cube of first integer: %d%nCube of second integer: %d%nProduct of the cubes: %d%n Remainder: %d", cube1, cube2, product, rem);
		}
	}