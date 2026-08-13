import java.util.Scanner;

public class ReverseOrderOfNumber {

	public static int [] reverseArray(int[] arrayOfNumbers){
		int store = 0;

		for(int count = 0; count < (arrayOfNumbers.length / 2); count++){
			store = arrayOfNumbers[count];
			arrayOfNumbers[count] = arrayOfNumbers[(arrayOfNumbers.length - 1) - count];
			arrayOfNumbers[(arrayOfNumbers.length - 1) - count] = store;
		}

	return arrayOfNumbers;
	}

	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		int[] arrayOfIntegers = new int[10];

		System.out.println("Enter 10 integers: ");
		for(int count = 0; count < arrayOfIntegers.length; count++){
			arrayOfIntegers[count] = input.nextInt();
		}

		int [] reversedArray = reverseArray(arrayOfIntegers);

		for(int count = 0; count < reversedArray.length; count++){
			System.out.print( reversedArray[count] + " ");
		}
	}
}