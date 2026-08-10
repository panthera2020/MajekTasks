


import java.util.Scanner;

public class SumOfArrayIntegers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int[] numbers = new int[5];

		for(int count = 0; count < numbers.length; count++ ){
			System.out.print("Enter Integer: ");
			numbers[count] = input.nextInt();

			sum += numbers[count];
		}

		System.out.println();
		System.out.print("Sum: " + sum);
		
	}
}