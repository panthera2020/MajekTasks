/* Question 7
(Palindrome Check) Write a method that takes a String and returns true if it reads the
same forwards and backwards. Incorporate the method into an application that reads a
value from the user and displays the result.
*/

import java.util.Scanner; 

public class PalindromeCheck {
	public static boolean isPalindome(String a){
		if(a.toLowerCase().charAt(0) == a.toLowerCase().charAt(2)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three letter word to determine if it's a PALINDROME or not");
		System.out.print("Enter Word: ");
		String userWord = input.next();

		if(userWord.length() > 3){
			System.out.println("Invalid Input");
		}else{

			boolean palindromeOrNot = isPalindome(userWord);

			System.out.println();
			System.out.println("Is " + userWord + " a PALINDROME? ");
			System.out.println();
			System.out.println(palindromeOrNot);
		}
	}
}