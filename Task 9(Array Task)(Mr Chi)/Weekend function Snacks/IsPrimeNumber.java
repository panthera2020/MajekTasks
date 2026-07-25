import java.util.Scanner;

public class IsPrimeNumber{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Detemine if number is a prime number");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();

		boolean primeNumberOrNot = Kata.isPrime(userNumber);

		System.out.println();
		System.out.println("Is " + userNumber + " a prime number?");
		System.out.println(primeNumberOrNot);
	}
}