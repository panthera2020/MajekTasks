import java.util.Scanner;

public class IsNumberEven {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Check if number is and even number");
		System.out.println();
		System.out.println("Enter number: ");
		int userNumber = input.nextInt();

		boolean isNumberEven = Kata.isEven(userNumber);

		System.out.println();
		System.out.println("Is " + userNumber + " an even number?");
		System.out.println(isNumberEven);
	}
}