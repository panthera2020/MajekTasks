import java.util.Scanner;

import java.util.ArrayList;

public class AnalyzeScores {
	public static double average(double... arrayOfNumbers){
		int sum = 0;

		for(int count = 0; count < arrayOfNumbers.length; count++){
			sum += arrayOfNumbers[count];
		}

	double average = (double)sum / arrayOfNumbers.length;

	return average; 
	}

	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();

		System.out.println("Enter scores, -1 to quit");

		int userInput = 0;

		while(true){
			userInput = input.nextInt();
			if(userInput == -1){
				break;
			}
			scores.add(userInput);
		}

		int[] arrayOfNumbers = new int[scores.size()];

		for(int count = 0; count < arrayOfNumbers.length; count++){
			arrayOfNumbers[count] = scores.get(count);
		}

		System.out.println("The average of the scores: " + average(arrayOfNumbers));
	}
}