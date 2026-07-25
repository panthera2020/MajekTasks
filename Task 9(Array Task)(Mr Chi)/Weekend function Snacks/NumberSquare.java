import java.util.Scanner;

public class NumberSquare {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine the square of the number");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();
		
		long squareOfNumber = Kata.square(userNumber);

		System.out.println();
		System.out.println("Square of " + userNumber + " is " + squareOfNumber);
	}
}