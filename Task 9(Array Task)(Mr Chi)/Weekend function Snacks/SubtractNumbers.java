import java.util.Scanner;

public class SubtractNumbers {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Substract numbers");
		System.out.println();
		System.out.println("Enter numbers: ");
		int userFirstNumber = input.nextInt();
		int userSecondNumber = input.nextInt();

		int subtractTheNumbers = Kata.sub(userFirstNumber, userSecondNumber);

		System.out.println();
		System.out.println(subtractTheNumbers);
	}
}