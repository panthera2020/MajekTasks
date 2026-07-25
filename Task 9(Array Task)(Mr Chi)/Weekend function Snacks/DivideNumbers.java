import java.util.Scanner;

public class DivideNumbers {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Divide two numbers");
		System.out.println();
		System.out.println("Enter numbers: ");
		int userFirstNumber = input.nextInt();
		int userSecondNumber = input.nextInt();

		float subtractTheNumbers = Kata.div(userFirstNumber, userSecondNumber);

		System.out.println();
		System.out.println(subtractTheNumbers);
	}
}