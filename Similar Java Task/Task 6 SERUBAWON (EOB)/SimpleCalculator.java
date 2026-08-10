/*
1 enter number 
2 enter operator
3 enter number
4 Use switch case to check the operators and do the calculation based on that
4 print result
*/

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int result = 0;
		
			System.out.println("Enter number: ");
			int numberOne = input.nextInt();
			input.nextLine();

			System.out.println("Enter Operator(plus, minus, divide, multiply):");
			String operator = input.nextLine();

			System.out.println("Enter number: ");
			int numberTwo = input.nextInt();

			switch(operator){
				case "plus":
					result = numberOne + numberTwo;
					break;
				case "minus":
					result = numberOne - numberTwo;
					break;
				case "divide":
					if(numberTwo == 0){
						System.out.println("Cannot divide by zero");
					}else{
						result = numberOne / numberTwo;
					}
					break;
				case "multiply":
					result = numberOne * numberTwo;
					break;
				default:
					System.out.println("Invalid Operator");
			} 
			System.out.printf("Result: %d%n", result);

		System.out.println();
	}
}