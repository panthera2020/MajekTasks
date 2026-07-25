import java.util.Scanner;

public class EvenNumbersIn {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Print even Numbers");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int[] printEvenNumbers = ArrayKata.printEven(numbers);

		System.out.println();
		System.out.print("The even numbers are: ");
		for(int evenNumber = 0; evenNumber < printEvenNumbers.length; evenNumber++){
			System.out.print(printEvenNumbers[evenNumber] + " ");
		}
	}
}