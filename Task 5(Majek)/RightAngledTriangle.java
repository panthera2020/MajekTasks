//4.30

/*
1 Collect input for the length of the base of the triangle
2 Use a for loop to create the triangle
3 the first loop for the asterisks and the second loop to move to the next line
4 Use the base input to determine the number of loops for the first loop, and move to the next line after the second loop completes its cycle
5 Use the second loop to print the asterisk
*/

import java.util.Scanner;

public class RightAngledTriangle {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter length of base of Triangle: ");
		int lenght = input.nextInt();

		if(lenght < 0 || lenght > 10){
			System.out.print("Invalid Input");
		}
		else{
			for(int i = 1; i <= lenght; i++){
				for(int count = 1; count <= i; count++){
					System.out.print("*");
				}
			System.out.println();
			}
		}
	}
}
