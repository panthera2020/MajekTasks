import java.util.Scanner;

public class CountOddNumbers {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Get the number of odd Number");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int oddNumberCount = ArrayKata.countOdd(numbers);

		System.out.println();
		System.out.println("There are " + oddNumberCount + " Odd Numbers");
	}
}