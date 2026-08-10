//Task 7 

import java.util.Scanner;

	public class Names{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("First Name: ");
			String firstname = input.nextLine();

			System.out.println("Last Name: ");
			String lastname = input.nextLine();

			System.out.println("Student ID: ");
			int id = input.nextInt();

			System.out.printf("First name: %s%nLast name: %s%nStudent ID: %d", firstname, lastname, id);
		}
	}