import java.util.Scanner;

public class SquareNumbersIn {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Print square of Numbers");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int[] printSquareOfNumbers = ArrayKata.square(numbers);

		System.out.println();
		System.out.println("The square of the numbers are: ");
		for(int squaredNumber = 0; squaredNumber < printSquareOfNumbers.length; squaredNumber++){
			System.out.println(numbers[squaredNumber] + " square = " + printSquareOfNumbers[squaredNumber] + " ");
		}
	}
}