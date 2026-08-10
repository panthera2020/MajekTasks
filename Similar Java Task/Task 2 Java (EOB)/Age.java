//Task 1

import java.util.Scanner;
	public class Age{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter Age: ");
			int age = input.nextInt();
	
			age++;
			
			System.out.printf("You'll be %d years old next year", age );
			}
	}