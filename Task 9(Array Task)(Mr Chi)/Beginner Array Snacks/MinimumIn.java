import java.util.Scanner;

public class MinimumIn {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Get the smallest Number");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int smallestNumber = ArrayKata.small(numbers);

		System.out.println();
		System.out.println("SmallestNumber: " + smallestNumber);
	}
}