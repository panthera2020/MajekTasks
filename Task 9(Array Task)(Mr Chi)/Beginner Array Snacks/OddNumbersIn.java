import java.util.Scanner;

public class OddNumbersIn {
	public static void main(String... args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Print odd Numbers");
		System.out.println("How many numbers?");
		int numberOfInput = userInput.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter numbers: ");
		for(int userNumber = 0; userNumber < numbers.length; userNumber++){
			numbers[userNumber] = userInput.nextInt();
		}

		int[] printOddNumbers = ArrayKata.printOdd(numbers);

		System.out.println();
		System.out.print("The odd numbers are: ");
		for(int oddNumber = 0; oddNumber < printOddNumbers.length; oddNumber++){
			System.out.print(printOddNumbers[oddNumber] + " ");
		}
	}
}