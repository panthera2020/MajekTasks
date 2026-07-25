import java.util.Scanner;

public class IsSquareNumber {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine if the number is a square Number");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();

		boolean squareNumberOrNot = Kata.isSquare(userNumber);

		System.out.println();
		System.out.println("Is " + userNumber + " a Square number?");
		System.out.println(squareNumberOrNot);;
	}
}