import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Get the number of factors");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();

		int numberOfFactors = Kata.fact(userNumber);

		System.out.println();
		System.out.println("The number of factors are: " + numberOfFactors);
	}
}