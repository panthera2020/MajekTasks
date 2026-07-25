import java.util.Scanner;

public class Factorial {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Determine the factorial");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();
		
		long factorialOfNumber = Kata.factorial(userNumber);

		System.out.println();
		System.out.println("The factorial of " + userNumber + " is " + factorialOfNumber);
	}
}