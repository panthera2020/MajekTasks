import java.util.Scanner;

public class MaximumIn {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Get the Largest Number from a variety of numbers");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();
		System.out.println();

		int[] numbers = new int[numberOfInput];

		System.out.println("Enter number: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int largestNumber = ArrayKata.lar(numbers);
		System.out.println();
		System.out.println("Largest number: " + largestNumber);
	}
}