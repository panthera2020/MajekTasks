


import java.util.Scanner;

public class SumOfOddNumberArrayIntegers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int[] numbers = new int[5];

		for(int count = 0; count < numbers.length; count++ ){
			System.out.print("Enter Integer: ");
			numbers[count] = input.nextInt();

			if(numbers[count] % 2 != 0){
				sum += numbers[count];
			}
		}

		System.out.println();
		System.out.print("Sum: " + sum);
		
	}
}