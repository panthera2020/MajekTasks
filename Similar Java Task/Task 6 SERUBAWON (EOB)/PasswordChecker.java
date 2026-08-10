/* Question 83
Create a variable that keeps checking for a set of password or returns "Incorrect Password"
*/

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 4 digit Password: ");
		String password = input.nextLine();

		while(!password.equals("secret123")){
			System.out.println("Please input correct password");
			password = input.nextLine();
		}
	}
}