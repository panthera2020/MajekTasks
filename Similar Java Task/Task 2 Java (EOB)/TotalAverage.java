//Task 2

import java.util.Scanner;
	public class TotalAverage{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter three Scores: ");
			int score1 = input.nextInt();
			int score2 = input.nextInt();
			int score3 = input.nextInt();

			int total = score1 + score2 + score3;
			int average = total / 3;

			System.out.printf("Total: %d%nAverage: %d", total, average);
		}
	}