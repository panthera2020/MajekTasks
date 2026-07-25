import java.util.Scanner;

public class IsNumberPalindrome {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine if the five digit Number is a PALINDROME");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();

		boolean palindromeOrNot = true;

		if(userNumber > 9999 && userNumber <= 99999){
			palindromeOrNot = Kata.isPal(userNumber);
		}else{
			System.out.println("Invalid Input");
			System.exit(0);
		}

		System.out.println();
		System.out.println("Is number a PALINDROME?");
		System.out.println(palindromeOrNot);;
	}
}