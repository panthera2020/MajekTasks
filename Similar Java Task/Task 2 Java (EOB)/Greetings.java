//Task 9

import java.util.Scanner;

	public class Greetings{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("First Name: ");
			String firstname = input.nextLine();

			System.out.println("Last Name: ");
			String lastname = input.nextLine(); 

			System.out.printf("Hello %s %s", firstname, lastname);
		}
	}