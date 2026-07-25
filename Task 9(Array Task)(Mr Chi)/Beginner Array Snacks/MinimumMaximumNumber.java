import java.util.Scanner;

public class MinimumMaximumNumber {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Get the largest and Smallest of odd Numbers");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int[] largestAndSmallest = ArrayKata.minMax(numbers);

		System.out.println();
		System.out.println("Largest number: " + largestAndSmallest[0]);
		System.out.println("Smallest number: " + largestAndSmallest[1]);
	}
}