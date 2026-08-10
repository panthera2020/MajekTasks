/*Question 2
Collect character as lower or upper case but convert all input to one case for clarity
Store input in char variable and use the trim method to take only the first character incase the user adds more than one letter
Using a switch case to return the keypad value for each of the corresponding letters
Display invalid input for non-letters
*/

import java.util.Scanner;

public class LettersToKeypadNumbers {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Letter: ");
		char letter = input.next().trim().toLowerCase().charAt(0);

		switch (letter) {
			case 'a','b','c'-> {
				System.out.println(1);
			}
			case 'd','e','f'-> {
				System.out.println(2);
			}
			case 'g','h','i'-> { 
				System.out.println(3);
			}
			case 'j','k','l'-> {
				System.out.println(4);
			}
			case 'm','n','o'-> {
				System.out.println(5);
			}
			case 'p','q','r','s'-> {
				System.out.println(6);
			}
			case 't','u','v'-> {
				System.out.println(7);
			}
			case 'w','x','y','z'-> {
				System.out.println(8);
			}
			default->
				System.out.println("Invalid input");
		}
	}
}