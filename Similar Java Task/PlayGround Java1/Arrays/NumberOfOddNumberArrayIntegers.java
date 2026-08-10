


import java.util.Scanner;

public class NumberOfOddNumberArrayIntegers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int counter = 0;
		int[] numbers = new int[5];

		for(int count = 0; count < numbers.length; count++ ){
			System.out.print("Enter Integer: ");
			numbers[count] = input.nextInt();

			if(numbers[count] % 2 != 0){
				counter++;
			}
		}

		System.out.println();
		System.out.print("Number of Odd Numbers " + counter);
		
	}
}